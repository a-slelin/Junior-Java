package InputOutput.Console;

import java.io.PrintWriter;

public class Main_WriteChars {
    public static void main(String[] args) {
        PrintWriter out = new PrintWriter(System.out, true);
        out.print('f');
        out.print('o');
        out.print('o');
        out.print(' ');
        out.print('b');
        out.print('a');
        out.print('r');
        out.println();

        out.println("ldjf s f");


        PrintWriter out2 = new PrintWriter(System.out, false);
        out2.print(100);
        out2.flush();
        out2.print("dkf kd 1002");
        out2.println('$');
        out2.flush();
        out2.print("end.");
        out2.close();
        out2.print(100);
    }
}
