public class Main {
    public static void main(String[] args) {

        Thread tTempo = new ThreadTempo();
        Thread tMusica = new ThreadMusica();

        tTempo.start();
        tMusica.start();

    }
}