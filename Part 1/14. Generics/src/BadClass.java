public class BadClass {
    private Object ob;

    public BadClass(Object ob){
        this.ob = ob;
    }

    public Object getOb() {
        return ob;
    }

    public void showType(){
        System.out.println(ob.getClass().getName());
    }
}