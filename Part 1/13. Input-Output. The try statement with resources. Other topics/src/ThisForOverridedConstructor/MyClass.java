package ThisForOverridedConstructor;

public class MyClass {
    private int i;
    private int j;

    MyClass(int i, int j){
        this.i = i;
        this.j = j;
    }

    MyClass(int i){
        this.i = this.j = i;
    }

    MyClass(){
       this.i = this.j = 0;
    }
}
