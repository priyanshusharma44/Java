public class Array{
    public static void main(String[] args) {
        // String myName = "Sagun basnet";
        String [] names = {"Sagun", "Sohan","Soniya","Sunita","Bijaya"};

        System.out.println("Total Names: "+ names.length);
        // for(int i = 0; i< names.length; i++){
        //     System.out.println(names[i]);
        // }
        for (String myName : names) {
            System.out.println(myName);
        }
    }
}