package Hierarchy;

public class A<T> {
    private T ob;

    A(T ob){
        this.ob = ob;
    }

    T getOb(){
        return ob;
    }
}
