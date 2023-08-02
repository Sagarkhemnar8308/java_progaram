class Baap{
   String name="the baap company";
   int a=name.length();
   void baapCompany(){
    for(int b=0;b<a;b++){
        for(int c=0;c<=b;c++){
            System.out.print(name.charAt(c));
        }
        System.out.println();
    }
  }
  public static void main(String[] args) {
    Baap baap=new Baap();
    baap.baapCompany();
  }
}
