class Milk{

    float day1=34.1f;
    float day2=32.2f;
    float day3=34;
    float day4=36;
    float day5=34;
    float day6=37.5f;
    float day7=34;
    float day8=30.7f;
    float day9=34;
    float day10=33.1f;
    float day11=34.5f;
    float day12=34.5f;
    float day13=30.7f;
    float day14=34;
    float day15=34.5f;

   double rateIs=35.67d;

    double  totalMilk=day1+day2+day3+day4+day5+day6+day7+day8+day9+day10+day11+day12+day13+day14+day15;

 double totalPayment=totalMilk*rateIs;

void payment(){
System.out.println("Rate of ltr is : "+rateIs);
System.out.println("Total milk is : "+totalMilk);
System.out.println("Total payment is : "+totalPayment);

}
public static void main(String[] args) {
    
    Milk i1=new Milk();
    i1.payment();

}




}