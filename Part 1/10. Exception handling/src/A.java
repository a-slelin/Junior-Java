public class A {
    public static void main(String[] args) {
        int d, a;
        int[] c = {1};

        try{
            d = 0;
            a = 42 / d;
            c[a] = 3;
            System.out.println("Это не выведется.");
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
        System.out.println("После блока try-catch.");
    }
}
