# Session 7 - Java Build Artifacts, CI/CD Workflows and Encoding Systems

**Session Date:** 27/08/26

**Entry Date:** 31/08/26

---

## Session Content

Session 7 covered ground that sits at the boundary between software development practice and the kind of infrastructure thinking that real projects require. The professor opened with Java compilation artifacts: the outputs that javac and Maven produce when you build a Java project. When you write Java code, what you have are .java source files. Running javac on those produces .class files, which contain bytecode: not human-readable code and not machine-specific binary, but instructions for the Java Virtual Machine to execute. Maven then takes those .class files and packages them into a JAR file (Java ARchive), which is the actual distributable unit you deploy or share with other developers. The rule about what belongs on Git came directly from this: source code (.java files) and build descriptors like pom.xml should always be tracked in version control. Binary and generated files, meaning the target/ directory, .class files, and the packaged JAR, should never be committed. They are build outputs, not source, and storing them creates repository bloat, merge conflicts on generated files, and environment-specific discrepancies that break other developers' builds.

The discussion on pom.xml went deeper than what we had covered in Sessions 4 and 6. The professor explained how Maven uses it to orchestrate the full build lifecycle. Maven follows a sequence: compile .java files into .class bytecode, run the test suite, and then package the .class files into a JAR. Plugins defined in pom.xml, like the maven-jar-plugin, control exactly how the JAR is assembled: which classes go in, where the manifest file is, and which class serves as the entry point for an executable JAR. Without pom.xml, replicating that build on a different machine requires manual scripting and guesswork. With it, the build is entirely reproducible by anyone who clones the repository.

The session then moved into CI/CD, which stands for Continuous Integration and Continuous Delivery or Deployment. CI is the practice of frequently pushing code to a shared repository and triggering an automated pipeline that builds and tests the code on every push. The pipeline catches integration bugs before they accumulate into something harder to fix. CD extends that pipeline by automating what happens after the tests pass: packaging the artifact, publishing it, and deploying it to staging or production. A typical pipeline runs like this:

```
Git Push/PR  →  Checkout Code  →  mvn compile  →  mvn test  →  Package JAR  →  Publish Artifact  →  Deploy to Staging / Production
```

Tools like GitHub Actions, GitLab CI, and Jenkins are what actually run these pipelines. The key idea is that the pipeline replaces manual steps that are easy to forget or get wrong, and makes the process of releasing software consistent regardless of who pushed the change.

The session closed with a discussion on character encoding: UTF-8 and UTF-16. Both are Unicode encoding standards that translate characters into byte sequences. UTF-8 uses a variable-length scheme where ASCII characters take 1 byte and characters outside that range take 2, 3, or 4 bytes. UTF-16 also uses variable-length encoding but its minimum unit is 2 bytes, with most characters in the Basic Multilingual Plane taking 2 bytes and characters outside it taking 4. UTF-8 is extremely efficient for Latin-script text because common ASCII characters each cost only 1 byte. For scripts like Chinese, Japanese, and Korean, however, UTF-8 typically uses 3 bytes per character while UTF-16 uses only 2. UTF-8 is the dominant standard for the web and most modern systems. UTF-16, despite its higher baseline cost for ASCII text, is used internally by Java, JavaScript, and Windows because those platforms were built to handle a wide range of scripts efficiently.

## What Else I Remember

The professor briefly mentioned JWT tokens and session management in the context of building a Node.js application, specifically the point that a good and secured login system is the single most important thing to get right before anything else in the application. It was more of a mention than a full discussion, but it framed why security thinking in web applications has to be baked in from the start rather than added later. There was also a short discussion on unit testing and integration testing: projects are built over phases and each phase needs to be verified individually before moving to the next. Unit tests check individual components in isolation; integration tests check that those components work correctly together. The professor mentioned that when you join a company as a developer, your first role is often inside a testing framework, writing and maintaining tests rather than building new features. On the side, there was a brief conversation about how technical interviews work, how to present a proof of concept effectively, and how to handle questions you are not fully certain about.

## What I Understood Well

The Java compilation pipeline made complete sense after this discussion. The flow from .java to .class to JAR is logical when you think about it in stages: the compiler produces portable bytecode that any JVM can run, Maven packages that bytecode into a single distributable file, and pom.xml is the blueprint that makes the whole sequence repeatable across any machine. The connection between pom.xml and bytecode is not that pom.xml produces bytecode directly, but that it configures Maven, which in turn configures javac and the packaging plugins. The UTF-8 versus UTF-16 distinction also became clear once I stopped thinking of them as version numbers. They are both Unicode standards but optimised for different text profiles. UTF-8 is the efficient choice when most characters are ASCII. UTF-16 is more efficient when most characters are in scripts like CJK, where UTF-8 would need 3 bytes per character and UTF-16 uses 2.

## What I Found Challenging

My initial assumption about UTF-8 and UTF-16 was that they worked like software version numbers: UTF-16 is newer, so it must be better and should replace UTF-8 entirely. That was wrong. The numbers in their names refer to the bit-width of the encoding unit, not a version or release cycle. UTF-8 uses 8-bit units, so its minimum character size is 1 byte. UTF-16 uses 16-bit units, so its minimum is 2 bytes. That means UTF-16 is actually more expensive for ASCII-heavy text because it uses at least 2 bytes for characters that UTF-8 handles in 1. The clarification from the professor made this click: UTF-16 is not overkill in all cases, it is contextually appropriate depending on what kind of text you are processing. Once that replaced the version-number assumption in my head, the encoding discussion made much more sense.

## Connections to Prior Sessions

The Java build artifacts discussion extends what was first introduced in Session 4 and expanded in Session 6. In Session 4, the professor introduced the target/ directory and explained it should be gitignored, alongside pom.xml as part of project file structure. At the time I understood the rule but not fully why. Now it makes sense: target/ contains .class files and the packaged JAR, which are generated outputs. Committing them means tracking machine-generated bytecode alongside human-written source code, which creates merge conflicts and repository bloat without any benefit. Session 6 then covered Maven and pom.xml in depth. Session 7 showed pom.xml in action as the driver of the actual build and packaging lifecycle, making what was theory in Session 6 concrete. The thread across Sessions 4, 6, and 7 is really one continuous idea: understand your project's file structure, understand which files define it, and understand how the build tool uses those files to produce a runnable artifact.

## Real-World Applications Explored

In CSE250 Database Management Systems last semester, I built a secured login system for an admin panel as part of the course project. The system managed users, roles, and permissions through five tables: Users, Roles, and Permissions were the three main tables, while Role_Permissions and User_Roles were the two join tables linking them together. This is the RBAC (Role-Based Access Control) pattern, and building it made the professor's point very concrete: the login system is not one feature among many, it is the foundation that everything else depends on. If access control is wrong, no other part of the application is safe regardless of how well the rest is built.

The CI/CD pipeline discussion maps directly onto how real production teams work. Every major software company runs some form of CI/CD. When a developer pushes a change, automated pipelines build it, test it, and deploy it to staging before any human manually reviews the deployment. This is how large teams ship changes consistently without manually coordinating every release.

## Insights

The UTF-16 discussion left me with something I had not expected. Java String objects are stored in UTF-16 internally, which means I had been working with UTF-16 in every Java program I had written without ever being aware of it. Even when a Java program reads a UTF-8 file from disk, it converts the contents to UTF-16 for in-memory processing. The preference for UTF-16 in Java, JavaScript, and Windows is not arbitrary: it comes from the need to handle CJK scripts efficiently, where UTF-16 is genuinely more compact than UTF-8. Realising that it is a trade-off rather than a version hierarchy changed how I think about encoding choices. There is no universally better option. There is only the right tool for the kind of text you are working with.

## Self-Study & Resources Consulted

- **[WebNots - UTF-8 vs UTF-16: Key Differences, Benefits, and Use Cases Explained](https://www.webnots.com/utf-8-vs-utf-16-key-differences-benefits-and-use-cases-explained/)**: A clear breakdown of how both encodings handle characters differently, why UTF-8 dominates the web, and the specific scenarios where UTF-16 is the more efficient choice.

- **[InfoWorld - What is CI/CD? Continuous Integration and Continuous Delivery Explained](https://www.infoworld.com/article/2269266/what-is-cicd-continuous-integration-and-continuous-delivery-explained.html)**: A practical explanation of how CI/CD pipelines work, covering the automation of build, test, and deployment stages and the tools commonly used to run them.

- **[theserverside.com - What is Maven in Java?](https://www.theserverside.com/blog/Coffee-Talk-Java-News-Stories-and-Opinions/maven-course-tutorial-apache-java-jenkins-build-spring-eclipse-compile-test)**: A solid primer on Maven's role in Java project builds, how pom.xml drives the compile-test-package lifecycle, and how Maven integrates with CI/CD tools like Jenkins.

## Key Takeaways

1. Java compilation produces two types of outputs: .class bytecode files produced by javac, and JAR files assembled by Maven. Source code and pom.xml belong on Git; generated binaries and build directories do not.
2. The pom.xml connects to bytecode indirectly: it configures Maven, which in turn configures javac and the JAR plugins. It is the blueprint that makes the build reproducible across any machine or CI server.
3. CI/CD automates the path from a code push to a running deployment. CI handles build and test on every commit; CD handles packaging and release once the tests pass.
4. UTF-8 and UTF-16 are not versions of the same standard. UTF-8 is efficient for ASCII-heavy content and dominates the web; UTF-16 is efficient for CJK-heavy content and is used internally by Java, JavaScript, and Windows.
5. Security in web applications, specifically the login and access control system, is not a feature to build later. It is the foundation everything else sits on, and getting it wrong compromises the entire application.

---
