package GeneralizedMethod;

public class Method {
    public static <T extends Comparable<T>, V extends T> boolean myMeth(T x, V[] y) {
        for(V elem : y){
            if (elem.compareTo(x) == 0){
                return true;
            }
        }
        return false;
    }

}
