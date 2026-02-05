# Exercise Description 

The goal of this exercise is to practice fundamental concepts of inheritance, polymorphism, encapsulation, and lists by simulating the registration of different product types and displaying their respective price tags.

## 🧠 Concepts Applied

Object-Oriented Programming (OOP)

Inheritance (extends)

Polymorphism (overwriting the method priceTag)

Abstract Classes / Base Classes

Use of List and ArrayList

Data Input with Scanner

Manipulating dates with LocalDate and DateTimeFormatter

## 🧱 Estrutura do exercício

Exercise Structure

* Product: Common product containing name and price. 

* UsedProduct: Includes a manufacture date in addition to name and price.

* ImportedProduct: Includes a customs fee in addition to name and price.

All products inherit from the base class Product and override the priceTag() method, allowing each type to display its information in a specific way.

## ▶️ Operation

1. The user enters the quantity of products.

2. For each product, they choose the type (common, used, or imported).

3. The data is read via terminal.

4. The products are stored in a list.

5. Finally, the system prints the price tags for all registered products.

## 🏗️ Project Structure

application/  
└── Program.java

entities/  
├── ImportedProduct.java  
├── Product.java  
└── UsedProduct.java  


## 🎯 Learning objective

This exercise focused on:

Understanding how objects of different types can be treated generically.

Applying polymorphism in practice

Reinforcing good object-oriented modeling practices

## 🚀 Observation

All the code was developed as part of a learning process, with research, testing, and adjustments along the way — focusing on understanding the concepts and not just the final solution.
