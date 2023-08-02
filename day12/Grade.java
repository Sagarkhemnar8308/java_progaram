import java.util.Scanner;

class Grade{
     public static void main(String ar[]){

     Scanner sc=new Scanner(System.in);

    System.out.println("Enter your Name");
    String name=sc.nextLine();

    System.out.println("phy mark");
    int phy = sc.nextInt();

    System.out.println("chem mark");
    int chem =sc.nextInt();

    System.out.println("bio mark");
    int bio=sc.nextInt();

    System.out.println("eng mark");
    int eng = sc.nextInt();

    System.out.println("san mark");
    int san = sc.nextInt();

    System.out.println("math mark");
    int math = sc.nextInt();

    System.out.println("phy : - "+phy);
    System.out.println("chem: - "+chem);
    System.out.println("bio : - "+bio);
    System.out.println("eng : - "+eng);
    System.out.println("san : - "+san);
    System.out.println("math : - "+math);

    int totalMark=phy+chem+bio+eng+san+math;

    System.out.println(name +" has got :- ");
  
    System.out.println("Total mark is : -"+totalMark);

    double persentage=totalMark/6;
   
    System.out.println("total Persentage are :- "+persentage+"%");

    if(persentage>85 && persentage<100){
System.out.println(name+" got a A grade");
    }else if(persentage >60 && persentage<85){
System.out.println(name+" got a B grade");
    }else if(persentage >35 && persentage<60){
System.out.println(name+" got a c grade");
    }else{
System.out.println("Fail");
    }


}
}