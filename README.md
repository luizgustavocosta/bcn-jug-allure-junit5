# Project title
Test report using Allure and JUnit5

## Motivation
Share the experience using Allure

## Build status
[![allure-junit5-maven](https://github.com/luizgustavocosta/bcn-jug-allure-junit5/actions/workflows/bcn-jug-allure-junit5.yml/badge.svg?branch=main)](https://github.com/luizgustavocosta/bcn-jug-allure-junit5/actions/workflows/bcn-jug-allure-junit5.yml)

## Tech/framework used
<b>Built with</b>
- [OpenJDK 11](https://openjdk.java.net/projects/jdk/11/)
- [JUnit5](https://junit.org/junit5/docs/current/user-guide/)
- [Allure](https://docs.qameta.io/allure/)

## Features
Payment

## Code Example
```java
@Test
void doStuff() {
  assertEquals(universalNumber, 42);
}
```

## Run locally
 - Download the project through the GitHub using
 ```git
 git clone https://github.com/luizgustavocosta/bcn-jug-allure-junit5.git
 ```
- Go to project folder and then execute
 ```maven
 mvn clean verify allure:report
 ```
- The command above will execute all tests and generate the Allure report
- Open the file index.html under the folder bcn-jug-allure-junit5/target/allure-results  

## References
* [Allure](https://docs.qameta.io/allure/)
* [Allure example](https://github.com/allure-examples/allure-junit5-example)
* [Payment domain](http://tfig.unece.org/contents/intro-domain-payment.htm)