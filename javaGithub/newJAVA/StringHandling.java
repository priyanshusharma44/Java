public class StringHandling {
    public static void main(String[] args) {
        String str = "Java string handling";

        // length of string
        System.out.println("Length of string: "+str.length());

        // index of a character
        System.out.println("Index of 's': "+str.indexOf('s'));

        // compare strings
        System.out.println("Comparison of strings: "+str.compareTo("Java string handling"));

        // substring
        System.out.println("Substring: "+str.substring(5));

        // replace character
        System.out.println("After replacing 's': "+str.replace('s', 'S'));
    }
}