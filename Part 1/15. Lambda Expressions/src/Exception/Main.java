package Exception;

public class Main {
    public static void main(String[] args){
        double[] values = {};

        DoubleNumericArrayFunc FunInt = (array) -> {
            double sum = 0;

            if(array.length == 0){
                throw new EmptyArrayException();
            }

            for(double elem : array){
                sum += elem;
            }

            return sum / array.length;
        };

        System.out.println(FunInt.func(values));
    }
}
