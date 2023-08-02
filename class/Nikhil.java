class Nikhil
{
    int marathi = 90;
    int english = 89;
    int math = 87;
    int phy = 80;
    int bio = 85;
    int chem = 83;
    double total;
       float marks;

    void show()
    {
        total = marathi + english + math + phy + bio + chem /6*100;
        
        System.out.println ("My Percentage is : "+total);
    }    
    public static void main(String args[])
    {
         System.out.println("main method");
        Nikhil mark = new Nikhil();
         mark.show();
    }

}