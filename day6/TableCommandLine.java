class TableCommandLine{

void tableC(int b){
for(int a=1;a<=10;a++){
    System.out.println(a*b);
}
}


public static void main(String a[]){

     String str1=a[0];
    int c= Integer.parseInt(str1);

     TableCommandLine table= new TableCommandLine();

     table.tableC(c);

}




}