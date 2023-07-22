public class Human{
    
    public Human(){
        System.out.println("RAM");
    }
        public Human(int i){
        System.out.println("sum is "+i);
    }
    
    
    public static void main(String[]args){
        Human h=new Human();
        Human hh=new Human(10);
        
    }
    
    
    
}