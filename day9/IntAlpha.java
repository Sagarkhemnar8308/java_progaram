class IntAlpha{
public static void main(String args[]) {
int[] arr={5,9,2,7,0};

int n=arr.length;
for(int a=0;a < n ;a++){
   for(int j =0 ; j < n - a - 1 ; j++){
      if(arr[j] > arr[j +1]){
         int temp =arr[j];
         arr[j]=arr[j+1];
         arr[j+1]=temp;
      }
   }
}
for(int a = 0 ; a < n ;a++){
   System.out.println(arr[a]);
}

}
}