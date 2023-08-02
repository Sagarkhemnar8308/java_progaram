class Data{
    double gb=1;
    double mb=gb*1024;
    double kb=mb*1024;
    double byt=kb*1024;
    double bit=byt*8;
    double tb=gb/1024;
void dis(){
    System.out.println(gb+" gb\n"+mb+" mb\n"+kb+" kb\n"+byt+" byte\n"+bit+" bit\n"+tb+" tb\n");
}
public static void main(String[] args) {
    Data d1=new Data();
    d1.dis();
}
}
