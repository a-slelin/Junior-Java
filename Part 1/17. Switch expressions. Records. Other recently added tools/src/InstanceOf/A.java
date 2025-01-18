package InstanceOf;

public class A {
    public static void main(String[] args) {
        Number n = Integer.valueOf(9);

        /* before:
        if ( n instanceof Integer) {
            Integer tmp = (Integer) n;
            System.out.println("n ссылается на целое число " + tmp);
        }
        */

        if((n instanceof Integer tmp) && (tmp > 0)) {
            System.out.println("n ссылается на целое неотрицательное число " + tmp);
        }

        Object[] array = {
                new String("Alfa"),
                new String("Beta"),
                new String("Omega"),
                Integer.parseInt("45")
        };

        for(int i = 0; (array[i] instanceof String str) && (i < array.length); ++i) {
            System.out.println("Handle " + str);
        }
    }
}
