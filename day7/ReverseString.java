class ReverseString{
    public static void main(String arg[]){
    // String str=arg[0];
    
    // System.out.println(str);
    // String reversedString="";

    // for(int a=str.length()-1;a>=0;a--){

    //   reversedString=reversedString + str.charAt(a);
    // }
    
    // System.out.println("string name is "+str);
    // System.out.println("Reversed String is "+reversedString);

     String str=arg[0];

     System.out.println(str);

     String reversedString="";

     

     for(int a=str.length()-1;a>=0;a--){
        reversedString+=str.charAt(a);
     }

     System.out.println(reversedString);

     }
}

