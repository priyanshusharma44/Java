class DetailInfo{
    private int id;
    private String name;
    private int roll;

    public void setId(int n){
        id = n;
    }
    public int getId(){
        return id;
    }
    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }
}

public class GetterSetter {
    public static void main(String[] args) {
        DetailInfo o1 = new DetailInfo();
        o1.setId(123);
        int id = o1.getId();
        System.out.println(id);

        o1.setName("Sagun basnet");
        System.out.println(o1.getName());
    }
}
