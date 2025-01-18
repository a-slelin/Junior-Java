package simplefuncs;

import static java.lang.Math.*;
import static mysupport.Support.isFactor;

public class SimpleFuncs {
    public static int lcf(int a, int b){
        a = abs(a);
        b = abs(b);
        int min = min(a, b);

        for(int i = 2;i <= min/2; ++i){
            if(isFactor(i, a) && isFactor(i, b)){
                return i;
            }
        }

        return 1;
    }

    public static int gcf(int a, int b){
        a = abs(a);
        b = abs(b);
        int min = min(a, b);

        for(int i = min/2;i >= 2; --i){
            if(isFactor(i, a) && isFactor(i, b)){
                return i;
            }
        }

        return 1;
    }
}
