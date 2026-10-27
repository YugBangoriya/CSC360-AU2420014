# Session 20 - GitHub as the Silent Resume: Five Standards for a Professional Repository

**Session Date:** 22/10/26

**Entry Date:** 24/10/26

---

## Session Content

Session 20 was different from anything that came before it in the course. The presentations were over, and the session shifted entirely to reviewing the GitHub repositories themselves. Before starting, the professor framed the exercise with a point that set the tone for everything that followed:

> Your GitHub profile is the document a recruiter or interviewer looks at before your resume, not after. Your activity graph, your pinned repositories, and the quality of what is in them are visible to anyone. A clean, well-maintained GitHub tells a story that a polished PDF cannot replicate.

The professor then introduced five criteria that would be used to grade every group's repository. The first is the README, which acts as the front door of any project. A good README explains what the project is in plain language, shows it working visually through screenshots or GIFs, lists prerequisites and system requirements, and provides reproducible build and run instructions. The second is folder structure. For a Maven project, this means following the standard layout so that build tools, IDEs, and CI pipelines can all work with the project without manual configuration:

```
project-root/
├── pom.xml
├── .gitignore
├── README.md
└── src/
    ├── main/
    │   ├── java/          ← production source code
    │   └── resources/     ← FXML, CSS, images, configs
    └── test/
        └── java/          ← unit and integration tests
```

The `.gitignore` must exclude build output and IDE metadata. Deviating from this layout is not just a style preference; it breaks toolchains that depend on the convention.

The third criterion is commit message quality. Commits should follow conventional prefixes and be written in the imperative mood so the git history reads as a meaningful audit trail, not a personal diary:

| Poor | Good (Conventional Commit) |
| :--- | :--- |
| fixed bug | fix: handle null input in property validator |
| update readme | docs: add screenshots and Maven build steps |
| more tests | test: add edge case coverage for empty tree nodes |
| changes | refactor: extract tree traversal into separate utility class |

The fourth criterion is Javadoc, which the professor described as the second level of documentation. The README explains the project to the outside world. Javadoc explains the codebase to a developer who is reading or using it. Good Javadoc documents the contract of each method: what the `@param` tags accept, what `@return` delivers, and what `@throws` can happen. It does not restate what the method name already says. The fifth and most demanding criterion is automated testing integrated into the build. Unit tests and integration tests should be wired into the Maven build lifecycle so that running `mvn test` either passes or halts the build. Tests are not an optional add-on; they are part of the evaluated artifact.

After laying out the framework, the professor walked through the repositories for Groups 1 through 6 and assessed each one against all five criteria. The variation across groups was significant. Some had polished READMEs with clear instructions and thoughtful commit histories. Others had visible gaps: generic commit messages, missing Javadoc, or test files that existed but were not wired into the build. Watching the live review made it clear that these criteria are not abstract standards. They are directly visible to anyone who opens the repository, and they form an impression before a single line of code is read.

## What Else I Remember

The professor noted that GitHub activity is cumulative and cannot be manufactured at the last minute before a job application. The contribution graph is timestamped and public. The best time to build a strong repository record is while actively working on the project, because that is when the commits are real and the history is honest. He also mentioned that Groups 7 through 12 would be reviewed in the following session.

## What I Understood Well

The five criteria together answer five questions that any experienced developer or evaluator would have when opening an unfamiliar repository. The README answers what is this and how do I run it. The folder structure answers whether this project is maintainable and tool-compatible. The commit history answers how this was built and whether the contributors understood what they were doing at each step. The Javadoc answers whether the code can be read and used without decoding every implementation detail. The tests answer whether the code actually holds up under edge cases and whether it can be safely changed later. Seeing them framed as five consecutive questions rather than a checklist made the logic behind each one much clearer.

## What I Found Challenging

Several groups had added GIFs to their READMEs to demonstrate their application in action, but the files were not rendering on GitHub as expected. They showed as broken links rather than animated previews. The lesson is that you should always verify what you push to GitHub by checking it from a different browser or another account, not just from your own logged-in session on the same device. What looks correct in a local preview may not be what someone else sees when they visit.

## Connections to Prior Sessions

The documentation discussion connects directly to Session 14, where writing the README for our own project revealed how different it is to describe a project from the outside rather than from inside the team that built it. The professor's framing of the README as the front door and Javadoc as the second level is a more structured version of the same insight from that session.

The commit message criterion connects to Session 6, where pull-before-you-work came up as a Git discipline and keeping the repository organised was discussed as a professional habit. Conventional commit messages are the natural extension of that: not just keeping the repo mechanically clean but making the history communicate intent so that anyone reading it later can follow the development arc.

## Real-World Applications Explored

Every serious open-source project on GitHub follows variations of all five criteria. The Maven standard layout and conventional commits are used across enterprise Java projects, and CI/CD pipelines in organisations like Jenkins and GitHub Actions depend on the test suite being integrated into the build to block merges when `mvn test` fails. For freelance or contract developers, a client evaluating their work before signing off will check the repository directly. The README is often the only thing they read before deciding whether the deliverable meets the brief.

For students applying for internships or entry-level roles, a GitHub profile with well-documented repositories and a genuine commit history is often what gets a resume past the first filter. Recruiters at technical companies increasingly use GitHub as a complement to or replacement for a portfolio section, precisely because the history is public, timestamped, and tells the story of how you actually work.

## Insights

What I did not expect from the session was the Claude moment. The professor was reviewing one of the repositories and noticed that Claude appeared in the contributors list alongside the human team members. He paused, noted it, and made the point that it matters whose name is on the work. Using AI assistance is not the problem. Having it show up as a named contributor to a project you are submitting under your own name is a different question entirely. It was a small moment but it landed clearly: the authorship of your work, especially in an academic and early-career context, is part of what you are being evaluated on.

## Self-Study & Resources Consulted

- **[conventionalcommits.org - Conventional Commits 1.0.0](https://www.conventionalcommits.org/en/v1.0.0/)**: The official specification for structured commit messages, covering the type/scope/description format, all standard commit types, and how the convention integrates with semantic versioning and automated changelog generation.

- **[Proxify - How to Assess a Developer's GitHub Contributions](https://proxify.io/knowledge-base/developer-types/how-to-assess-a-developers-github-contributions)**: Written from the perspective of a technical hiring platform, this article explains what experienced hiring teams actually look for when evaluating a developer's GitHub profile, including contribution consistency, code quality signals, and repository documentation.

- **[Oracle - How to Write Doc Comments for the Javadoc Tool](https://www.oracle.com/technical-resources/articles/java/javadoc-tool.html)**: Oracle's official guide on writing meaningful Javadoc, covering the correct use of @param, @return, @throws, and @see tags, and explaining the difference between documentation that adds contract clarity and documentation that just restates the code.

## Key Takeaways

1. GitHub is a professional document. A recruiter or interviewer will look at your repositories and contribution graph before they read your resume. A clean, active, well-documented GitHub profile is a signal that a PDF cannot replicate.
2. The five grading criteria (README, folder structure, commit messages, Javadoc, and automated tests) each answer a specific question an evaluator has when opening an unfamiliar repository. Together they determine whether a project reads as professional work or as a student submission.
3. Conventional commit messages (feat, fix, docs, refactor, test, chore written in the imperative mood) turn the git history into a readable record of how a project was built. Generic messages like "update" or "fix bug" destroy that readability.
4. Javadoc and the README serve different audiences. The README is for anyone who wants to understand or run the project. Javadoc is for a developer who needs to read or use the code without decoding every implementation detail.
5. If you add visuals to your README, verify that they render correctly for someone viewing the repository from outside your own account and device. Broken image or GIF links make documentation worse than no documentation at all.

---
