📌 Descrição do Exercício

O objetivo do exercício é praticar conceitos fundamentais de herança, polimorfismo, encapsulamento e listas, simulando o cadastro de diferentes tipos de produtos e a exibição de suas respectivas price tags.

🧠 Conceitos aplicados

Programação Orientada a Objetos (POO)

Herança (extends)

Polimorfismo (sobrescrita do método priceTag)

Classes abstratas / classes base

Uso de List e ArrayList

Leitura de dados com Scanner

Manipulação de datas com LocalDate e DateTimeFormatter

🧱 Estrutura do exercício

O sistema trabalha com três tipos de produtos:

Product
Produto comum, contendo nome e preço.

UsedProduct
Produto usado, que além do nome e preço possui data de fabricação.

ImportedProduct
Produto importado, que possui uma taxa de alfândega (customs fee) adicionada ao preço final.

Todos os produtos herdam da classe base Product e sobrescrevem o método priceTag(), permitindo que cada tipo apresente sua informação de forma específica.

▶️ Funcionamento

O usuário informa a quantidade de produtos

Para cada produto, escolhe o tipo (comum, usado ou importado)

Os dados são lidos via terminal

Os produtos são armazenados em uma lista

Ao final, o sistema imprime as price tags de todos os produtos cadastrados

🎯 Objetivo do aprendizado

Este exercício teve como foco:

Entender como objetos de diferentes tipos podem ser tratados de forma genérica

Aplicar polimorfismo na prática

Reforçar boas práticas de modelagem orientada a objetos

🚀 Observação

Todo o código foi desenvolvido como parte do processo de aprendizado, com pesquisa, testes e ajustes ao longo do caminho — focando na compreensão dos conceitos e não apenas na solução final.