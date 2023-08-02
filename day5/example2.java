class Money{
double landInHector;
double seedForHalfAcre=23;
double seedforHector=seedForHalfAcre*5;
double seedRatePerGram=12.35;

double calculateSeed(){
return seedforHector*landInHector;
}
double calculateTotalMoney(){
   return seedforHector*landInHector*seedRatePerGram;
}
public static void main(String[] args) {
    Money sagar=new  Money();
      
     sagar.landInHector=10.15;

    //  sagar.calculateSeed();
    //  sagar.calculateTotalMoney();

     System.out.println("total seed required  "+sagar.calculateSeed()+"gm");
     System.out.println("total money required  "+sagar.calculateTotalMoney()+"rs");
}




}