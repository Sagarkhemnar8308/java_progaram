class MethodOverLoading {
    public static void main(String[] args) {
        
      AreaOfCalculator a1=new AreaOfCalculator();

     int rect= a1.area(12, 16);
      float cir=a1.area(12);

      System.out.println("Area of Rectrangle : "+rect);
       System.out.println("Area Of Circle : "+cir);

    }
}
