class DiShape {
    public static void main(String[] args) {
        Shape cir = new Shape(4);
        Shape rect = new Shape(12, 4);
        Shape squ = new Shape(10);
        Shape cub = new Shape(4, 7, 8);
    }
}

class Shape {
    Shape(int radius) {
        double area = 3.14 * radius * radius;
        System.out.println("Area of circle is: " + area);
    }

    Shape(int length, int breadth) {
        double rectangle = length * breadth;
        System.out.println("Area of rectangle is: " + rectangle);
    }

    Shape(float side) {
        double square = side * side;
        System.out.println("Area of square is: " + square);
    }

    Shape(int length, int breadth, int height) {
        double cube = length * breadth * height;
        System.out.println("Cube is: " + cube);
    }
}