//Q8:  Write a program that  takes three boolean inputs  and prints  true  if at least two of them are  true  . 
//Hint  : Use logical operators (  &&  ,  || ).

import java.util.Scanner;

class Q8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first boolean value (true/false): ");
        boolean bool1 = scanner.nextBoolean();

        System.out.print("Enter the second boolean value (true/false): ");
        boolean bool2 = scanner.nextBoolean();

        System.out.print("Enter the third boolean value (true/false): ");
        boolean bool3 = scanner.nextBoolean();

        scanner.close();

        boolean result = (bool1 && bool2) || (bool1 && bool3) || (bool2 && bool3);

        System.out.println(result);
    }
}