package ValueBasedClasses;

public class Main {
    public static void main(String[] args){
        ImmutablePoint p = new ImmutablePoint(6, 7);
        ImmutablePoint p2 = new ImmutablePoint(6, 7);
        System.out.println(p == p2);
        System.out.print(p.equals(p2));
    }
}
