## Habitat Energy Web Task (Part 2 of 2)

In November/December 2022, I interviewed for the position of Software Engineer in Test at Habitat Energy in Oxford.

As part of the interview process, I undertook a challenge to develop two automation frameworks — one for an API and one for a web UI.

I successfully completed the challenge and the interview process, ultimately receiving an offer for the position in December 2022. However, I made the decision to decline the offer. In hindsight, I realize I probably should have accepted it, given the interesting nature of the role. Oh well, live and learn.

The task description is [Here](TECHNICAL-TASK.md).

### BDD Automation with Cucumber

I used Behavior-Driven Development (BDD) with Cucumber and Java to develop the automation scripts (feature files).

### Page Object Design Pattern

I used the Page Object Design Pattern (POM). POM, is a design pattern that creates an object repository for storing all
web elements. It helps reduce code duplication and improves test case maintenance.

In Page Object Model, consider each web page of an application as a class file. Each class file will contain only
corresponding web page elements. Using these elements, testers can perform operations on the website under test.

Advantages of Page Object Model:

- Easy Maintenance
- Code Reusability
- Readability and Reliability of scripts

### Installation and Prerequisites

The following Java components were used in the test framework:

1. Java JDK 11
2. Maven build manager
3. IntelliJ IDE / or other
4. Required IDE plugins:
    - Maven
    - Cucumber
    - Lombok
    - JUnit
5. Chrome web browser
6. Firefox web browser

### Framework Setup

To set up the framework, you can either clone the repository, or download the ZIP file to your local workspace.

### Running the tests

Open a terminal window, navigate to the project directory and enter the command:

~~~
mvn test
~~~

Maven should automatically download and install the required dependencies before running the tests. If not, then enter the following command:

~~~
mvn clean install
~~~

You can also run the tests from your IDE, by running the Cucumber feature files.

### Pipelines

_This repository was originally hosted in Atlassian BitBucket and used their pipelines. I've since migrated
the repository to GitHub (Jan 2024) so that all of my repositories are in a single location._

I implemented a simple pipeline using BitBucket to run the test suite whenever a changed was pushed to the repository.

The pipeline ran the following:

- Create a Docker contain to run maven:3.6.3 
- Checkout the code from the repository
- Run the following steps in parallel:
  - Build and execute the tests (collecting any results)
  - Perform a security scan on the code (collecting any results)

Note: Atlassian scripts are like GH Actions.
