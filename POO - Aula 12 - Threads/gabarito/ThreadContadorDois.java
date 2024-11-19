package gabarito;
import java.util.concurrent.TimeUnit;

public class ThreadContadorDois extends Thread{
    
    @Override
    public void run() {
        for (int i = 2; i < 7; i++) {

            System.out.println("Contador 2: " + i);
            
            try {
                TimeUnit.SECONDS.sleep(4);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
