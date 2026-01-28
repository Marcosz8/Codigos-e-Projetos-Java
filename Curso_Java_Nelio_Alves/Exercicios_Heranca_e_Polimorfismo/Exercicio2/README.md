# Exercício de Herança e Polimorfismo em Java

Este projeto é um exercício prático desenvolvido em Java com o objetivo de praticar **Programação Orientada a Objetos**, com foco em **herança**, **classes abstratas** e **polimorfismo**.

O exercício faz parte dos estudos sobre POO do Curso do Nelio Alves e simula o cálculo de impostos para diferentes tipos de contribuintes.

---

## 🧠 Descrição do Problema

O programa deve ler os dados de **N contribuintes**, informados pelo usuário.  
Cada contribuinte pode ser:

- **Pessoa Física (Individual)**
- **Pessoa Jurídica (Company)**

Ao final, o sistema exibe:
- O valor do imposto pago por cada contribuinte
- O total de impostos arrecadados

---

## 📋 Regras de Negócio

### 👤 Pessoa Física (Individual)
- Renda anual **abaixo de 20.000** → imposto de **15%**
- Renda anual **a partir de 20.000** → imposto de **25%**
- Gastos com saúde permitem **abatimento de 50%** no imposto

---

### 🏢 Pessoa Jurídica (Company)
- Imposto padrão: **16%**
- Se a empresa possuir **mais de 10 funcionários**, o imposto cai para **14%**

## 🏗️ Estrutura do Projeto

application/  
└── Program.java

entities/  
├── TaxPayer.java  
├── Individual.java  
└── Company.java  

## 🔁 Conceitos Utilizados

- ✔️ Herança
- ✔️ Classe abstrata
- ✔️ Polimorfismo
- ✔️ Encapsulamento
- ✔️ Estruturas de repetição
- ✔️ Boas práticas de organização de código