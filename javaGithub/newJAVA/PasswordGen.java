import java.util.Random;

public class PasswordGen {
    public static void main(String args[]){
        int length = 10;
        System.out.print("===>>  "+ getPassword(length));
    }
    static char[] getPassword(int len){
        System.out.print("This is your random password:  ");
        String capsLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String smalLetters = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "1234567890";
        String specialChars = "!@#$%^&*(){}[]:";

        String allPasswords = capsLetters+smalLetters+numbers+specialChars;
        Random random = new Random();

        char[] passwords = new char[len];
        for(int i=0;i<len;i++){
            passwords[i]=allPasswords.charAt(random.nextInt(allPasswords.length()));
        }
        return passwords;
    }
}
