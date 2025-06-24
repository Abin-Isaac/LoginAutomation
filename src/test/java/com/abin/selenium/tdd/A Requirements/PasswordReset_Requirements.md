
### 📄 **PasswordReset\_Requirement.md**

**📌 Title:** Password Reset – Functional Requirement Specification
**📁 Path:** `docs/requirements/PasswordReset_Requirement.md`

---

### 🔖 1. Objective

To enable users who have forgotten their password to securely reset it using the **"Forgot your password?"** flow on the OrangeHRM login page.

---

### 🌐 2. Target Application

**Application:** OrangeHRM – Open Source Demo
**URL:** [https://opensource-demo.orangehrmlive.com/](https://opensource-demo.orangehrmlive.com/)

---

### 🧩 3. Scope

This requirement document focuses solely on the **password reset feature** and covers the following:

* Accessing the "Forgot your password?" page
* Submitting a valid username for password recovery
* Validating success and error messages
* Navigating back to login from the reset flow

---

### 🛠️ 4. Functional Requirements

| #   | Requirement Description                                                                |
| --- | -------------------------------------------------------------------------------------- |
| FR1 | The login page must contain a **"Forgot your password?"** link                         |
| FR2 | Clicking this link should redirect to the password reset page                          |
| FR3 | The reset page must have an input for **Username**                                     |
| FR4 | Submitting a valid username must trigger a confirmation message                        |
| FR5 | Submitting an invalid or empty username must show an appropriate validation error      |
| FR6 | There should be a **"Cancel"** or **"Back to Login"** option to return to login screen |

---

### ⚠️ 5. Non-Functional Requirements

* The process must complete within **5 seconds**
* The feature should support **cross-browser compatibility**
* The UI should be responsive on mobile and desktop
* Confirmation/error messages must follow the system’s message design standard

---

### 🔐 6. Assumptions

* The user must already exist in the system
* The email functionality is mocked or assumed functional (actual email delivery is not tested)

---

### 🔬 7. Exclusions

* No testing of actual password reset email delivery
* No testing of admin password reset functionality

---

### 🧪 8. Test Entry Criteria

* The password reset link is visible and clickable
* The OrangeHRM test environment is accessible

---

### ✅ 9. Acceptance Criteria

* A user sees a success message on submitting a valid username
* A user sees a validation error when submitting invalid or empty input
* Navigation back to login page works correctly
* No broken UI or console errors during flow

---

Would you like this saved to `docs/requirements/PasswordReset_Requirement.md` in your repo as a markdown file?
