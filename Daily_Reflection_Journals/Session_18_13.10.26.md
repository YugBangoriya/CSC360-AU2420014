# Session 18 - Our Turn to Present: A Tree Editor, Concurrent Jobs, and a JavaFX-Swing Hybrid

**Session Date:** 13/10/26

**Entry Date:** 18/10/26

---

## Session Content

Session 18 was the third round of project presentations, and this one was different from Sessions 16 and 17 in one important way: our group was presenting. We had watched two rounds of other groups go through the professor's interview-style Q&A, and now we were on the other side of it. The professor kept the same format: live demo, followed by probing questions about the design decisions behind what was built.

Our group (Group 7) presented the Tree of Objects Editor. The project is a local-first JavaFX desktop application for building and navigating hierarchical data structures with unlimited nesting depth. Every node in the tree is either a Folder, which can hold child nodes, or an Item, which is a leaf. Any node can carry a set of key-value properties, which are edited in real time through a Property Inspector panel on the right side of the window. Every change saves automatically to a local binary file using Java object serialization, so nothing is lost between sessions. The interface uses the Catppuccin Mocha dark theme, which was one of the more visually distinctive choices across all the groups that had presented so far. Being asked to explain our design decisions by the professor, while the class listened, was a genuinely different experience from watching other groups go through the same process.

Group 8 presented a Composite Progress Bar application. The app runs three background jobs concurrently in a JavaFX window while keeping the interface fully responsive. Each job has its own progress bar and status label and can be cancelled individually or all at once. The technically interesting part is how the overall progress is calculated: instead of averaging the three job percentages equally, it uses a weighted formula where each job's contribution is proportional to how much total work it represents. A job with 200 units of work has twice the influence on the composite bar as a job with 100 units. The jobs run on background threads using JavaFX Task objects and an ExecutorService worker pool, while the UI updates happen on the JavaFX Application Thread.

Group 9 presented a registration form that does something technically unusual for this course: it runs both JavaFX and Swing components in the same window at the same time. A JavaFX TextField and Submit Button sit in the same scene as a Swing JComboBox, Swing JRadioButtons, a Swing JSlider for SGPA input, and a Swing JCheckBox for terms agreement. The Swing components are embedded inside the JavaFX scene graph using SwingNode. Because the two frameworks run on separate event dispatch systems, the form carefully routes every operation to the correct thread: Swing component updates go through SwingUtilities.invokeLater, and JavaFX label and styling changes go through Platform.runLater. The whole application is a single Java file with no FXML or CSS.

## What Else I Remember

The GitHub repositories for the three groups:

- Group 7 (Tree Objects Editor): [github.com/YugBangoriya/CSC360-Group7](https://github.com/YugBangoriya/CSC360-Group7)
- Group 8 (Composite Progress Bar): [github.com/Denim-Ahir/CSC360-Group8](https://github.com/Denim-Ahir/CSC360-Group8)
- Group 9 (Registration Form): [github.com/aryanjoshi15/CSC360-GROUP9](https://github.com/aryanjoshi15/CSC360-GROUP9)

Presenting in the same session as two other groups also meant watching their demos right after ours, which made the comparisons sharper. Group 8's threading model and Group 9's cross-framework architecture were both noticeably more technically ambitious than a straightforward JavaFX application.

## What I Understood Well

Group 7 (our project) is a JavaFX desktop application that organises hierarchical data as an unlimited-depth tree of Folder and Item nodes. Each node can hold a dynamic set of key-value properties managed through a real-time property inspector, and the full tree state is serialized automatically to a local binary file on every change.

Group 8 (Composite Progress Bar) is a JavaFX concurrency demo: three background jobs run in parallel using JavaFX Task objects submitted to an ExecutorService, each with its own cancellable progress bar, and a weighted composite bar reflects the overall progress scaled by each job's total work, not just a simple average.

Group 9 (Registration Form) is a JavaFX application that embeds Swing components (a JComboBox, JRadioButtons, a JSlider, and a JCheckBox) directly into a JavaFX scene using SwingNode, with cross-thread validation that routes between the Swing Event Dispatch Thread and the JavaFX Application Thread using SwingUtilities.invokeLater and Platform.runLater.

## What I Found Challenging

Being asked about your own project by the professor in front of the class is different from watching it happen to someone else. The questions about design decisions, such as why we chose binary serialization instead of JSON, or what happens when the saved file is corrupted, required articulating reasoning that we had acted on weeks ago without explicitly writing down. The challenge is not knowing the answer. It is translating the implicit understanding of a decision made during development into a clear, spoken explanation on the spot.

## Connections to Prior Sessions

Group 8's use of JavaFX Task objects and an ExecutorService worker pool connects directly to Session 6, where the professor explained why GUI frameworks are deliberately single-threaded and how the Event Dispatch Thread pattern enforces that discipline. JavaFX's Task API is that exact pattern applied to JavaFX: long-running work happens on a background thread, and all UI updates are routed back to the JavaFX Application Thread. Seeing it implemented in Group 8's project turned an abstract explanation from Session 6 into a concrete architecture.

Group 9's SwingNode approach is a practical answer to the Swing vs JavaFX comparison covered in Session 17's self-study. The two frameworks are not just alternatives to choose between: they can coexist in the same window using SwingNode for Swing inside JavaFX, or JFXPanel for JavaFX inside Swing. Group 9 demonstrated that the boundary between them is softer than it first appears.

## Real-World Applications Explored

A tree-structured editor like our project has direct parallels in tools people use daily. File system explorers, project hierarchies in IDEs, knowledge management apps like Notion and Obsidian, and configuration management systems all organise data as navigable trees with metadata attached to each node. The property inspector pattern (select a node, edit its attributes in a separate panel) is the same pattern used in property editors in Unity, IntelliJ, and most GUI design tools.

Group 8's composite progress bar is exactly what download managers, build pipeline dashboards, and backup tools display when multiple tasks are running in parallel. A CI/CD system showing the combined build progress across three parallel test runners uses the same weighted aggregation logic. The weighting is important because treating a 10-second test suite and a 10-minute test suite as equal contributors would make the overall bar misleading.

Group 9's SwingNode approach is how large enterprise Java applications migrate incrementally from Swing to JavaFX. Rather than rewriting an entire Swing application at once, teams can introduce JavaFX screens one at a time while the legacy Swing components continue to function in the same window. SwingNode was added to JavaFX specifically to support this migration path.

## Insights

Presenting our own project made something concrete that had only been an observation until now. When we watched Groups 1 through 6, the professor's question about a design decision was something the presenting group had to answer. In Session 18, it was our turn to answer it, and I realised that keeping notes about why you made a choice while you are making it is not just good documentation practice. It is what lets you answer that question clearly two months later. The decisions you made will be exactly right or exactly wrong, and either way you need to be able to explain them.

## Self-Study & Resources Consulted

- **[Oracle JavaFX Interoperability - Concurrency in JavaFX](https://docs.oracle.com/javase/8/javafx/interoperability-tutorial/concurrency.htm)**: Official Oracle tutorial explaining why the JavaFX scene graph is not thread-safe, how to delegate long-running work to background threads using the Task class and ExecutorService, and how to safely update the UI from those threads. Directly relevant to Group 8's architecture.

- **[Oracle JavaFX - Embedding Swing Content in JavaFX Applications](https://docs.oracle.com/javafx/8/embed_swing/jfxpub-embed_swing.htm)**: Official Oracle guide on the SwingNode class, explaining how to embed Swing components inside a JavaFX scene graph, how threading must be managed between the two frameworks, and the reverse use case of JFXPanel for embedding JavaFX inside Swing. Directly relevant to Group 9's approach.

## Key Takeaways

1. Presenting your own project under faculty Q&A is different from watching others do it. You know the project, but explaining the reasoning behind specific decisions clearly and quickly, on the spot, is a skill that needs practice separately from building.
2. Our project (Group 7) is a local-first JavaFX tree editor with unlimited nesting, a key-value property inspector, and auto-save via Java object serialization. Describing it to an audience that has never seen it sharpened how I think about what actually matters in the design.
3. Group 8's weighted composite progress bar is a strong example of JavaFX concurrency in practice: Task objects offload work to an ExecutorService pool, the UI stays responsive on the JavaFX Application Thread, and the composite bar uses weighted aggregation rather than a simple average.
4. Group 9's registration form shows that JavaFX and Swing are not mutually exclusive. SwingNode embeds Swing components inside a JavaFX scene, with cross-thread coordination managed explicitly between the two event dispatch systems.
5. Keeping notes about design decisions as you make them is not just documentation. It is preparation for the moment when someone asks you to justify those decisions out loud.

---
