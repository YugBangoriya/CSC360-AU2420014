# Session 23 - What a Pixel Looks Like in Memory: RGBA, Byte Order, and Endianness

**Session Date:** 03/11/26

**Entry Date:** 04/11/26

---

## Session Content

Session 23 was about how a digital image is actually stored inside a computer. Session 22 was about what we can do to an image, like fixing contrast or finding edges. This session went one level lower and looked at what an image is made of as raw bytes. The six topics came in a clear order, and each one depended on the one before it.

1. **Pixel Representation:** The professor started with the pixel, which is the smallest unit of a digital image. Each pixel is described by colour values. In the RGB model these are Red, Green, and Blue. Each channel usually takes 8 bits, which is 1 byte, so it can hold a value from `0` to `255`. With three channels, this gives 256 x 256 x 256 = 16,777,216 possible colours, or about 16.7 million.

2. **RGB vs RGBA:** An RGB pixel needs 3 bytes (24 bits). RGBA adds a fourth channel called Alpha, which controls transparency, so each pixel takes 4 bytes (32 bits). Alpha also runs from 0 to 255. A value of 0 means fully transparent, 128 means about 50% opacity, and 255 means fully opaque. For example, a red pixel with an alpha of 128 lets about half of the background show through.

3. **Image Storage in Memory:** An image with m rows and n columns has m x n pixels, and each pixel stores its RGB or RGBA values. In memory, all of this can sit in one long 1D array of bytes, one row after another. To find where pixel (i, j) starts in an RGB image, we use this formula.

   ```
   Index = (i * n + j) * 3
   ```

   Here i is the row, j is the column, and n is the number of pixels in one row. Counting starts from 0. For RGBA, the 3 becomes a 4. For example, in an image that is 4 pixels wide, pixel (1, 2) starts at (1 * 4 + 2) * 3 = 18, so its red, green, and blue values sit at bytes 18, 19, and 20. The total storage is m x n x 3 bytes for RGB and m x n x 4 bytes for RGBA. A 1920 by 1080 image takes 6,220,800 bytes as RGB (about 6.2 MB) and 8,294,400 bytes as RGBA (about 8.3 MB), before any compression.

4. **Byte Ordering:** The bytes of one pixel can be arranged in different channel orders. The common ones are RGBA (Red, Green, Blue, Alpha), BGRA (Blue, Green, Red, Alpha), and ARGB (Alpha, Red, Green, Blue). The pixel is the same in all three cases. Only the order of its bytes changes, so software needs to know which order it is dealing with.

5. **Endianness:** Endianness is a different idea. It decides the order of the bytes inside one value that takes more than one byte. In little-endian, the least significant byte (LSB) is stored first. In big-endian, the most significant byte (MSB) is stored first. For example, the value `0x12345678` is stored as `78 56 34 12` in little-endian and as `12 34 56 78` in big-endian. It is the same number and the same four bytes, just in opposite order.

6. **Network Byte Order and Image Representation:** Network protocols commonly use big-endian, and this is called network byte order. Image data also needs a clearly defined arrangement of its bytes and channels, such as RGBA, BGRA, or ARGB. The professor pointed out that endianness and channel ordering are different concepts, but both decide how data gets interpreted. If a program reads the data in the wrong order, the values or the colours come out wrong.

Looking at the six topics together, they build on each other. A pixel is made of channels, the channels are stored as bytes, the bytes sit in one long array, and the order of those bytes decides how the computer reads them back.

## What Else I Remember

The textbook covers byte order in the image file formats part of Chapter 1. It explains that big-endian is called network byte order because the IP protocol sends data from the most significant byte to the least significant byte. It also says that Intel processors like the x86 family are traditionally little-endian, which is one reason little-endian is so common on everyday computers.

Some file formats even record the byte order inside the file. A TIFF file starts with the letters II for Intel (little-endian) or MM for Motorola (big-endian), so a program knows how to read the rest of the data.

One example helped me see how the last few topics fit together. Take an opaque red pixel written as an ARGB number, which is `0xFFFF0000`. On a big-endian machine its bytes in memory are `FF FF 00 00`, which is ARGB order. On a little-endian machine they are `00 00 FF FF`, which is BGRA order. So the same pixel can look like two different channel orders depending on how the machine stores a 32-bit number. One reason BGRA shows up so often could be this.

## What I Understood Well

The index formula made the most sense to me. A 2D image is stored as one long row of bytes, and the formula counts the full rows and extra pixels before pixel (i, j), then multiplies by the bytes per pixel. I also understood the endianness example well, because `0x12345678` is always the same four bytes and only their order flips.

## What I Found Challenging

The hardest part was keeping byte ordering and endianness separate in my head. Both are about the order of bytes, so they sound like the same thing at first. Channel order is about which colour comes first in a pixel, while endianness is about the order of bytes inside one multi-byte number, and I needed to work through an actual pixel value before the difference was clear.

## Connections to Prior Sessions

The pixel discussion connects to Sessions 2 and 4. In Session 2 we learned that raster images are grids of pixels, and in Session 4 we talked about pixels and screen resolution. Back then a pixel was just a coloured dot. Now I can see what it looks like in memory, which is 3 or 4 bytes in a long array. It also connects to Session 22, where pixel values from 0 to 255 were the basis for histograms. The convolution filters in that session look at the neighbours of a pixel, and the index formula shows where those neighbours sit in memory. For example, the pixel directly above pixel (i, j) in an RGB image is exactly n * 3 bytes earlier in the array.

Byte order also links back to Session 7, where we covered UTF-8 and UTF-16. Those encodings turn characters into bytes, and UTF-16 uses 2-byte units. I think the same question applies there, because a 2-byte unit can also be stored with either byte first. Based on the course outline, it seems like we will use ImageJ for the practical image processing work, so I think this topic will matter when we read and write pixel data in that tool.

## Real-World Applications Explored

Channel order mistakes show up in real software. If a program expects RGBA but receives BGRA, the red and blue channels swap, so faces look blue and skies look orange. Web canvas pixel data uses RGBA order with 4 bytes per pixel, while Java's `BufferedImage` has types like `TYPE_INT_ARGB` and `TYPE_3BYTE_BGR` that arrange the channels differently. Endianness matters whenever data moves between machines. This is why network protocols fix big-endian as the network byte order, and why file formats like TIFF store a marker for their byte order. Image libraries and graphics drivers deal with these details every time they load, save, or send an image.

## Insights

What struck me was that RGBA, BGRA, and ARGB look like three random orders until you add endianness into the picture. A single ARGB number stored on a little-endian machine ends up as BGRA in memory, so the two ideas are separate but they meet at the same place. It made me think twice before assuming that the bytes in memory are in the same order as the number I write in code.

## Self-Study & Resources Consulted

- **[IBM Docs - Network Byte Order and Host Byte Order](https://www.ibm.com/docs/en/zvm/7.4.0?topic=domains-network-byte-order-host-byte-order)**: Explains that network byte order is always big-endian, which machines use little-endian or big-endian internally, and how functions like `htons()` convert between the two. Useful for the network byte order part of the session.

- **[MDN Web Docs - Pixel Manipulation with Canvas](https://developer.mozilla.org/en-US/docs/Web/API/Canvas_API/Tutorial/Pixel_manipulation_with_canvas)**: Shows how a canvas stores an image as a one-dimensional array with 4 bytes per pixel in RGBA order, going left to right and then downward. It also gives a formula to find a colour value from a row and column, which is very close to the index formula from class.

- **[Android Developers - java.nio.ByteOrder](https://developer.android.com/reference/java/nio/ByteOrder)**: The reference page for the Java `ByteOrder` class, which has the `BIG_ENDIAN` and `LITTLE_ENDIAN` constants and a `nativeOrder()` method that returns the byte order of the machine. It shows how Java code can deal with endianness directly.

## Key Takeaways

1. A pixel is stored as colour channel values from 0 to 255, with one byte per channel. RGB uses 3 bytes (24 bits) per pixel, and RGBA uses 4 bytes (32 bits) because of the extra Alpha channel for transparency.
2. An image can be stored as one continuous array of bytes, row by row. The starting index of pixel (i, j) in an RGB image is (i * n + j) * 3, and the total size is m x n x 3 bytes for RGB or m x n x 4 bytes for RGBA.
3. Byte ordering for channels (RGBA, BGRA, ARGB) decides which colour comes first inside each pixel. The same pixel can be stored in any of these orders, so software has to know which one it is reading.
4. Endianness decides the order of bytes inside a multi-byte value. Little-endian stores the least significant byte first and big-endian stores the most significant byte first, so `0x12345678` becomes `78 56 34 12` or `12 34 56 78`.
5. Network byte order is big-endian. Endianness and channel ordering are different ideas, but both decide how data is interpreted, and mixing them up gives wrong values or wrong colours.

---
