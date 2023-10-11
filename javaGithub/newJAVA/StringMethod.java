public class StringMethod {
    public static void main(String[] args) {
        String n1 = "Auaguna";
        String n2 = "Basnet";
        int n = 123;
        System.out.println(n1.length());
        System.out.println(n1.charAt(2));
        System.out.println(n1.substring(1, 4));
        System.out.println(n1.concat(n2));
        System.out.println(n1.indexOf("g"));//if not found return -1;
        System.out.println(n1.indexOf("u",2));
        System.out.println(n1.lastIndexOf("a")); //searching start from last of string..
        System.out.println(n1.equals(n2));//case sensetive...
        System.out.println(n1.equalsIgnoreCase(n2));// not a case sensetive..
        System.out.println(n1.compareTo(n2));//first char of string 1 alphabet number like a=1, b=2 subtract with second string first char..
        System.out.println(n1.toUpperCase());
        System.out.println(n1.toLowerCase());
        System.out.println(n1.trim());// cut the space of beging and ending of the string.
        System.out.println(n2.replace('a','b' ));
        System.out.println(n1.isEmpty());
        char ch[] = new char[5];
        // Auaguna
        n1.getChars(2, 6, ch, 1);
        // System.out.println(ch);
        byte b[]=n1.getBytes();
        System.out.println("yo ho hai: "+b);
        char chr[] = n1.toCharArray();
        System.out.println(chr.getClass().getSimpleName());
        // System.out.println();
    }   
}
