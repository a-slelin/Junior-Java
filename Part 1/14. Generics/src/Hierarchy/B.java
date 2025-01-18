package Hierarchy;

import java.io.Serializable;

public class B<T, V extends Cloneable & Serializable> extends A<T>{
    private V value;

    B(T ob, V value){
        super(ob);
        this.value = value;
    }

    V getValue(){
        return value;
    }
}
