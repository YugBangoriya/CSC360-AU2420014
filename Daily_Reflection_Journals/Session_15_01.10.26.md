# Session 15 - Functionality, Generics, and JavaFX Shape Abstraction

**Session Date:** 01/10/26

**Entry Date:** 07/10/26

---

## Session Content

Session 15 had a different structure from a regular lecture. It opened with the professor running mock presentations with a few selected groups to show everyone what the actual project evaluation would look like. This was not a quiet demonstration: it was an active feedback round where the presenting group, the faculty, and the rest of the class all contributed. The conversation covered what groups had assumed about the evaluation format, what the faculty actually expects, and how to make a presentation flow in a way that communicates the project clearly rather than just demoing features in sequence. Seeing it run live with a real group made it much more concrete than any verbal description of the evaluation criteria would have been.

One of the clearest takeaways from that feedback round was the distinction between functionality and features. The professor was explicit about this: functionality is what the software does, meaning whether it works correctly and fulfils its core purpose. Features are the extras built on top. When it comes to evaluation, functionality carries more weight. A project that does fewer things but does them reliably will be judged more favourably than one with many features that are poorly implemented or that break during the demo. This reframing of what "done" means was one of the more useful things to hear before the actual evaluation.

After the presentation practice, the session shifted to programming concepts. The professor explained generic programming and reusable code, two ideas that are closely linked. The point being made was simple: if you are writing nearly the same class or method twice just because the types differ, something is wrong with the approach, and generics are Java's solution to that. By making the type itself a parameter, you write one class or method and the compiler adapts it for whatever type is used. This is not just about saving lines of code. It is about keeping the same logic in one place so that any fixes or improvements apply everywhere the code is used.

The session ended with a discussion connecting these ideas to JavaFX. The professor explained how JavaFX graphical objects relate to shape abstraction, how they sit within a scene graph hierarchy, and how they carry observable properties. The Shape class in JavaFX is abstract. Concrete types like Rectangle, Circle, Line, and Ellipse extend it and inherit common properties such as fill, stroke, strokeWidth, and opacity. The GraphicsContext, on the other hand, belongs to a different drawing model entirely: it is tied to a Canvas node and works in immediate mode, where drawing commands are issued directly rather than creating persistent objects in a scene tree.

## What Else I Remember

The session had a noticeably different energy because of the mock presentation format at the start. Opening with a live, interactive feedback round before moving into concepts gave the later material a more applied feel. The programming topics did not feel like standalone theory: they felt like things that would show up directly in the project and in the evaluation.

## What I Understood Well

Generic programming clicked for me because the problem it solves is easy to picture. Before generics, if you wanted a container class that could hold integers, you would write one version. If you then needed it to hold strings, you would write another. Generics replace both with a single parameterised version where the type is filled in at the point of use. The Java Collections framework is the best illustration of this: List, Map, and Set work with any type because they are generic, and the logic for adding, removing, and traversing elements is identical regardless of what the collection holds. That same principle applies to any method or class where the behaviour does not depend on the specific type, only on the structure. Code reuse follows naturally: instead of maintaining multiple near-identical implementations, a generic version lives in one place and changes propagate everywhere.

The JavaFX Shape hierarchy also came together clearly. Shape is an abstract class, and all the concrete types, Rectangle, Circle, Line, and Ellipse, extend it and inherit the same base properties: fill, stroke, strokeWidth, and opacity. The practical implication is that you can hold a collection of different shapes through a single List of Shape references, apply a property change to all of them in a loop, and each shape responds correctly without the code needing to know the concrete type. It is polymorphism from the earlier OOP sessions applied directly to a visual context, and seeing it framed that way made the connection feel immediate.

## What I Found Challenging

The JavaFX shape abstraction and graphics context section was the hardest part of the session to follow fully. The difficulty was not the Shape hierarchy itself, which is a straightforward inheritance tree. The confusing part was that JavaFX has two completely separate drawing models: scene graph shapes and the Canvas plus GraphicsContext approach. Scene graph shapes like Rectangle and Circle are persistent objects that live in the scene tree. You set their properties and JavaFX handles the rendering. GraphicsContext is the opposite: it is immediate mode, meaning commands like fillRect and strokeOval execute and the output is committed to a pixel buffer, with nothing retained as an object. Understanding why both models exist and when to use which one was not fully clear from the session alone.

## Connections to Prior Sessions

The generic programming discussion connects directly to the OOP concepts from Sessions 1 through 3, where inheritance and polymorphism were central. Generics take the same motivation one step further: instead of sharing behaviour across a class hierarchy through inheritance, you share behaviour across unrelated types through parameterisation. The two ideas solve different problems but come from the same instinct, which is writing logic once and applying it broadly.

The JavaFX Shape hierarchy is the natural evolution of what the course covered in Sessions 4 and 5 with Java 2D and Graphics2D. In those sessions, shapes were drawn imperatively using a Graphics2D context: you called drawRect or fillOval and the shape appeared. JavaFX's scene graph shapes flip that model: instead of drawing commands, you create objects with properties and let the framework handle rendering. The GraphicsContext in JavaFX is actually closer to the old Graphics2D model, which is why the two coexist in the framework.

## Real-World Applications Explored

Generic programming is everywhere in production Java code. The entire Collections framework, which almost every Java application depends on, is built on generics. Frameworks like Spring use generic type parameters throughout their dependency injection and data access layers. Any SDK or utility library that needs to work across different data types without forcing the user to cast objects relies on generics to make that safe and readable. Reusable code more broadly is what makes libraries and frameworks possible at all. A sorting algorithm written once as a generic method is more valuable than ten type-specific versions of the same logic.

The shape abstraction idea appears in game engines, vector graphics editors, and CAD tools. In a game engine, every drawable object in the scene typically shares a common base type with properties like position, rotation, and opacity. The engine can iterate a list of all scene objects and render each one without knowing its concrete type, because the shared base provides everything the render loop needs.

## Insights

What struck me during the mock presentation feedback was the functionality versus features distinction. I had been thinking about the project in terms of what it has, meaning the list of things it can do. The professor reframed this to what it does, meaning whether it works correctly end to end. The two are related but not the same, and for evaluation purposes the difference matters more than I had assumed going in.

## Self-Study & Resources Consulted

- **[Oracle Java Tutorials - Generics](https://docs.oracle.com/javase/tutorial/java/generics/index.html)**: The official Java tutorial series on generics, covering generic types, generic methods, bounded type parameters, and wildcards. A solid reference for understanding why generics were added and how they are used throughout the Java API.

- **[OpenJFX - GraphicsContext API Documentation](https://openjfx.io/javadoc/11/javafx.graphics/javafx/scene/canvas/GraphicsContext.html)**: The official OpenJFX API reference for the GraphicsContext class, detailing its immediate-mode rendering model, state stack, and the full set of drawing methods available on a Canvas. Useful for understanding how GraphicsContext differs from the scene graph shape approach covered in the session.

## Key Takeaways

1. Functionality and features are not the same thing. For project evaluation, whether the core of the software works correctly matters more than how many things it can do. A focused, working project is evaluated more favourably than a feature-heavy one with unreliable behaviour.
2. Generic programming solves the problem of writing the same logic multiple times for different types. By making the type a parameter, one implementation covers all cases, which also means any fix or improvement applies everywhere that code is used.
3. Code reuse is not just about saving lines. Keeping the same logic in one place means it is easier to maintain, test, and improve without having to track down every place a similar version was copied.
4. JavaFX has two separate drawing models: scene graph shapes (retained mode, property-based, part of the node tree) and Canvas with GraphicsContext (immediate mode, draw commands, no persistent objects). Both exist for different use cases and understanding when to use each is important.
5. Documentation is what lets an evaluator understand a project without reading the source code. It gives the team control over how the project is presented and understood, which is a significant advantage during any evaluation.

---
