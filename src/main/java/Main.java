import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) throws InterruptedException{

        Semaphore s = new Semaphore(2,true);

        new Thread(new Car(s,"Kia")).start();
        Thread.sleep(400);
        new Thread(new Car(s,"Ford")).start();
        Thread.sleep(400);
        new Thread(new Car(s,"Audi")).start();
        Thread.sleep(400);
        new Thread(new Car(s,"BMW")).start();
        Thread.sleep(400);
        new Thread(new Car(s,"Mercedes")).start();
        Thread.sleep(400);


    }
}
