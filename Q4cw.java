package Day12;

import java.util.Scanner;

public class Q4cw extends PersonalDetails {
	public static void main(String[] args) {
		Q4cw obj=new Q4cw();
		obj.details();
		obj.detail();
	}
}
class PersonalDetails extends Accadmic{
	public void details() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Name");
		String name=sc.next();
		
		System.out.println("Enter your Address");
		String address=sc.next();
		System.out.println(" your Address: "+address);
		System.out.println(" your name: "+name);
	}
}
class Accadmic{
	public void detail() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your year");
		String name=sc.next();
		
		System.out.println("Enter your Stream");
		String address=sc.next();
		System.out.println(" your stream: "+address);
		System.out.println(" your year: "+name);
	}
}
