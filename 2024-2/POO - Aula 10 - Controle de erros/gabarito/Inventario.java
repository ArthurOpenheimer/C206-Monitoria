import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private List<Livro> livros;

    public Inventario() {
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) throws ExcecaoLivroInvalido {
        if (livro.getTitulo().isEmpty()) {
            throw new ExcecaoLivroInvalido("O título do livro não pode estar vazio.");
        }
        if (livro.getPreco() < 0) {
            throw new ExcecaoLivroInvalido("O preço do livro não pode ser negativo.");
        }
        livros.add(livro);
        System.out.println("Livro adicionado com sucesso: " + livro.getTitulo());
    }

    public void exibirLivros() {
        if (livros.isEmpty()) {
            System.out.println("Nenhum livro no inventário.");
        } else {
            for (Livro livro : livros) {
                System.out.println("Título: " + livro.getTitulo() + ", Autor: " + livro.getAutor() + ", Preço: " + livro.getPreco());
            }
        }
    }
}