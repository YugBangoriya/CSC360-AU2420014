# Session 16 - Presenting Is Not the Same as Building: Project Demos and Interview Q&A

**Session Date:** 06/10/26

**Entry Date:** 09/10/26

---

## Session Content

Session 16 was a peer presentation session with no new academic content from the faculty. Groups 1, 2, and 3 each presented their JavaFX desktop applications to the rest of the class. The format was not a slide-based walkthrough: each group ran a live demo of their app, and the professor observed, asked questions mid-presentation, and kept the audience engaged throughout. The session was organized entirely around watching and reacting to each other's work.

After each group presented, the professor ran what felt more like a technical interview than a regular classroom Q&A. The questions were not about what the app does. They went further: "why did you structure it this way?", "what would break at scale?", "how does your code handle this edge case?". The professor was explicit that this was intentional. In a professional setting, presenting a project is not just showing the features. A technical interviewer will probe the decisions behind it, and you need to be ready to discuss them clearly, including the parts you would do differently. Watching other groups get asked these questions was useful in its own right because it showed what that kind of pressure actually looks like.

All three groups built entirely different applications despite working with the same tech stack of Java 21, JavaFX, and Maven. Group 1 built TriangleFX, a geometry solver that takes three linear equations, computes their pairwise intersection points using determinants, validates that those points form a real triangle using the Shoelace formula for area, and renders the result with side lengths, perimeter, and an auto-scaled coordinate grid. Group 2 built a directed graph editor where nodes and arrows are placed entirely by mouse, with full undo and redo history, JSON persistence, and one-click export to PNG or SVG. Group 3 built a binary tree visualizer that takes a list of integers, builds a level-order binary tree from them, and renders it using a layout engine that computes exact XY positions to guarantee no nodes overlap, scaling dynamically with window size and a user-controlled spacing slider.

## What Else I Remember

The GitHub repositories for the three groups are below, and all three are worth reading through.

- Group 1 (TriangleFX): [github.com/Devang280904/CSC360-Group1](https://github.com/Devang280904/CSC360-Group1)
- Group 2 (Graph Editor): [github.com/varunkarthic/CSC360-Group2](https://github.com/varunkarthic/CSC360-Group2)
- Group 3 (Binary Tree Visualizer): [github.com/PrashamMehta-04/CSC360-Group-3](https://github.com/PrashamMehta-04/CSC360-Group-3)

What stood out across all three was that the shared stack did not produce similar-looking projects at all. The problem each group chose and the design of the visual layer made them feel completely distinct from each other.

## What I Understood Well

Group 1 (TriangleFX) is a JavaFX geometry solver: enter three linear equations, and it finds where each pair of lines intersects using determinants, checks that the three intersection points form a valid non-degenerate triangle with the Shoelace formula, and draws it with labelled corners, side lengths, and a smart coordinate axis.

Group 2 (Graph Editor) is a JavaFX directed graph editor: click to place nodes, drag to connect them with directed arrows, drag back along an existing arrow to make it bidirectional, and undo or redo every action through a command pattern built on a hand-written linked-list stack. The graph saves to JSON and exports to PNG or SVG.

Group 3 (Binary Tree Visualizer) is a JavaFX app for building and rendering level-order binary trees: paste in a list of integers, and a layout engine computes the XY position of every node so that no branches ever cross or overlap. A spacing slider lets you adjust the vertical gap between levels in real time, and the max node count caps automatically based on the viewport size.

## What I Found Challenging

This was an observation session. There was nothing to implement or debug, and the Q&A was conducted between the faculty and the presenting groups. Nothing in the session created a personal technical challenge to report.

## Connections to Prior Sessions

The Maven build setup and the mvn javafx:run workflow all three groups used connects directly to Session 6, where we first set up Maven for our own project and the professor explained pom.xml as the reproducible build contract that makes the project runnable on any machine. Seeing three other groups use the same setup confirmed that it is genuinely the standard approach for this kind of project.

Group 2's command pattern, where an EditCommand interface defines apply and undo and eight concrete classes implement it, is a strong example of the reusable code and generic programming ideas from Session 15. One interface covers eight different operations, each of which is swappable, undoable, and testable in isolation. The pattern did not come up by name in Session 15, but the session's ideas about writing logic once and making it composable are exactly what this architecture does in practice.

## Real-World Applications Explored

TriangleFX's approach to computational geometry, finding intersection points and checking geometric validity, appears in GIS tools, survey software, and architectural design tools where real-world regions are defined by the lines that bound them. The same determinant-based intersection logic is used in physics engines for collision detection.

The Graph Editor maps directly to tools like draw.io, Mermaid, and UML editors. Any tool that lets a user draw boxes and arrows between them, whether for a workflow diagram, a network map, or a database schema, is solving the same problem Group 2 solved: persist nodes and edges, handle selection and movement, export to a portable format.

The Binary Tree Visualizer is closest to the kind of educational and debugging tool that CS students and developers use when working with tree-structured data. File system browsers, syntax trees in compilers, and expression evaluators all use binary tree structures under the hood. A visual tool that renders the tree from an input sequence is useful any time you want to check whether your insertion order is producing the structure you expect.

## Insights

What stayed with me from the interview-style Q&A was that the professor's questions were almost never about features. They were about decisions. "Why did you use a linked list here instead of an array?", "What happens if the user inputs duplicate values?". The right answer was not always knowing the perfect solution. It was knowing your own project well enough to reason about it out loud. A presenter who says "we did not handle that case and here is why we deprioritized it" comes across better than one who is caught off guard by the question. That is a different skill from building the thing, and this session was a useful first look at it.

## Self-Study & Resources Consulted

- **[Toward Data Science - How to Present Your Project in a Software Engineer Job Interview](https://towardsdatascience.com/how-to-present-your-project-in-a-software-engineer-job-interview-d4d3fc184308/)**: A practical breakdown of how to structure a project walkthrough for a technical interview, covering what to lead with, how to handle follow-up questions, and why running mock sessions with both familiar and unfamiliar reviewers is useful preparation.

- **[Northeastern University Careers - Technical Interview Guide](https://careers.northeastern.edu/resources/interview-type-technical/)**: An official university careers resource explaining what to expect in a technical interview, including the role of project walkthroughs, how to handle questions you do not immediately know the answer to, and the importance of explaining your reasoning out loud rather than just the answer.

## Key Takeaways

1. Presenting a project in an interview is a different skill from building it. The questions are about decisions and trade-offs, not just features. The ability to reason about your own project out loud, including its weaknesses, matters as much as what you built.
2. TriangleFX, the Graph Editor, and the Binary Tree Visualizer are three distinct approaches to a shared idea: make an abstract mathematical structure visible and interactive using JavaFX.
3. All three groups used the same Java 21, JavaFX, and Maven stack, but the problem domain and visual design choices made each project feel completely different from the others.
4. The command pattern in Group 2's Graph Editor, where one interface covers eight reversible operations, is a strong real-world example of the generic and reusable code ideas discussed in Session 15.
5. Watching other groups get asked probing questions by the professor made it clear that "knowing your project" means being able to speak to the parts that are incomplete or imperfect, not just the parts that work well.

---
