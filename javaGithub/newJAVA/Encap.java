public class Encap {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println("Id = "+ s1.getId());
        System.out.println("Name = "+ s1.getName());
        s1.setAddress("itahari");
        System.out.println("Address = "+s1.getAddress());


    }
}

class Student{
    private int id=2;//only get
    private String name="sohan";//only get
    private String address;//only set

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public void setAddress(String address){
        this.address = address;
    } 
    public String getAddress(){
        return address;
    }
    // Student(){
    //     System.out.println(this.address);
    // }
}