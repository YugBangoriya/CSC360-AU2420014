# Session 6 - Maven, Thread Safety and the Java 2D Complexity Roadmap

**Session Date:** 25/08/26

**Entry Date:** 29/08/26

---

## Session Content

Session 6 opened with a quick look at where the course is going in terms of drawing complexity. The professor laid out three stages: first, drawing a square, which we have already started; second, drawing a triangle; and third, drawing trees. That last one might sound straightforward, but trees in computer graphics are algorithmically interesting because their structure is recursive and branching. Having this roadmap upfront gave the session good context: we are not just drawing random shapes, we are building toward something more complex in a deliberate order.

Before getting into the session's main topics, the professor made a point about Git workflow that is worth internalising: always pull upstream changes from a shared repository before starting any new work. In a collaborative project, someone else may have pushed changes since the last time you synced, and starting work on an outdated codebase is one of the most common causes of merge conflicts. The fix is simple and takes seconds, but skipping it creates problems that can take far longer to resolve.

The bulk of the session was a detailed discussion on Maven and its pom.xml file. Maven is a build management tool for Java projects. The pom.xml, which stands for Project Object Model, is the file that tells Maven everything it needs to know about how to build the project: where the source files are, which external libraries the project depends on, how those dependencies should be downloaded, and what kind of output to produce, whether a JAR or a WAR file. Without this file, Maven has no idea what to do. It is essentially the single source of truth for the project's build process. The syntax uses XML tags to define elements like groupId, artifactId, and version, along with a dependencies block where each required library is listed with its own identifier. Maven then fetches those dependencies automatically from the Maven Central Repository, which means you never have to manually download and place JAR files into the project folder yourself.

The second half of the session went into threading, which connected closely to how Swing works. The professor first revisited the concepts of processes and threads. A process is an independent program running on the operating system, with its own memory space. A thread is a lighter unit of execution that runs within a process and shares the process's memory. When multiple threads access the same data simultaneously, the results can be unpredictable: one thread might read a value at the same moment another is writing to it, producing corrupted state. This is the thread safety problem. In Swing's case, the framework was designed around a single dedicated thread called the Event Dispatch Thread, which handles all GUI rendering and event processing. Having two threads work on the same drawing at the same time is a bad idea not just for performance reasons but for visual correctness: if one thread is midway through drawing a shape and another reads the drawing state at that moment, the user sees a partially drawn, broken output.

## What Else I Remember

The professor explained why Java's GUI package, Swing, is deliberately not thread-safe while many other Java packages are. Making Swing components thread-safe would require locking on every GUI operation, which adds overhead and makes the framework significantly harder to extend. The chosen design routes all GUI work through the Event Dispatch Thread, achieving safety through single-threaded access rather than through locks. The professor also mentioned Java's cold start delay: when the JVM starts up, it takes time to initialise before any code runs. This makes Java a poor choice for short scripts where that startup cost is noticeable relative to the actual work. For long-running server applications that stay alive for days or months, however, the startup cost is negligible and Java's strengths in memory management and threading become far more valuable.

## What I Understood Well

The Maven and pom.xml discussion was clear throughout. I understood that Maven is not just a convenience tool but a contract: the pom.xml defines the project so precisely that anyone who clones the repository and runs Maven gets an identical build environment without manually configuring anything. The dependency section made particular sense because it solves a problem I had faced before, which is having to manually hunt down JAR files and figure out where to place them. Maven handles all of that automatically. I also understood the processes and threads discussion well, partly because I had already studied this material in CSE340 Operating Systems. Seeing it come up again in the context of Java Swing was a useful reinforcement: the theory from that course explains exactly why Swing made the design choices it did, and the two subjects ended up cross-referencing each other in a way I did not expect when I took that course.

## What I Found Challenging

The concept of two threads working on the same drawing being a problem was something I initially found hard to visualise. I understood theoretically that concurrent access causes issues, but I could not immediately picture what that looks like in a drawing context. The professor explained it with a concrete scenario: imagine one thread is halfway through drawing a rectangle, it has drawn three sides but not yet the fourth, and at that exact moment another thread reads the drawing state and renders it to screen. The user sees a three-sided shape, which is wrong. Once I had that specific example in my head, the problem clicked immediately. Thread safety in GUI work is not just a performance concern: it directly affects what the user actually sees on screen.

## Connections to Prior Sessions

The Maven and pom.xml discussion builds directly on Session 4's introduction to project file structure, where the professor first mentioned pom.xml alongside the src folder and the gitignore file. That session gave the conceptual overview. This session filled in the detail: what pom.xml actually contains, why each element is there, and how Maven uses it during the build process. The threading discussion also connects to Session 5, where we saw that our drawing class extends JPanel. Now we understand that JPanel and Swing components are not thread-safe, which means the way we structure our drawing code is not just a style choice but a correctness requirement.

## Real-World Applications Explored

The pom.xml discussion reminded me directly of my SGA Software project from the summer. In that project I had to configure a gitignore file to keep node_modules and other build output folders out of the repository, so only the actual source code was tracked. The principle is the same as what was discussed today: separating what defines the project from what gets generated during the build process. The threading lesson also has direct real-world consequences in any application with a UI. Desktop applications, mobile apps, and web front-ends all face the same problem: if a background task such as loading data from a server tries to update the UI directly from its own thread, it can crash or corrupt the display. Every major UI framework, whether Android, iOS, or JavaFX, enforces the same single-thread-for-UI rule for exactly the same reasons Swing does.

## Insights

The threading discussion unlocked a connection I had not made before. In CSE340 Operating Systems, processes and threads were studied as scheduling and memory concepts, mostly in the abstract. Hearing the professor explain why Swing is not thread-safe and what concretely goes wrong when two threads try to draw simultaneously made those same concepts feel like real engineering decisions.

## Self-Study & Resources Consulted

- **[Oracle Java Tutorials - The Event Dispatch Thread](https://docs.oracle.com/javase/tutorial/uiswing/concurrency/dispatch.html)**: The official Oracle explanation of why Swing is not thread-safe and how the Event Dispatch Thread handles all GUI rendering and event processing safely through single-threaded access.

- **[InfoWorld - What is Apache Maven?](https://www.infoworld.com/article/2266043/what-is-apache-maven-build-and-dependency-management-for-java.html)**: A solid introduction to Maven and how the pom.xml acts as a complete description of a Java project's dependencies, build steps, and output format.

- **[GeeksforGeeks - Maven POM](https://www.geeksforgeeks.org/advance-java/maven-pom/)**: A clean reference for the pom.xml structure covering metadata, dependency management, and build configuration in a straightforward format.

## Key Takeaways

1. The course covers three levels of drawing complexity: squares, triangles, and trees. Each builds on the previous in algorithmic thinking, with trees introducing recursion as a graphics concept.
2. Always pull upstream changes before starting work on a shared repository. It is a ten-second habit that prevents merge conflicts that can take far longer to untangle.
3. The pom.xml is Maven's single source of truth. It defines the project's dependencies, build configuration, and output format so precisely that any developer can clone the repository and get an identical build without manual setup.
4. Swing is deliberately not thread-safe. All GUI operations must run on the Event Dispatch Thread to prevent concurrent access from producing incorrect or corrupted rendering output.
5. Two threads working on the same drawing simultaneously is a visual correctness problem, not just a performance concern. A partially drawn shape read by a second thread renders incorrectly on screen, which is exactly the kind of bug that is hard to reproduce and harder to debug.

---
