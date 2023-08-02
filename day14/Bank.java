import java. util.*;
class Bank{
    int amount;
   int Current(){
        return amount;
    }
   void savingAccount(){
        if(amount>500){
            System.out.println("Saving amount is"+amount);
        }
    }
    int credit(int add){
        return amount+add;
    }
    int withdraw(int sub){
        return amount-sub;
    }
public static void main(String[] args) {
    Bank b1=new Bank();

    Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Amount");
        b1.amount=sc.nextInt();
    

    System.out.println("Current Amount is "+ b1.Current());

  int op1=b1.withdraw(0);
  int op2=b1.credit(100);
  System.out.println("Withdraw Amount "+op1);
  System.out.println("credit amount is "+op2);
}
}
