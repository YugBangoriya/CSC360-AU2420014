# Session 4 - Pixels, Square Geometry Algorithm and Project Organisation Conventions

**Session Date:** 18/08/26

**Entry Date:** 22/08/26

---

## Session Content

Session 4 opened with something that seems simple on the surface but gets interesting the moment you start thinking about it: pixels and screen resolution. The professor explained what a pixel actually is and walked us through how resolution works in practice. The part that stuck with me was the comparison between two screens with the same resolution but different physical sizes. If you take a 1080p display on a 13-inch laptop and a 1080p display on a 27-inch monitor, both show the exact same number of pixels. But on the larger screen, those pixels are spread out over a bigger area, so each pixel is physically larger. That is why images look sharper on smaller screens with the same resolution: the pixels are more tightly packed, giving you a higher pixel density. On a larger screen, the individual pixels become more visible and the image can look stretched or slightly blurry.

From there we moved into the core graphics topic for the session: how to draw a square programmatically. This sounds straightforward, but drawing a square correctly on a canvas is actually a coordinate problem. You do not just tell the computer to draw a square. You need to specify exactly where its four corners are. The professor introduced the idea of starting from a centroid, a fixed central point on the canvas, and then calculating the four corners from that point using the side length. Alongside the coordinates, we also discussed the need for additional arguments like width, height, and color to make the square actually appear on screen. This connected the geometry of a square directly to a drawing algorithm, which was the conceptual highlight of the session.

The second half shifted away from graphics and into project structure. The professor explained how professional software projects are typically organised: a src folder for source code, configuration files like pom.xml which defines a Maven project along with its dependencies and build settings, and a .gitignore file that tells Git which files and folders to exclude from version control. The professor made a clear point about what should and should not be pushed to a repository. Things like compiled class files, build output folders, and environment files with project secrets should be excluded. Only the source code and configuration files that define the project belong on Git.

## What Else I Remember

The professor teaching this course also taught us DBMS in a previous semester, and he had mentioned the importance of Git back then too. What was different this time was watching the juniors hear about it for the first time. Over the past year I have gone from treating Git as something I had to use to something I genuinely rely on every time I work on anything. Seeing where they are right now reminded me of exactly where I was, and it was a good way to appreciate how much of this just takes time and repeated use before it actually clicks.

## Mathematical Concepts

To draw a square on a canvas, you need the coordinates of its four corners. If you fix the centroid, the geometric center of the square, at a point (cx, cy), and you know the side length L, you can calculate all four corners by moving exactly half the side length in each direction from the center.

The formula, verified from coordinate geometry:

```
Given centroid (cx, cy) and side length L, the four corners are:

  Top-left:     (cx - L/2,  cy - L/2)
  Top-right:    (cx + L/2,  cy - L/2)
  Bottom-right: (cx + L/2,  cy + L/2)
  Bottom-left:  (cx - L/2,  cy + L/2)
```

The logic is straightforward. Subtracting L/2 from cx moves left and adding L/2 moves right. In screen coordinates, where y increases downward, subtracting L/2 from cy moves up and adding L/2 moves down. This gives four points that are equidistant from the center in all directions, which is what makes the shape a perfect square.

## Code / Implementation Done

The class discussed a basic pseudocode outline for the square drawing algorithm. The idea is to take the centroid, side length, and color as inputs, compute the four corners, and then draw four lines connecting them in order.

```
function drawSquare(cx, cy, L, color):

  Step 1: Compute the 4 corner coordinates using the centroid formula
  Step 2: Draw a line from top-left to top-right
  Step 3: Draw a line from top-right to bottom-right
  Step 4: Draw a line from bottom-right to bottom-left
  Step 5: Draw a line from bottom-left back to top-left
  Step 6: Apply the specified color
```

The pseudocode stays at the logic level rather than Java-specific syntax. The key point it makes clear is that drawing a square is really just drawing four connected lines between four calculated points.

## What I Understood Well

The pixel density explanation made complete sense to me. Two screens can have the same resolution but very different image quality depending on their physical size, because the same number of pixels spread across a larger area means each pixel is bigger and more visible. The centroid formula also clicked well. Once I understood that the center is the midpoint between all four corners, it was obvious that each corner sits exactly L/2 away from the center in both x and y, and the formula follows naturally from that.

## What I Found Challenging

Nothing in this session felt genuinely difficult. The concepts were clear and logically connected. The only moment of mild confusion was around pom.xml and the target folder, specifically which one needs to be committed to Git and which should be ignored. The professor explained it as well as I referred to my SGA Software files too, and it made sense after: pom.xml defines the project and belongs on Git, while the target folder is generated at build time and should be gitignored. It just took a small conversation to sort out the distinction.

## Connections to Prior Sessions

The pixel discussion connects directly to Session 2's raster vs vector topic. Raster images are made of pixels, and now there is a concrete sense of what that means in practice: fixed grids of individually coloured dots whose apparent quality changes depending on how spread out they are across a screen. The coordinate system used in the square formula also builds on Session 3, where we first worked with x and y coordinates to position shapes on a canvas. Computing corners from a centroid using L/2 offsets is a more deliberate and mathematical version of the same idea.

## Real-World Applications Explored

During my summer break I built a project of my own, and looking back at its folder structure now, I can see it follows the exact conventions the professor described today: a src folder for source code, a gitignore file, and a clear separation between what gets committed and what stays local.

Here is the link to that project:
**[SGA-Software](https://github.com/YugBangoriya/SGA-Software)**

It was a vibe-coded project, so I was not consciously thinking about these rules at the time and asked AI to help me with the project setup, but they were already there. Seeing them discussed in a classroom context made me realise these are not arbitrary conventions. They are standard practices that real projects follow because they make collaboration and long-term maintenance actually manageable.

## Insights

What struck me was that I had already been following these project structure conventions without knowing their names or the reasoning behind them, and this session gave me the vocabulary to understand what I had been doing all along.

## Self-Study & Resources Consulted

- **[ViewSonic - Monitor Resolution and Pixel Density: A Comprehensive Guide](https://www.viewsonic.com/library/tech/monitor-resolution-aspect-ratio/)**: A clear breakdown of how pixel density works and why the same resolution on a larger screen produces a lower quality image than on a smaller one.

- **[javathinking.com - What Files in a Maven Project Should Be Committed to Git?](https://www.javathinking.com/blog/what-files-in-a-maven-project-should-be-committed-to-git/)**: A practical guide covering which files belong in a Maven project's Git repository, including the role of pom.xml, the src folder, and what the gitignore file should exclude.

## Key Takeaways

1. Screen resolution and screen size are not the same thing. The same resolution on a larger screen means lower pixel density, so each pixel is physically bigger and images look less sharp.
2. Drawing a square programmatically is a coordinate problem. You fix a centroid, compute the four corners using L/2 offsets in both x and y, and then draw four lines connecting them.
3. The centroid formula (cx +- L/2, cy +- L/2) is basic coordinate geometry. Each corner sits exactly half a side length away from the center in both x and y directions.
4. Files like pom.xml define the project and belong on Git. Build output like the target folder and compiled class files are generated automatically and should be gitignored.
5. The .gitignore file is not just a cleanup tool. It actively protects a repository from having sensitive files like environment variables accidentally committed.

---
