//Q3:  Implement a program that calculates the  sum of digits  of an integer using  modulus (  %  ) and division (  /  ) operators 

import java.util.Scanner;

class Q3{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number: ");
		int num=sc.nextInt();
		int sum=0;
		
		for(int i=0;i<num;i++){
			int temp=num%10;
			sum=sum+temp;
			num=num/10;
		}
		
		System.out.println("Sum of Digits : "+sum);
	}
}