package AV2.gabarito;

public class Vestuario extends Item{
    private int tamanho;

    public Vestuario(String nome, double preco, int estoque, int tamanho) {
        super(nome, preco, estoque);
        this.tamanho = tamanho;
    }
    
    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("Tamanho: " + this.tamanho);
    }
}
