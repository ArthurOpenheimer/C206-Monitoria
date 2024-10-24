package objects;

public class Livro {
    private String titulo;
    private String autor;
    private int paginas;
    private int id;

    public Livro(String titulo, String autor, int paginas, int id) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public int getId() {
        return id;
    }
}
