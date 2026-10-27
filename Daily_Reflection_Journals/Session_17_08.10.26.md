# Session 17 - When the Problem Shapes the Stack: Project Presentations from Groups 4, 5, and 6

**Session Date:** 08/10/26

**Entry Date:** 13/10/26

---

## Session Content

Session 17 was the second round of project presentations. Groups 4, 5, and 6 each presented their work to the class, and the professor continued the same interview-style Q&A format from Session 16, probing decisions and edge cases after each demo. There was no new academic content from the faculty.

The most immediately noticeable thing about this batch was the variety in technology choices. All three groups from Session 16 had used JavaFX. This round was different. Group 4 submitted a pure Java console application with no GUI at all: just terminal input and formatted text output. Group 5 used Java Swing with Graphics2D rather than JavaFX. Group 6 used JavaFX but structured their UI using FXML, a declarative XML-based layout format that none of the other groups had used. Each choice said something about how the group had thought about their problem before writing any code.

Group 4 built an ASCII Tree Generator. You enter the number of parent-child relationships and type them one per line, and the program figures out which node is the root (the one that never appears as a child) and prints the full tree using the ├──, └──, and │ connectors. The traversal is iterative and stack-based, and the branch formatting is handled by a dedicated printer class that tracks context for each node. Group 5 built a set intersection visualizer. You enter two lists of items, and the app finds the common elements using HashSet operations, then draws curved arrows in Swing connecting the matching items side by side in two columns. The arrowheads use atan2 to calculate angle and direction. Group 6 built a splash screen and notes application in JavaFX. The splash screen is built with FXML and shows a logo, a progress bar with loading status messages, and the timestamp of the last time the app was opened. Once loading finishes, the app transitions to a notes editor that saves and reloads content from a file and warns you before closing without saving.

## What Else I Remember

The GitHub repositories for the three groups:

- Group 4 (ASCII Tree Generator): [github.com/AI-AgentBuildr/CSC360-Group4](https://github.com/AI-AgentBuildr/CSC360-Group4)
- Group 5 (Set Intersection Visualizer): [github.com/jiyathakkar597/CSC360-Group5](https://github.com/jiyathakkar597/CSC360-Group5)
- Group 6 (Splash Screen and Notes App): [github.com/KesarThakkar1410/CSC360-Group-06](https://github.com/KesarThakkar1410/CSC360-Group-06)

Group 6's project had a direct overlap with what our own group is currently adding: a splash screen. Seeing their implementation using FXML and a progress bar gave a concrete reference for what that feature can look like when done well.

## What I Understood Well

Group 4 (ASCII Tree Generator) is a pure Java console program: the user provides parent-child pairs, the program identifies the root automatically as the node that never appears on the child side, and then prints the hierarchy to the terminal using ASCII box-drawing connectors. No GUI, no build system beyond basic javac. Just structured output.

Group 5 (Set Intersection Visualizer) is a Java Swing application that takes two lists as input, computes their intersection using HashSet operations, and draws curved arrows in a custom Graphics2D panel connecting the items that appear in both lists. The arrow angles and arrowhead shapes are calculated using trigonometry.

Group 6 (Splash Screen and Notes App) is a JavaFX application built with FXML. The splash screen shows a progress bar with live loading messages and displays the last time the app was opened, before transitioning to a text editor where notes are loaded from disk on startup, saved on demand, and protected against accidental loss when the window is closed without saving.

## What I Found Challenging

This was an observation session. There was nothing to implement or debug, and the Q&A was between the faculty and the presenting groups. Nothing in the session created a personal technical challenge to report.

## Connections to Prior Sessions

Group 5's use of Graphics2D and QuadCurve2D for drawing curves and arrowheads connects directly to Sessions 4 and 5, where the course covered Java 2D drawing using a Graphics2D context. Seeing a different group use the same API for a completely different purpose (curved relationship arrows rather than simple shapes) made it clear that Graphics2D is genuinely versatile and not just a teaching tool.

Group 6's splash screen also connects to the decision made in Session 14, where our group agreed to add a splash screen as the final feature before submission. Group 6 implemented theirs using FXML and a progress bar with status messages. Our group has not yet seen a working reference for that feature from another project, so seeing it presented here was directly useful context.

## Real-World Applications Explored

Group 4's ASCII tree output mirrors the Unix tree command exactly. The same connector characters and branching logic are used in terminal outputs for file system explorers, package manager dependency lists, and org chart generators. Any tool that needs to print a hierarchy in a readable text format uses this same approach.

Group 5's set intersection visualizer maps directly to data reconciliation tools. Database migration tools use the same visual idea: show which fields from one schema correspond to fields in another. The project's own README notes additional applications well: plagiarism detection, inventory reconciliation, and comparative genomics. Any scenario where two collections need to be compared and the matches need to be shown visually rather than listed in text is this project's use case.

Group 6's combination of a splash screen and a persistent notes application mirrors the pattern of almost every consumer desktop application: a loading screen on startup, persistent state between sessions, and unsaved-changes protection. Tools like Notepad++, VS Code, and any basic desktop note-taking app all follow this same pattern. It is straightforward but important because it is what makes an app feel finished and reliable to a user.

## Insights

What stood out most this session was that Group 4 chose to build a console application for a course in computer graphics. That might sound like a mismatch, but the tree printer they built is exactly what it needed to be. Adding a JavaFX window would not have made it better. The right tool is the one that fits the problem, not the most sophisticated one available. Seeing that presented without apology was a useful reminder that engineering decisions should be driven by the problem, not by what sounds most impressive.

## Self-Study & Resources Consulted

- **[dev.java - Using FXML](https://dev.java/learn/javafx/core/fxml/)**: The official Java developer portal's guide to FXML, explaining how it lets you declare the scene graph structure in XML markup and load it with FXMLLoader, keeping UI layout separate from application logic. Directly relevant to how Group 6 built their splash screen.

- **[careerkarma.com - JavaFX vs Java Swing](https://careerkarma.com/blog/javafx-vs-java-swing/)**: A side-by-side comparison of the two Java GUI frameworks covering design philosophy, component availability, styling, and when each makes sense. Useful context for understanding why Groups 4 and 5 ended up using different stacks from the rest of the class.

## Key Takeaways

1. The three groups in this round made noticeably different technology choices: a console application (Group 4), Java Swing with Graphics2D (Group 5), and JavaFX with FXML (Group 6). The stack each group used matched what their problem actually needed.
2. Group 4's ASCII tree printer shows that a console application is a valid deliverable when a GUI adds nothing to the core functionality. The problem should drive the tool choice.
3. Group 5's use of HashSet intersection and Graphics2D curve drawing brought together two concepts, data structure operations and custom 2D rendering, that the course covered separately in earlier sessions.
4. Group 6's FXML-based splash screen is a direct reference point for our group's own final feature, and it showed what a well-structured splash screen with a progress bar and status messages looks like in practice.
5. Across both presentation sessions so far, the groups that answered the professor's Q&A most confidently were the ones who could explain not just what their code does, but why it is structured the way it is.

---
