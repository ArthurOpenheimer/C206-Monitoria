public class Main {
    
    public static void main(String[] args) {
        //criando um treinador
        Treinador ash = new Treinador();
        Pokemon[] timeAsh = new Pokemon[6];
        ash.setTime(timeAsh);
        ash.setNome("Ash Ketchum");
        ash.setNumPokebola(10);
        ash.setNumInsignia(0);
        ash.setDinheiro(1000);
        
        //criando pokemons
        Pokemon pikachu = new Pokemon("Pikachu", new String[]{"Elétrico"});
        pikachu.ataque.setNome("Choque do Trovão");
        pikachu.ataque.setTipo("Elétrico");

        Pokemon charmander = new Pokemon("Charmander", new String[]{"Fogo"});
        charmander.ataque.setNome("Brasas");
        charmander.ataque.setTipo("Fogo");

        Pokemon squirtle = new Pokemon("Squirtle", new String[]{"Água"});
        squirtle.ataque.setNome("Jato de Água");
        squirtle.ataque.setTipo("Água");

        Pokemon bulbasaur = new Pokemon("Bulbasaur", new String[]{"Planta", "Veneno"});
        bulbasaur.ataque.setNome("Chicote de Vinha");
        bulbasaur.ataque.setTipo("Planta");

        //capturando pokemons
        ash.capturarPokemon(pikachu);
        ash.capturarPokemon(charmander);
        ash.capturarPokemon(squirtle);
        ash.capturarPokemon(bulbasaur);

        //mostrando informações
        System.out.println("Informações do treinador Ash Ketchum");
        ash.mostraInfo();

        //criando um líder de ginásio
        LiderGinasio brock = new LiderGinasio();
        Pokemon[] timeBrock = new Pokemon[6];
        brock.setTime(timeBrock);
        brock.setNome("Brock");
        brock.setNumPokebola(10);
        brock.setNumInsignia(0);
        brock.setDinheiro(1000);
        brock.setCidadeGinasio("Pewter");
        brock.setTipoGinasio("Pedra");

        //criando pokemons
        Pokemon onix = new Pokemon("Onix", new String[]{"Pedra", "Terra"});	
        onix.ataque.setNome("Caveira de Ferro");
        onix.ataque.setTipo("Pedra");

        Pokemon geodude = new Pokemon("Geodude", new String[]{"Pedra", "Terra"});
        geodude.ataque.setNome("Lança Rocha");
        geodude.ataque.setTipo("Pedra");

        //capturando pokemons
        brock.capturarPokemon(onix);
        brock.capturarPokemon(geodude);

        //mostrando informações
        System.out.println("Informações do líder de ginásio Brock");
        brock.mostraInfo();

        //luta
        ash.lutar(brock, 0, 0);

        //comprar pokebolas
        ash.comprarPokebola(5);

        //mostrando informações atualizadas
        System.out.println("Informações do treinador Ash Ketchum atualizadas");
        ash.mostraInfo();
    }
}
