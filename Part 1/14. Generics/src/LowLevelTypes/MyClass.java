package LowLevelTypes;

public class MyClass<T> {
    private T ob;

    MyClass(T ob){
        this.ob = ob;
    }

    T getOb(){
        return ob;
    }
}
