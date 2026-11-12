# Session 24 - Project Kickoff - Researching PNG, JPEG, and GIF at the Binary Level

**Session Date:** 05/11/26

**Entry Date:** 10/11/26

---

## Session Content

Session 24 was another project session, and it ran a lot like Sessions 12 to 14. There was no lecture and no slides. The whole class time was used to work on our group projects, and the professor walked around the room to meet each group individually.

This project is different from the one we worked on earlier in the course. Back then we were building an application. This time the topic is "Explain the popular image formats (with binary-level details): PNG, JPEG, and GIF". For each format, we need to research what it is, where it is used, how it differs from the other two, and when one format is a better choice than the others. We also need to write code to create and present demos, so the project is not only about explaining things in words. I understand "binary-level details" to mean looking at what is actually inside these files, which is the bytes, and how they are laid out.

When the professor came to each group, the conversation was about progress, any doubts the group had, and how to actually work on the project based on the topic we were assigned. After that, my group started working. We began with the initial research from the prescribed textbooks for this course, which felt like the right first step because we needed a shared base of knowledge before writing any code. I think the code and demos will come once the research is clear.

## What Else I Remember

The professor's check-ins were mostly about helping each group start in the right direction, and the real work of getting started was left to us. Starting with the textbook also made sense because Chapter 1 of the Burger and Burge book covers GIF, PNG, and JPEG in one section, so all three formats can be read side by side. Even at a first look, the formats are clearly different in purpose. The textbook describes GIF as an indexed format limited to 256 colours that can store simple animations, PNG as a lossless format with a proper alpha channel for transparency, and JPEG as a lossy format built for photographs. That already gives me a rough idea of why the project asks us to compare when each one is the better choice.

## What I Understood Well

The rule on using AI in this project is clear to me now. We are allowed to use AI for the project, as long as we know what we have worked on. The course outline also supports this, since it talks about prompt engineering and about groups working with AI systems. I understood the rule as being about ownership and not about avoiding AI. This matters even more for this project, because we will have to present demos and explain binary-level details. If someone asks why a PNG file begins the way it does or what a field in a header means, a copied answer is not enough. We should be able to explain it ourselves.

## What I Found Challenging

There was no new concept this session, so nothing was hard in the usual sense. I think the hardest part of this project will be the binary-level side of the topic, because we have to explain what is actually inside PNG, JPEG, and GIF files at the byte level, and I do not have a clear picture of that yet. JPEG looks like the toughest of the three, since the textbook describes it as a combination of several steps, including a colour conversion, a cosine transform, and a final lossless compression. The other challenge is covering three formats well. Each one needs research, a comparison, and a demo, so I think we will need to plan our time carefully.

## Connections to Prior Sessions

The topic connects most directly to Session 23, where we learned how pixels are stored as bytes, what byte order means, and how little-endian and big-endian differ. Binary-level details of image formats depend on the same ideas, because every format has to decide how its numbers are written into bytes. For example, PNG stores its numbers in big-endian order, which is network byte order, while GIF stores them in little-endian order. It also connects to Session 2, where we looked at raster and vector graphics. PNG, JPEG, and GIF are all raster formats, so they all store an image as a grid of pixels in some form. The textbook lines up with this too. Chapter 1 has a section on image file formats, and a later part of the same section is about bits and bytes, which includes byte order.

The way this session ran connects to Sessions 12 to 14, where the faculty also walked around and met each group during project time. The difference is that those sessions were about building an application, while this one starts with research. The AI rule connects to Session 21, where the professor said AI has made it easier to produce good code and documentation, but the hard part is still understanding what you built. Knowing what we have worked on is the same idea, because that is the only way to use our own work later without spending the time to figure it out all over again. It also ties back to Session 18, where the faculty Q&A showed that you need to understand your own project's design decisions to be able to explain them.

## Real-World Applications Explored

AI can help with the tasks we give it, but to get the most out of it, we need to know what we want it to do on our behalf. For example, AI can write code, but the type of code, the methodology, and the principles behind it should be stated by us. Networking principles, database principles, and cyber security protocols should be clearly defined by us, so that AI can then help put everything together from a general perspective. This applies to any software work, from a small app to a large system.

The three formats in our topic are also part of everyday life. JPEG was designed for continuous images like photographs, which is why it is so common for photos. PNG supports transparency with a proper alpha channel and is the format the textbook recommends for new web software. GIF is still used for simple animations because it can store several images in one file. Knowing which one to pick for a given job is exactly the kind of question our project needs to answer.

## Insights

What struck me was how much AI has changed the kind of work that used to be slow and boring, like doing research, writing code, and making good looking visual deliverables. It feels like the next level of intelligence, and I think people who use AI in a productive way will end up replacing those who believe AI is just a passing trend that will fade in a few years. At the same time, this session showed me the other half of that idea. The rule says we can use AI but we have to know what we worked on, so the advantage goes to people who combine AI with real understanding, and not to people who just paste in whatever it gives them.

## Self-Study & Resources Consulted

- **[RFC 2083 - PNG (Portable Network Graphics) Specification Version 1.0](https://www.rfc-editor.org/rfc/rfc2083)**: The official PNG specification, which explains the file signature, the chunk layout, and how integers are stored in the file. This is the main source for the binary-level part of the PNG research.

- **[GIFLIB - What's In A GIF: Bits and Bytes](https://giflib.sourceforge.net/whatsinagif/bits_and_bytes.html)**: Walks through a real GIF file byte by byte, including the header, the logical screen descriptor, and the colour table, and it shows that GIF stores multi-byte values in little-endian order. It connects directly to what we learned about byte order in Session 23.

- **[File Format Docs - What is a JPEG file?](https://docs.fileformat.com/image/jpeg)**: Explains how JPEG uses lossy compression to trade image quality for file size, and lists the markers such as SOI, DQT, and EOI that make up the structure of a JPEG file. Useful for understanding what a JPEG looks like inside.

## Key Takeaways

1. Session 24 was a project session with no lecture, and our group topic is explaining PNG, JPEG, and GIF with binary-level details. The goal is to look at what is actually inside these files and not just describe them from the outside.
2. The project has two parts, research and demos. For each format, we need to cover what it is, where it is used, how it differs from the others, and when it is the better choice, and then back that up with code.
3. Starting with the prescribed textbook gives the group a shared base before any code is written. The professor's check-ins help make sure each group starts in the right direction.
4. Using AI for the project is allowed, as long as we know what we have worked on. This matters even more here, because we will have to explain binary-level details ourselves.
5. To use AI well, we have to know what we want from it. Principles like networking, database design, and security protocols need to be defined by us first, and then AI can help put everything together.

---