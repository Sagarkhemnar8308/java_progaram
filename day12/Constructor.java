class Constructor {
public static void main(String[] args) {
    Student s=new Student();
    Student sagar=new Student(66,78);
}
}
class Student{
int SSC;
int HSC;

boolean isEligble(){
    if(SSC > 60 && HSC > 60){
        return true;
    }else{
        return false;
    }
}
Student(){
System.out.println("Enpty Constructor");
}
Student(int ssc,int hsc){
SSC=ssc;
HSC=hsc;
boolean eligble=isEligble();
if(eligble==true){
    System.out.println("You are Eligible");
}else{
     System.out.println("You are Not  Eligible");
}
}
}