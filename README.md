# Data-Driven Testing Framework using Selenium and TestNG

![Testing](https://www.testing-whiz.com/sites/default/files/selenium-webdriver-banner.jpg)

## Project Description
This project is a robust automation testing framework built using Selenium WebDriver and TestNG. It supports data-driven testing, allowing test data to be driven from external sources such as Excel files. The framework also includes comprehensive reporting using ExtentReports.

## Key Features
- **Data-Driven Testing:** Utilize external data sources to drive test cases, enhancing flexibility and reusability.
- **Selenium WebDriver Integration:** Automate web application testing using Selenium WebDriver.
- **TestNG Framework:** Manage test execution, configuration, and reporting with TestNG.
- **ExtentReports Integration:** Generate detailed HTML reports to document test results.
- **Page Object Model (POM):** Organize web elements and interactions in a structured manner for better maintainability.

## Technologies Used
- **Java:** Programming language for developing test scripts.
- **Selenium WebDriver:** Web automation tool.
- **TestNG:** Testing framework for managing and executing tests.
- **Apache POI:** Library for reading from and writing to Excel files.
- **ExtentReports:** Library for generating detailed HTML reports.

## Project Structure
```plaintext
src
└── main
    └── java
        ├── GenricLibrary
        │   └── Baseclass.java
        ├── ObjectRepository
        │   ├── RegisterPage.java
        │   └── WelcomePage.java
        └── fileutility
            └── Excelutilitty.java
└── test
    └── java
        └── TestScriptss
            └── RegisterTest.java
