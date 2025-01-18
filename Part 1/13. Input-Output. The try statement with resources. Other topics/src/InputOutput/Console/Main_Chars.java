package InputOutput.Console;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;

public class Main_Chars {
    public static void main(String[] args) throws IOException {
        InputStream in = System.in;
        Charset charset = System.console().charset();

        InputStreamReader char_in = new InputStreamReader(in, charset);

        BufferedReader br = new BufferedReader(char_in);

        int tmp, i = -1;
        ArrayList<Character> array = new ArrayList();
        do{
            ++i;
            tmp = br.read();
            array.add((char)tmp);
        }while(tmp != '\n');

        for(char a: array){
            System.out.print(a);
        }
    }
}
