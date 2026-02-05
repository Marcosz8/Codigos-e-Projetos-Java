# 🧾 Order Management System (Java)

This project is a practical exercise in Java focusing on Object-Oriented Programming (OOP), developed to consolidate fundamental concepts such as classes, objects, associations, enums, lists, dates, and console input.

The system simulates the registration of an order, including customer, items, products, order status, and calculation of the total value.

## 🚀 Technologies Used

Java

Java Time API (LocalDate, Instant, DateTimeFormatter)

Enum

Collections (ArrayList)

Scanner (console data input)

## 🧠 Concepts in Practice

Class Modeling

Relationships between objects:

Order → Client

Order → list of OrderItems

OrderItem → Product

Using Enums for order status

Handling dates and times

Encapsulation best practices

For-each loops

Calculating order subtotal and total

Overriding the toString() method

## 🏗️ Project Structure

application  
 └── Program.java

entities  
 ├── Client.java  
 ├── Order.java  
 ├── OrderItem.java  
 ├── Product.java  
 └── enums  
 |    └── OrderStatus.java

## 📋 Features

Customer registration (name, email, and date of birth)

Order creation with current date/time and status

Adding multiple products to the order

Automatic calculation:

Subtotal per item

Total of the ordero

