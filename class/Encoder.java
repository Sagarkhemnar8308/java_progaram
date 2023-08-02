public class Encoder {
    
  String encode(char c){
   if(c == 'A'){
    return "@@";
   }
   if (c == 'B') {
    return  "##";
   }
   if (c == 'C') {
    return "$$";
   }
   return null;
  }
public static void main(String[] args) {
    Encoder e1= new Encoder();
  
    String output = e1.encode('A');
    System.out.println(output);

    output = e1.encode('B');
    System.out.println(output);
    
}


}
