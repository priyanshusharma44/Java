class StringProgram{
    public static void main(String[]args)
    {
        
        String fname="PRIYANSHU";
        String lname="SHARMA";
        String output=fname.concat(lname);
        System.out.println("The Combine on F and L name is:"+output);
        //concadination program........
        
        String one ="PRIYANSHUSHARMA".substring(2,4);
        System.out.println("The Substring at 2,4  is:"+one);
        // returns "IY"
        
        String two="PRIYANSHUSHARMA".substring(5);
        System.out.println("The Substring at 5 is:"+two);
        //
        
        String three = "PRIYANSHUSHARMA";
        System.out.println("The char at index 4 is:"+three.charAt(4));
        // char at index 4 is N
        
        String four = "PRIYANSHUSHARMA";
        System.out.println("The lenght is:"+four.length());
        //lenght of name 
        
        String five="PRIYANSHU SHARMA";
        System.out.println("The lenght is:"+five.indexOf("PRIYANSHU SHARMA"));
        // index of name
        String six="PRIYANSHU SHAPRA";
        System.out.println("The lenght is:"+six.indexOf("PR",2));
        
        String seven="PRIYANSHU SHARMA";
        System.out.println("The lenght is:"+seven.lastIndexOf("S"));
        
        Boolean out="PRIYANSHUSHARMA".equals("priyanshu sharma");
        System.out.println(out);
        Boolean in="PRIYANSHUSHARMA".equals("PRIYANSHUSHARMA");
        System.out.println(in);
        
        Boolean a="PRIYANSHUSHARMA".equalsIgnoreCase("priyanshu sharma");
        System.out.println("acase:"+a);
        Boolean b="PRIYANSHUSHARMA".equals("PRIYANSHUSHARMA");
        System.out.println("caseeee:"+b);
        
        
        String nine="abc";
        String firstww="def";
        int save=nine.compareTo(firstww);
        System.out.println(save);
        
        int oo=nine.compareToIgnoreCase(firstww);
        System.out.println(oo);
        
        
        String qq="PRiyANSHU";
        String rr=qq.toLowerCase();
        System.out.println(rr);
        
        String lower="PRiyanshu";
        String r=lower.toUpperCase();
        System.out.println(r);
        
        
        String hello="PRIYANSHU";
        String h=hello.replace("R","M");
        System.out.println(h);
        
        
        String ten="";
        System.out.println(ten.isEmpty());
         String te="oo";
        System.out.println(te.isEmpty());
        
        
        String str="HELLO";
        byte x[]=str.getBytes();
        System.out.println(x);
    
        String sr="Hello World";
        char ch[]=new char[4];
        str.getChars(1,5,ch,0);
        System.out.println(ch);//ello
        
        String ster="Hello World";
        char choo[]=new char[4];
        str.getChars(1,5,choo,0);
        System.out.println(choo);//ello
        
        }
        }
        
        
        
        
        
        

    