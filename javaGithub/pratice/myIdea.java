import java.util.Scanner;
public class myIdea {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        Data d1 = new Data();
        System.out.print("Enter name of Employee: ");
        String empName = obj.nextLine();
        System.out.print("Enter phon no of Employee: ");
        long empNum = obj.nextLong();
        obj.nextLine();
        System.out.print("Enter Address of Employee: ");
        String empAddress = obj.nextLine();
        d1.setEmpNum(empNum);
        d1.setEmpName(empName);
        d1.setEmpAddress(empAddress);

        int pass = 1234;

        System.out.println("To display detail\nEnter a pssword: ");
        int passCh = obj.nextInt();
        if(pass == passCh){
            System.out.println("Name = "+d1.getEmpName());
            System.out.println("pPhon no = "+d1.getEmpNum());
            System.out.println("Address = "+d1.getEmpAddress());
        }
        else
            System.out.println("Password incorrect......");

    }
}

class Data{
    private long empNum;
    private String empName,empAddress;
     
    public void setEmpNum(long empNum){
        this.empNum = empNum;
    }
    public void setEmpName(String empName){
        this.empName = empName;
    }
    public void setEmpAddress(String empAddress){
        this.empAddress = empAddress;
    }

    public long getEmpNum(){
        return  empNum;
    }
    public String getEmpName(){
        return  empName;
    }
    public String getEmpAddress(){
        return  empAddress;
    }
}
