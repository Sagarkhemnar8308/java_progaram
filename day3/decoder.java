class Decoder{

    String show(char c){
        if(c == '*')
        {
         return "A";
        };
        if(c == '&')
         {
            return "B";
         };
         if(c == '$')
         {
            return "C";
         };
         return null;

    }
public static void main(String[] args) {
    Decoder d1= new Decoder();

    String output=d1.show('*');
    System.out.println(output);

    output=d1.show('&');
    System.out.println(output);
}

}