# Session 12 - Project's First Demo - Project Build and Faculty Approval

**Session Date:** 15/09/26

**Entry Date:** 21/09/26

---

## Session Content

Session 12 was not a teaching session. The entire class period was dedicated to project work, and the faculty used the time to walk around and check in with each group individually: tracking progress, checking whether the pace was reasonable, and guiding groups on how to approach the actual build based on what they had been assigned. There were no slides and no new academic content. The room turned into a working lab for the day.

Our group was well prepared. We had discussed the concept, assigned roles, and settled on the project idea before this session, so we were not starting from scratch. Using Claude, we generated the initial source code for project: our local-first JavaFX application with a form panel for editing each node, and JSON-based persistence. We tested the code on one machine, got a first working demo on screen, and showed it to the faculty for feedback. He confirmed the project was heading in the right direction and gave his approval. We committed the source code to GitHub at the end of the session so every group member could clone it and start working individually from the same base.

## What Else I Remember

The faculty's check-ins with each group were not just progress updates: he was actively steering teams who were moving too fast or too slow, or who had misunderstood the scope of what their project needed to be. For my group, the approval after the demo was a useful checkpoint. It meant we were not building something for weeks only to find it did not match expectations.

## Visual Observations

(Link will be attached here directly as a GitHub Link)

First visual of Taskwood (Our Project), generated with Claude and tested live in session.

## Code / Implementation Done

The first working version of Taskwood was built and tested in this session. The application is a local-first JavaFX desktop tool that organises work into three levels: Workspaces contain Projects, and Projects contain Tasks. A TreeView on the left panel displays the full hierarchy and lets you navigate between nodes. Clicking any node opens its details in a form panel on the right where you can view and edit its properties. All data is automatically saved to a local JSON file when changes are made and reloaded the next time the application starts, so nothing is lost between sessions.

This session's code was generated with Claude's help, reviewed by the team, tested on one machine to confirm it ran as expected, and committed to the shared GitHub repository. Using Claude for the initial scaffolding is in line with the course outline, which explicitly permits AI assistance as long as students understand and can explain what they have built. The AI wrote the structure. The group understood it well enough to test it, evaluate whether it matched the requirements, and get it approved by the faculty.

## What I Understood Well

The line between writing code and directing code is getting thinner. The most important decisions in this session were architectural: what the three levels should be, how the tree should behave, what the edit panel should contain, and what the persistence format should look like. Claude wrote the implementation once we knew what we wanted. That split, between thinking through the design and generating the code, is exactly how SGA Software was built too: not by writing every line manually, but by directing what needed to exist and making sure the output actually matched that intent.

## What I Found Challenging

Nothing about this session was technically blocked, but there was a moment of uncertainty when we first saw the generated code: it was longer and more structured than expected, and it took some time to read through it and confirm it was actually doing what we planned. AI-generated code is only useful if you understand what it is doing. We read through the key parts before testing, which slowed things down slightly but was the right call. Running code you do not understand is not a good position to be in when the faculty asks how it works.

## Connections to Prior Sessions

This session is the direct continuation of Session 11, where Taskwood's concept, name, and structure were first decided. Everything that happened today, the build, the test, the approval, and the commit, was possible because the planning from Session 11 was solid. The GitHub commit at the end of this session also connects to the Git workflow introduced back in Sessions 2 and 3, where SSH setup and committing from a local machine were first covered. Those sessions made today's team workflow feel natural rather than something to figure out mid-session.

## Real-World Applications Explored

Vibe coding describes a workflow where the primary role shifts from writing code line-by-line to guiding an AI assistant to generate, refine, and debug an application through a more conversational process. This is exactly what happened in this session, and it is increasingly how professional teams operate. According to industry data, **72% of developers now use AI-powered coding tools daily, and 41% of global code is AI-generated** (daily.dev, 2026). The ability to direct an AI to produce a working scaffold, review it critically, and ship it is becoming as important a skill as writing the code itself was in the previous decade.

## Insights

What changed for me in this session was seeing it work on screen for the first time. There is a gap between deciding what to build and actually having a running application in front of you, and it closed very quickly with AI assistance. That speed is not just convenient: it changes how you think about building things. My SGA Software project from last year was also vibe coded, and at the time I thought of it as a shortcut. This session made me see it differently. The ability to get to a testable version fast is what lets you spend more time on the things that actually matter: whether the design is right, whether the user experience makes sense, and whether the faculty approves it before you build further on a wrong foundation.

## Self-Study & Resources Consulted

- **[daily.dev - Vibe Coding in 2026: How AI is Changing How Developers Code](https://daily.dev/blog/vibe-coding-how-ai-changing-developers-code/)**: The source for the adoption statistics cited in Real-World Applications, covering how 72% of developers now use AI coding tools daily and how team workflows are shifting as a result.

- **[IBM - What is Vibe Coding?](https://www.ibm.com/think/topics/vibe-coding)**: A concise overview of vibe coding as a development strategy where developers focus on outcomes and direction while AI handles the implementation, directly relevant to how this session's project work was approached.

- **[Addy Osmani - My LLM Coding Workflow Going into 2026](https://addyosmani.com/blog/ai-coding-workflow/)**: A practical guide by a well-known developer on how to treat an AI coding assistant as a pair programmer rather than an autonomous agent, covering how to give clear instructions, provide context, and reduce hallucinations by prompting the AI to ask for clarification rather than guess.

## Key Takeaways

1. The most important decisions in an AI-assisted project session are architectural, not syntactic. Deciding what to build and why is the work. The AI handles what it looks like in code.
2. AI-generated code must be read and understood before it is tested or submitted. Getting approval for code you cannot explain is not a valid outcome.
3. Getting a working demo in front of the faculty early is more valuable than spending longer on a version that might be misaligned. The approval checkpoint today saved potential rework later.
4. Committing the initial source to GitHub immediately after approval gives the entire team a clean starting point to branch and build from, without conflicting versions or setup confusion.
5. AI-assisted development is not a shortcut around understanding. It shifts what you need to understand: from implementation syntax to design intent, architecture, and critical review of generated output.

---
