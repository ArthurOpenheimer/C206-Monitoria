package objects;

public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro("O Senhor dos Aneis", "J. R. R. Tolkien", 1000, 1);
        Livro livro2 = new Livro("Harry Potter", "J. K. Rowling", 500, 2);
        Livro livro3 = new Livro("Game of Thrones", "George R. R. Martin", 800, 3);
        Livro livro4 = new Livro("Percy Jackson", "Rick Riordan", 300, 4);

        Arquivo arquivo = new Arquivo();
        arquivo.escreverLivro(livro1);
        arquivo.escreverLivro(livro2);
        arquivo.escreverLivro(livro3);
        arquivo.escreverLivro(livro4);

        System.out.println("Lendo livro 3:");
        arquivo.lerLivro("3");

        System.out.println("Lendo todos os livros:");
        arquivo.lerLivros();
    }
}
