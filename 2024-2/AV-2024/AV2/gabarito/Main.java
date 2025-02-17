package AV2.gabarito;

public class Main {
    public static void main(String[] args) {
        Alimento alimento1 = new Alimento("Maçã", 5.0, 10, "10/11/2024");
        Vestuario vestuario1 = new Vestuario("Camisa", 50.0, 5, 42);

        Carrinho carrinho = new Carrinho();

        // Try-catch para adicionar itens com sucesso
        try {
            alimento1.aplicarDesconto(0.10); // Aplica desconto de 10%
            carrinho.adicionarItem(alimento1, 2);
            carrinho.adicionarItem(vestuario1, 1);
            System.out.println("Itens adicionados com sucesso!");
        } catch (EstoqueInsuficienteException e) {
            System.out.println(e.getMessage());
        }

        // Try-catch para adicionar itens com erro
        try {
            carrinho.adicionarItem(alimento1, 20); // Força exceção de estoque
        } catch (EstoqueInsuficienteException e) {
            System.out.println(e.getMessage());
        }

        // Try-catch para calcular total com sucesso
        try {
            double total = carrinho.calcularTotal();
            System.out.println("Total do carrinho: " + total);
        } catch (CarrinhoVazioException e) {
            System.out.println(e.getMessage());
        }

        // Try-catch para calcular total com erro
        try {
            Carrinho carrinhoVazio = new Carrinho();
            double total = carrinhoVazio.calcularTotal(); // Força exceção de carrinho vazio
        } catch (CarrinhoVazioException e) {
            System.out.println(e.getMessage());
        }

        // Exibir itens do carrinho
        System.out.println("\nItens no carrinho:");
        carrinho.exibirItens();
    }
}
