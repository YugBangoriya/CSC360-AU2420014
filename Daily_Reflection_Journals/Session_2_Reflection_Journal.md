# Session 2 - Getting Started with the Course

**Session Date:** 07/08/26

**Entry Date:** 09/08/26

---

## Session Content

We started with a quick recap of Session 1. The professor went over the difference between computer graphics and image processing, and the Java graphical frameworks we had touched on. It was a short revisit, but it helped ground the class before moving forward.

Then we got into SSH properly. SSH stands for Secure Shell. Before explaining it though, the professor first set up some context around Command Prompt and PowerShell. Command Prompt is the older, more limited Windows terminal. PowerShell is newer and has a lot more scripting power. Most regular users never touch either of these, and I think the point was to connect this to the bigger picture: before GUIs took over, terminals were how everyone interacted with computers. With that in mind, it made more sense to talk about SSH as a protocol that lets you connect to a remote machine securely, through that kind of command-line environment.

From there we covered the difference between HTTPS and SSH for GitHub. HTTPS works through tokens or passwords. SSH works through a key pair, which is both more secure and more convenient once it is set up. The professor then walked us through SSH keygen, the tool that generates that key pair. Running it creates two files: a private key that stays on your machine and a public key that you upload to GitHub. When you try to connect, GitHub checks whether your private key matches the public one it has on file, all without you ever sending the private key anywhere. The padlock analogy from this explanation stuck with me: your public key is a padlock you can copy and share freely, and your private key is the only thing that opens it.

The second half of the session shifted into actual graphics. We covered raster vs vector graphics, which was the conceptual highlight of the day. Then the professor introduced the difference between static and interactive graphics: static graphics are drawn once and stay fixed, while interactive graphics respond to user input in real time. By the end of the session we had a practice task to go home and work on.

## What Else I Remember

The SSH key process connects directly to how Git links your physical device to your remote account. Once the public key is on GitHub and the private key is on your machine, any push or pull you do goes through that authentication automatically. I remember doing this in my second year without really understanding what I was setting up. This session actually filled in the why behind those steps.

## Code / Implementation Done

The professor assigned a basic 2D Java program as a practice task, to be done after class and then pushed to GitHub. The goal is not to build anything complex. It is more about getting comfortable with Java's graphics API and the Git workflow: write some code, commit it, push it, and have it live on the repository. The task involves drawing basic shapes using Java 2D, which means setting up a window, overriding the paint method, and using a `Graphics` or `Graphics2D` object to render lines, rectangles, or similar shapes on screen. This is the first time I am touching Java's graphics API directly, so it is mainly about getting familiar with how the pieces fit together rather than producing something polished.

## What I Understood Well

The raster vs vector distinction clicked well for me. Raster images are stored as a grid of pixels, so they have a fixed resolution. When you scale them up, you are just stretching those pixels and the image becomes blurry or blocky. Vector images are stored as mathematical descriptions of shapes, so when you scale them, the math just recalculates to fit the new size and the result stays sharp. That is why logos and icons are almost always in vector format: they need to look clean whether they are on a tiny favicon or a billboard. It is not just a design preference, it is a fundamental difference in how the image data is stored and rendered.

## What I Found Challenging

SSH was the part that gave me the most trouble. The key pair concept makes sense at a surface level, but the details got fuzzy. What exactly happens during the handshake between client and server? Where does the private key live on your machine and how does the terminal know to use it? What does the SSH agent actually do? I understood enough to follow the setup during the session, and after reading a bit online things became clearer. But I still feel like I could not explain the full process from scratch without looking things up.

## Connections to Prior Sessions

Session 1 introduced the idea that lines and curves are described by their rates of change, basically the geometry and calculus underneath how shapes are defined. That same idea is showing up already in the vector graphics discussion: vector images are built on mathematical paths and formulas, which is the same kind of math we started talking about last time. The connection is not loudly obvious but it is there. We also mentioned graphical frameworks in Session 1 without writing any code, and now the practice task is pushing us to actually open the Java 2D API for the first time. Based on where the course seems to be heading, I think we will start going deeper into how shapes are drawn in code soon, though I am guessing at the pace more than anything.

## Real-World Applications Explored

In my second year I had to configure SSH for GitHub myself and I genuinely had no idea what I was doing. I ran the keygen command, copied something into GitHub settings, and hoped for the best. Now I actually understand what that process was doing. Beyond Git, SSH is used constantly in professional settings: connecting to cloud servers, deploying web applications, managing remote machines. The raster vs vector distinction also shows up everywhere in real-world design. In Photoshop, when you import a photo, it is raster data. The text and shapes you draw inside Photoshop stay sharp when resized because they are vector. Knowing which type you are working with, and why that matters, is basic fluency in any design or development workflow.

## Insights

The Photoshop moment was the one that actually landed. I had noticed before that imported images go blurry when you resize them in Photoshop, but the text and shapes you draw inside stay crisp. Now I know why: the photos are raster, and the text and shapes are handled as vector. Photoshop is working with both types at the same time without making it obvious. That made raster vs vector feel like something real I had already experienced, rather than just a concept being introduced for the first time.

## Self-Study & Resources Consulted

- **[GeeksforGeeks - Vector vs Raster Graphics](https://www.geeksforgeeks.org/computer-graphics/vector-vs-raster-graphics/)**: A solid breakdown of how raster images store fixed pixel grids while vector images store mathematical shape instructions, and what that means for scaling and file size.

- **[Kinsta - How to Generate SSH Keys for GitHub](https://kinsta.com/blog/generate-ssh-key/)**: A clear walkthrough of what SSH keys are, how the public and private key pair works behind the scenes, and how to set up authentication with GitHub step by step.

- **[Oracle Java Tutorials - Trail: 2D Graphics](https://docs.oracle.com/javase/tutorial/2d/index.html)**: The official Oracle guide to the Java 2D API, covering shapes, text, and rendering, directly relevant to the practice assignment.

## Key Takeaways

1. SSH stands for Secure Shell. It works by generating a key pair: your private key stays on your machine, and your public key goes to GitHub. Authentication happens by matching them, with no password ever sent over the network.
2. Raster images are pixel-based and lose quality when scaled up. Vector images are math-based and stay sharp at any size. That difference is not cosmetic: it is baked into how the data is stored.
3. Command Prompt and PowerShell are not the same. PowerShell has far more scripting capability, and understanding these tools is part of thinking like someone who works at a deeper level with computers.
4. Static graphics are drawn once and do not change. Interactive graphics respond to user input. That distinction matters more and more as we move toward building real applications.
5. The first coding task, writing a Java 2D program and pushing it to GitHub, is where the tooling setup from these first two sessions finally connects to actual graphics code.

---
