# Payroll - Android App

A **Payroll System** is an essential tool for businesses to efficiently manage employee payments, automate salary calculations, tax deductions, and other financial processes. This project presents a simple payroll system app designed for small to medium-sized businesses, aiming to streamline payroll management and ensure accurate and timely compensation.

## Features
- **Automated Salary Calculations**: Calculates gross and net salaries.
- **Tax & Deduction Handling**: Manages tax deductions, PF, health insurance, and unpaid leave.
- **Attendance Tracking**: Tracks employee work hours and leaves.
- **Secure Data Storage**: Stores employee data securely and complies with tax regulations.
- **User-Friendly Interface**: Intuitive for both administrators and employees.
- **Customizable**: Flexible to meet various business needs.

## Modules and Their Functionalities

### 1. User Authentication Module
**Purpose**: Allows users to create accounts and securely log in.  
**Functionality**:
- **Login and Sign-Up**: Users can create accounts or log in to existing ones.
- **Secure Authentication**: Handled by Firebase Authentication with email and password verification.

### 2. Employee Management Module
**Purpose**: Efficiently manage employee details.  
**Functionality**:
- **Add Employee**: Administrators can add employee details such as name, designation, and contact information.
- **View Employees**: Displays a list of employees for easy management and retrieval.

### 3. Payroll Processing Module
**Purpose**: Calculate employee pay based on salary, attendance, bonuses, and deductions.  
**Functionality**:
- **Basic Salary Calculation**: Manually entered by the administrator.
- **Gross Salary Calculation**: `Gross Salary = Basic Salary + Bonuses + Allowances`.
- **Net Pay Calculation**: `Net Pay = Gross Salary - Deductions (PF, ESI, Health Insurance)`.

### 4. Attendance Management Module
**Purpose**: Handle employee attendance and manage leave records.  
**Functionality**:
- **Manual Attendance Entry**: Administrators can input attendance manually.
- **Leave Management**: Tracks paid and unpaid leaves, affecting salary calculations.
- **Attendance Summary**: Generates an attendance summary for payroll processing.

### 5. Deduction Calculation Module
**Purpose**: Apply deductions for attendance, insurance, PF, ESI, and taxes.  
**Functionality**:
- **Unpaid Leave Deductions**: Automatically calculates deductions based on attendance data.
- **Provident Fund (PF) Deduction**: Deducts a percentage from the basic salary.
- **Employee State Insurance (ESI)**: Deducts a percentage from the gross salary.
- **Health Insurance Deduction**: Deducts the health insurance premium as per company policy.

### 6. Transaction Management Module
**Purpose**: View and manage payroll transactions.  
**Functionality**:
- **View Transactions**: Displays recent payroll transactions for auditing.

### 7. Data Management Module (with Firebase)
**Purpose**: Securely store employee data, attendance, payroll info, and transactions.  
**Functionality**:
- **Data Storage**: Uses Firebase Firestore/Realtime Database to securely store data.
- **Data Retrieval**: Easily retrieves data for payroll processing and auditing.

---

### Screenshots

![Screenshot 1](https://user-images.githubusercontent.com/51875794/81916927-2397da00-95f2-11ea-9824-b0ee0bd6131a.jpg)
![Screenshot 2](https://user-images.githubusercontent.com/51875794/81917149-72de0a80-95f2-11ea-97a9-28476cb82979.jpg)
![Screenshot 3](https://user-images.githubusercontent.com/51875794/81918689-71addd00-95f4-11ea-9b32-49bff6e2d6af.jpg)
![Screenshot 4](https://user-images.githubusercontent.com/51875794/81918855-ade13d80-95f4-11ea-8271-1d121975f602.jpg)
![Screenshot 5](https://user-images.githubusercontent.com/51875794/81918896-bb96c300-95f4-11ea-8846-291310358b6e.jpg)
![Screenshot 6](https://user-images.githubusercontent.com/51875794/81919459-8474e180-95f5-11ea-83e6-3009a4f8cb2a.jpg)
