public class SomeClass<T> {
    private T ob;

    public SomeClass(T ob){
        this.ob = ob;
    }

    public T getOb() {
        return ob;
    }

    public void showType(){
        System.out.println(ob.getClass().getName());
    }
}
