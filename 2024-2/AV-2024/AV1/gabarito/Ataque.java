public class Ataque {
    private String nome;
    private String tipo;

    public void mostraInfo() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Tipo: " + this.tipo);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
