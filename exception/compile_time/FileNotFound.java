package exception.compile_time;

//File not found : This Exception occurs when trying to access a file that does not exist or the specified path is incorrect

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileNotFound
{
    /*
    public static void main(String[] args) throws FileNotFoundException {
       File f = new File("java.txt");
       FileReader fi = new FileReader(f);
    }
}
*/

    public static void main(String[] args) {
        try {
            File f = new File("java.txt");
            FileReader fi = new FileReader(f);
        } catch (FileNotFoundException fil) {
            System.out.println("File is not existing in user providede path or path is incorrect");
        }
    }
}
