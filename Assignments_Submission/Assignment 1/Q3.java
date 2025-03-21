//3. Implement a Java program to demonstrate implicit and explicit type casting
class Q3{
	public static void main(String[] args) {
        int i = 10;
        long l = i; // Implicit (int to long)
        double d = 12.5;
        int i2 = (int) d; // Explicit (double to int)
        System.out.println("Implicit: " + l);
        System.out.println("Explicit: " + i2);
    }
	
}