//6. Develop a program that takes user input for a character and prints whether it is a vowel or consonant.
import java.util.Scanner;

class Q6{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char inputChar = scanner.next().toLowerCase().charAt(0);

        if (Character.isLetter(inputChar)) {
            if (inputChar == 'a' || inputChar == 'e' || inputChar == 'i' || inputChar == 'o' || inputChar == 'u') {
                System.out.println(inputChar + " is a vowel.");
            } else {
                System.out.println(inputChar + " is a consonant.");
            }
        } else {
            System.out.println("Invalid input. Please enter a letter.");
        }

        
    }
}