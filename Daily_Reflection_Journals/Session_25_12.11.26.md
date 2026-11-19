# Session 25 - Class Participation Grading and Back to the Project After the Break

**Session Date:** 12/11/26

**Entry Date:** 19/11/26

---

## Session Content

Session 25 was the first session after the Diwali break, and it was a mix of two things. There was no lecture and no new topic. The first part of the class went into grading class participation, and the second part was project work.

In the first part, the professor graded each student individually for class participation. The grading was based on how actively each of us takes part in class and how often we answer. This is different from the assignments and the project, because there is nothing to submit. It is about what each person does in the classroom across the sessions, and the professor was putting a number on that, one student at a time.

Once the grading was finished, we went back to the project work. Our topic is explaining PNG, JPEG, and GIF with binary-level details, and in Session 24 we had only started with the textbook research. By this session, the group repository already had a project skeleton, which I had pushed on 9 November. Everything else in the project builds on that skeleton, so it helps to explain how it works.

The idea is to save one small test image as a PNG, a JPEG, and a GIF, and then read each file byte by byte with Java and label every part of it. To keep the comparison fair, all three files come from the same 16 x 16 test image. In it, the red value grows from left to right, the green value grows from top to bottom, and blue stays at 128. Each format gets its own inspector, and every inspector follows one shared rule. Every byte of the file must belong to exactly one labelled part, with no gaps and no overlaps. A labelled part is called a segment, and it stores where it starts, how long it is, its name, and what it means. A small hex dump tool then prints all the segments as a table, so we can see the real bytes next to their meaning. The first code for the individual formats was pushed the next day, on 13 November, so this session sat right between the planning and the first real code.

## What Else I Remember

The grading connects to something the professor said in Session 10. He mentioned that class participation, paying attention during sessions, assigned reading, and take-home activities all carry equal weight in this course, and that strong assignment output alone does not make up for staying disengaged in class. At the time it sounded like general advice. This session showed that participation is actually graded and recorded.

The course outline also has a matching line. I think the component it refers to is "Active Engagement within Learning Sessions", which is 20% of the final grade. It is an individual evaluation, and the outline says the TA's teaching diary keeps observation entries on how actively each student engages in a session. That would explain how a grade can be given for something that happens across many days.

## What I Understood Well

I understood how class participation fits into the overall grade. The outline gives active engagement within learning sessions 20%, and it is judged for each student on their own. The project marks are different, since they are group marks that are shared among the members. So even when the project is going well as a team, participation is the part where each person's own contribution in class is seen separately.

## What I Found Challenging

There was nothing technically hard in this session. What I find tricky about class participation is that it is observed over every session and not on one day, so it cannot be fixed at the last minute. I think the harder part for me is taking part on project days like this one, where there is no lecture and no question to answer, so the chances to be active in class look different from a normal session.

## Connections to Prior Sessions

The grading connects to Session 10, where the professor said participation carries the same weight as the other parts of the course. It also connects to Sessions 16 to 18, where the professor asked interview-style questions during the project presentations. In Session 18 it was our own group being asked about its design decisions in front of the class, and that was a clear example of what participation looks like in this course. Answering when asked and knowing the work well enough to answer both count.

The project time connects to Session 24, where my group started with the textbook research, and to Sessions 12 to 14, which were also project sessions where the professor met with each group. This time the work is on a research topic and not an application. The test image also ties straight back to Session 23. At 16 x 16 pixels with 3 bytes each, the raw RGB data is 768 bytes, and with the alpha channel it is 1,024 bytes. The index formula from that session works on it too. For the pixel at column 5 and row 3, the starting index is (3 * 16 + 5) * 3 = 159, and its three bytes are 55 33 80 in hex, which is red 85, green 51, and blue 128. Our code builds the test image as `TYPE_INT_ARGB`, one of the `BufferedImage` types from the Session 23 real-world examples, and it keeps a second copy without alpha because the JPEG and GIF writers in Java's ImageIO want an image without an alpha channel, which is the RGB versus RGBA difference from Session 23. Byte order will also keep coming up, since PNG and GIF store their numbers in different byte orders.

## Real-World Applications Explored

Individual evaluation inside a group effort is how most workplaces work too. A team can ship a project together, but each person is still seen for what they contribute in meetings, daily standups, and code reviews. A Git repository shows this very directly, since every commit carries the name of its author and the time it was made. Our own repository is a good example, because its history shows who added which part of the project and when. The professor's participation grading plays a similar role in class, since it looks at each person on their own.

## Insights

What struck me was how the remark from Session 10 turned into something real. At that time it was only a statement that participation carries weight, and in this session the professor actually graded it, one student at a time. I also think that after a few weeks of group project work it is easy to feel that the group result is all that matters, and this session was a reminder that each person is still seen on their own.

## Self-Study & Resources Consulted

- **[Harvard Bok Center - Assessing Class Participation](https://bokcenter.harvard.edu/assessing-class-participation)**: A guide for instructors on how to assess participation fairly. It says teachers need clear strategies so grading stays fair and accountable, and that students should have more than one way to show they are participating. This helped me see what is behind a participation grade.

- **[Columbia Business School - Beyond Attendance: Encouraging Active Participation in Your Classroom](https://business.columbia.edu/samberg/teaching-strategies/beyond-attendance-encouraging-active-participation-your-classroom)**: Explains the difference between attendance and participation. It notes that participation is often understood as how often a student speaks up, and that a good grade should also look at the quality of what a student contributes.

- **[Oracle Java Tutorials - Data Streams](https://docs.oracle.com/javase/tutorial/essential/io/datastreams.html)**: Shows how Java reads and writes binary values like int and double through DataInputStream and DataOutputStream. It also points out that a binary stream does not say what type each value is or where it starts, which is useful for the byte-level work in our project.

## Key Takeaways

1. Session 25 was the first session after the Diwali break, and it had no lecture. The time went into class participation grading and then project work.
2. The professor graded each student individually for class participation, based on how actively we take part and how often we answer. It is a grade for what each person does in the classroom across the sessions.
3. Participation counts toward the course grade. The outline lists active engagement within learning sessions as 20%, and Session 10 had already said participation carries real weight.
4. Project marks are shared by the group, but participation is graded for each person. Each of us is seen on our own contribution in class, even when the team is doing well.
5. After the grading, project work continued from the skeleton already in the repository. The project saves one shared 16 x 16 test image as PNG, JPEG, and GIF, then reads each file byte by byte and labels every part, and the first code for the formats was pushed the next day.

---
