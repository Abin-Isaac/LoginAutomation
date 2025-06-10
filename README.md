

# 🔐 Login Automation Framework (OrangeHRM & Facebook)

## Selenium Automation Framework 🚀

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apache-maven&logoColor=white)
![TestNG](https://img.shields.io/badge/TestNG-FF6347?style=for-the-badge&logo=testng&logoColor=white)
![Selenium](https://img.shields.io/badge/Selenium-43B02A?style=for-the-badge&logo=selenium&logoColor=white)
![License: MIT](https://img.shields.io/badge/License-MIT-blue.svg?style=for-the-badge)


---

## 📁 Project Structure

```

LoginAutomation/
│
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/
│   │           └── demo/
│   │               └── util/
│   │                   └── DemoUtils.java        # Utility methods (pause, reusable functions)
│   └── test/
│       └── java/
│           └── com/
│               └── abin/
│                   └── test/
│                       ├── orangehrm/
│                       │   └── OrangeHRMLoginTest.java
│                       └── facebook/
│                           └── FacebookLoginTest.java
│
├── testng-orangehrm.xml                           # Runs only OrangeHRM login tests
├── testng-facebook.xml                            # Runs only Facebook login tests
├── pom.xml                                        # Maven config with dependencies and build plugins
└── README.md                                      # Project documentation

````

---

## 🧰 Tech Stack

- **Java 17**
- **Selenium 4.18.1**
- **TestNG 7.1.0**
- **WebDriverManager 5.8.0**
- **Maven**
- **SLF4J (Simple Logging)**

---

## 🧪 Features

- ✅ Modular test classes for multiple websites
- 🔁 Reusable utility methods (`DemoUtils`) for pause and enhancements
- 🔍 Explicit waits using `WebDriverWait` and `ExpectedConditions`
- 📄 Separate TestNG suite XML files to run tests individually
- 📦 Clean project structure to support scalability and collaboration
- 💥 Built-in assertions to validate login scenarios (valid and invalid)
- 💡 Easily extendable for CI tools like Jenkins or GitHub Actions


---

## ✍️ T3 QA Journal Highlights
_Think it. Test it. Talk it — with T3._

As part of my testing journey, I document key learnings and reflections under the **T3 QA Journal** initiative. Here are a few highlights inspired by this project:

- 🔍 **Why verifying UI isn't enough — What OrangeHRM taught me about invisible bugs.**
- ⚠️ **The importance of waiting smartly: How I moved from Thread.sleep() to WebDriverWait.**
- 🧠 **Reusable utilities: How a single `DemoUtils.pause()` made debugging friendlier.**

> 📌 You can catch my weekly posts on [LinkedIn](https://www.linkedin.com/in/abin-isaac) under the tag `#abiNwriteS` and `T3` .

---


## 🚀 How to Run

Run specific test suite from command line:

```bash
# OrangeHRM Tests
mvn test -DsuiteXmlFile=testng-orangehrm.xml

# Facebook Tests
mvn test -DsuiteXmlFile=testng-facebook.xml
````

---

## 👤 About Me

Hi, I’m **Abin Isaac**, a passionate QA professional focused on building reliable and maintainable automation solutions. I believe testing is not just about finding bugs — it’s about building confidence.

🧠 **Think it. Test it. Talk it — with T3.**
This project is part of my continuous journey to refine automation skills, explore real-world testing challenges, and share practical QA insights with the community.

🔗 [Connect with me on LinkedIn](https://www.linkedin.com/in/abin-isaac/)

---

