package Transient;

import java.io.*;

public class Main implements Serializable {
    private String name;
    private transient String password; // Это поле не будет сериализовано

    public Main(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Main obj = new Main("John Doe", "secretPassword");
        String path = "src/FirstBook/Chapter13/Transient/transient_example.ser";

        // Сериализация
        FileOutputStream fos = new FileOutputStream(path);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(obj);
        oos.close();
        fos.close();

        // Десериализация
        FileInputStream fis = new FileInputStream(path);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Main deserializedObj = (Main) ois.readObject();
        ois.close();
        fis.close();

        System.out.println("Name: " + deserializedObj.name);
        System.out.println("Password: " + deserializedObj.password); // password будет null
    }
}
