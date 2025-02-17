import java.util.concurrent.TimeUnit;
public class ThreadTempo extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {

            System.out.println(i);
            
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}


