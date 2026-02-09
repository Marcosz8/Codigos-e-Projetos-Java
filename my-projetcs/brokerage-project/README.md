## 💼 Investment Broker System

English 🇺🇸  
This project was developed for educational purposes as part of an Object-Oriented Programming (OOP) learning journey.

It is a Java-based console application that simulates an international investment broker, allowing users to create investments, calculate yields, apply early withdrawal penalties, manage portfolios, and persist data to files.

Português 🇧🇷  
Este projeto foi desenvolvido para fins educacionais como parte do aprendizado de Programação Orientada a Objetos (POO).

Trata-se de uma aplicação Java em console que simula uma corretora internacional de investimentos, permitindo criar investimentos, calcular rendimentos, aplicar penalidades por saque antecipado, gerenciar portfólios e salvar dados em arquivos.

## 🧠 Problem Description

English 🇺🇸  
The system allows users to manage financial investments in different currencies (Real, Dollar, and Euro).

* Each investment contains:

* A unique ID

* Customer name

* Currency type

* Deposit date

* Expected withdrawal date

* Initial amount

* Calculated final amount

* The user can add investments, simulate withdrawals (with or without penalties), view reports, search investments, and export data.

Português 🇧🇷  
O sistema permite ao usuário gerenciar investimentos financeiros em diferentes moedas (Real, Dólar e Euro).

* Cada investimento contém:

* Um ID único

* Nome do cliente

* Tipo de moeda

* Data de depósito

* Data prevista de saque

* Valor inicial

* Valor final calculado

* O usuário pode adicionar investimentos, simular saques (com ou sem penalidade), visualizar relatórios, buscar investimentos e exportar dados.

## 📋 Business Rules 

English 🇺🇸  

Investments earn simple monthly interest based on the chosen currency.

Interest is calculated using the number of months between deposit and withdrawal dates.

If the withdrawal occurs before the expected date, an early withdrawal fee is applied.

Each currency defines:

* Monthly interest rate

* Early withdrawal penalty

* Investments cannot be created with:

* Past deposit dates

* Withdrawal dates before deposit

* Zero or negative values

Português 🇧🇷  

Os investimentos rendem juros simples mensais conforme a moeda escolhida.

Os juros são calculados com base na quantidade de meses entre depósito e saque.

Se o saque ocorrer antes da data prevista, uma penalidade é aplicada.

Cada moeda define:

* Taxa de juros mensal

* Taxa de penalidade por saque antecipado

* Não é permitido criar investimentos com:

* Datas de depósito no passado

* Datas de saque anteriores ao depósito

* Valores zero ou negativos

## 💱 Currency Rules

English 🇺🇸

| Currency | Monthly Interest | Early Withdrawal Fee |
| -------- | ---------------- | -------------------- |
| Real     | 1.00%            | 4%                   |
| Dollar   | 0.50%            | 2%                   |
| Euro     | 0.75%            | 3%                   |

Português 🇧🇷

| Moeda | Juros Mensais | Penalidade de Saque |
| ----- | ------------- | ------------------- |
| Real  | 1,00%         | 4%                  |
| Dólar | 0,50%         | 2%                  |
| Euro  | 0,75%         | 3%                  |


## 🏗️ Project Structure

```
application/
└── Program.java
    (User interaction and application flow)

model/
├── entities/
│   ├── Investment.java
│   └── Broker.java
│
├── policies/
│   ├── Currency.java
│   ├── Real.java
│   ├── Dolar.java
│   └── Euro.java
│
└── services/
    ├── InvestmentCalculationService.java
    └── BackupService.java
```

## 🔁 Concepts Used

English 🇺🇸  

* Object-Oriented Programming (Encapsulation, Abstraction, Polymorphism)

* Interfaces for currency behavior

* Dependency Injection between Broker and Service classes

* Java Streams and Iterators

* Exception Handling (try-catch)

* File I/O with BufferedWriter

* Java Time API (LocalDate, ChronoUnit)

Português 🇧🇷  

* Programação Orientada a Objetos (Encapsulamento, Abstração, Polimorfismo)

* Interfaces para comportamento das moedas

* Injeção de dependência entre Broker e Services

* Streams e Iterator do Java

* Tratamento de exceções (try-catch)

* Escrita de arquivos com BufferedWriter

* API de Datas do Java (LocalDate, ChronoUnit)

## 📚 Technologies Used

English 🇺🇸  

* Java JDK 17+

* Java Collections Framework

* Java Time API

Português 🇧🇷  

* Java JDK 17+

* Framework de Coleções do Java

* API de Datas do Jav

## ▶️ How to Run

English 🇺🇸  

1. Compile the project using a Java compiler (JDK 17 or higher).

2. Run the Program class.

3. Follow the console menu instructions.

Português 🇧🇷  

1. Compile o projeto usando um compilador Java (JDK 17 ou superior).

2. Execute a classe Program.

3. Siga as instruções exibidas no console.

## ⚙️ Example Output:

English 🇺🇸

* Add an investment

* Simulate a withdrawal with penalty

* Confirm or cancel withdrawal

* View all investments sorted by client

* Save data to a .txt file

* View portfolio totals and subtotals

Português 🇧🇷

* Adicionar um investimento

* Simular saque com penalidade

* Confirmar ou cancelar saque

* Visualizar investimentos ordenados por cliente

* Salvar dados em arquivo .txt

* Ver totais e subtotais do portfólio