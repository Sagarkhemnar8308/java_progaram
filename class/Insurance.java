class Insurance{
double acre=25d;
double hector=acre/2.5;
double insurance;
double gunth=acre*40;

void show(){
if(hector<10){
 insurance=0.05*hector*5000;
 }else{
 insurance=0.025*hector*5000;
 }
 System.out.println("Total hector is "+hector);
 System.out.println("total insurance is "+insurance);
 System.out.println(acre+" acre  in guntha is :"+gunth);
 
}


public static void main(String[] args) {
    Insurance i1=new Insurance();

    i1.show();
}

}