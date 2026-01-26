🧾 Order Management System (Java)

Este projeto é um exercício prático em Java com foco em Programação Orientada a Objetos (POO), desenvolvido para consolidar conceitos fundamentais como classes, objetos, associações, enums, listas, datas e entrada de dados via console.

O sistema simula o cadastro de um pedido, contendo cliente, itens, produtos, status do pedido e cálculo do valor total.

🚀 Tecnologias Utilizadas

Java

Java Time API (LocalDate, Instant, DateTimeFormatter)

Enum

Collections (ArrayList)

Scanner (entrada de dados pelo console)

🧠 Conceitos Praticados

Modelagem de classes

Relacionamento entre objetos:

Order → Client

Order → lista de OrderItem

OrderItem → Product

Uso de Enum para status do pedido

Manipulação de datas e horas

Boas práticas de encapsulamento

Laços de repetição (for-each)

Cálculo de subtotal e total do pedido

Sobrescrita do método toString()

🏗️ Estrutura do Projeto
application  
 └── Program.java

entities  
 ├── Client.java  
 ├── Order.java  
 ├── OrderItem.java  
 ├── Product.java  
 └── enums 

         └── OrderStatus.java

📋 Funcionalidades

Cadastro de cliente (nome, email e data de nascimento)

Criação de pedido com data/hora atual e status

Inserção de múltiplos produtos no pedido

Cálculo automático:

Subtotal por item

Total do pedido

Exibição do resumo completo do pedido

🖥️ Exemplo de Execução  
Enter client data:  
Name: Maria Brown  
Email: maria@gmail.com  
Birth date (DD/MM/YYYY): 15/03/1985  

Enter order data:  
Status: PROCESSING  
How many items to this order? 2  

Enter #1 item data:  
Product name: TV  
Product price: 1000.00  
Quantity: 1  

Enter #2 item data:  
Product name: Mouse  
Product price: 40.00  
Quantity: 2  

ORDER SUMMARY:  
Order moment: 20/04/2018 11:25:09  
Order status: PROCESSING 
Client: Maria Brown (15/03/1985) - maria@gmail.com  
Order items:  
TV, $1000.00, Quantity: 1, Subtotal: $1000.00  
Mouse, $40.00, Quantity: 2, Subtotal: $80.00  
Total price: $1080.00  

📌 Observações

Este exercício foi desenvolvido como parte do processo de aprendizado, incluindo pesquisa, testes, erros e ajustes, reforçando a compreensão prática dos conceitos de Java e POO.

O foco não foi apenas “fazer funcionar”, mas entender o porquê de cada decisão de modelagem.