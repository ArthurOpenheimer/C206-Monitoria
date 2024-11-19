public class Treinador {
    private String nome;
    private int numPokebola;
    private int numInsignia;
    private int dinheiro;
    private Pokemon[] time;

    public void comprarPokebola(int quantidade){
        int precoFinal = quantidade * 100;
        if (this.dinheiro >= precoFinal){
            this.dinheiro -= precoFinal;
            this.numPokebola += quantidade;
            System.out.println("Treinador " + this.nome + " agora tem " + this.dinheiro + " dinheiro e " + this.numPokebola + " pokebolas");
        } else {
            System.out.println("Treinador " + this.nome + " não tem dinheiro suficiente");
        }
    }

    public void lutar(Treinador oponente, int posTimeTreinador, int posTimeOponente){
        Pokemon pokemonTreinador = this.time[posTimeTreinador];
        Pokemon pokemonOponente = oponente.time[posTimeOponente];
        if (pokemonOponente == null){
            System.out.println("pokemon oponente nulo");
            return;
        }
        pokemonTreinador.atacar();
        pokemonOponente.atacar();
        if(oponente instanceof LiderGinasio){
            this.numInsignia++;
        }
    }

    public void capturarPokemon(Pokemon pokemon){
        for(int i = 0; i < this.time.length; i++){
            if(this.time[i] == null){
                this.time[i] = pokemon;
                break;
            }
        }
    }

    public void mostraInfo(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Número de pokebolas: " + this.numPokebola);
        System.out.println("Número de insígnias: " + this.numInsignia);
        System.out.println("Dinheiro: " + this.dinheiro);
        System.out.println("Time: ");
        for (Pokemon pokemon : this.time) {
            if(pokemon != null){
                pokemon.mostraInfo();
            }
        }
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setNumPokebola(int numPokebola){
        this.numPokebola = numPokebola;
    }

    public void setNumInsignia(int numInsignia){
        this.numInsignia = numInsignia;
    }

    public void setDinheiro(int dinheiro){
        this.dinheiro = dinheiro;
    }

    public void setTime(Pokemon[] time) {
        this.time = time;
    }
    
    public Pokemon[] getTime(){
        return this.time;
    }
}
