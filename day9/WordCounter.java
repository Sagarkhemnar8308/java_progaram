class WordCounter{
    String para;
int counter(){
    int l=para.length();
    int count = 0;
    for(int i=0;i < l;i++){
     char c = para.charAt(i);
    System.out.println(c);
    if(c == ' '){
    count = count + 1 ;
    }
    }
    return count +1;
}
public static void main(String args[]) {
    WordCounter w= new WordCounter();
 
    w.para="sagar is a bca student";
    int output = w.counter();
    System.out.println("Total count is : "+output);
}
}
