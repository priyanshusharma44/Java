import javax.sound.sampled.SourceDataLine;

public class ConstructorWork {
    public static void main(String[] args) {
        Book c = new Book(1,"Intalligent invester",100.2,250);
        Book d = new Book(2,"Investor dad",680,290);

        Book [] books = {c,d};
        // c.printInfo();
        for(Book b: books){
            b.printInfo();
            
        }
    }
}
class Book{
    int id=3,noOfPage=23;
    String  name="Rich thinking";
    double price=125.6;

    //Making constructor...
    Book(int id,String name, double price,int noOfPage){
        System.out.println("Constructor called.");
        System.out.println("ID = "+id);
        System.out.println("Name = "+name);
        System.out.println("No of pages = "+noOfPage);
        System.out.println("Price = "+price);
    }
    void printInfo(){
        System.out.println("\n\n");
        System.out.println("ID = "+id);
        System.out.println("Name = "+name);
        System.out.println("No of pages = "+noOfPage);
        System.out.println("Price = "+price);
    }
}