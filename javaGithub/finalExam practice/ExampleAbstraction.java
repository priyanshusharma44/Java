abstract class Vechel{
     abstract void bike();      
}

class ExampleAbstraction extends Vechel{
    void bike(){
        System.out.println("Honda is running");
    }
    public static void main(String[] args) {
        Vechel obj = new ExampleAbstraction();
        // Vechel obj = new Vechel();
        obj.bike();
    }
}