# Session 1 - Introduction to Course

**Session Date:** 04/08/26

**Entry Date:** 08/08/26

---

## Session Content

The first session was mostly about getting a feel for what this course actually is. We went through the outline together, and the thing that stood out to me early on was that CSC360 is really two courses stitched into one: computer graphics and digital image processing. I used to think they were basically the same thing, but the way the professor framed it made the difference clear. Graphics is about creating images from mathematical models. Image processing is about taking an image that already exists and figuring out what is in it or improving it. So they run in opposite directions, and once I saw it that way, the combination made a lot more sense.

We then spent time on what I would call the building blocks of graphics: how shapes are actually formed. The discussion on lines versus curves was interesting because it went beyond just "a line is straight and a curve is not." The professor brought in the idea of rate of change. A line changes at a constant rate, so its derivative is always the same value. A curve does not, so its derivative keeps changing depending on where you are on it. I had done this exact math in school, but I never thought about it as something that a computer would use to actually draw things. That connection was genuinely new to me.

The rest of the session was about how the course will run: project-based, with group work tied closely to what we learn in lectures. We also set up GitHub and talked about how journal reflections should be submitted as Markdown files. I appreciated that this was covered on day one, because it made the submission process feel like a real workflow rather than an afterthought.

## What Else I Remember

We got a quick overview of the graphical frameworks in Java: AWT, Swing, and JavaFX. The way I understood it, AWT came first and was pretty limited. Swing fixed a lot of those issues and is still part of the Java runtime. JavaFX is what we will actually be using in this course, and it is the modern one with proper support for things like animations and styled components. I did not know until this session that AWT and Swing are still bundled with Java even though nobody really recommends them for new work anymore.

The professor also mentioned that there are design patterns specifically for building user interfaces. I had come across this idea before in my HCI course, so it was good to see it showing up here too. On the GitHub side, we talked about SSH versus HTTPS. Both are ways to connect to a remote repository, but SSH uses key-based authentication and HTTPS uses tokens or passwords. It is a small thing, but worth knowing before we start pushing files regularly.

## What I Understood Well

I understood the difference between computer graphics and image processing pretty quickly. One builds images from scratch using math, the other works on images that already exist. Thinking of them as opposites helped a lot. I also understood the lines versus curves explanation well. A line is predictable because its rate of change never varies, but a curve is more complex because that rate shifts continuously. It is basically calculus applied to drawing, which I found much easier to grasp when I could see what it was actually describing.

## What I Found Challenging

The Java frameworks overview was the part I found hardest to follow. I have used Swing a little bit, mostly just to make a basic window, but I have never really explored any of these frameworks properly. Hearing about AWT, Swing, and JavaFX back to back, with no code in front of me, left a lot of gaps. I get the story at a high level now, but I think I will only properly understand the differences once we start writing actual UI code.

## Connections to Prior Sessions

This is the first session, so there is nothing to look back at yet. Based on the course outline, I think the next few sessions will go deeper into the geometry of 2D graphics and then move toward how shapes are actually drawn in code. The lines and curves discussion today feels like the starting point for all of that. I am guessing that the drawing algorithms and Java 2D programming will come up soon, though the exact pace will probably depend on how the class progresses.

## Real-World Applications Explored

The professor made a point that stuck with me: nearly every way we interact with a computer today goes through a graphical interface. The terminal is still there, but most people never see it. All those buttons, windows, sliders, and animations exist because of frameworks like the ones we touched on today. Beyond desktop software, the same principles apply to mobile apps, game engines, and even rendering inside a browser. The underlying idea is always the same: take a mathematical description of a shape and turn it into pixels.

## Insights

The biggest moment for me was connecting derivatives to how curves are drawn. I must have computed thousands of derivatives in school without ever thinking about what they were actually measuring visually. Hearing the professor explain that a curve's changing derivative is precisely what makes it different from a line made calculus feel like it was describing something I could see rather than just something on paper. The other connection I made was to HCI: design patterns for UI are not just about keeping code clean. They exist because of how users actually behave. Jakob's Law says that users spend most of their time on other websites, so they come to yours with existing expectations. Following design conventions is not laziness, it is respecting what users already know. I had not thought about graphics and usability as being that closely linked before this session.

## Self-Study & Resources Consulted

- **[GeeksforGeeks - Difference Between Computer Graphics and Image Processing](https://www.geeksforgeeks.org/computer-graphics/difference-between-computer-graphics-and-image-processing/)**: A clear side-by-side breakdown of how the two fields work in opposite directions: one builds images from data, the other analyzes images that already exist.

- **[TheServerSide - Swing vs. JavaFX: Compare Java GUI Frameworks](https://www.theserverside.com/tip/Swing-vs-JavaFX-Compare-Java-GUI-frameworks)**: A practical comparison of Java's main UI frameworks, covering why JavaFX replaced Swing as the recommended choice and what each one actually offers.

- **[YouTube - Java Graphics Programming Tutorial: Shapes, Paths, Curves, and Transformations](https://www.youtube.com/watch?v=zCiMlbu1-aQ)**: A hands-on intro to drawing 2D shapes and curves in Java, which connects directly to what the first few sessions of this course will cover.

## Key Takeaways

1. Computer graphics and image processing work in opposite directions: one builds images from mathematical models, the other analyzes or improves images that already exist.
2. Lines and curves differ at a fundamental level: a line has a constant rate of change, a curve does not, and that difference is what calculus was capturing all along.
3. Java has three graphical frameworks (AWT, Swing, JavaFX), each built to fix the gaps in the one before it, with JavaFX being what this course will actually use.
4. The GitHub and Markdown submission workflow is part of working like a developer from day one: version-controlled, documented, and easy to iterate on.
5. Design patterns for UI are not just a software engineering concept. They connect directly to how users behave, and understanding that link between graphics and usability is something that will matter well beyond this course.

---
