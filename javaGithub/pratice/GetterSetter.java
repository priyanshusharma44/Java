public class GetterSetter {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        
        s1.setId(1);
        s1.setName("Sagun");
        s2.setId(2);
        s2.setName("Sohan");
        s3.setId(3);
        s3.setName("Soniya");

        System.out.println(s1.getId());
        System.out.println(s1.getName());
        System.out.println(s2.getId());
        System.out.println(s2.getName());
        System.out.println(s3.getId());
        System.out.println(s3.getName());
    }
}

class Student{
    private int id;
    private String name;

    public int getId(){
        return id;
    }

    public int setId(int id){
        this.id = id;
        return id;
    }

    public String getName(){
        return name;
    }

    public String setName(String name){
        this.name = name;
        return name;
    }

}
