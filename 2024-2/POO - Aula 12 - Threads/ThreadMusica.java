import java.util.concurrent.TimeUnit;
public class ThreadMusica extends Thread{

    @Override
    public void run() {

        for (int i = 0; i < 3; i++) {

            System.out.println("Tocando música ");

            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

