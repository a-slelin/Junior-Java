package StaticImport;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import static java.lang.System.out;

public class Main {
    public static void main(String[] args){
        double catheter1, catheter2, hypotenuse;
        catheter1 = 3.0;
        catheter2 = 4.0;
        hypotenuse = sqrt(pow(catheter1, 2) + pow(catheter2, 2));
        out.println(hypotenuse);
    }
}
