package InputOutput.Console;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class Main_Bytes {
    public static void main(String[] args) throws IOException {
        InputStream in = System.in;

        int tmp = 0;
        ArrayList<Integer> bytes = new ArrayList<>();
        do{
            tmp = in.read();
            bytes.add(tmp);
        } while(tmp != '\n');
        in.close();


        for(int b: bytes){
            System.out.print((char)b);
        }
    }
}
