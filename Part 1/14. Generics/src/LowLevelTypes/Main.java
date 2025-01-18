package LowLevelTypes;

public class Main {
    public static void main(String[] args){
        var value1 = new MyClass<Integer>(9);
        int tmp2 = value1.getOb();
        MyClass<String> value2 = new MyClass<>("4kld;");

        //Low-level (Object class)
        MyClass value3 = new MyClass(7);
        int tmp = (int)value3.getOb();

    }
}
