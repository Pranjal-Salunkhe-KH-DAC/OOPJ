//Q18:  Given a student’s percentage, print  “Pass”  if the percentage is 40 or above; otherwise, print  “Fail”  , using only the ternary operator.


import java.util.Scanner;

public class Q18 {
    
    String checkResult(double percentage) {
        return (percentage >= 40) ? "Pass" : "Fail";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student percentage: ");
        double percentage = scanner.nextDouble();

      
        Q18 obj = new Q18();
        String result = obj.checkResult(percentage);

        System.out.println("Result: " + result);

        scanner.close();
    }
}
