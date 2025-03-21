//Q21:  Write a program that  increments a number without using  +  or  ++  operators. 
//Hint  : Use bitwise  - (~x) 
import java.util.Scanner;

public class Q21 {
    
    int increment(int num) {
        return -~num; // Using bitwise NOT (~) and negation (-)
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        
        Q21 obj = new Q21();
        int incrementedValue = obj.increment(num);

        System.out.println("Incremented value: " + incrementedValue);

        scanner.close();
    }
}
