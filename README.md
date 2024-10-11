# Payroll
Android App

This is a basic Payroll App, an android based app written on java language.

It  helps in managing the Payroll Management System of a company or an organisation.

It will provide basic functionalties like Login and Sign up of the User,

It provides secure authentication and savinng data to the Google Firebase.

adding employee, generating payslip, view available employee and view latest transactions.

2.2 - Functionality of Modules
1. User Authentication Module
    Purpose: Allow users to create accounts and securely log in.
    Functionality:
    Login and Sign-Up: Enables users to create new accounts or log in to existing ones.
    Secure Authentication: Uses Firebase Authentication to handle secure login and sign-up processes with email and password verification.
2. Employee Management Module
    Purpose: Manage employee details efficiently.
    Functionality:
    Add Employee: Allows administrators to manually enter and store employee details such as name, designation, and contact information.
    View Employees: Displays a list of employees for easy management and retrieval of their details.
3. Payroll Processing Module 
    Purpose: To calculate the employee’s net pay based on the basic salary, attendance, bonuses, and deductions.
    Functionality:
    Basic Salary Calculation: Manually entered by the administrator. It serves as the foundation for salary calculations.
    Gross Salary Calculation: Gross Salary = Basic Salary + Bonuses + Allowances.
    Net Pay Calculation: The net pay is calculated by subtracting deductions (such as unpaid leave, PF, ESI, and health insurance) from the gross salary.
4. Attendance Management Module 
    Purpose: Handle employee attendance and manage leave records, directly impacting salary calculations.
    Functionality:
    
    Manual Entry of Attendance: Administrators can enter the number of present and absent days for each employee.
    Leave Management: Tracks approved leaves, both paid (PFA) and unpaid, and ensures leaves are accounted for in payroll processing.
    Summary Generation: Generates a summary of attendance, including present days, absent days, and leave taken, at the end of the payroll cycle.
5. Deduction Calculation Module (Updated)
    Purpose: Apply deductions based on attendance, health insurance, PF, ESI, and taxes.
    Functionality:
    Unpaid Leave Deductions: Automatically calculate deductions for unpaid leave based on attendance data.
    Provident Fund (PF) Calculation: Deduct a percentage of the basic salary as the employee’s contribution to the PF.
    Employee State Insurance (ESI): Deduct a percentage of the gross salary for ESI.
    Health Insurance Deduction: Deduct the health insurance premium as specified by company policy.
6. Transaction Management Module
    Purpose: View and manage payroll transactions.
    Functionality:
    View Latest Transactions: Display recent payroll transactions for easy reference and auditing.
7. Data Management Module with Firebase
    Purpose: Securely store all employee data, attendance, payroll information, and transactions.
    Functionality:
    Data Storage: Use Firebase Firestore or Realtime Database to store data securely.
    Data Retrieval: Ensure data is easily accessible for payroll processing, reporting, and auditing.


![rsz_screenshot_2020-04-28-13-59-41-154_comexamplepayroll](https://user-images.githubusercontent.com/51875794/81916927-2397da00-95f2-11ea-9824-b0ee0bd6131a.jpg) ![rsz_screenshot_2020-04-28-13-59-47-021_comexamplepayroll](https://user-images.githubusercontent.com/51875794/81917149-72de0a80-95f2-11ea-97a9-28476cb82979.jpg) ![Screenshot_2020-04-28-13-59-50-278_comexamplepayroll](https://user-images.githubusercontent.com/51875794/81918689-71addd00-95f4-11ea-9b32-49bff6e2d6af.jpg)

![Screenshot_2020-04-28-14-00-16-716_comexamplepayroll](https://user-images.githubusercontent.com/51875794/81918855-ade13d80-95f4-11ea-8271-1d121975f602.jpg) ![Screenshot_2020-04-28-14-00-19-919_comexamplepayroll](https://user-images.githubusercontent.com/51875794/81918896-bb96c300-95f4-11ea-8846-291310358b6e.jpg) ![rsz_screenshot_2020-05-14-03-42-07-402_comexamplepayroll](https://user-images.githubusercontent.com/51875794/81918970-d5d0a100-95f4-11ea-89e8-8a8b764b73ff.jpg)

![unnamed](https://user-images.githubusercontent.com/51875794/81919459-8474e180-95f5-11ea-83e6-3009a4f8cb2a.jpg) ![unnamed 2](https://user-images.githubusercontent.com/51875794/81919495-8e96e000-95f5-11ea-8094-211d4eb5ff9e.jpg) ![unnamed 1](https://user-images.githubusercontent.com/51875794/81919535-98204800-95f5-11ea-9e29-9beb87d5f8f4.jpg)

