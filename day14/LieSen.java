class LieSen {
    public static void main(String[] args) {
        String senteString="my name is sagar";
        System.out.println(senteString.length());

        for(int a=0;a<senteString.length();a+=2){
          char str=senteString.charAt(a);
           System.out.print(str);
        }
       
    }
}
