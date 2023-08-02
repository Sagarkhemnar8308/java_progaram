class Table {
    void tableTwo(int a){
          for(int i=1 ;i<20 ;i=i+2 ){
           System.out.println(i*a);
          }
    }
   public static void main(String args[]){
      Table t = new Table();
         t.tableTwo(2);
   }
}