public class Main {
    public static void main(String[] args) {
    
        Arma espada = new Arma(30, 10);
        Arma arco = new Arma(20, 5);

        Jogador jogador1 = new Jogador(espada, 50, 100);
        Jogador jogador2 = new Jogador(arco, 40, 100);

        System.out.println("Estado inicial dos jogadores:");
        System.out.println(jogador1);
        System.out.println(jogador2);

        System.out.println("\nJogador 1 ataca Jogador 2:");
        jogador1.atacar(jogador2);

        System.out.println("\nEstado final dos jogadores:");
        System.out.println(jogador1);
        System.out.println(jogador2);
    }
}
