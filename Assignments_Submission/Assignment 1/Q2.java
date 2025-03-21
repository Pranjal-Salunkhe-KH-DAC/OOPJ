//2. Write a Java program that takes two integers as input and performs all arithmetic operations on them
import java.util.Scanner;
class Q2{
	public static void main(String args[]){
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number 1: ");
		int num1=sc.nextInt();
		System.out.print("Enter Number 2: ");
		int num2=sc.nextInt();
		System.out.println("Addition : "+(num1+num2));
		System.out.println("Subtraction : "+(num1-num2));
		float result=(float)((float)num1/(float)num2);
		System.out.println("Division : "+result);
		System.out.println("Multiplication : "+(num1*num2));
		System.out.println("Division : "+(num1%num2));
	}
}