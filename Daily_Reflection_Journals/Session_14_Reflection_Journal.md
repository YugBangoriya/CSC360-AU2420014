# Session 14 - Last In-Class Sprint: Splash Screen and Project Documentation

**Session Date:** 29/09/26

**Entry Date:** 05/10/26

---

## Session Content

Session 14 was the last session dedicated to work on the project inside the classroom. There was no lecture. Instead, professor moved around the room and met with each group individually to review their visual interfaces, check progress, and help with anything that was still unclear before the final submission. It felt more like a design review than a class, and groups that had fallen behind had a direct opportunity to get guidance.

When the professor reached our group, we were in a good position. The project was almost fully done. The conversation was short because there was not much left to sort out. What came out of it was a brief ideation session among ourselves: was there anything still worth adding? After thinking through it, we agreed on one final feature, a splash screen. Functionally it is a small addition, but it has a clear impact on how the application is experienced when it first opens. Every well-built desktop app greets you with something before it loads, and we wanted ours to do the same.

Once that was settled, we split the remaining work. Part of the group took on implementing the splash screen while the rest moved into writing the project documentation, mainly the README and the Wiki on our GitHub repository. These are the two primary surfaces anyone will see when they look at our project, so getting them right is as important as the code itself.

## What Else I Remember

There was no academic learning from the faculty this session. It was entirely project time, structured around the professor's group-by-group walkthrough. Our group used the session productively. Because the bulk of the work was already done, we had enough time to both finalise what was left to build and actually start on the documentation before the session ended.

## Visual Observation

The UI rework I mentioned in the Session 13 reflection was now fully visible. The earlier version had a very utilitarian look, the kind of interface that gets the job done but does not feel like anyone thought about how it would look. It had the aesthetic of software from the 90s: flat, grey, and functional without any visual consideration. The redesigned version is a significant step forward. It is cleaner, better proportioned, and genuinely pleasant to look at. The rework made the project feel finished in a way the earlier version simply did not.

## Code / Implementation Done

The splash screen is the last feature being added to the project. A splash screen appears briefly when the application first launches, before the main window is shown. In JavaFX, the standard way to do this is through the Preloader class. The Preloader is a separate class that JavaFX runs before the main Application starts. It shows a lightweight window, typically the project name or a branded screen, and then hands off control to the main application once it is ready to load. For simpler cases, another approach is to open a separate Stage with a short fade transition and then close it before the main Scene appears.

For our project, the splash screen is mainly a branding moment. It shows the project name and a brief loading state before the tree editor UI appears. It is not technically complex, but it completes the experience. The application no longer opens abruptly. There is a proper entry point now, and it makes the project feel like a finished product rather than a prototype.

## What I Understood Well

Documentation is not an afterthought; it is part of what the project is. The source code is not readable to most people, and even for someone technical, understanding what a codebase does by reading the files alone takes significant time. A well-written README explains what the project is, why it was built, how to run it, and what it does, all in plain language. The Wiki goes one level deeper into the details. Together they are what makes the project accessible to anyone who encounters it on GitHub. Building something without documenting it is like finishing a presentation and then not showing up to deliver it. The outside world has no way in without documentation.

## What I Found Challenging

There was no technical blocker this session. The implementation work was clear and the group had enough direction to split tasks without much back and forth. The one thing that required real thought was deciding what belongs in the README versus the Wiki. The README should be a quick overview that answers the basic questions fast. The Wiki is where the detailed documentation lives. Drawing that line is more of an editorial call than a technical one, and it took some discussion to agree on where each piece of content should sit.

## Connections to Prior Sessions

The UI rework being visible this session is a direct continuation of Session 13, where it was planned and noted as in progress. Seeing it completed here closes that thread. The other connection is to Session 6, where pull-before-you-work came up as a Git habit and we briefly touched on the value of keeping the repository organised and legible. The README and Wiki work today is the same idea applied at a higher level: not just keeping the repo clean internally, but making it understandable to someone who arrives at it with no prior context.

## Real-World Applications Explored

Documentation as a deliverable shows up constantly in professional software development. When a developer opens an unfamiliar repository on GitHub, the README is the first thing they read. Projects with poor or missing documentation get ignored even when the code underneath is solid. I ran into this directly with my SGA Software project, where writing a detailed README that explains the architecture, setup steps, and feature list clearly enough for someone with no prior knowledge of the project was a significant piece of work on its own. That documentation is available at [github.com/YugBangoriya/SGA-Software](https://github.com/YugBangoriya/SGA-Software/blob/main/README.md). The same principle applies in corporate settings. Internal tools and developer SDKs ship with READMEs and setup guides because onboarding someone without them is simply too expensive.

## Insights

What struck me this session was how writing the documentation forced me to think about the project from the outside. To write the README well, I had to ask questions like "what would someone who has never seen this need to know first?" That perspective is genuinely different from how I think while building. Building is inside-out: you know the system so you make decisions from inside it. Documentation is outside-in. Doing it properly also makes you realise which parts of the project are still unclear even to you, which is a useful signal on its own.

## Self-Study & Resources Consulted

- **[Gurubase.io - Create Splash Screen JavaFX](https://gurubase.io/g/java/create-splash-screen-javafx)**: Walks through implementing a JavaFX splash screen using the Preloader pattern, with code for a progress bar and fade transition before the main application window appears. Directly relevant to what we are implementing.

- **[Cleverence - Create a Java Splash Screen: Step-by-Step Guide](https://www.cleverence.com/articles/oracle-documentation/create-a-java-splash-screen-guide-4837/)**: Covers multiple approaches for splash screens in Java including the built-in SplashScreen API, the Swing JWindow method, and the JavaFX Preloader pattern, with notes on when each approach fits best.

- **[freeCodeCamp - How to Write a Good README File](https://www.freecodecamp.org/news/how-to-write-a-good-readme-file/)**: A practical guide on structuring a project README with the right sections, explaining the minimum requirements and what actually makes documentation useful to someone reading it for the first time.

## Key Takeaways

1. Session 14 was the last dedicated project session in class. Our group was nearly done and used the time well, confirming the plan with the professor and settling on the splash screen as the final feature before submission.
2. A splash screen is a small but meaningful addition. It gives the application a proper entry point instead of loading abruptly, and the JavaFX Preloader pattern makes it possible to implement this cleanly without complicating the main application logic.
3. The UI redesign from Session 13 is complete and the visual difference is significant. A well-designed interface makes a project feel finished in a way that functionality alone cannot achieve.
4. Documentation is not separate from the project; it is part of the product. A README that clearly explains what was built, why, and how to use it is what makes the project legible to the world outside the team.
5. Writing good documentation requires thinking about the project from an outside perspective. That shift in mindset is different from building, and going through it often surfaces things that are still unclear even to the people who built it.

---
