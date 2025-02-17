public class Main {
    public static void main(String[] args) {

        //criando os objetos
        Livro livro1 = new Livro();
        livro1.titulo = "O Ladrão de Raios";
        livro1.paginas = 400;

        Livro livro2 = new Livro();
        livro2.titulo = "O Mar de Monstros";
        livro2.paginas = 350;

        Saga saga = new Saga();
        saga.nota = 10;

        Autor autor = new Autor();
        autor.nome = "Rick Riordan";

        //adicionando os livros na saga
        saga.adicionarLivro(livro1);
        saga.adicionarLivro(livro2);
        
        //adicionando a saga no autor
        autor.adicionarSaga(saga);

        //listando as sagas do autor
        autor.listarSagas();        
    }
}
