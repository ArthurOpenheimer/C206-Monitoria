package gabarito;
import java.util.concurrent.TimeUnit;

public class ThreadContadorUm extends Thread{
    
    @Override
    public void run() {
        for (int i = 1; i < 11; i++) {

            System.out.println("Contador 1: " + i);
            
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

