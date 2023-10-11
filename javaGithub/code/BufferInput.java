//Program to get input from user using buffer reader
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class BufferInput {
    public static void main(String[] args) {
        BufferedReader myObj = new BufferedReader(new InputStreamReader(System.in));
        String name, address;
        int age;
        float marks;
        try{
            System.out.println("Enter name: ");
            name = myObj.readLine();
            System.out.println("Enter address: ");
            address = myObj.readLine();
            System.out.println("Enter age:");
            age = Integer.parseInt(myObj.readLine());
            System.out.println("Enter marks:");
            marks = Float.parseFloat(myObj.readLine());
            System.out.printf("Name = %s, Address = %s, Age = %d, Marks = %f",name,address,age,marks);
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
