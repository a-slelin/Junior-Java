package ThisForOverridedConstructor;

public class MyClass2 {
    private int i;
    private int j;

    MyClass2(int i, int j){
        this.i = i;
        this.j = j;
    }

    MyClass2(int i){
        this(i, i);
    }

    MyClass2(){
        this(0);
    }
}
