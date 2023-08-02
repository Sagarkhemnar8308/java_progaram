class Calculator{
 
        void add(int a,int b){
            int c=a+b;
          System.out.println("Addition is "+ c);
        }
        void sub(int a,int b){
            int c=a-b;
          System.out.println("Subtraction is "+ c);
        }
        void multi(int a,int b){
          System.out.println("Multiplication "+ a*b);
        }
        void div(int a,int b){
          System.out.println("Division is "+ a/b);
        }
public static void main(String arg[])
  {

     
        String str1=arg[0];
        String str2=arg[1];
        int c=Integer.parseInt(str1);
        int d=Integer.parseInt(str2);

        Calculator calci=new Calculator();                                            

        calci.add(c,d);
        calci.sub(c,d);
        calci.multi(c,d);
        calci.div(c,d);
   }

}