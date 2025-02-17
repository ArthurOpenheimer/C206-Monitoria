public class Pokemon {
    private static int numTotalPokemon = 0;
    private int idPokemon;
    private String nome;
    private String[] tipos;
    Ataque ataque;

    public Pokemon(String nome, String[] tipos) {
        numTotalPokemon++;
        this.idPokemon = numTotalPokemon;
        this.nome = nome;
        this.tipos = tipos;
        this.ataque = new Ataque();
    }

    public void atacar() {
        System.out.println("Pokemon " + this.nome + " está atacando");
        this.ataque.mostraInfo();
    }

    public void mostraInfo() {
        System.out.println("ID: " + this.idPokemon);
        System.out.println("Nome: " + this.nome);
        System.out.println("Tipos: ");
        for (String tipo : this.tipos) {
            System.out.println(tipo);
        }
        System.out.println("Ataque: ");
        this.ataque.mostraInfo();
    }
}
