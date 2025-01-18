package TryWithResources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MainRead {
    public static void main(String[] args) throws FileNotFoundException {
        try(FileInputStream in = new FileInputStream("src/FirstBook/Chapter13/TryWithResources/input.txt")){
            int tmp;
            do{
                tmp = in.read();
                if (tmp != -1){
                    System.out.print((char)tmp);
                }
            } while(tmp != -1);
        }
        catch(FileNotFoundException e){
            System.out.println("File was not found.");
        }
        catch(IOException e) {
            System.out.println("Error of input-output.");
        }
    }
}
