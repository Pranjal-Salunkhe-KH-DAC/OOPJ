//7. Create a Java program to check whether a given number is even or odd using command-line arguments.


class Q7 {
    public static void main(String[] args) {
        // Check if the user has provided a command-line argument
        if (args.length != 1) {
            System.out.println("Usage: java Q7 <number>");
            return;
        }

        try {
            // Convert the command-line argument to an integer
            int number = Integer.parseInt(args[0]);

            // Check if the number is even or odd
            if (number % 2 == 0) {
                System.out.println(number + " is an even number.");
            } else {
                System.out.println(number + " is an odd number.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter an integer.");
        }
    }
}
