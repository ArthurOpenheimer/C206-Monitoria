public class Saga {
    int nota;
    Livro[] livros = new Livro[10];

    public void listarLivros() {
        for (Livro livro : livros) {
            if(livro != null) {
                livro.mostraInfo();
            }
        }
    }

    public void adicionarLivro(Livro livro) {
        for (int i = 0; i < livros.length; i++) {
            if (livros[i] == null) {
                livros[i] = livro;
                break;
            }
        }
    }
}
