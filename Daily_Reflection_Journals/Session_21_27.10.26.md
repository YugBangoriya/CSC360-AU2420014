# Session 21 - Code Quality, Creativity, and What AI Actually Changes About Building Software

**Session Date:** 27/10/26

**Entry Date:** 29/10/26

---

## Session Content

Session 21 continued the GitHub repository grading exercise from Session 20. The professor walked through the repositories for Groups 7 through 10 against the same five criteria, but what made this session feel different was how it unfolded. Rather than a straight grading walkthrough, the professor used each repository as a live prompt to share broader observations about how things work outside the classroom. He was actively interacting with the class as he reviewed each repo, flagging patterns in the code and turning them into real-world lessons as he went.

The code quality discussion came up naturally as he went through the actual source files. A few specific habits stood out as important industry practices:

1. **Inline comments explain WHY, not WHAT.** The code already says what it does. A comment that restates the line adds noise. A comment that explains the reasoning behind a decision, why a particular approach was chosen or why a value is what it is, adds actual meaning for the next person who reads the file.

2. **Consistent formatting across the codebase.** Uniform indentation, spacing, and naming conventions signal that the team coordinated and wrote the code with a reader in mind. Inconsistency makes it harder to parse at a glance, even when the logic underneath is correct.

3. **Code as communication.** The best code is written for the next developer, not just for the compiler. A function that runs but takes twenty minutes to understand is worse than one that takes a moment longer to write but reads clearly.

Alongside the review, the professor made a point about creativity that felt less like a technical note and more like a mindset shift. Engineering projects, he said, should try to create curiosity rather than explain themselves. A project that makes someone stop and ask "how did they build this?" is more compelling than one that front-loads a walkthrough of every feature. The instinct to over-explain is common in technical work, and it is usually the wrong one.

He also spoke about what AI actually changes in software development, and the answer was more specific than it usually gets framed. Producing good code and documentation has become genuinely easier. But the hard part has not changed: you can only use code immediately if you truly understand it. If you do not, you will spend the same time later figuring out what it does and whether it does it correctly. And on a bigger level, AI should be pointed at problems that genuinely exist. Cloning something already available on the internet, even if AI does the cloning faster, is not building anything new. The grading session will conclude in the next session, with Groups 11 and 12 still to be reviewed.

## What Else I Remember

The interactive format of this session made a difference. Because the professor was sharing these observations in real time as he moved through the repos, the points landed with more weight than they would have in a standalone lecture. Seeing real examples from the groups' actual code files, some with comments that just restated what the line was doing, made the WHY-not-WHAT principle concrete rather than abstract. The creativity point felt like it applied well beyond this course. And the AI observation — "you can use it immediately only if you already understand it" — was short enough to carry around as a principle.

## What I Understood Well

The inline comment principle is one of those things that sounds obvious but is easy to do wrong under pressure. When you are writing code quickly, it is natural to add a comment that says what the next line does rather than why you wrote it that way. The professor's framing made the distinction precise: the WHAT is already in the code. The WHY is what gets lost the moment you step away from the file. Good inline comments are essentially notes to your future self and to whoever comes after you, explaining the reasoning that was in your head at the time of writing but will not be visible from the code alone.

## What I Found Challenging

The session was discussion-based throughout and did not involve any implementation or problem-solving on my part. There was nothing technically challenging to report. The concepts covered were clear to follow, though the AI point about originality raised questions I did not fully resolve: at what point does AI assistance in building something make it yours versus the AI's?

## Connections to Prior Sessions

The code-as-communication discussion connects directly to Session 15, where the professor covered reusable and generic code. The argument there was about writing logic once so it can be read and applied broadly. Good inline comments are an extension of the same idea: code that communicates its intent is code that someone else can actually use, not just code that runs.

The professor's AI point about understanding what you build also connects to Session 18, where being asked questions about our own project's design decisions in the faculty Q&A made it clear that you need to understand your work to explain it. Code you generated with AI assistance but do not fully understand fails exactly the same test: the moment someone asks you why it is structured the way it is, you have no answer.

## Real-World Applications Explored

The professor's point about using AI to solve problems that genuinely exist rather than cloning what is already available maps directly to SGA Software, a project I built outside this course. A CNG fitment business needed a system that could manage customer records, generate invoices and quotations, handle CRM across WhatsApp, Facebook, and Instagram, track inventory, run sales analytics, auto-schedule follow-up messages, and maintain a repository of car details with images and videos. No off-the-shelf tool did all of this in a way that fit how the business actually operated. The project ([github.com/YugBangoriya/SGA-Software](https://github.com/YugBangoriya/SGA-Software)) was built with AI assistance as a tool, but the problem definition, the feature decisions, and the integration logic came from understanding the actual business workflow, not from cloning something that already existed. That is exactly the distinction the professor drew.

## Insights

When the professor said "try to create curiosity, not explain," and "use AI to solve problems that exist, not to clone what is already on the internet," SGA Software came to mind immediately. That project started from a genuine gap: the business had no system that could do what it needed, and building one required thinking about the problem first, not searching for a template to copy. The professor's framing gave me a cleaner way to describe what made that project worth building: it was original because the problem was specific, not because the technology was novel.

## Self-Study & Resources Consulted

- **[Real Python - Writing Comments: Best Practices](https://realpython.com/ref/best-practices/comments/)**: A practical guide to writing code comments well, covering the core principle of explaining WHY rather than WHAT, when inline comments add value versus noise, and the risk of comments that go stale when code changes around them. Directly relevant to the code quality discussion from the session.

- **[LeadDev - If Anyone Can Vibe Code a Product, Who Needs Developers?](https://leaddev.com/software-quality/if-anyone-can-vibe-code-a-product-who-needs-developers)**: A serious analysis of what AI-generated and AI-cloned software actually lacks: architecture, scalability, security, and the judgment built into mature products over years of use. Argues that the real value of a software developer is shifting toward the things AI cannot replicate, which connects directly to the professor's point about understanding your code and building something original.

## Key Takeaways

1. Inline comments should explain WHY a decision was made, not WHAT the code does. The code already shows the what. The reasoning behind it is what gets lost without a comment.
2. Consistent code formatting across a codebase is a signal that the team coordinated and thought about the next reader, not just the compiler. It is a small habit with a disproportionate effect on readability.
3. Creativity in engineering means making someone curious, not making someone informed. A project that raises the question "how did they do this?" is more compelling than one that answers every question before it is asked.
4. AI makes producing code easier, not understanding it. If you cannot explain what you built or why it is structured the way it is, the speed advantage of AI-assisted generation disappears the moment you need to maintain, extend, or defend it.
5. The real opportunity with AI is solving problems that genuinely exist and building something original, not cloning what is already available. A clone built faster is still a clone.

---
