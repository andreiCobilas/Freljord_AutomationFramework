
# "Freljord" is An Automated test framework in Java with Cucumber and Selenium WebDriver #

This code it's a demo code, written by Andrei Alexandru with the help of Mr.Google and StackOverflow: 


## Info ##

This is a work in progress, with few automated tests from different features and User Stories, and it's meant to show my abilities regarding automation testing. Freljord uses "Selenium", "Maven", "Cucumber".
Tests are written in "BDD" and automated with "Selenium", logs are made with "log4j". The framework is divided in  3 part:

- Infrastructure : the core of framework that contains generic Utilities and functionalities that can be used for testing any WebApplication.

- WebStructure : this part contains the PageFactory and Utilities related to the tested [WebApplication](https://demostore.x-cart.com)

- Resource : this part contains all the resources used for the project and is divided in 2 parts 
    - Infrastructure related , generic resources that can be used for testing any WebApplication.
    - WebStructure related, resources that contain "BDD" tests that are related to the tested [WebApplication](https://demostore.x-cart.com)

## Installation ##

You need to have [Java 8 JDK](https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) installed along with [maven](https://maven.apache.org/download.cgi).

## Running tests ##

Test runs will be started using test runners from "Freljord_AutomationFramework\src\test\java\TestRunners", test are sorted by features and tags.
Tests are hardcoded to run on "Chrome" , "Firefox" support is available.

## Contact ##

andrei7xd@yahoo.com

## Version ##

2.0.1
