package gabarito;

public class Main {
    public static void main(String[] args) {
        ThreadContadorUm t1 = new ThreadContadorUm();
        ThreadContadorDois t2 = new ThreadContadorDois();
        ThreadPotencia t3 = new ThreadPotencia();
        
        t1.start();
        t2.start();
        t3.start();
    }
}
