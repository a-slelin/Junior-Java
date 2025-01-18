package Volatile;

public class Main {
    private volatile boolean stop = false; // volatile - ключевое слово
    private int counter = 0;

    public void run() {
        while (!stop) { // Проверяет значение stop из основной памяти
            counter++;
        }
    }

    public void stop() {
        stop = true; // Изменяет значение stop в основной памяти
    }

    public static void main(String[] args) throws InterruptedException {
        Main example = new Main();
        Thread thread = new Thread(example::run);
        thread.start();

        Thread.sleep(1000); // Даем потоку немного поработать
        example.stop();
        thread.join(); // Ждем завершения потока

        System.out.println("Counter: " + example.counter);
    }
}
