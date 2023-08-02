class Pramid{
    public static void main(String[] args) {
        int a = 15;
        for (int i = 0; i < a; i++) {
            for(int b=a-i;b>1;b--){
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}