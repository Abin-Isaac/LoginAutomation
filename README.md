# 🔐 Login Automation Framework (OrangeHRM & Facebook)

## Selenium-Based Automation Project 🚀

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apache-maven&logoColor=white)
![TestNG](https://img.shields.io/badge/TestNG-FF6347?style=for-the-badge&logo=testng&logoColor=white)
![Selenium](https://img.shields.io/badge/Selenium-43B02A?style=for-the-badge&logo=selenium&logoColor=white)
![License: MIT](https://img.shields.io/badge/License-MIT-blue.svg?style=for-the-badge)

---

## 📌 Project Overview

This repository demonstrates a modular automation test framework built using **Java, Selenium, and TestNG**, targeting login functionalities on **OrangeHRM** and **Facebook**. The framework focuses on reusability, maintainability, and real-world test practices.

Designed as a portfolio project, it reflects how I apply structured QA thinking, from framework setup to test validation — with practical insights gained from both learning and execution.

---

## 📁 Folder Structure

```

LoginAutomation/
├── src/
│   ├── main/java/com/demo/util/DemoUtils.java         # Reusable utility functions
│   └── test/java/com/abin/test/
│       ├── orangehrm/OrangeHRMLoginTest.java
│       └── facebook/FacebookLoginTest.java
├── testng-orangehrm.xml                               # OrangeHRM suite
├── testng-facebook.xml                                # Facebook suite
├── pom.xml                                            # Maven dependencies
└── README.md                                          # Documentation

````

---

## ⚙️ Tech Stack

- Java 17
- Selenium 4.18.1
- TestNG 7.1.0
- Maven
- WebDriverManager 5.8.0
- SLF4J (Simple Logging)

---

## 🧪 Features

- ✅ Clean, modular class structure for each test target
- 🔁 Centralized utility functions (`DemoUtils`)
- 🔍 Explicit waits with `WebDriverWait` & `ExpectedConditions`
- 📄 Separate TestNG XMLs for test selection
- 💥 Built-in assertions for both valid and invalid login attempts
- 📦 Scalable architecture suitable for CI integration (Jenkins-ready)

---

## 🧠 QA Learning Highlights (T3 Series)
> _“Think it. Test it. Talk it — with T3.”_

This project is part of my ongoing QA journal where I explore deeper insights into testing beyond tools:

- 🔍 UI elements can lie — OrangeHRM taught me about invisible bugs.
- 🧘‍♂️ Waits that work — from `Thread.sleep()` to smart waits.
- 🧩 Small utility, big impact — how `DemoUtils.pause()` helped debug smarter.

📝 I share these reflections regularly on [LinkedIn](https://www.linkedin.com/in/abin-isaac) under `#abiNwriteS` and `#T3`.

---

## 🚀 How to Run the Tests

Run from terminal using Maven:

```bash
# OrangeHRM Login Test
mvn test -DsuiteXmlFile=testng-orangehrm.xml

# Facebook Login Test
mvn test -DsuiteXmlFile=testng-facebook.xml
````

---

## 🎯 What’s Coming Next 🚀

I'm extending this framework as part of a focused 6-day QA enhancement sprint. Here's what’s planned and currently in development:

📂 `sql-testing/` – Realistic SQL queries and test validation

📂 `regression_suite/` – Refactored flows for regression automation

📂 `performance/` – JMeter-based load testing on login API

📂 `hybrid-approach/` – Combining manual + automated test flows

📂 `tdd-demo/` – TDD-based automation on password reset flow

📂 `docs/test-plan/` – Manual test plan + test case documentation

📂 `docs/reports/` – QA reports summarizing test cycles

🔧 GitHub Issues/PRs – Simulated team collaboration and defect lifecycle tracking

All enhancements will be structured as commits and clearly documented for visibility and review.

---

## 👤 About Me

Hi, I’m **Abin Isaac**, a QA Automation Engineer with 4 years of experience, including hands-on Selenium automation and technical support for Adobe products. I believe good testing isn’t just about finding bugs — it's about building **confidence** in software.

🎯 My goal is to keep evolving as a tester — by thinking deeply, testing smartly, and sharing openly.

📬 Let’s connect: [LinkedIn](https://www.linkedin.com/in/abin-isaac)
