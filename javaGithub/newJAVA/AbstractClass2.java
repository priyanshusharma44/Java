/*Create an abstract class 'bank' with an abstract method 'getBalance'. $100, $150 & $200 are deposited in banks A,B and C res. 'BankA', 'BankB' and 'BankC' are subclasses of 'Bank', each having a method named 'getBalance'. call this method by creating an object of each of the three classes*/

public class AbstractClass2 {
    public static void main(String[] args) {
        Bank b1 = new BankA();
        b1.getBalance();
        Bank b2 = new BankB();
        b2.getBalance();
        Bank b3 = new BankC();
        b3.getBalance();
    }
}
 abstract class Bank{
    abstract void getBalance();
 }
  
 class BankA extends Bank{
    void getBalance(){
        double bln = 100;
        System.out.println("Balance of bankA = "+ bln);
    }
 }
 class BankB extends Bank{
    void getBalance(){
        double bln = 150;
        System.out.println("Balance of bankB = "+ bln);
    }
 }
 class BankC extends Bank{
    void getBalance(){
        double bln = 200;
        System.out.println("Balance of bankC = "+ bln);
    }
 }
