# Session 3 - Development Environment Setup and Basic Java 2D Drawing

**Session Date:** 13/08/26

**Entry Date:** 15/08/26

---

## Session Content

Session 3 was mostly a practical, hands-on class rather than a theory-heavy one. The professor started by asking everyone to check which version of Java they had installed. For a lot of the juniors in the class this was their first time working with Java seriously, so the professor walked through the installation process step by step. It was a necessary detour before we could get into any actual graphics work, and it made sense to get everyone on the same page before moving forward.

Once the environment was sorted, I moved into writing a basic Java 2D program. The goal was simple: draw a few shapes and understand the difference between filled shapes, outlined shapes, and shapes that have both. This was the first time I actually wrote graphics code in class, and while the program itself was short, it covered the three most fundamental things you do with a drawing API. You use draw methods for outlines, fill methods for solid fills, and you call both on the same shape if you want colour plus a visible border. Getting hands-on with this makes the whole idea of drawing shapes on screen feel much more concrete.

Towards the end of the session, the professor suggested using TortoiseGit for managing Git operations. I had initially assumed it was a CLI tool that runs in the terminal, but that was wrong. TortoiseGit is actually a GUI client. It integrates directly into Windows Explorer's right-click context menu, which means you can commit, push, pull, and manage branches without opening a terminal at all. It is a completely different approach from typing git push in PowerShell, and for people who are new to Git, it is probably a lot less intimidating.

On the personal side, I also set up a few extensions in Antigravity IDE for Java support, code visualization, file structure management, and GitHub commit history. These are not course requirements, but they make the workflow noticeably cleaner.

## What Else I Remember

One of the more memorable parts of the session happened outside the formal class structure. A few of the juniors were completely new to the whole setup: they had never generated SSH keys, never linked their device to GitHub, never installed an IDE, and never cloned a repository locally. I ended up helping a few of them get through the full process: SSH keygen, GitHub integration, IDE installation, and cloning their repo so they could push and commit directly from the IDE without going through the browser every time. It took a while but it was worth it.

## Visual Observation

A Java 2D window showing three shapes: a blue outlined square with no fill, a solid red circle with no border, and a green filled triangle with a black outline, each demonstrating a different use of the Graphics2D drawing API.
<div align="center">
<img width="768" alt="Shapes Preview" src="https://github.com/user-attachments/assets/d95c41ea-2374-4441-b3af-9f9367b506c1" />
</div>

## Code / Implementation Done

The program written in this session draws three basic shapes using Java's Graphics2D API inside a Swing JPanel. The first shape is a square drawn using drawRect, which produces only the outline with no fill, coloured blue with a stroke thickness of 3. The second shape is a circle drawn using fillOval, which produces a completely solid shape with no border, filled in red. The third shape is a triangle built by specifying three coordinate points, filled in green using fillPolygon, and then drawPolygon called on top with a black stroke to add the outline.

The main thing this program makes clear is the difference between draw and fill in the Java 2D API. One gives you an outline, the other fills the shape, and using both together on the same shape gives you colour and a visible border at the same time. Implementing this myself makes the concept click in a way that just reading about it would not.

## Tools & Libraries Used

**Antigravity IDE** was the primary development environment used for writing and running the Java program, along with extensions for Java support, code visualization, and GitHub commit history. **Claude** was used as an AI reference for help during the session.

## Insights

Helping my juniors set up their environments was satisfying in a way I did not fully expect. What surprised me was how clearly it brought back the memory of being in their position a few semesters ago, not knowing what SSH keys were, not understanding why cloning was different from downloading a zip, and finding the whole Git workflow unnecessarily complex. Being on the other side of that now and explaining it to someone else made me realise that the confusion juniors feel is not a lack of ability. It is just a lack of exposure, and that gap closes faster than it seems.

## Self-Study & Resources Consulted

- **[TortoiseGit - About](https://tortoisegit.org/about/)**: The official page explaining what TortoiseGit is: a Windows Shell Interface to Git that adds Git commands to Windows Explorer's right-click context menu, making version control accessible without the terminal.

- **[Oracle Java Tutorials - Working with Geometry](https://docs.oracle.com/javase/tutorial/2d/geometry/index.html)**: The official Oracle guide on using Graphics2D to draw shapes, covering how draw* produces outlines and fill* produces solid shapes, directly relevant to this session's practice program.

## Key Takeaways

1. TortoiseGit is a GUI client, not a CLI tool. It integrates into Windows Explorer's right-click context menu, making Git operations accessible without ever touching the terminal.
2. In Java 2D, draw* methods render an outline and fill* methods render a solid shape. Calling both on the same shape gives you colour plus a visible border.
3. Setting up Java, Git, SSH, and an IDE is essentially a developer's onboarding checklist. Going through it yourself, and then helping others through it, makes every step make a lot more sense.
4. Confusion around tools like Git is almost always about lack of exposure, not lack of ability. Helping juniors set up their environments was a good reminder of that.

---
