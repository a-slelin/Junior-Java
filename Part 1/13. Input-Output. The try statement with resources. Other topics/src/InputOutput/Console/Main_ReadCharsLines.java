package InputOutput.Console;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

public class Main_ReadCharsLines {
    public static void main(String[] args) throws IOException {
        InputStream in = System.in;
        Charset charset = System.console().charset();

        InputStreamReader in_char = new InputStreamReader(in, charset);

        BufferedReader buff_in = new BufferedReader(in_char);

        String str = buff_in.readLine();
        String str2 = buff_in.readLine();

        System.out.println(str);
        System.out.println(str2);
    }

}
