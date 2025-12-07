# 💳 Sistema de Compras com Cartão de Crédito

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)

## 📝 Descrição

Este projeto é uma aplicação backend desenvolvida em **Java** que simula o funcionamento de um cartão de crédito. O sistema permite definir um limite, realizar compras validando o saldo disponível e, ao final, exibir uma lista de compras ordenada por valor.

O objetivo principal foi praticar conceitos fundamentais de **Orientação a Objetos** e **Estrutura de Dados**.

## 🔨 Funcionalidades

- [x] Definição de limite do cartão.
- [x] Cadastro de compras (Descrição e Valor).
- [x] Validação de saldo (impede compras se o limite for excedido).
- [x] Ordenação automática da lista de compras (do menor para o maior valor).
- [x] Exibição do total gasto e saldo remanescente.

## 💻 Tecnologias e Conceitos Utilizados

- **Java 25**
- **POO (Programação Orientada a Objetos):**
  - Encapsulamento (atributos privados e getters).
  - Composição (Cartão possui uma Lista de Compras).
- **Collections Framework:** Uso da interface `List` e da classe `ArrayList`.
- **Ordenação:** Interface `Comparable` e `Comparator` (Java 8 Lambdas).
- **Entrada de Dados:** Classe `Scanner`.

## 📂 Estrutura do Projeto

O código está organizado em classes para separar responsabilidades:

- `Principal.java`: Classe main responsável pela interação com o usuário.
- `CartaoDeCredito.java`: Gerencia o saldo, o limite e a lista de compras.
- `Compras.java`: Modelo que representa o item comprado.

## 🚀 Como executar

1. Clone o repositório:
  
   git clone [https://[https://github.com/tacitopontes-dev/AtividadeListaDeCompras.git](https://github.com/tacitopontes-dev/AtividadeListaDeCompras.git)
   
2.Abra o projeto na sua IDE favorita (IntelliJ, Eclipse, VS Code).

3.Execute a classe Principal.

👨‍💻 Autor
Desenvolvido por Tácito Pontes Amaral.

LinkedIn: https://www.linkedin.com/in/tacito-pontes-amaral/

GitHub: https://github.com/tacitopontes-dev
