import java.util.Scanner;

public class Aluno {
    
    int matricula;
    int np1;
    int np2;
    int periodo;
    String nome;

    public int calculaMedia() {
        int media =(np1 + np2) / 2;

        if (media >= 60) {
            System.out.println("Aprovado com média final: " + media);
        } else if(media < 60 && media >= 30){
            calculaNP3(media);
        }
        return media;
    }

    public int calculaNP3(int media) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a nota da NP3: ");
        int np3 = scanner.nextInt();
        media = (media + np3) / 2;

        if (media >= 50) {
            System.out.println("Aprovado com média final: " + media);
        } else {
            System.out.println("Reprovado com média final " + media);
        }
        scanner.close();
        return media;
    }

    public String toString(){
        return "Aluno [" +
        "matricula=" + matricula +
        ", np1=" + np1 +
        ", np2=" + np2 +
        ", periodo=" + periodo +
        ", nome='" + nome + '\'' +
        ']';
    }
}
