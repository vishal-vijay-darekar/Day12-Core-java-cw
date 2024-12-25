package Day12;

import java.util.Scanner;

public class Q2cw extends Credit {
	public static void main(String[] args) {
		Q2cw obj=new Q2cw();
		obj.credit();
		obj.debit();
	}
  
}
class Credit extends Debit{
	public void credit() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your credited amount");
		int amount=sc.nextInt();
		System.out.println("Your credited amount: "+amount);
		int total=0;
		total+=amount;
		System.out.println("Your total balance"+total);
		
	}

}
class Debit{
	public void debit() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your debited amount");
		int amt=sc.nextInt();
		System.out.println("Your debited amount: "+amt);
	}
}
