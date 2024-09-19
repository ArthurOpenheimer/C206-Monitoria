package gabarito;
public class Main {
    
    public static void main(String[] args) {
        
        Produto[] produtos = new Produto[3];

        produtos[0] = new Notebook("Notebook", 2500.0, 512, "GTX 1050", "i5");
        produtos[1] = new Camiseta("Camiseta", 50.0, "Azul", "M");
        produtos[2] = new Produto("Mesa", 300.0);

        for (Produto produto : produtos) {
            if(produto instanceof Notebook) {
                System.out.println("Notebook: " + produto.etiquetaPreco());
            } else if(produto instanceof Camiseta) {
                System.out.println("Camiseta: " + produto.etiquetaPreco());
            } else {
                System.out.println("Produto: " + produto.etiquetaPreco());
            }
        }
    }
}
