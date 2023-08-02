class Building{

    double height=500;
    double width=300;

    double multi = height*width;
    double rate=23.75;

    double tax=multi*rate;

   void pay(){
   System.out.println("Total tax is :"+tax);
}
public static void main(String args[]){
  Building b1=new Building();
b1.pay();
}
}