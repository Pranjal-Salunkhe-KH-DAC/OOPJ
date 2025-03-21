//5:  Write a Java program to  swap two numbers  using the  +=  and  -=  operators only. 

import java.util.Scanner;
class Q5{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number 1: ");
		int a = sc.nextInt();
		System.out.print("Enter Number 2: ");
        int b = sc.nextInt();

        System.out.println("Before swap: a = " + a + ", b = " + b);

       
        a += b; // a now holds the sum of a and b
        b = a - b; // b now holds the original value of a
        a -= b; // a now holds the original value of b

        System.out.println("After swap: a = " + a + ", b = " + b);
    }
}