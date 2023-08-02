class Table{

   void generateTable(int b){
        for(int a=1;a<=10;a++){
            System.out.println(a*b);
        }
   }
     public static void main(String a[]){
       
      Table table=new Table();

      table.generateTable(9);
     }

}