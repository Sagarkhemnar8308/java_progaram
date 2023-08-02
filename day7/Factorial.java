class Factorial{

  void factorial(int b,int e){
    int c=1,d=1;
     for(int a=1;a<=b;a++){
        c=c*a;
     }
     for(int f=1;f<=e;f++){
        d=d*f;
     }
     System.out.println("Factoial of "+b+" is "+c);
     System.out.println("Factoial of "+e+" is "+d);
  }

  public static void main(String a[]){
    Factorial facto=new Factorial();
  
    String str=a[0];
    String str1=a[1];
    int d= Integer.parseInt(str);
    int e= Integer.parseInt(str1);
    facto.factorial(d,e);
  }

}