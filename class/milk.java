class Milk{
int ltr=3000;
float rate=35.37f;

void show(){
System.out.println("total income is "+ltr*rate);
}
public static void main(String args[]){
System.out.println("main method called");

Milk m1= new Milk();
m1.show();
}

}