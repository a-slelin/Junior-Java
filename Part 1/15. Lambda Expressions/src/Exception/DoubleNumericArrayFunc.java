package Exception;

@FunctionalInterface
public interface DoubleNumericArrayFunc {
    double func(double[] n) throws EmptyArrayException;
}
