# Smart Farming – Implementação de Padrões Criacionais

## Descrição

Este projeto foi desenvolvido como atividade acadêmica com o objetivo de aplicar, na prática, conceitos relacionados aos padrões de projeto criacionais.

Foram implementados dois padrões utilizando a linguagem Java: Singleton e Factory Method. A temática escolhida foi a de uma fazenda inteligente, utilizada como metáfora para representar os conceitos de forma contextualizada.

---

## Linguagem Utilizada

Java

---

## Padrões Implementados

### Singleton

O padrão Singleton garante que uma classe possua apenas uma única instância durante a execução do sistema, além de fornecer um ponto global de acesso a ela.

No projeto, esse padrão foi representado pela classe `ReservatorioAgua`, que simula um reservatório central da fazenda. A implementação utiliza construtor privado, atributo estático para armazenar a instância e um método público responsável por retorná-la.

---

### Factory Method

O padrão Factory Method define um método para criação de objetos, permitindo que subclasses decidam qual classe concreta será instanciada.

No projeto, foi utilizada a interface `Cultura` e suas implementações `Milho` e `Trigo`. A classe abstrata `Fazenda` declara o método de criação, que é implementado pelas subclasses `FazendaMilho` e `FazendaTrigo`, delegando a responsabilidade de instanciar a cultura correta.

Esse padrão reduz o acoplamento e torna o sistema mais flexível.

---

## Estrutura do Projeto

* Cultura.java
* Milho.java
* Trigo.java
* Fazenda.java
* FazendaMilho.java
* FazendaTrigo.java
* ReservatorioAgua.java
* Main.java

