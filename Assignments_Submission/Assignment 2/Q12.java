//Q12:  Write a Java program to  multiply a number by 8  without using  *  or  /  operators. 
//Hint  : Use bitwise left shift (  <<  ).
import java.util.Scanner;

class Q12 {
    static int multiplyByEight(int n) {
        return n << 3; // Left shifting by 3 is equal to multiplying by 8
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int result = multiplyByEight(num);
        System.out.println(num + " multiplied by 8 is: " + result);

       
    }
}

