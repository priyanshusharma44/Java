import java.security.Identity;

public class EncaptulationGetterSetter {
    public static void main(String[] args) {
        GetterSetter obj = new GetterSetter();
        obj.setId(101);
        System.out.println("The id is: "+obj.getId());
        obj.setName("rohan");
        System.out.println("The Name is: "+obj.getName());
    }
}

class GetterSetter{
    
    private int id;
    private String name;

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return this.id;
    }
    
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

}