class Square{
 
    int num =2;

void dis(){
    System.out.println("square root of "+ num +" is "+ num*num);
}
public static void main(String arg[]){
    System.out.println("main method is called");

    Square s1=new Square();
      s1.num=12;
      s1.dis();
    Square s2 = new Square();
     s2.dis();
}
}