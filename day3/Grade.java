class Grade{
int mar=45;
int hin=67;
int bio=50;
int chem=67;
int phy=46;
int math=56;

float persentage=mar+hin+bio+chem+phy+math;

float formula=persentage/6;

void ans(){
if(formula < 35){
    System.out.println("fail");
}else if(formula >=35 && formula < 60){
    System.out.println("pass class");
}else if(formula >=60 && formula < 100){
    System.out.println("First class");
}

System.out.println("total persentage is :"+formula);
}
public static void main(String[] args) {
    Grade g1=new Grade();
    g1.ans();
}
}