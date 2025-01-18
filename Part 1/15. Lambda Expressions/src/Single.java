public class Single {
    public static void main(String[] args){
        MyInterface mi;

        //Можно так
        mi = () -> 123.4;
       System.out.println(mi.getValue());

       //Можно вот так
        mi = () -> Math.random() * 100;
        System.out.println(mi.getValue());

        //Error
        //mi = () -> "123.4";
        //mi = (n) -> 123.4;

        NumericTest isEven = (int n) -> (n % 2) == 0;
        int tmp = 4;
        System.out.println(isEven.test(tmp));

        NumericTest isNonNeg = (n) -> n >= 0;
        System.out.println(isNonNeg.test(tmp));

        NumericTest isSmall = (n) -> Math.abs(n) <= 10;
        System.out.println(isSmall.test(tmp));



        NumericTest2 isFactor = (n, d) -> (n % d) == 0;
        System.out.println(isFactor.test(10, 2));
    }
}