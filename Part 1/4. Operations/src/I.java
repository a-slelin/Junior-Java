public class I {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean c = a | b;
        boolean d = a & b;
        boolean e = a ^ b;
        boolean f = (!a & b) | (a & !b);
        boolean g = !a;

        System.out.println("\ta = " + a);
        System.out.println("\tb = " + b);
        System.out.println("\ta | b = " + c);
        System.out.println("\ta & b = " + d);
        System.out.println("\ta ^ b = " + e);
        System.out.println("\t(!a & b) | (a & !b) = " + f);
        System.out.println("\t!a = " + g);
    }
}
