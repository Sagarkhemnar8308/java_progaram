class Hours{
 
    double hour=1;
    double min=hour*60;
    double sec=min*60;
    double milli=sec*1000;

    void show(){
        System.out.println(hour+" hour \n"+min+" min \n"+sec+" sec \n"+milli+" milli ");
    }
public static void main(String[] args) {
    Hours h1=new Hours();
    h1.show();
}




}