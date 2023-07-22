class A{
    
    void msg()
    {
        System.out.println("Hello");
    }
        void compile()
    {
        int a=10;
        int b=20;
        int c=a+b;
        System.out.println("c");
    }
}



    class C extends A{
        
          public static void main(String[] args){
            C obj=new C();
            obj.msg();
            obj.compile();
           
        }
    }
    
    
    
    
    