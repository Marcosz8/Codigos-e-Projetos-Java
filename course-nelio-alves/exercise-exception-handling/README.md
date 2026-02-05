# Bank Account System with Exception Handling

This is a didactic example exercise in Java that demonstrates the use of custom exception handling for business rules, simulating basic bank account operations from Nelio Alves' course.

## 📌 Features

* Creating a bank account with:

  * Account number
   Account holder
  * Initial balance
  * Withdrawal limit
* Withdrawal process
* Validation of business rules
* Handling of custom exceptions

## 🧱 Project Structure

```
application/
 └── Program.java          

model/
 ├── entities/
 │    └── Account.java     
 │
 └── exceptions/
      └── BusinessException.java  

```
## ⚙️ General Operation

1. The user enters the account details.
2. The system creates an `Account` object.
3. The user enters the withdrawal amount.
4. The `withdraw()` method validates:

   * If the amount exceeds the withdrawal limit.
   * If the amount is greater than the available balance.
5. If any rule is violated, a **BusinessException** is thrown.
6. The program catches the exception and displays the appropriate message.

## 🚨 Tratamento de Exceções

### Exception Handling

The `BusinessException` class extends `Exception` and represents expected domain errors, such as:

* Withdrawal exceeding the limit
* Insufficient funds

These exceptions are handled explicitly in `main`:

* Displays a clear message to the user
* Prevents abrupt program termination

### Generic Exception

Unexpected errors are handled with `RuntimeException`, displaying a generic error message.---

## 🧠 Applied Concepts

* Object-Oriented Programming (OOP)
* Encapsulation
* Custom exceptions
* Separation of responsibilities
* Validation of business rules

## 📚 Technologies Used

* Java SE
* Scanner (data input)
* Locale (numeric formatting)

