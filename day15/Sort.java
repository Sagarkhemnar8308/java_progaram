import java.util.Scanner;
class Sort {

    void sorting(int a,int b,int c){

        int[] arr={a,b,c};

        int len=arr.length;
        System.out.println("Natural array");
        for(int d=0;d<len;d++){
         System.out.println(arr[d]);
        }
        System.out.println("Sorted Array");
        for (int i = 0; i < len ; i++) {
            for (int e = 0; e < len -1 ; e++) {
                if(arr[e]>arr[e+1]){
             
                }             
            }
        }
    }
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);

     System.out.println("Enter Element in Array");

    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();

    Sort sort=new Sort();

    sort.sorting(a,b,c);


    }
}