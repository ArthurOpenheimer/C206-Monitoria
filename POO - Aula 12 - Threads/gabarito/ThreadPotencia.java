package gabarito;
import java.util.concurrent.TimeUnit;

public class ThreadPotencia extends Thread{
        
    @Override
    public void run(){
        for (int i = 1; i < 6; i++) {
            System.out.println(i + " ao quadrado: " + i*i);
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
