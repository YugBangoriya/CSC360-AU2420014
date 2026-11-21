# Session 26 - The Last Session: Twelve Image Projects and a Look Back at the Course

**Session Date:** 17/11/26

**Entry Date:** 21/11/26

---

## Session Content

Session 26 was the last session of this course. There was no lecture and no new topic. The whole session was meant for the end-sem group presentations, and the plan was to go through all 12 groups.

Because of the time limit, we were only able to get through Groups 1 to 8 in the classroom. Groups 9 to 12 had to go to the professor's cabin and present there.

The 12 projects covered a wide range, even though they all worked with images. Going by the README of each repository, this is what each group built.

- **Group 1 (Wall Crack Detector):** A Java app that finds cracks in wall photos, highlights them, and reports the size and location of each crack in pixels.
- **Group 2 (Simple-Image-Proof):** A Java desktop app that looks at one image and points out areas that may have been edited.
- **Group 3 (RRR-SVGs):** A Java app that reads SVG files, draws the shapes, and converts the vector graphics into raster images.
- **Group 4 (Median Filter):** A Java program that removes salt-and-pepper noise, which means random black and white dots, from an image using a median filter. It uses ImageJ to open and show the images.
- **Group 5 (ImageJ Guide):** A guide to what ImageJ can do, covering installation on Windows and WSL, a tour of the user interface, and plugins.
- **Group 6 (Grayscale Contrast Filter):** A small Java project that improves the contrast of a grayscale image, with a slider window to adjust it.
- **Group 7 (PNG, JPEG and GIF at Byte Level):** Our project. One 16 x 16 test image is saved as a PNG, a JPEG, and a GIF, then each file is read byte by byte and every part is labelled.
- **Group 8 (ImageLite):** An image compressor with a graphical interface. You load an image, change the JPEG quality, resize it while keeping the aspect ratio, preview the result, and save it.
- **Group 9 (Classroom Student Counter):** A JavaFX app that counts students in a classroom photo using classical image processing and draws a box around each head candidate.
- **Group 10 (Counting Birds in Garden Photos):** A Java project that uses ImageJ to count birds in garden photos. Its README shows 32 JUnit tests passing.
- **Group 11 (Image to PDF Converter):** A command-line tool written in Python with Pillow that converts one image or many images into a PDF.
- **Group 12 (JavaFX Image Editor):** A JavaFX app for annotating images. You draw translucent rectangle markers, choose their colours, and save the result as a PNG.

Looking at the list as a whole, some projects find things in a photo, some change how an image looks, some work with image files and formats, and some are tools for working with images.

## What Else I Remember

Our group, Group 7, was in the first set, so we presented in the classroom. The group repository was in its final form by then, with the last commit, named "Final Presentation", pushed on 16 November, the day before.

I did not see the four presentations in the cabin, so for Groups 9 to 12 the README is all I have to go on. This was also a different round from Sessions 16 to 19, when the same 12 groups presented their first projects. This time the projects were the end-sem ones, and nearly all of them were about images.

The GitHub repositories for all 12 groups:

- Group 1 (Wall Crack Detector): [github.com/Devang280904/CSC360-Group-01](https://github.com/Devang280904/CSC360-Group-01)
- Group 2 (Simple-Image-Proof): [github.com/satvikp-coder/CSC360-Group2](https://github.com/satvikp-coder/CSC360-Group2)
- Group 3 (RRR-SVGs): [github.com/bhavya1975/CSC360-Group3](https://github.com/bhavya1975/CSC360-Group3)
- Group 4 (Median Filter): [github.com/AI-AgentBuildr/CSC360-Group4_End](https://github.com/AI-AgentBuildr/CSC360-Group4_End)
- Group 5 (ImageJ Guide): [github.com/Dhriti-Sarkar/CSC360-Group5-EndSem](https://github.com/Dhriti-Sarkar/CSC360-Group5-EndSem)
- Group 6 (Grayscale Contrast Filter): [github.com/KesarThakkar1410/CSC360-Group-06-Endsem](https://github.com/KesarThakkar1410/CSC360-Group-06-Endsem)
- Group 7 (PNG, JPEG and GIF at Byte Level, our group): [github.com/Jawal23/CSC360-Group7](https://github.com/Jawal23/CSC360-Group7)
- Group 8 (ImageLite Image Compressor): [github.com/Denim-Ahir/CSC360-Group8-EndSem](https://github.com/Denim-Ahir/CSC360-Group8-EndSem)
- Group 9 (Classroom Student Counter): [github.com/Quack-Duck12/CSC360-GROUP9-ENDSEM](https://github.com/Quack-Duck12/CSC360-GROUP9-ENDSEM)
- Group 10 (Counting Birds in Garden Photos): [github.com/aneri-k/CSC360-Group10](https://github.com/aneri-k/CSC360-Group10)
- Group 11 (Image to PDF Converter): [github.com/Sneha8125/CSC360-Group-11](https://github.com/Sneha8125/CSC360-Group-11)
- Group 12 (JavaFX Image Editor): [github.com/Monsoon-2026/CSC360-JavaFX-Image-Editor-Group-12](https://github.com/Monsoon-2026/CSC360-JavaFX-Image-Editor-Group-12)

## What I Understood Well

I could link several projects to what we studied in the course. Group 6's contrast filter is the idea from Session 22 on contrast and histograms. Group 4's median filter works on the neighbours of each pixel, like the convolution filters from the same session, except that it sorts the neighbours and picks the middle value instead of using a weighted sum. Group 3's SVG to raster conversion is the raster versus vector idea from Session 2.

## What I Found Challenging

There was no new concept to learn this session, so nothing was hard in that way. The harder part was keeping up with so many different projects. I think eight projects in one sitting are a lot to take in. For Groups 9 to 12, I only know the projects from their READMEs. A README shows what a project does, but it does not show why the group built it the way it did.

## Connections to Prior Sessions

This session connects to Sessions 16 to 19, when all 12 groups presented their first projects. That round was mostly JavaFX applications, such as a tree editor, a library browser, and a shape styler. This round was all about images, which fits the second half of the course. Session 20's five standards for a professional repository also show up in these projects. Group 2's README has a CI badge, Group 10's shows its JUnit test results, and our own README has a results table and instructions to build and run the project.

The project topics connect to the later sessions as well. Our project builds on Sessions 23 and 24. The same 16 x 16 test image is 768 bytes as raw RGB data, which is the pixel storage formula from Session 23. In our README it takes 352 bytes as a PNG, 659 bytes as a JPEG, and 1,087 bytes as a GIF. Only the PNG came out smaller than the raw data. In the JPEG, only 34 bytes are image data and the rest are markers, headers, and tables, and the GIF colour palette alone takes 768 bytes. The README also lists PNG and JPEG as big-endian and GIF as little-endian, which is the byte order topic from Session 23. Group 8's compressor connects to the JPEG quality trade-off from Session 24, where lossy compression gives a smaller file in exchange for some lost detail.

## Real-World Applications Explored

Almost every project here has a real-world version. Crack detection on photos is used to inspect buildings and bridges without climbing them. Checking an image for edited areas matters in journalism and insurance claims, where a photo is used as proof. Counting students or birds in a photo is the same idea as counting people in a building or animals in a wildlife survey. Compressing images is what makes web pages load faster, and turning images into a PDF is what document scanning apps do. Group 12's rectangle markers are the same kind of annotation used to label objects when training machine learning models. Group 3's SVG to raster conversion is what happens whenever a vector icon is shown on a screen.

## Insights

What struck me was that all 12 projects started from the same place. Whether the project counted birds, found cracks, or compressed a photo, each one treats an image as a grid of numbers, which is what Sessions 4 and 23 were about. Twelve groups picked twelve different problems, and still the basics underneath were the same. I think that is a good sign that the course gave us the right foundation, and it was a good way to end the semester.

## Self-Study & Resources Consulted

- **[MDN Web Docs - Image File Type and Format Guide](https://developer.mozilla.org/docs/Web/Media/Guides/Formats/Image_types)**: Lists the image file types used on the web, including GIF, PNG, JPEG, and SVG, and says what each one is good for. It suggests PNG over GIF for still images that need lossless quality and SVG for icons and diagrams that must stay sharp at any size. This is useful for the projects on image formats.

- **[ImageJ - ImageJ User Guide](https://imagej.net/ij/docs/guide/)**: The official guide to ImageJ by Tiago Ferreira and Wayne Rasband, which gives a detailed overview of ImageJ as a standard tool for scientific image analysis. It is relevant for the projects that used ImageJ, such as Groups 4, 5, and 10.

- **[HIPR2 - Thresholding](https://homepages.inf.ed.ac.uk/rbf/HIPR2/threshld.htm)**: Explains thresholding, which turns a grayscale image into a binary image by splitting the pixels into foreground and background. It also shows how to check the histogram to see if simple thresholding will work. Thresholding comes up in the READMEs of Groups 1, 9, and 10.

## Key Takeaways

1. Session 26 was the last session of the course, and it was used for the end-sem group presentations. Because of the time limit, only Groups 1 to 8 presented in the classroom, and Groups 9 to 12 presented in the professor's cabin.
2. The 12 projects covered finding things in photos, changing how images look, working with image files and formats, and tools for working with images. Despite that range, all of them treat an image as a grid of pixel values.
3. Many projects tie back to topics from the course, such as SVG to raster (Session 2), contrast, histograms, and filters (Session 22), and byte storage and byte order (Session 23).
4. In our project, the same 16 x 16 image took 352 bytes as a PNG, 659 bytes as a JPEG, and 1,087 bytes as a GIF. File size depends on the extra data a format carries, like tables and palettes, and not only on the pixels.
5. A clear README lets someone understand a project without watching the presentation, which is how I could follow the groups that presented in the cabin.

---
