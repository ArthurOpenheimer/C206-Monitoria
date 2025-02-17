public class Main {
    public static void main(String[] args) {
        Arquivo arquivo = new Arquivo();

        Jogo jogo1 = new Jogo(1, "Overwatch", 65.0);
        Jogo jogo2 = new Jogo(2, "Minecraft", 120.0);
        Jogo jogo3 = new Jogo(3, "Sea of Thieves", 250.0);

        arquivo.escrever(jogo1);
        arquivo.escrever(jogo2);
        arquivo.escrever(jogo3);

        arquivo.lerJogo("120.0");

        arquivo.lerJogos();
    }
}
