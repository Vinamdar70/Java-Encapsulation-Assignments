# Java Encapsulation Practice 🚀

This repository contains three encapsulation-based Java programs designed for beginner to intermediate learners. Each problem explores a real-world scenario and applies key Object-Oriented Programming concepts like **encapsulation**, **access control**, **validation**, and **data protection**.

---


---

## ✅ Problem Levels & Descriptions

### 🔹 Easy: Student Details Encapsulation

**Class:** `Student`  
**Fields (private):**  
- `name` (String)  
- `rollNumber` (int)  
- `marks` (float)

**Tasks:**  
- Create getters and setters.  
- In `main()`: create a `Student` object, set values using setters, and print values using getters.

**Concepts Practiced:**  
- Encapsulation  
- Access modifiers  
- Object creation and manipulation  

---

### 🔸 Medium: Bank Account with Access Control

**Class:** `BankAccount`  
**Fields (private):**  
- `accountNumber`  
- `accountHolder`  
- `balance`

**Tasks:**  
- `getBalance()` and `setBalance()` (with negative balance check)  
- `deposit(double amount)`  
- `withdraw(double amount)` with insufficient funds check  
- In `main()`: test with multiple deposit/withdraw scenarios

**Concepts Practiced:**  
- Logical constraints  
- Validation in setters  
- Secure access to sensitive data  

---

### 🔥 Hard: HR Management System

**Class:** `Employee`  
**Fields (private):**  
- `employeeId` (int)  
- `name` (String)  
- `salary` (double)  
- `designation` (String)

**Tasks:**  
- Use setters with:
  - Negative salary restriction  
  - Designation limited to: `"Developer"`, `"Tester"`, `"Manager"`  
- `displayEmployeeDetails()` method to print formatted data  
- In `main()`: create 3 employees, test validation logic

**Concepts Practiced:**  
- Full encapsulation  
- Real-world object modeling  
- Logical enforcement in setters  

---

