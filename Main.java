class Configuracao {

    private static Configuracao instancia;

    private Configuracao() {
        System.out.println("Configuracao criada.");
    }

    public static Configuracao getInstancia() {
        if (instancia == null) {
            instancia = new Configuracao();
        }
        return instancia;
    }

    public void exibirMensagem() {
        System.out.println("Usando configuracao do sistema.");
    }
}

interface Produto {
    void criar();
}

class ProdutoA implements Produto {
    public void criar() {
        System.out.println("Produto A criado.");
    }
}

class ProdutoB implements Produto {
    public void criar() {
        System.out.println("Produto B criado.");
    }
}

class FabricaProduto {

    public static Produto criarProduto(String tipo) {
        if (tipo.equalsIgnoreCase("A")) {
            return new ProdutoA();
        } else if (tipo.equalsIgnoreCase("B")) {
            return new ProdutoB();
        } else {
            throw new IllegalArgumentException("Tipo de produto invalido.");
        }
    }
}

public class Main {

    public static void main(String[] args) {

        System.out.println("===== Testando Singleton =====");
        Configuracao config1 = Configuracao.getInstancia();
        Configuracao config2 = Configuracao.getInstancia();

        config1.exibirMensagem();

        if (config1 == config2) {
            System.out.println("As duas variaveis apontam para a mesma instancia.");
        }

        System.out.println("\n===== Testando Factory Method =====");

        Produto produto1 = FabricaProduto.criarProduto("A");
        produto1.criar();

        Produto produto2 = FabricaProduto.criarProduto("B");
        produto2.criar();
    }
}