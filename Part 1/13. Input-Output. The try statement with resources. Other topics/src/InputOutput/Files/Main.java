package InputOutput.Files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        File input = new File("src/FirstBook/Chapter13/InputOutput/Files/input.txt");
        File output = new File("src/FirstBook/Chapter13/InputOutput/Files/output.txt");

        FileInputStream in = new FileInputStream(input);
        FileOutputStream out = new FileOutputStream(output);

        int tmp;
        ArrayList<Integer> input_data = new ArrayList<>();
        do{
            tmp = in.read();
            if(tmp != -1) input_data.add(tmp);
        } while(tmp != -1);
        in.close();

        for(int i : input_data){
            out.write(i);
        }
        out.close();
    }
}
