# Contract Processing System 

This project was developed for educational purposes as part of an Object-Oriented Programming course.

It is a Java-based exercise focused on practicing core OOP concepts such as Interfaces, Dependency Injection, and Exception Handling, simulating the processing of contract installments using an online payment service (PayPal).

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

```
application/  
└── Program.java  (Data input and interaction)

model/  
├── entities/  
|       ├── Contract.java (Contract data)  
|       └── Installment.java (Installment data)  
└── services/    
        ├── OnlinePaymentService.java (Interface)  
        ├── PaypalServices.java (Logic implementation)  
        └── ContractService.java (Processing orchestration)  
```

## 🔁 Concepts Used

* Interfaces: To ensure low coupling.

* Dependency Injection: Flexibility in choosing the payment service.

* Exception Handling: Using try-catch to validate user inputs.

* Loops and Lists: Collection manipulation to manage installments.

## 📚 Technologies Used

* Java JDK 25.

* Java Time API (LocalDate).

* Generics & Collections (List)

## ▶️ How to Run

1. Compile the project using a Java compiler (JDK 17+ recommended).
2. Run the `Program` class.
3. Enter the contract data as requested in the console.

## ⚙️ Example Output:

Enter contract data  
Number: 8028  
Date (dd/MM/yyyy): 25/06/2018  
Contract value: 600.00  
Enter number of installments: 3  
Installments:  
25/07/2018 - 206.04  
25/08/2018 - 208.08  
25/09/2018 - 210.12  


