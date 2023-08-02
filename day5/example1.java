class Calculartor{

        int length;
        int width;
        int area;

        static float taxRate=23.75f;

        float totalTax;

        int calculateArea(){
                int tempArea=length*width;
                 return tempArea;
        }
          float calculateTax(){
                return area * taxRate;
        }
        
 public static void main(String[] args) {
        System.out.println("programis running");

  Calculartor rushi=new Calculartor();
   rushi.length=400;
   rushi.width=300;
    rushi.area=rushi.calculateArea();
    rushi.totalTax=rushi.calculateTax();

    System.out.println(rushi.totalTax);
 

 }


}