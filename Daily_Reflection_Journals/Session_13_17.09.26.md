# Session 13 - Project Feature Planning - Dark Mode, Drag and Drop and UI Refresh

**Session Date:** 17/09/26

**Entry Date:** 23/09/26

---

## Session Content

Session 13 was another project lab, a direct continuation of Session 12. The faculty again walked through each group, this time checking not just on progress but on how the team was working: were they pushing to GitHub regularly, were they following good practices to avoid merge conflicts since everyone is working independently on their own branches. The core advice was straightforward: commit often, push before pulling, and communicate before touching shared files. These are not new principles but they matter more when a team is working in parallel without being in the same room.

For my group, most of the session was spent on ideation rather than building. The first order of business was making sure the project actually ran on every team member's machine, since three of us are on Windows and one is on Mac. This kind of cross-platform check is easy to skip when development started on one machine, but it can hide path issues, font rendering differences, and JavaFX behaviour quirks that only appear on a different OS. Once we confirmed everyone could run it, we moved into planning what the next version of Taskwood should look like. The current state is functional but feels basic. We decided on two concrete features to add: a dark/light theme toggle and drag-and-drop for reordering nodes in the tree. Both are genuinely useful in a real interface, not just cosmetic additions. We also agreed the overall UI needs a refresh, moving away from the plain default look toward something with a cleaner, more modern tech-themed aesthetic, brighter and more purposeful while staying consistent with the current colour direction.

By the end of the session, we had split the planned work into individual take-home tasks distributed equally across the team. With exams starting September 19th and running through the 27th, the group will be working at a slower pace for the exam duration, which is why the ideation happened now but the actual implementation will follow later.

## What Else I Remember

The faculty's merge conflict guidance was worth noting specifically. The main point was that conflicts happen most often when people work on the same files without checking what others are doing. The practical fix is not just technical: it is about communicating clearly within the team before starting work on any shared part of the codebase. Having well-defined individual responsibilities makes this much easier.

## Code / Implementation Done

No new code was written or committed in this session. The team ideated and agreed on the next set of features: a dark/light theme toggle, drag-and-drop for rearranging tree nodes, and a UI redesign with a more attractive colour theme. With exams running from September 19th to 27th, implementing these was not realistic in the time available, so the work was divided into individual take-home tasks to be picked up after the exam period. The planning was the deliverable for this session, not the code.

## What I Understood Well

The human versus AI distinction in UI design is something I thought about more clearly in this session. AI is very good at generating interfaces that are technically correct, HCI-compliant, and convention-following because that is what it learned from. The output tends to look polished but generic, like a statistically averaged version of every UI it has ever seen. What humans bring is intentional deviation: the deliberate choice to break a convention because it creates something memorable, or to pick a colour that does not follow contrast guidelines strictly but feels right for the brand. The AI generates well from instructions. The human sets the creative direction that makes those instructions worth following.

That split maps onto what we are doing with our project: AI wrote the functional structure in Session 12, and now the group is doing the creative direction work of deciding what it should actually feel like to use.

## What I Found Challenging

The cross-platform test was the one moment of genuine uncertainty. JavaFX apps can behave slightly differently on Mac versus Windows, particularly with font rendering and file path handling for the JSON persistence. Getting confirmation that the app ran correctly on the Mac in the team was reassuring, but it flagged that this is something we will need to test again every time the codebase changes significantly. Compatibility is not a one-time check.

## Connections to Prior Sessions

The merge conflict discussion connects directly to the Git workflow introduced in Sessions 2 and 3, where SSH setup and basic commit/push workflows were first covered. Those sessions established the mechanics. This session was about the team discipline that makes those mechanics work across multiple contributors. The planned dark mode feature also connects back to Session 10's discussion on CSS layouts and styling in JavaFX: implementing a theme toggle means creating separate stylesheets and swapping them at runtime, which is exactly the kind of dynamic styling Session 10 pointed toward.

## Real-World Applications Explored

Dark mode and drag-and-drop are not just nice-to-have additions: they are features that appear in essentially every mature desktop application. VS Code has both. Notion has both. Figma has both. Users now expect them as defaults, not extras. The cross-platform testing done in this session reflects the same discipline used in professional software releases: no feature ships until it has been verified on every target operating system. A JavaFX application that works perfectly on Windows but breaks on Mac is not a finished product, it is half a product.

## Insights

The thing that stayed with me from this session was the gap between an AI-generated UI and a human-refined one. AI interfaces tend to feel correct but sterile. They follow HCI rules well enough but they do not surprise you or feel like they were made for you specifically. The human tweaks, the colour that breaks the rule but feels right, the layout that is slightly unconventional but more comfortable, are what make an interface feel alive. What struck me was that this is the same conclusion I reached in CSE519 HCI: Jakob's Law says follow conventions so users feel at home, but the interfaces people remember and love are the ones that borrowed the conventions and added something of their own on top.

## Self-Study & Resources Consulted

- **[Oracle JavaFX - Drag-and-Drop Feature in JavaFX Applications](https://docs.oracle.com/javafx/2/drag_drop/jfxpub-drag_drop.htm)**: The official Oracle tutorial on implementing drag-and-drop in JavaFX, directly relevant to one of the two features the team decided to add to Taskwood.

- **[GitHub - antoniopelusi/JavaFX-Dark-Theme](https://github.com/antoniopelusi/JavaFX-Dark-Theme)**: A ready-to-use CSS stylesheet for adding dark theme support to a JavaFX application, a practical reference for implementing the dark/light toggle planned for Taskwood.

- **[Atlassian - Git Merge Conflicts](https://www.atlassian.com/git/tutorials/using-branches/merge-conflicts)**: A clear guide on what causes merge conflicts in team repositories and how to prevent them, directly relevant to the faculty's guidance on team Git practices in this session.

## Key Takeaways

1. Cross-platform testing is not a one-time check. A JavaFX app that runs on Windows needs to be verified on Mac every time the codebase changes significantly, not just at the start.
2. Dark mode and drag-and-drop are not extras: they are expected features in any serious desktop application and make the difference between something that looks like a class project and something you would put on a CV.
3. Merge conflicts in team projects are as much a communication problem as a technical one. Committing often and talking before touching shared files prevents most of them.
4. AI generates well from instructions but defaults to averaged, convention-following design. The human's job in a vibe-coded project is to provide the creative direction that makes the output feel distinct rather than generic.
5. Planning and task distribution are their own form of project work. A clear ideation session with tasks assigned before an exam period is better than trying to build features while under study pressure.

---
