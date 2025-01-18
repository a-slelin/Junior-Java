package InputOutput.Piped;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        PipedInputStream pis = new PipedInputStream();
        PipedOutputStream pos = new PipedOutputStream(pis); // Связываем потоки

        Thread producer = new Thread(() -> {
            try {
                pos.write("Hello".getBytes());
                pos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        Thread consumer = new Thread(() -> {
            try {
                byte[] buffer = new byte[1024];
                int bytesRead;
                while ((bytesRead = pis.read(buffer)) != -1) {
                    System.out.print(new String(buffer, 0, bytesRead));
                }
                pis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        producer.start();
        consumer.start();
        producer.join();
        consumer.join();

    }
}