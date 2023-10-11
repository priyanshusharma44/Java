import java.io.*;
public class CheckedExceptionExample {
    public static void main(String[] args) throws IOException {
        FileInputStream file_data = null;
        file_data = new FileInputStream("D:/3rdSem/hello.txt");
        int m;
        while((m = file_data.read()) != 1){
            System.out.println((char)m);
        }
        file_data.close();
    }
}
