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

## Execução do Programa

Ao executar o arquivo `Main.java`, o programa imprime a seguinte saída no console:

```
===== Testando Singleton =====
Configuração criada.
Usando configuração do sistema.
As duas variáveis apontam para a mesma instância.

===== Testando Factory Method =====
Produto A criado.
Produto B criado.
```

---

## Explicação da Saída

### Parte 1 – Testando o Singleton

* A mensagem **"Configuração criada."** aparece apenas uma vez, pois o padrão Singleton garante que apenas uma única instância da classe `Configuracao` seja criada.
* Mesmo chamando o método `getInstancia()` duas vezes, o sistema reutiliza o mesmo objeto.
* A mensagem **"As duas variáveis apontam para a mesma instância."** confirma que `config1` e `config2` referenciam o mesmo objeto na memória.

Isso demonstra o funcionamento correto do padrão Singleton.

---

### Parte 2 – Testando o Factory Method

* Quando o programa chama `FabricaProduto.criarProduto("A")`, é criado um objeto do tipo `ProdutoA`.
* Quando chama `FabricaProduto.criarProduto("B")`, é criado um objeto do tipo `ProdutoB`.
* Cada objeto executa seu próprio método `criar()`, imprimindo mensagens diferentes no console.

Isso demonstra que a criação dos objetos foi delegada à fábrica, caracterizando o uso do padrão Factory Method.

