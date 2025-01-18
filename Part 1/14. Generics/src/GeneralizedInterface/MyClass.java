package GeneralizedInterface;

public class MyClass<T extends Comparable<T>> implements MinMax<T>{
    private T[] values;

    public MyClass(T[] values){
        this.values = values.clone();
    }

    @Override
    public T Min() {
        T min = values[0];
        for(T value : values){
            if(value.compareTo(min) < 0){
                min = value;
            }
        }
        return min;
    }

    @Override
    public T Max() {
        T max = values[0];
        for(T value : values){
            if(value.compareTo(max) > 0){
                max = value;
            }
        }
        return max;
    }
}
