<b>CSC542– SOFTWARE ENGINEERING CONCEPTS– FALL ‘16 PROJECT DESCRIPTIONS & BASIC REQUIREMENTS</b>

Since you will have limited contact with the users, the Project Executive started working compiling requirements for each project. This list is based on a quick brainstorming session with the product owner at the client site. These requirements must be incomplete and preliminary. Very little of the implementation details are specified; like all customers, they are hiring you to handle the details of the development of this project. The hope is for this to serve as a starting point for your brainstorming and project conceptualization.
CLIENT: COMPUTER SCIENCE LECTURERS
At large U.S. universities, Lecturers teach the introductory programming courses. These courses enroll hundreds of students and this makes automated grading systems very important. While automated grading systems exist, they have a limited focus. In particular, they are extremely limited in their ability to be adapted to courses instructing students on testing and test-driven development. In particular, your client teaches introductory Java programming courses. In these courses, students are taught how to test their code using the JUnit library. While there is a Java library for measuring test case coverage, JaCoCo, your client needs a library that allows them to pass the name of a class to method and receive the percentage of the class’s code covered by the JUnit tests returned. A second method would be similar, but return the percentage of a method’s code covered by the JUnit tests.
 Code coverage must be returned as a percentage of coverage. This can already be measured by the JaCoCo library; your solution should build upon the existing library.
 The actual grading process is a Java application and so any library you write must be runnable from a Java application.
 This will need to be used by teams of instructors in the future, so any deliverables must be clear and the concepts well documented.
 Other Lecturers are also likely to be interested in this library. At the end of the term, teams will have the option of “open-sourcing” their program so that it may be adopted elsewhere. The opportunity could also exist for teams to try to market and sell their program, but this would require the cooperation of the entire team.
 Teams must accept a strict budget of $0 for this project. This should not prevent students from using software they already own or any free or open source software and libraries. Any use of outside resources MUST be clearly documented and be in keeping with the University at Buffalo’s Intellectual Integrity Policy.

<br>
<b>Execution Instructions</b>
Please execute the AutoGraderTestRunner.java file to Run and View all the test cases.

<br>
<b>Reports</b>
Reports are present under the reports folder.
