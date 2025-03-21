//4. Create a Java program that converts a given integer to a double and vice versa using wrapper classes. 
class Q4{
	public static void main(String args[]){
		int i = 10;
        double d = Integer.valueOf(i).doubleValue(); // int to double
        System.out.println("Int to Double: " + d);

        double d2 = 15.7;
        int i2 = Double.valueOf(d2).intValue(); // double to int
        System.out.println("Double to Int: " + i2);
	
	}
}
/*

How It Works Internally:

	1) Integer.valueOf(i) creates an Integer object that holds the value 10.
	2) .doubleValue() extracts that value and converts it to a double.
	3) 10 (int) becomes 10.0 (double).


*/