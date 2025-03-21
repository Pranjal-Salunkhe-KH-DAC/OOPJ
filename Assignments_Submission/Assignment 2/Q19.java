//Q19:  Write a Java program that checks whether a character is  uppercase, lowercase, or not a letter  using only the ternary operator.

import java.util.Scanner;

public class Q19 {
    
    String checkCharacterType(char ch) {
        return (ch >= 'A' && ch <= 'Z') ? "Uppercase" 
             : (ch >= 'a' && ch <= 'z') ? "Lowercase" 
             : "Not a letter";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);

        
        Q19 obj = new Q19();
        String result = obj.checkCharacterType(ch);

        System.out.println("Character type: " + result);

        scanner.close();
    }
}
