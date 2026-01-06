# 🧪 Swag Labs Automation Testing Project

## 📌 Project Overview
This project is an Automation Testing Framework for the Swag Labs web application using Selenium WebDriver, Java, and TestNG.  
The framework follows the Page Object Model (POM) design pattern and supports Data-Driven Testing using CSV, Excel, and JSON files.

---

##  Tech Stack
- Java
- Selenium WebDriver
- TestNG
- Maven
- Page Object Model (POM)
- Data-Driven Testing

---

##  Project Structure
src
├─ main
│ └─ java
│ ├─ BasePage.java
│ ├─ LoginPage.java
│ └─ ProductPage.java
│
├─ test
│ └─ java
│ ├─ DriverFactory
│ │ ├─ DriverFactory.java
│ │ ├─ ChromeFactory.java
│ │ ├─ EdgeFactory.java
│ │ └─ FirefoxFactory.java
│ │
│ ├─ utils
│ │ ├─ CSVFile.java
│ │ ├─ ExcelFile.java
│ │ └─ JsonFile.java
│ │
│ ├─ BaseTest.java
│ ├─ CheckOutPage.java
│ ├─ DataProviderClass.java
│ └─ LoginTest.java
│
└─ resources
├─ data.csv
├─ data.json
└─ theData.xlsx

pom.xml
testng.xml

yaml
Copy code

---

##  Key Components

### BasePage
- Contains common WebDriver actions
- Handles waits and reusable methods

### LoginPage
- Manages login page elements and actions

### ProductPage
- Handles product listing and add-to-cart actions

### DriverFactory
- Manages browser initialization
- Supports Chrome, Edge, and Firefox

### Utils
- Reads test data from CSV, Excel, and JSON files

### BaseTest
- Handles test setup and teardown

### DataProviderClass
- Supplies data to TestNG tests

---

##  How to Run
1. Clone the repository
2. Open the project in IntelliJ IDEA
3. Install Maven dependencies
4. Run tests using testng.xml or any test class

---

##  Features
- Cross-browser testing
- Data-driven testing
- Page Object Model design
- Clean and maintainable code

---

##  Author
Esraa Youssef
