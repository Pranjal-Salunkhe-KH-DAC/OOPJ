//Q9:  Implement a Java program that checks if a number is  within a specific range (20 to 50)  without using  if-else  . 
//Hint  : Use  logical AND (  &&  ) in a print statement 

import java.util.Scanner;

class Q9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        scanner.close();

        boolean withinRange = (number >= 20) && (number <= 50);

        System.out.println(withinRange);
    }
}