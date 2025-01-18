package ManyGenerics;

public class MyClass<T, V, E> {
    private T value;
    private V[] array;
    private E field;

    MyClass(T value, V[] array, E field){
        this.value = value;
        this.array = array.clone();
        this.field = field;
    }
}
