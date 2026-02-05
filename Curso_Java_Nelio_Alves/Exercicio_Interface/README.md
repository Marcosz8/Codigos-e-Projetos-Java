# 🤔 Contract Processing System (Java)

This project is a practical exercise developed in Java aimed at practicing Object-Oriented Programming, focusing on Interfaces, Dependency Injection, and Exception Handling.

The exercise is part of the OOP studies in Nélio Alves' Course and simulates the processing of contract installments based on online payment services (PayPal).

## 🧠 Problem Description

The program must read the data of a Contract:

Contract number, date, and total value.

Next, the user enters the number of installments. The system must:

Generate installments with monthly due dates.

Calculate interest and fees according to the payment service used.

Display the list of generated installments (date and value).

## 📋 Business Rules (PayPal Service)

### 📈 Simple Interest
Application of 1% simple interest on the installment value for each month until the due date.

### 💳 Payment Fee
Application of a 2% service fee on the installment value already increased by interest.


## 🏗️ Project Structure

application/  
└── Program.java  (Data input and interaction)

model/  
├── entities/  
│   ├── Contract.java (Contract data)  
│   └── Installment.java (Installment data)  
├── services/    
│   ├── OnlinePaymentService.java (Interface)  
│   ├── PaypalServices.java (Logic implementation)  
│   └── ContractService.java (Processing orchestration)  


## 🔁 Concepts Used

✔️ Interfaces: To ensure low coupling.

✔️ Dependency Injection: Flexibility in choosing the payment service.

✔️ Exception Handling: Using try-catch to validate user inputs.

✔️ Loops and Lists: Collection manipulation to manage installments.

✔️ Java Time (LocalDate): Professional handling of due dates.