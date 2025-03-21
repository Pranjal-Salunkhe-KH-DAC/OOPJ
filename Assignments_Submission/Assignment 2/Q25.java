//Q25:  Implement a program that reverses an  integer number  without using string conversion (  StringBuilder  or  toCharArray  ). 
//Hint  : Use  while(n!=0) { rev = rev * 10 + n % 10; n /= 10; } 
import java.util.Scanner;

public class Q25 {
   
    int reverseNumber(int n) {
        int rev = 0;
        while (n != 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();

        
        Q25 obj = new Q25();
        int reversed = obj.reverseNumber(num);

        System.out.println("Reversed number: " + reversed);
        scanner.close();
    }
}
