//5. Write a Java program to swap two numbers using a temporary variable and without using a temporary variable.
import java.util.Scanner;
class Q5{
	int num1;
	int num2;
	void with_thirdVar(int num1, int num2){
		this.num1=num1;
		this.num2=num2;
		
		int temp=num1;
			num1=num2;
			num2=temp;
			
			System.out.println("-------With Third Variable-------");
			System.out.println("Number 1: "+ num1);
			System.out.println("Number 2: "+ num2);
		
	}
	void without_thirdVar(int num1, int num2){
		this.num1=num1;
		this.num2=num2;
		
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		
		System.out.println("-------Without Third Variable-------");
		System.out.println("Number 1: "+ num1);
		System.out.print("Number 2: "+ num2);
		
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number 1: ");
		int num1=sc.nextInt();
		System.out.print("Enter Number 2: ");
		int num2=sc.nextInt();
		
		Q5 obj=new Q5();
		obj.with_thirdVar(num1,num2);
		obj.without_thirdVar(num1,num2);
	
	}
} 