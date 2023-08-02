
class ConstGrade{
public static void main(String ar[]){

Mark m1=new Mark(45,67,89,90,45,78);
Mark m2=new Mark(45,45,45,45,45,45);
Mark m3=new Mark(35,35,35,35,35,35);
Mark m4=new Mark(100,100,100,100,100,100);
Mark m5=new Mark(85,85,85,85,85,85);


}
}

class Mark{
Mark(int mar,int eng,int hin,int phy,int chem,int bio){

int add=mar+eng+hin+phy+chem+bio;

System.out.println("total Marks :-"+add);

double per=add/6;

System.out.println("total persentage are "+per+" %");

if(per>=85&&per<=100){
System.out.println("A Grade");
}else if(per>=60 && per<85){
System.out.println("B grade");
}else if(per>=35&& per<60){
System.out.println("C grade");
}else{
System.out.println("fail");
}

}

}