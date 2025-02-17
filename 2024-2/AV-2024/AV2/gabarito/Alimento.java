package AV2.gabarito;

public class Alimento extends Item {
    private String validade;

    public Alimento(String nome, double preco, int estoque, String validade) {
        super(nome, preco, estoque);
        this.validade = validade;
    }

    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("Validade: " + this.validade);
    }
}
