import java.util.concurrent.Semaphore;

public class Car implements Runnable{
    Semaphore s;
    String name;

    public Car(Semaphore s, String n) {
        this.s = s;
        this.name = n;
    }

    @Override
    public void run() {
        System.out.println("Поиск свободного места для "+ name);
        try {
            System.out.println("Автомобиль " + name + " ожидает место");
            s.acquire();
            System.out.println("Автомобиль " + name + " паркуется");
            Thread.sleep(3000);
        }
        catch (InterruptedException e){
            System.out.println(e);
        }
        System.out.println("Автомобиль " + name + " освобождает место");
        s.release();
    }
}
