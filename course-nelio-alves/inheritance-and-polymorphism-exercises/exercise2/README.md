# Exercise on Inheritance and Polymorphism

This project is a practical exercise developed in Java with the goal of practicing **Object-Oriented Programming**, focusing on **inheritance**, **abstract classes**, and **polymorphism**.

The exercise is part of the OOP studies in Nelio Alves' course and simulates the calculation of taxes for different types of taxpayers.

## 🧠 Problem Description

The program should read the data from **N taxpayers**, provided by the user.

Each taxpayer can be:
- **Individual (Natural Person)**
- **Company (Legal Entity)**

Finally, the system displays:
- The amount of tax paid by each taxpayer
- The total amount of taxes collected

## 📋 Business Rules

### 👤 Individual Taxpayer
- Annual income **below R$20,000** → 15% tax rate
- Annual income **from R$20,000** → 25% tax rate
- Healthcare expenses allow for a **50% tax deduction**

### 🏢 Legal Entity (Company)
- Standard tax: **16%**
- If the company has **more than 10 employees**, the tax drops to **14%**

## 🏗️ Project Structure

application/  
└── Program.java

entities/  
├── TaxPayer.java  
├── Individual.java  
└── Company.java  

## 🔁 Concepts Used

- Inheritance
- Abstract classes
- Polymorphism
- Encapsulation
- Repetition structures
- Good code organization practices