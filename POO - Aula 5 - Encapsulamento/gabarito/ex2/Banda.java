public class Banda {
    private Musica[] musicas;
    private String nome;
    private int numeroDeIntegrantes;

    Banda(String nome, int numeroDeIntegrantes) {
        this.nome = nome;
        this.numeroDeIntegrantes = numeroDeIntegrantes;
        this.musicas = new Musica[10];
    }

    public void tocarMusica(int posicao){
        if (posicao < 0 || posicao >= musicas.length) {
            System.out.println("Posição inválida");
            return;
        }
        if (musicas[posicao] == null) {
            System.out.println("Música não encontrada");
            return;
        }
        System.out.println("Tocando " + musicas[posicao].getNome() + " do album " + musicas[posicao].getAlbum());
    }

    public void tocarShow(){
        for (int i = 0; i < musicas.length; i++) {
            if (musicas[i] != null) {
                System.out.println("Tocando " + musicas[i].getNome() + " do album " + musicas[i].getAlbum());
            }
        }
    }

    public boolean adicionarMusica(Musica musica){
        for (int i = 0; i < musicas.length; i++) {
            if (musicas[i] == null) {
                musicas[i] = musica;
                return true;
            }
        }
        return false;
    }

    public boolean deletarMusica(String nome){
        for (int i = 0; i < musicas.length; i++) {
            if (musicas[i] != null && musicas[i].getNome().equals(nome)) {
                musicas[i] = null;
                return true;
            }
        }
        return false;
    }
}
