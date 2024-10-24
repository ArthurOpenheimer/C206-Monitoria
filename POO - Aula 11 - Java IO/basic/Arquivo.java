package basic;
import java.io.*;	

public class Arquivo {
    public void escrever(){
        // Criando os objetos de escrita
        FileOutputStream fluxoSaida = null;
        OutputStreamWriter geradorFluxoSaida = null;
        BufferedWriter bufferSaida = null;
        try {
            //Inicializando os objetos
            fluxoSaida = new FileOutputStream("scratch.txt");
            geradorFluxoSaida = new OutputStreamWriter(fluxoSaida);
            bufferSaida = new BufferedWriter(geradorFluxoSaida);
            // Escrita no arquivo
            bufferSaida.write("POO!");
            bufferSaida.newLine();
            bufferSaida.write("POO!");
            bufferSaida.newLine();
               
        }catch (Exception e){
            System.err.printf(String.valueOf(e));
        } finally {
            try {
                // Fechando o buffer
                assert bufferSaida != null;
                bufferSaida.close();
                System.out.println("Sistema Encerrado");
            } catch (IOException e) {
                System.err.printf(String.valueOf(e));
            }
        }
    }

    public void ler(){
        // Criando os objetos de leitura
        FileInputStream fluxoEntrada = null;
        InputStreamReader geradorFluxoEntrada = null;
        BufferedReader bufferEntrada = null;

        try {
            // Inicializando os objetos
            fluxoEntrada = new FileInputStream("scratch.txt");
            geradorFluxoEntrada = new InputStreamReader(fluxoEntrada);
            bufferEntrada = new BufferedReader(geradorFluxoEntrada);
            // Leitura do arquivo
            String leitura  = bufferEntrada.readLine();
            while (leitura != null){
                System.out.println(leitura);
                leitura = bufferEntrada.readLine();
            }

        }catch (Exception e){
            System.err.printf(String.valueOf(e));
        } finally {
            // Fechando o buffer
            try {
                assert bufferEntrada != null;
                bufferEntrada.close();
                System.out.println("Sistema Encerrado");
            } catch (IOException e) {
                System.err.printf(String.valueOf(e));
            }
        }

    }

}

