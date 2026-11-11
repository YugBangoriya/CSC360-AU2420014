# Session 24 - Starting the Image Formats Project: PNG, JPEG, and GIF

**Session Date:** 05/11/26

**Entry Date:** 11/11/26

---

## Session Content

Session 24 was a project work session, so there was no new concept taught by the professor. The whole class time went into working on our group projects inside the classroom.

Our group project topic is "Explain the popular image formats (with binary-level details): PNG, JPEG, and GIF". For each format, we need to do research on what it is, where it is used, how it differs from the other two, and when one format is a better choice than another. We also need to write code to create and present demos, so the project is not only about explaining things in words.

During the session, the professor met every group one by one. The professor guided each group on its progress, cleared doubts, and explained how to actually work on the project based on the topic we were assigned. After that, my group started working on the project. We began with the initial research from the prescribed textbooks for this course. I think the code and demos will come once the research is clear.

## What Else I Remember

We worked on the project for the whole class and there was no academic teaching, so this reflection looks a little different from the earlier ones.

## What I Understood Well

We are allowed to use AI for the project in this course, as long as we know what we have worked on. The course outline also fits with this, since it talks about prompt engineering and about groups working with AI systems. I understood the rule as being about ownership, which means I should be able to explain every part of our work myself.

## What I Found Challenging

Since there was no new concept this session, nothing was hard in the usual sense. I think the hardest part of the project will be the binary-level side of the topic, because we have to explain what is actually inside PNG, JPEG, and GIF files at the byte level. We are only at the start of the research, so I do not have a clear picture of that yet.

## Connections to Prior Sessions

The project connects most directly to Session 23, where we learned how pixels are stored as bytes, what byte order means, and how little-endian and big-endian differ. Binary-level details of image formats depend on the same ideas, because every format has to decide how its numbers are written into bytes. For example, PNG stores its numbers in big-endian order, which is network byte order, while GIF stores them in little-endian order. It also connects to Session 2, where we looked at raster and vector graphics. PNG, JPEG, and GIF are all raster formats, so they all store an image as a grid of pixels in some form. The textbook lines up with this too. Chapter 1 of the Burger and Burge book has a section on image file formats that covers GIF, PNG, and JPEG, and a later part of the same section is about bits and bytes, which includes byte order.

The AI rule connects to Session 21, where the professor said AI has made it easier to produce good code and documentation, but the hard part is still understanding what you built. Knowing what we have worked on is the same idea, because that is the only way to use our own work later without spending the time to figure it out all over again. It also ties back to Session 18, where the faculty Q&A showed that you need to understand your own project's design decisions to be able to explain them.

## Real-World Applications Explored

AI can help with the tasks we give it, but to get the most out of it, we need to know what we want it to do on our behalf. For example, AI can write code, but the type of code, the methodology, and the principles behind it should be stated by us. Networking principles, database principles, and cyber security protocols should be clearly defined by us, so that AI can then help put everything together from a general perspective. This applies to any software work, from a small app to a large system.

## Insights

What struck me was how much AI has changed work that used to be slow and boring, like doing research, writing code, and making good looking visual deliverables. I think this is the next level of intelligence, where people who use AI in a productive way will end up replacing those who think AI is just a passing trend. This also connects to the rule from the session, because using AI well only works if we still understand what we are doing.

## Self-Study & Resources Consulted

- **[RFC 2083 - PNG (Portable Network Graphics) Specification Version 1.0](https://www.rfc-editor.org/rfc/rfc2083)**: The official PNG specification, which explains the file signature, the chunk layout, and how integers are stored in the file. Useful for the binary-level part of the PNG research.

- **[GIFLIB - What's In A GIF: Bits and Bytes](https://giflib.sourceforge.net/whatsinagif/bits_and_bytes.html)**: Walks through a real GIF file byte by byte, including the header, the logical screen descriptor, and the color table, and it shows that GIF stores multi-byte values in little-endian order.

- **[File Format Docs - What is a JPEG file?](https://docs.fileformat.com/image/jpeg)**: Explains how JPEG uses lossy compression to trade image quality for file size, and lists the markers such as SOI, DQT, and EOI that make up the structure of a JPEG file.

## Key Takeaways

1. Session 24 was a project work session with no new lecture, and our group topic is explaining PNG, JPEG, and GIF with binary-level details.
2. The project needs research on each format, covering its uses, the differences between formats, and when each one is better, along with code to create and present demos.
3. The professor met every group to guide progress and clear doubts, and our group started with initial research from the prescribed textbooks.
4. Using AI for the project is allowed in this course, as long as we know what we have worked on.
5. To use AI well, we have to know what we want from it, since principles like networking, database design, and security protocols need to be defined by us first.

---
