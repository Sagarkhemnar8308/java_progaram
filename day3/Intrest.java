class Intrest{

   float money=1500000;
   float year=20;
   float rate=11;

   float formula=(money*year*rate)/100;
   float formula2=formula/year;
   
void show(){
   System.out.println("Intrest is :"+formula);
   System.out.println("1 year intrest is : "+formula2);
}
public static void main(String args[]){
Intrest i1=new Intrest();
i1.show();
}

}