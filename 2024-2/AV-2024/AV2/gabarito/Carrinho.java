package AV2.gabarito;

import java.util.ArrayList;

public class Carrinho {
    
    private ArrayList<Item> carrinhoArray = new ArrayList<Item>();

    public void adicionarItem(Item item, int quantidade) throws EstoqueInsuficienteException {
        try {
            if (item.verificarEstoque(quantidade)) {
                carrinhoArray.add(item);
            } else {
                throw new EstoqueInsuficienteException("Estoque insuficiente para o item ");
            }
        } catch (EstoqueInsuficienteException e) {
            System.out.println(e.getMessage());
        }
    }

    public double calcularTotal() throws CarrinhoVazioException {
        double total = 0;
        try {
            if (carrinhoArray.isEmpty()) {
                throw new CarrinhoVazioException("Carrinho vazio");
            } else {
                for (Item item : carrinhoArray) {
                    total += item.getPreco();
                }
            }
        } catch (CarrinhoVazioException e) {
            System.out.println(e.getMessage());
        }
        return total;
    }

    public void exibirItens() {
        if(carrinhoArray.isEmpty()) {
            System.out.println("Carrinho vazio");
        } else {
            for (Item item : carrinhoArray) {
                item.mostraInfo();
            }
        }
    }
}
