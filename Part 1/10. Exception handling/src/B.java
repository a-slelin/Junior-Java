public class B {
    public static void main(String[] args) {
        try{
            int a = args.length;
            System.out.println("a = " + a);
            int b = 42 / a;
            int[] c = {1};
            c[42] = 4;
        } catch (ArithmeticException e){
            System.out.println("Деление на ноль." + e);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Выход за рамки массива:" + e);
        }
    }
}
