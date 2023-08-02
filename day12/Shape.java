class Shape {
    public static void main(String[] args) {
        Calculate a=new Calculate(12);
        Calculate b=new Calculate(12,45);
        Calculate c=new Calculate(10, 20, 30);

    }
}
class Calculate{
double PI=3.14;
    Calculate(int radius){
      System.out.println("Area of Circle is "+PI*radius*radius);
    }
    Calculate(int length,int width){
    System.out.println("Area Of Rectrangle is "+length*width);
    }
    Calculate(int h,int b,int l){
    System.out.println("volume of cuboid "+h*l*b);
    }

}