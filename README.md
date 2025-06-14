# 🔐 Login Automation Framework (OrangeHRM & Facebook)

🏗️ **QA Sprint Progress**: Day 2 of 6 • ✅ 2/8 Modules Completed  
📌 [View Sprint Tracker ↓](#-6-day-qa-skill-enhancement-sprint--in-progress)


## Selenium-Based Automation Project 🚀

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apache-maven&logoColor=white)
![TestNG](https://img.shields.io/badge/TestNG-FF6347?style=for-the-badge&logo=testng&logoColor=white)
![Selenium](https://img.shields.io/badge/Selenium-43B02A?style=for-the-badge&logo=selenium&logoColor=white)
![License: MIT](https://img.shields.io/badge/License-MIT-blue.svg?style=for-the-badge)
![SQLite](https://img.shields.io/badge/SQLite-07405E?style=for-the-badge&logo=sqlite&logoColor=white) 
[![View Wiki](https://img.shields.io/badge/View-Wiki-blue?style=for-the-badge)](https://github.com/Abin-Isaac/LoginAutomation/wiki)


## 🧠 QA Wiki & Sprint Tracker

📘 Check out the full **QA Sprint Tracker** and documentation on the [Wiki](https://github.com/Abin-Isaac/LoginAutomation/wiki)

🚀 Highlights:
- 6-Day QA Skill Sprint
- SQL, Regression, Hybrid Testing
- Defect Simulation with GitHub Issues

---

## 📌 Project Overview

This repository demonstrates a modular automation test framework built using **Java, Selenium, and TestNG**, targeting login functionalities on **OrangeHRM** and **Facebook**. The framework focuses on reusability, maintainability, and real-world test practices.

Designed as a portfolio project, it reflects how I apply structured QA thinking, from framework setup to test validation — with practical insights gained from both learning and execution.

---

## 📁 Folder Structure

```

LoginAutomation/
├── sql-testing/
│ └── sample_login_queries.sql                         # SQL for QA validation practice
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
- 📄 SQL practice included for database testing concepts

---

## 🧠 New: SQL Testing Practice for QA

As part of my QA journey, I’ve added SQL-based validation relevant to test scenarios like login failures, order processing, and user data checks.

📄 **Location**: [`sql-testing/sample_login_queries.sql`](sql-testing/sample_login_queries.sql)

### Includes:
- Users, LoginAttempts, and Orders tables
- Sample `INSERT` data
- Queries using `SELECT`, `WHERE`, `JOIN`, `GROUP BY` for test data validation
- Practical for validating test cases and DB logic

### 🔧 Run It:
```bash
sqlite3 login_test.db < sql-testing/sample_login_queries.sql
```
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
🏁 6-Day QA Skill Enhancement Sprint — In Progress

🚀 I’ve officially started a 6-day focused sprint to enhance and document my QA automation skillset through structured, hands-on modules.

Below is the full roadmap with daily objectives and progress tracking:

Day	Module / Folder	Description	Status

1	📂 sql-testing/	Real-world SQL tables + QA validation queries (Users, LoginAttempts)	✅ Done

2	📂 docs/test-plan/	Manual test plan & test case writing (OrangeHRM login flow)	✅ Done

3	📂 regression_suite/	Regression testing using Selenium-TestNG refactor	⬜ Not done

4	📂 performance/	Basic performance testing using JMeter (login load test)	⬜ Not done

5	📂 tdd-demo/	Password reset flow built using TDD principles	⬜ Not done

6	📂 hybrid-approach/	Demonstrating manual + automation hybrid testing approach	⬜ Not done

—	📂 docs/reports/	QA reports: execution summary, test status, blockers	⬜ Not done

—	🔧 GitHub Issues / PRs	Simulated collaboration: bug reporting, code reviews, and resolution steps	⬜ Not done

✅ I’ll mark each module as complete once uploaded to GitHub, with a README and commit reference.

---

## 👤 About Me

Hi, I’m **Abin Isaac**, a QA Automation Engineer with 4 years of experience, including hands-on Selenium automation and technical support for Adobe products. I believe good testing isn’t just about finding bugs — it's about building **confidence** in software.

🎯 My goal is to keep evolving as a tester — by thinking deeply, testing smartly, and sharing openly.

📬 Let’s connect: [LinkedIn](https://www.linkedin.com/in/abin-isaac)
