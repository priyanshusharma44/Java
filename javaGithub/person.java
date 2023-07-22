class Person{
    int id;
    String name;
    
    Person( int id, String name){
        
        this.id=id;
        this.name=name;
    }
}

class Emp extends Person{
    float salary;
    
    Emp(int id, String name, float salary){
        super(id,name); //should not be at second below this.salary..........
        this.salary=salary;
    }
    
    void display(){
        System.out.println(id +""+name +""+salary);
    }
}
class TestSuper5{
    
    public static void main(String[] args){
        Emp e1= new Emp(1,"saaman",40000f);
        e1.display();
        
    }
}