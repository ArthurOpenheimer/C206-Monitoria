public class Main {
    public static void main(String[] args) {
        
        Banda banda = new Banda("Imagine Dragons", 4);

        Musica musica1 = new Musica();
        musica1.setNome("Believer");
        musica1.setAlbum("Evolve");

        Musica musica2 = new Musica();
        musica2.setNome("Radioactive");
        musica2.setAlbum("Night Visions");

        Musica musica3 = new Musica();
        musica3.setNome("Demons");
        musica3.setAlbum("Night Visions");

        Musica musica4 = new Musica();
        musica4.setNome("Whatever It Takes");
        musica4.setAlbum("Evolve");

        Musica musica5 = new Musica();
        musica5.setNome("Thunder");
        musica5.setAlbum("Evolve");

        banda.adicionarMusica(musica1);
        banda.adicionarMusica(musica2);
        banda.adicionarMusica(musica3);
        banda.adicionarMusica(musica4);
        banda.adicionarMusica(musica5);

        banda.tocarMusica(1);
        banda.deletarMusica("Radioactive");
        banda.tocarShow();

        

    }
}
