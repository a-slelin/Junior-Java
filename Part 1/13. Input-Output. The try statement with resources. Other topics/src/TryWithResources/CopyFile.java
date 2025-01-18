package TryWithResources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args){
       try(FileInputStream in =
                   new FileInputStream("src/FirstBook/Chapter13/TryWithResources/input.txt");
               FileOutputStream out =
                       new FileOutputStream("src/FirstBook/Chapter13/TryWithResources/output.txt")){
           int tmp;
           do{
               tmp = in.read();
               if(tmp != -1){
                   out.write(tmp);
               }
           } while(tmp != -1);
        }
       catch(FileNotFoundException e){
           System.out.println("Files were not found.");
        }
       catch(IOException e){
           System.out.println("Error of input-output.");
        }
    }
}
