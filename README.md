# Data-Driven Testing Framework using Selenium and TestNG


  <a href="https://ibb.co/CWnf9bF"><img src="https://i.ibb.co/SJKzmtp/Screenshot-95.png" alt="Screenshot-95" border="0"></a><br />

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

```
## Getting Started

### Prerequisites
- **Java JDK:** Ensure Java is installed on your system.
- **Maven:** Build tool for managing project dependencies.
- **Selenium WebDriver:** Add the required WebDriver executable (e.g., ChromeDriver) to your system PATH.

### Installation
1. **Clone the repository:**
   ```sh
   git clone https://github.com/GANESHGITHUB112/Data_Driven_Testing.git
   cd Data_Driven_Testing
   ```
### Running the Tests
1. Update the Excel file path: Ensure the Excel file path is correctly specified in the Excelutilitty class.
2. Run the tests: Execute the tests using TestNG.  

## Installation
1.Clone the repository:

```sh
git clone https://github.com/your-username/your-repo-name.git
cd your-repo-name
```
2.Add dependencies:
Ensure the following dependencies are added to your pom.xml:
```plaintext
<dependencies>
    <!-- Selenium Dependency -->
    <dependency>
        <groupId>org.seleniumhq.selenium</groupId>
        <artifactId>selenium-java</artifactId>
        <version>3.141.59</version>
    </dependency>
    <!-- TestNG Dependency -->
    <dependency>
        <groupId>org.testng</groupId>
        <artifactId>testng</artifactId>
        <version>7.4.0</version>
        <scope>test</scope>
    </dependency>
    <!-- Apache POI Dependency -->
    <dependency>
        <groupId>org.apache.poi</groupId>
        <artifactId>poi</artifactId>
        <version>4.1.2</version>
    </dependency>
    <dependency>
        <groupId>org.apache.poi</groupId>
        <artifactId>poi-ooxml</artifactId>
        <version>4.1.2</version>
    </dependency>
    <!-- ExtentReports Dependency -->
    <dependency>
        <groupId>com.relevantcodes</groupId>
        <artifactId>extentreports</artifactId>
        <version>2.41.2</version>
    </dependency>
</dependencies>
```
## Running the Tests
**Update the Excel file path:** Ensure the Excel file path is correctly specified in the Excelutilitty class.
Run the tests: Execute the tests using TestNG.
```sh
mvn test
```
## Detailed Class Descriptions
**Baseclass.java**
This class handles the setup and teardown processes for the WebDriver and ExtentReports. It includes common setup and teardown methods that are inherited by the test classes.

**RegisterTest.java**
This class contains the test script for the registration functionality, driven by data from an Excel file.

**Excelutilitty.java**
This utility class provides methods for reading data from Excel files, supporting data-driven testing.

**RegisterPage.java & WelcomePage.java**
These classes use the Page Object Model (POM) to represent the web elements and actions on the registration and welcome pages, respectively.

## Reporting
ExtentReports generates a detailed HTML report (./Reports/TestReport.html) documenting the test execution, including passed, failed, and skipped test cases.
Contributing
Contributions are welcome! Please fork the repository and submit pull requests for any enhancements or bug fixes.

## License
This project is licensed under the MIT License.

## Acknowledgements
1.Selenium WebDriver
2.TestNG
3.ExtentReports
4.Apache POI

