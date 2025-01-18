package GeneralizedConstructor;

public class MyClass {
    private double value;

    public <T extends Number> MyClass(T value){
        this.value = value.doubleValue();
    }
}
