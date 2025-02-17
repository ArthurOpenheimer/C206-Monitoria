public class Jogador {
   int energia;
   int vida;
   Arma arma;
   
   Jogador(){

   }

   Jogador(Arma arma, int energia, int vida){
      this.arma = arma;
      this.energia = energia;
      this.vida = vida;
   }

   public void atacar(Jogador alvo){
      if(energia >= arma.custoDeEnergia){
         alvo.vida -= arma.dano;
         energia -= arma.custoDeEnergia;
      }
      else{
         System.out.println("Sem energia para atacar");
      }
   }

   public String toString(){
    return "Jogador [Vida=" + vida + 
    ", Energia=" + energia + 
    ", Arma=" + "Dano=" + arma.dano + 
    ", Custo de Energia=" + arma.custoDeEnergia + 
    "]";
   }
}
