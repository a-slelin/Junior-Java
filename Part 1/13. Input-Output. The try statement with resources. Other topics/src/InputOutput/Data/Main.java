package InputOutput.Data;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Запись
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("file.dat"));
        dos.writeInt(1000);
        dos.writeBoolean(true);
        dos.writeDouble(2000.23);
        dos.close();

        // Чтение
        DataInputStream dis = new DataInputStream(new FileInputStream("file.dat"));
        int first = dis.readInt();
        boolean second = dis.readBoolean();
        double third = dis.readDouble();
        dis.close();

        System.out.println("First: " + first);
        System.out.println("Second: " + second);
        System.out.println("Third: " + third);
    }
}
