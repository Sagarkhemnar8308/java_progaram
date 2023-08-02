import java.util.Scanner;
class MyScanner{

 public static void main(String[] args) {
   Scanner c = new Scanner(System.in);

   System.out.println("Enter First Number");
   int num1= Integer.parseInt(c.nextLine());

   System.out.println("Enter Second Number");
   int num2= Integer.parseInt(c.nextLine());

   System.out.println("Enter Operator (+,-,*,/)");
   String op = c.nextLine();
   
   if(op.equals("+"))
   {
    int add=num1+num2;
    System.out.println("Add is : "+add);
   }
   if(op.equals("-"))
   {
    int sub=num1+num2;
    System.out.println("sub is : "+sub);
   }
   if(op.equals("/"))
   {
    int mul=num1+num2;
    System.out.println("mul is : "+mul);
   }
   if(op.equals("*"))
   {
    int div=num1+num2;
    System.out.println("div is : "+div);
   }
}    
}


