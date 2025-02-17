package AV2.gabarito;

public abstract class Item implements AplicarDesconto {
    private String nome;
    private double preco;
    private int estoque;

    public Item(String nome, double preco, int estoque) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    public boolean verificarEstoque(int quantidade) {
        if (this.estoque >= quantidade) {
            return true;
        } else {
            return false;
        }
    }

    public void mostraInfo() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Preço: " + this.preco);
        System.out.println("Estoque: " + this.estoque);
    }
    
    public double getPreco() {
        return this.preco;
    }

    @Override
    public double aplicarDesconto(double porcentagem) {
        this.preco -= this.preco * porcentagem;
        return this.preco;
    }
}
