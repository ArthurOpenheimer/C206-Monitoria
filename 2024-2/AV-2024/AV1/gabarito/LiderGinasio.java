public class LiderGinasio extends Treinador {
    private String cidadeGinasio;
    private String tipoGinasio;

    public void mostraInfo(){
        super.mostraInfo();
        System.out.println("Cidade do ginásio: " + this.cidadeGinasio);
        System.out.println("Tipo do ginásio: " + this.tipoGinasio);
    }

    public void setCidadeGinasio(String cidadeGinasio){
        this.cidadeGinasio = cidadeGinasio;
    }

    public void setTipoGinasio(String tipoGinasio){
        this.tipoGinasio = tipoGinasio;
    }
}
