package exception.compile_time;

// It occurs when an input output operation fails

import java.io.*;
/*
public class IO {
    public static void main(String[] args) throws IOException {
        FileReader f = new FileReader("file.txt");
        System.out.println(f.read());
    }
    }
*/
class IO
{
    public static void main(String[] args) {
        try
        {
            FileReader f = new FileReader("file.txt");
            System.out.println(f.read());
        }
        catch (IOException fp){
            System.out.println("Not existing file");
        }
    }
}


