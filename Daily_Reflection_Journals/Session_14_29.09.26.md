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

## Visual Observations

The UI rework I mentioned in the Session 13 reflection was now fully visible. The earlier version had a very utilitarian look, the kind of interface that gets the job done but does not feel like anyone thought about how it would look. It had the aesthetic of software from the 90s: flat, white, and functional without any visual consideration. The redesigned version is a significant step forward. It is cleaner, better proportioned, and genuinely pleasant to look at. The rework made the project feel finished in a way the earlier version simply did not.

<img width="786" height="480" alt="Grove - New UI Preview" src="https://github.com/user-attachments/assets/9a021f06-4185-4f53-9b3a-505b1d394fd0" />

## Code / Implementation Done

The splash screen is the last feature being added to the project. A splash screen appears briefly when the application first launches, before the main window is shown. In JavaFX, the standard way to do this is through the Preloader class. The Preloader is a separate class that JavaFX runs before the main Application starts. It shows a lightweight window, typically the project name or a branded screen, and then hands off control to the main application once it is ready to load. For simpler cases, another approach is to open a separate Stage with a short fade transition and then close it before the main Scene appears.

For our project, the splash screen is mainly a branding moment. It shows the project name and a brief loading state before the tree editor UI appears. It is not technically complex, but it completes the experience. The application no longer opens abruptly. There is a proper entry point now, and it makes the project feel like a finished product rather than a prototype.

## What I Understood Well

The README and the Wiki serve different purposes, and understanding that distinction is what makes documentation actually usable rather than just technically present. A README is the elevator pitch for the project. Someone landing on the repository for the first time should be able to read it in a couple of minutes and come away knowing what the project is, what it does, and how to run it. The Wiki is where the depth lives: architecture decisions, feature explanations, known limitations, and contribution steps. Writing both without that boundary in mind produces a README that is too long and a Wiki that just repeats it. Getting the split right means each document does its job without the other one needing to compensate.

## What I Found Challenging

There was no technical blocker this session. The work was distributed and everyone had a clear task. If I am being honest, the harder thing was a mindset one: knowing when a feature is good enough to ship. With the splash screen, there was a brief discussion about whether it needed more than just the project name and a loading indicator, or whether more elaborate branding was worth the time this close to submission. That line between done enough and spending time we do not have is not always obvious, and it came up more than once today.

## Connections to Prior Sessions

The UI rework being visible this session is a direct continuation of Session 13, where it was planned and noted as in progress. Seeing it completed here closes that thread. The other connection is to Session 6, where pull-before-you-work came up as a Git habit and we briefly touched on the value of keeping the repository organised and legible. The README and Wiki work today is the same idea applied at a higher level: not just keeping the repo clean internally, but making it understandable to someone who arrives at it with no prior context.

## Real-World Applications Explored

Documentation as a deliverable shows up constantly in professional software development. When a developer opens an unfamiliar repository on GitHub, the README is the first thing they read. Projects with poor or missing documentation get ignored even when the code underneath is solid. I ran into this directly with my SGA Software project, where writing a detailed README that explains the architecture, setup steps, and feature list clearly enough for someone with no prior knowledge of the project was a significant piece of work on its own. That documentation is available at [github.com/YugBangoriya/SGA-Software](https://github.com/YugBangoriya/SGA-Software/blob/main/README.md). The same principle applies in corporate settings. Internal tools and developer SDKs ship with READMEs and setup guides because onboarding someone without them is simply too expensive.

## Insights

What struck me this session was how writing the documentation forced me to think about the project from the outside. To write the README well, I had to ask questions like "what would someone who has never seen this need to know first?" That perspective is genuinely different from how I think while building. Building is inside-out: you know the system so you make decisions from inside it. Documentation is outside-in. Doing it properly also makes you realise which parts of the project are still unclear even to you, which is a useful signal on its own.

## Self-Study & Resources Consulted

- **[jewelsea - JavaFX Splash Screen with Fade Transition](https://gist.github.com/jewelsea/2305098)**: A widely referenced code example from a recognised JavaFX contributor showing a splash screen with a fade animation, progress bar, and background Task, closely matching the Preloader-based approach we are using.

- **[freeCodeCamp - How to Write a Good README File](https://www.freecodecamp.org/news/how-to-write-a-good-readme-file/)**: A practical guide on structuring a project README with the right sections, explaining the minimum requirements and what actually makes documentation useful to someone reading it for the first time.

## Key Takeaways

1. Session 14 was the last dedicated project session in class. Our group was nearly done and used the time well, confirming the plan with the professor and settling on the splash screen as the final feature before submission.
2. A splash screen is a small but meaningful addition. It gives the application a proper entry point instead of loading abruptly, and the JavaFX Preloader pattern makes it possible to implement this cleanly without complicating the main application logic.
3. The UI redesign from Session 13 is complete and the visual difference is significant. A well-designed interface makes a project feel finished in a way that functionality alone cannot achieve.
4. Documentation is not separate from the project; it is part of the product. A README that clearly explains what was built, why, and how to use it is what makes the project legible to the world outside the team.
5. Writing good documentation requires thinking about the project from an outside perspective. That shift in mindset is different from building, and going through it often surfaces things that are still unclear even to the people who built it.

---
