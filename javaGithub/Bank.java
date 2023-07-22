interface Bank{
    
    float rateOfInterest();
}

class NIC implements Bank{
    
    public float rateOfInterest(){
    return 9.15f;
}
}

class Sanima implements Bank{
    public float rateOfInterest()
    {
     return 9.7f;   
    }
}

class Abstraction
{
    
    public static void main(String[]args)
    {
        Bank b= new Sanima();
        System.out.println("ROI:" +b.rateOfInterest());
    }
}