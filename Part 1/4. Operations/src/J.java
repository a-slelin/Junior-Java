public class J {
    public static void main(String[] args) {
        int i, k;

        i = 10;
        k = i < 0 ? -i : i;
        System.out.println("Абсолютная величина " + i + " равна " + k);

        i = -10;
        k = i < 0 ? -i : i;
        System.out.println("Абсолютная величина " + i + " равна " + k);
    }
}
