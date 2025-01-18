package NonStaticInnerClass;

public class Main {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner(1, 2, 3, 4);
        //System.out.println(inner.privateValue);
    }
}
