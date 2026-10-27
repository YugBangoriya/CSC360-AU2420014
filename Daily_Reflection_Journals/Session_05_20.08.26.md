# Session 5 - Markdown Best Practices, Java Syntax Revisited and OOP Fundamentals

**Session Date:** 20/08/26

**Entry Date:** 23/08/26

---

## Session Content

Session 5 was different from the previous ones in that it was less about introducing new graphics theory and more about consolidating what we have been building up. The professor started by going through our markdown reflections directly on GitHub, which was more useful than I expected. Seeing what classmates had done right and wrong, things like overloading a section with too much information, including sensitive details, or using inconsistent formatting, made the dos and don'ts feel concrete rather than abstract. The session then covered what a good reflection looks like in practice: information ordered by importance, no oversharing, clean formatting, and a flow that reads naturally rather than like a checklist. We also went over how to view markdown files without needing an IDE, such as directly on GitHub or through browser-based markdown previewers.

The second part of the session shifted back into Java. The professor did a code review using the practice program from Session 2, walking through how a Java 2D program is actually structured from the ground up. The flow that got clarified was something I had found confusing: you first create a JFrame, which is the window container, and then create a custom class that extends JPanel. That panel class is where all the drawing happens, inside an overridden paintComponent method. The panel is then added to the frame using frame.add(), not the other way around. Once I had that relationship straight, the rest of the structure made sense. super.paintComponent is called first inside the method to clear the background properly, and then you pass colors and coordinate arguments to the drawing methods to actually render shapes on screen.

From there the professor moved into classes, subclasses, and anonymous classes in Java. The example used was intuitive: a class Apple could extend a parent class Fruit, inheriting its properties while adding its own. This maps directly to how our drawing programs work. Our drawing class extends JPanel, which means it inherits all of JPanel's behaviour while letting us override the painting method to add custom drawing logic on top. Anonymous classes were also touched on briefly: classes defined and instantiated in a single expression without giving them a name, useful for short one-off implementations.

The session closed with a discussion on drawing algorithms. A rectangle needs only two points to define it: one corner and the diagonally opposite corner, and from those two points you can derive the full shape. A triangle needs three points, but not just any three. The professor pointed out that two of the points can be chosen fairly freely within a given range on the canvas, but the third must be chosen carefully so that the three points actually form a valid triangle rather than a degenerate straight line. This is where the Triangle Inequality Theorem comes in.

## What Else I Remember

The professor also briefly covered how to add a button to a JFrame. In the context of the Session 2 code, the JFrame is already the container and the drawing panel is added to it. Adding a button follows the same logic: create the button component and add it to the frame. It reinforced the idea that a JFrame is not just a window but a container you can keep populating with components as needed.

## Mathematical Concepts

The Triangle Inequality Theorem came up during the drawing discussion. The theorem states that for any valid triangle with sides a, b, and c, the sum of any two sides must always be greater than the third:

```
a + b > c
b + c > a
a + c > b
```

If any one of these fails, the three points are either collinear or too far apart to close into a triangle at all. The practical implication in graphics is that when you pick three points on a canvas to draw a triangle, you cannot assume they form a valid triangle without checking this condition first. That is why the professor said the third point must be chosen carefully: the first two can sit fairly freely within a range, but the third must satisfy the inequality relative to the distances already set by the first two.

## Code / Implementation Done

No new code was written this session. The focus was a structured review of the Session 2 practice program to understand the syntax and structure behind it.

The key elements reviewed:

```
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
```

Import statements bring in the libraries the program needs. javax.swing provides JFrame and JPanel. java.awt provides Graphics, Color, and BasicStroke. java.awt.geom provides extended geometric shape classes.

```
public class Java_Basic_2D_Program extends JPanel
```

This declares a public class that is a subclass of JPanel. The extends keyword is what makes it a subclass. It inherits all of JPanel's existing behaviour while letting us add custom drawing logic through method overriding.

```
protected void paintComponent(Graphics g) {
    super.paintComponent(g);
}
```

paintComponent is the method Swing calls automatically whenever the panel needs to be drawn or redrawn. Calling super.paintComponent(g) first ensures the background is cleared properly before any custom drawing is layered on top. Skipping this can cause rendering artifacts from previous frames.

```
Graphics2D g2d = (Graphics2D) g;
g2d.setColor(Color.BLUE);
g2d.drawRect(80, 80, 150, 150);
```

The Graphics object passed into paintComponent is cast to Graphics2D to access the full 2D drawing API. Colors are set as arguments before each draw call, and coordinate values are passed directly to methods like drawRect and fillOval.

```
JFrame frame = new JFrame("Java 2D - Basic Shapes");
frame.add(new Java_Basic_2D_Program());
frame.setVisible(true);
```

In the main method, a JFrame is created first as the window. An instance of the JPanel subclass is then added to it using frame.add(). The frame is made visible last, which triggers the first paint cycle.

## Tools & Libraries Used

The Session 2 practice program, which was reviewed this session, uses javax.swing for JFrame and JPanel, java.awt for Graphics2D, Color, and BasicStroke, and java.awt.geom for extended geometric shape support. These three libraries form the foundation of all Java 2D graphics work covered in this course so far.

## What I Understood Well

The markdown dos and don'ts were easy to absorb because we were looking at real examples rather than a list of abstract rules. Seeing what happens when someone overloads a section, leaves in sensitive details, or formats things inconsistently made the principles feel obvious rather than prescriptive. The classes and subclasses discussion also felt natural. I have worked with inheritance across Introduction to Programming, DSA, Cyber Security, and Software Engineering. Seeing it appear again in a graphics context just reinforced that these fundamentals carry across every subject and every project you work on.

## What I Found Challenging

The JFrame and panel relationship was genuinely confusing before this session. I had the direction backwards: I was picturing the frame going into the panel somehow, when it is actually the opposite. The JPanel subclass is what gets added to the JFrame, not the other way around. Once the professor walked through the code line by line and I could see frame.add() explicitly placing the panel inside the frame, the whole flow finally made sense and I stopped second-guessing which way the nesting went.

## Connections to Prior Sessions

The drawing algorithm discussion here connects to Session 4's square centroid formula. That formula was about deriving all four corners of a square from a minimal input: one center point and one side length. The progression feels intentional: start with a centroid and side length to define a square, then learn to generalise to rectangles with two corner points and triangles with three carefully chosen points. The code review also ties back to Session 3 where we first wrote and ran a basic 2D program. Going through it again with a focus on syntax and structure gave much more meaning to lines I had typed without fully understanding at the time.

## Real-World Applications Explored

The markdown writing principles discussed this session are the same ones that apply to any professional technical documentation, README files, API documentation, internal wikis, and project handoffs all depend on structured, readable writing with nothing sensitive left exposed. The Triangle Inequality also has direct applications in 3D graphics and mesh generation. When algorithms build triangular meshes for 3D models or game environments, they need to validate that every set of three candidate points forms a real triangle before including it. An invalid triangle in a mesh causes visible rendering errors in the final output, which is a real production concern in any graphics pipeline.

## Insights

Seeing the line public class Java_Basic_2D_Program extends JPanel through the lens of the subclasses discussion was a genuine moment of connection for me. I had typed that line in Session 2 without fully thinking about what it meant. This session made clear that it is not boilerplate: our drawing class is a subclass of JPanel, and everything JPanel does, rendering, layout, sizing, comes along with it through inheritance. That same concept from at least four other courses was quietly powering the graphics code the whole time. The other shift was fixing my mental model of the JFrame and panel relationship. The panel does not contain the frame. The frame contains the panel. Correcting that one reversed assumption made the entire Java 2D setup structure click into place in a way it had not before.

## Self-Study & Resources Consulted

- **[bogotobogo.com - Java Tutorial: Graphics Interface III - paintComponent](https://www.bogotobogo.com/Java/tutorials/javagraphics3.php)**: A clear walkthrough of how JPanel subclasses override paintComponent and how the panel is added to a JFrame, directly matching the code review covered in this session.

- **[GitHub Docs - Basic Writing and Formatting Syntax](https://docs.github.com/en/get-started/writing-on-github/getting-started-with-writing-and-formatting-on-github/basic-writing-and-formatting-syntax)**: The official GitHub guide to markdown formatting, relevant to this session's discussion on markdown best practices and how to write and preview formatted files correctly.

## Key Takeaways

1. In Java Swing, the JPanel subclass goes inside the JFrame, not the other way around. The frame is the window container and frame.add() is what places the drawing panel inside it.
2. super.paintComponent(g) must be called first inside paintComponent to clear the background before any custom drawing begins. Skipping it causes rendering artifacts from previous paint cycles.
3. The Triangle Inequality Theorem is a validity check for graphics: if three chosen points do not satisfy all three inequalities, they cannot close into a real triangle on screen.
4. Extending JPanel is not just a syntax requirement. It is inheritance in action, the same OOP concept from multiple prior courses, applied directly to how Java graphics work.
5. Good markdown follows the same principles as good documentation: structured, free of sensitive information, and ordered by importance. Reviewing real examples from classmates made these principles concrete.

---
