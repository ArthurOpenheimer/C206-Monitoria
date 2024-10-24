public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();

        try {
            Livro livro1 = new Livro("Java Programming", "John Doe", 49.99);
            inventario.adicionarLivro(livro1);

            Livro livro2 = new Livro("", "Jane Doe", 19.99);
            inventario.adicionarLivro(livro2);

        } catch (ExcecaoLivroInvalido e) {
            System.out.println("Erro: " + e.getMessage());
        }

        try {
            Livro livro3 = new Livro("C Programming", "Bob Doe", 39.99);
            inventario.adicionarLivro(livro3);

            Livro livro4 = new Livro("Python Programming", "Alice Doe", -29.99);
            inventario.adicionarLivro(livro4);

        } catch (ExcecaoLivroInvalido e) {
            System.out.println("Erro: " + e.getMessage());
        }

        inventario.exibirLivros();
    }
}
