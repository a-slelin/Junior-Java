package InputOutput.Object;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person person = new Person("Alice", 30);

        // Запись объекта в файл
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.ser"))) {
            oos.writeObject(person);
        }

        // Чтение объекта из файла
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.ser"))) {
            Person readPerson = (Person) ois.readObject();
            System.out.println("Name: " + readPerson.name);
            System.out.println("Age: " + readPerson.age);
        }
    }
}

