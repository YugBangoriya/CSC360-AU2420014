# Session 19 - Geometric Styling, a Library Browser, and the Final Presentation Round

**Session Date:** 15/10/26

**Entry Date:** 19/10/26

---

## Session Content

Session 19 was the fourth and final round of group presentations. Groups 10, 11, and 12 completed the full set of twelve projects across the class. The professor continued the same interview-style Q&A format after each demo. With this session, the evaluation block for the project work concluded.

Group 10 presented a library browser built around the master-detail layout pattern. The left panel (the master) holds a scrollable list of books. Selecting any item loads its complete record into the right panel (the detail), which shows the title, author, description, category, publisher, price, and publication date. A search bar filters the master list in real time. The project is clean and straightforward: it does one thing and does it well.

Group 11 presented what was arguably the most directly course-relevant project of all twelve: a Geometric Object Styler. The application lets you work on one geometric shape at a time, choosing from a Circle, Rectangle, Square, Ellipse, or five-point star Polygon. The control panel on the left covers the full range of 2D transformations: position (X/Y), width and height, rotation from 0 to 360 degrees around the object centre, independent scale for X and Y with an optional uniform lock, and separate translation sliders on top of the base position. The appearance panel handles fill (solid, linear gradient, radial gradient with individually set start and end colours), border colour and style (solid, dashed, dotted), opacity, and two combinable effects (drop shadow and glow). Everything updates live. The object can be dragged directly in the preview and controlled with keyboard shortcuts. Input validation prevents the shape from ever going off screen.

Group 12 presented a project with a noticeably different structure. Their repository had no README and was organised into Code, Data, Report, Results, and Video folders rather than a standard Maven layout. Based on that structure and what was visible during the demo, the project appeared to be a data or image processing project rather than a GUI application. The live demo and the faculty Q&A gave more context than the repository alone, but without a README the design rationale was harder to follow from the outside.

## What Else I Remember

The GitHub repositories for the three groups:

- Group 10 (Library Master-Detail): [github.com/NirjaraJain/CSC360-Group10](https://github.com/NirjaraJain/CSC360-Group10)
- Group 11 (Geometric Object Styler): [github.com/Sneha8125/CSC360-Group11](https://github.com/Sneha8125/CSC360-Group11)
- Group 12: [github.com/kamyaahduni/CSC360](https://github.com/kamyaahduni/CSC360)

Session 19 also marked the end of the full presentation block. Across Sessions 16 through 19, all twelve groups presented their projects. Looking back at the range, the variation in tools, problem domains, and presentation styles across those twelve demos was wider than I expected going in.

## What I Understood Well

Group 10 (Library Master-Detail Layout) is a JavaFX desktop app built around the master-detail pattern: a filterable book list on the left drives a live detail panel on the right that shows every field for the selected book, including title, author, description, category, publisher, price, and publication date.

Group 11 (Geometric Object Styler) is a JavaFX application for styling and transforming a single geometric shape: it covers translation, rotation, scale, flip, gradient fills (linear and radial), stroke styles, opacity, drop shadow, and glow, all applied interactively with mouse and keyboard support to one shape at a time.

Group 12 presented a project that, from the repository structure (Code, Data, Report, Results, Video folders, no README), appeared to be a data or image processing project rather than a GUI application. The demo provided more context than the repository, but with an empty README the project was harder to describe precisely from the outside.

## What I Found Challenging

Group 12's Q&A was harder to follow than the others specifically because there was no README context coming in. When you have read a group's documentation before the session, the professor's questions about design decisions make more sense. Without that reference, the Q&A for Group 12 was less clear to follow as an observer, even when the demo itself was visible.

## Connections to Prior Sessions

Group 11's application is the most direct course-content reflection I have seen in any of the twelve projects. Sessions 3 through 5 covered 2D geometric transformations as abstract concepts: translate, rotate, scale, and how they are composed. Group 11 built a complete interactive implementation of those exact ideas, including separate translation and position properties, uniform scale locking, rotation around the object centre, and a live preview that updates with every slider change. The theory from the earlier sessions and the working application from Group 11 are the same ideas separated by implementation.

Group 10's master-detail pattern also connects to Session 15, where the professor discussed JavaFX's property and event system. A master-detail layout is driven precisely by selection listeners: when the master list fires a selection-changed event, the detail panel updates. That binding between a selection state and a rendered detail view is the JavaFX property model working as intended.

## Real-World Applications Explored

The master-detail layout from Group 10 is one of the most common UI patterns in production software. Mail clients (inbox on the left, email body on the right), music library apps (artists or albums on the left, tracks on the right), file explorers, and e-commerce category and product pages all use this pattern. It is so common because it maps naturally to how users browse a collection: scan the list, pick one, see everything.

Group 11's shape styler maps to graphic design and prototyping tools. Illustrator's properties panel, CSS animation editors, game engine inspector panels (Unity's inspector, Unreal's details panel), and SVG editors all operate on the same principle: select an object, and a panel exposes its full set of transformable properties. The apply-live-preview pattern that Group 11 used (sliders update immediately, typed values commit on Enter or Apply) is exactly how professional tools balance speed with precision.

If Group 12's project was image processing, that work connects to filters, thresholding, histogram analysis, and other techniques that make up the second half of this course. Medical imaging tools, satellite image analysis pipelines, and computer vision preprocessing pipelines all depend on the same foundational operations.

## Insights

Group 11 was the most satisfying project to watch demonstrated across all twelve groups, and I think it is because it was the clearest translation of what the course actually taught into a built thing. Every transformation in the control panel maps directly to a concept from Sessions 3 through 5. Seeing translation, rotation, scale, and gradient fills all working together in one polished interface made it obvious why the professor spent so much time on those concepts in the first half of the semester. Group 11 built the thing those sessions were preparing for.

## Self-Study & Resources Consulted

- **[Jenkov - JavaFX Transformation](https://jenkov.com/tutorials/javafx/transformation.html)**: A clear walkthrough of JavaFX's Translate, Rotate, and Scale transformation classes, showing how to apply them to nodes and how the pivot point affects rotation and scaling results. Directly relevant to the transformation controls in Group 11's project.

- **[Oracle JavaFX - Transformation Types and Examples](https://docs.oracle.com/javase/8/javafx/visual-effects-tutorial/transformation-types.htm)**: Official Oracle tutorial covering all JavaFX transformation types with code examples, including how to compose multiple transformations in sequence and how position versus translate differs when both are applied to the same node.

## Key Takeaways

1. Group 11 (Geometric Object Styler) was the most direct translation of course theory into a built application across all twelve projects: translate, rotate, scale, gradient fills, and effects all implemented as interactive controls on a live-preview shape.
2. Group 10's master-detail layout is one of the most commonly used UI patterns in software. Seeing it built cleanly in JavaFX showed how straightforward the pattern is to implement when the selection listener and detail panel are properly decoupled.
3. An empty README is a real cost. Group 12's project was harder to follow in the Q&A than the others, purely because there was no documentation context to bring into the session. Documentation is part of the project.
4. Across all twelve presentations over four sessions, the range in tools, problem domains, and approaches was wider than a single framework or course spec would suggest. The common denominator was the Java ecosystem, not a shared application type.
5. Session 19 completed the presentation block. Looking back across Sessions 16 through 19, the groups that consistently made the strongest impression were the ones that could explain why their project was built the way it was, not just what it does.

---
