```markdown
# 🔐 LoginAutomation | Selenium TestNG Framework

Automated UI testing project using **Selenium WebDriver**, **TestNG**, and **Maven** to validate login workflows for sample applications like **OrangeHRM** and **Facebook**.

## 📌 Project Overview

This framework was created to demonstrate a structured and scalable approach to browser automation. It focuses on:

- ✅ Cross-browser login testing
- 🧪 Positive and negative test cases
- 🧩 Page element synchronization using **Explicit Waits**
- 📁 Maven integration for dependency management and build execution
- 🧰 Reusability via utility methods

---

## 🧪 Technologies Used

| Tool / Library        | Purpose                         |
|-----------------------|---------------------------------|
| Selenium WebDriver    | Browser automation              |
| TestNG                | Test structure and assertions   |
| Maven                 | Build and dependency management |
| WebDriverManager      | Driver management               |
| Git / GitHub          | Version control                 |
| Java 17               | Programming language            |

---

## 📂 Project Structure

```

LoginAutomation/
│
├── src/
│   ├── test/
│   │   ├── java/
│   │   │   ├── com.abin.test.orangehrm/
│   │   │   │   └── OrangeHRMLoginTest.java
│   │   │   ├── com.abin.test.facebook/
│   │   │   │   └── FacebookLoginTest.java
│   │   │   └── demo.util/
│   │   │       └── DemoUtils.java
│
├── testng-orangehrm.xml
├── testng-facebook.xml
├── pom.xml
└── README.md

````

---

## 🚀 How to Run the Tests

1. **Clone the repo**:
   ```bash
   git clone https://github.com/Abin-Isaac/LoginAutomation.git
   cd LoginAutomation
````

2. **Run OrangeHRM tests**:

   ```bash
   mvn test -DsuiteXmlFile=testng-orangehrm.xml
   ```

3. **Run Facebook tests**:

   ```bash
   mvn test -DsuiteXmlFile=testng-facebook.xml
   ```

---

## 🎯 Highlights for Recruiters

* Clean code with proper wait handling and assertions
* Modular structure with **utility class for reusability**
* Professional use of `@BeforeClass`, `@AfterClass`, and proper teardown
* TestNG `xml` files used for **targeted test execution**
* Demonstrates **real-world testing scenarios** like login failure, wait handling, and dynamic element checks

---

## 📬 Contact

**Abin Isaac**
📧 [abinisaac2000@gmail.com](mailto:abinisaac2000@gmail.com)
🌐 [LinkedIn](https://www.linkedin.com/in/abin-isaac)

---

> *“Think it. Test it. Talk it — with T3.”*

```

---

Let me know if you want to include screenshots, test result samples, or CI tools like Jenkins.
```
