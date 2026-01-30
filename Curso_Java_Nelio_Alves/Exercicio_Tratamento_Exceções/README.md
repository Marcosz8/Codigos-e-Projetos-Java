# Sistema de Conta Bancária com Tratamento de Exceções (Java)

Este é um exercicio de exemplo **didático em Java** que demonstra o uso de **tratamento de exceções personalizadas** para regras de negócio, simulando operações básicas de uma conta bancária do curso do Nelio Alves.

## 📌 Funcionalidades

* Criação de uma conta bancária com:

  * Número da conta
  * Titular
  * Saldo inicial
  * Limite de saque
* Realização de saque
* Validação de regras de negócio
* Tratamento de exceções customizadas

---

## 🧱 Estrutura do Projeto

```
application/
 └── Program.java          // Classe principal (entrada do sistema)

model/
 ├── entities/
 │    └── Account.java     // Entidade Conta Bancária
 │
 └── exceptions/
      └── BusinessException.java  // Exceção de negócio personalizada
```

---

## ⚙️ Funcionamento Geral

1. O usuário informa os dados da conta
2. O sistema cria um objeto `Account`
3. O usuário informa o valor para saque
4. O método `withdraw()` valida:

   * Se o valor excede o limite de saque
   * Se o valor é maior que o saldo disponível
5. Caso alguma regra seja violada, uma **BusinessException** é lançada
6. O programa captura a exceção e exibe a mensagem apropriada

---

## 🚨 Tratamento de Exceções

### Exceção de Negócio

A classe `BusinessException` estende `Exception` e representa erros esperados do domínio, como:

* Saque acima do limite
* Saldo insuficiente

Essas exceções são tratadas explicitamente no `main`:

* Exibe mensagem clara ao usuário
* Evita encerramento abrupto do programa

### Exceção Genérica

Erros inesperados são tratados com `RuntimeException`, exibindo uma mensagem genérica de erro.

---

## 🧠 Conceitos Aplicados

* Programação Orientada a Objetos (POO)
* Encapsulamento
* Exceções customizadas
* Separação de responsabilidades
* Validação de regras de negócio


## 📚 Tecnologias Utilizadas

* Java SE
* Scanner (entrada de dados)
* Locale (formatação numérica)

