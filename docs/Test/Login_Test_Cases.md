<details> <summary>📋 Click to Copy Markdown Content</summary>
markdown
Copy
Edit
# 🧪 Login Module Test Cases – OrangeHRM

---

### ✅ TC_001 – Valid Login
- **Scenario**: Valid username and password
- **Preconditions**: Registered user; login page is fresh
- **Steps**:
  1. Enter username: `Admin`
  2. Enter password: `admin123`
  3. Click Login
- **Expected**: Dashboard is displayed  
- **Status**: Pass/Fail  
- **Remarks**: -

---

### ✅ TC_002 – Invalid Login (Both Invalid)
- **Steps**: Use `invalid` username and password
- **Expected**: *Invalid credentials* error

---

### ✅ TC_003 – Invalid Username
- **Steps**: Username: `invalid`, Password: `admin123`
- **Expected**: *Invalid credentials* error

---

### ✅ TC_004 – Invalid Password
- **Steps**: Username: `Admin`, Password: `invalid`
- **Expected**: *Invalid credentials* error

---

### ✅ TC_005 – Blank Credentials
- **Steps**: Leave both fields empty
- **Expected**: *Required* messages shown

---

### ✅ TC_006 – Case Sensitivity Check
- **Steps**: Username: `admin`, Password: `Admin123`
- **Expected**: Login fails if case-sensitive

---

### ✅ TC_007 – Case Variation Check
- **Steps**: Username: `admin`, Password: `admin123`
- **Expected**: Error message (case-sensitive systems)

---

### ✅ TC_008 – Password Field UI
- **Steps**: Enter strong password with symbols
- **Expected**: Characters are hidden as bullets

---

### ✅ TC_009 – Show Password Feature
- **Steps**: Click eye icon after entering password
- **Expected**: Password is revealed temporarily

---

### ✅ TC_010 – Reset Password (Valid Username)
- **Steps**:
  1. Click “Forgot your password?”
  2. Enter `Admin`
  3. Click Reset
- **Expected**: *Reset link sent successfully.*

---

### ✅ TC_011 – Reset Password (Invalid Username)
- **Steps**: Username: `123XXX#`
- **Expected**: *Username is incorrect* error

---
</details>
