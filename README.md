# CS-320-Software-Testing
Portfolio artifacts from CS 320 Software Testing, Automation, and Quality Assurance at Southern New Hampshire University.
CS 320: Software Testing, Automation, and Quality Assurance

This repository contains work completed for CS 320: Software Testing, Automation, and Quality Assurance. The artifacts included demonstrate my experience developing Java services, creating JUnit tests, evaluating software requirements, and applying software testing strategies. For my portfolio, I included the Contact Service files from Project One and my Summary and Reflections Report from Project Two.

How can I ensure that my code, program, or software is functional and secure?

I can ensure that my software is functional and secure by developing it according to its requirements and testing both expected and unexpected inputs. During this course, I used JUnit testing to verify that my code met the requirements provided for each service. For example, the Contact Service included requirements for maximum field lengths, required values, unique contact IDs, and valid phone numbers. I created tests for valid information as well as invalid conditions such as null values, values that exceeded the required lengths, and duplicate IDs.

I also learned that testing should not only confirm that software works when everything goes correctly. Effective testing should attempt to uncover errors by testing boundaries, invalid inputs, and unexpected situations. Automated unit testing makes it easier to repeat these tests whenever the code changes. Maintaining strong test coverage and reviewing requirements throughout development can help identify problems before software is released.

How do I interpret user needs and incorporate them into a program?

I interpret user needs by first translating them into clear and testable software requirements. Requirements provide specific rules that can then be implemented in the program and verified through testing. Instead of assuming how a feature should behave, I can use the requirements to determine what inputs should be accepted, what should be rejected, and what the expected behavior should be.

The Contact Service project demonstrated this process because each requirement directly influenced both my Java code and my JUnit tests. If a contact ID could not contain more than 10 characters, for example, the program needed validation to enforce that requirement and a unit test to verify it. Connecting requirements to both implementation and testing helped me make sure the final program behaved according to the user's needs.

How do I approach designing software?

My approach to designing software begins with understanding the requirements before writing the code. I break the requirements into smaller pieces and determine what classes, methods, data, and validation rules will be necessary. I then develop the program in manageable sections and test each part as I work instead of waiting until the entire program is complete.

Throughout this course, I learned that testing should be considered during the design process rather than treated as something that happens only after development. Writing unit tests helped me think about how the program should respond to normal inputs, boundary conditions, and invalid data. I also learned the importance of keeping code organized and focused so that individual components can be tested and maintained more easily. Going forward, I plan to continue using this approach because it allows me to find problems earlier and create software that is more reliable, maintainable, and aligned with its requirements.

Portfolio Artifacts

Project One – Contact Service

Contact.java
ContactService.java
ContactTest.java
ContactServiceTest.java

Project Two – Summary and Reflections Report

These artifacts demonstrate my understanding of software testing, automation, quality assurance, requirement-based testing, and the use of JUnit to verify Java applications.
