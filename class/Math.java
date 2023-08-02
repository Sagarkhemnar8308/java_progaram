 class Math {
    int math = 12;
    int eng = 35;
    int phy = 46;
    int bio = 78;
    int chem = 67;
    int marathi = 45;

    int totalMArks = math + eng + phy + bio + chem + marathi;
    float formulaMarks = totalMArks / 6;

    void Function(){
    System.out.println("persentage is "+formulaMarks);
    }

    public static void main(String[] args) {
        System.out.println("main method");

        Math math=new Math();
        math.Function();
    }

}
