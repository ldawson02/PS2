package MainPackage;

public class MyInteger {
	// Sets attribute value
	private int value;

	// Constructor no arguments
	public MyInteger() {

	}

	// Constructor with attribute arguments
	public MyInteger(int value) {
		this.value = value;
	}

	// method that gets value
	public int getValue() {
		return value;
	}

	// method that sets value
	public void setValue(int value) {
		this.value = value;
	}

	// instance method isEven()
	public boolean isEven() {
		return (value % 2 == 0);
	}

	// instance method isOdd()
	public boolean isOdd() {
		return (value % 2 != 0);
	}

	// instance method isPrime()
	// FIX
	public boolean isPrime() {
		int n = value - 1;
		while (n > 2) {
			if (value % n == 0) {
				return false;
			} else {
				n--;
			}
		}
		return true;
	}

	// Static method isEven(int)
	public static boolean isEven(int val) {
		return (val % 2 == 0);
	}

	// Static method isOdd(int)
	public static boolean isOdd(int val) {
		return (val % 2 != 0);
	}

	// Static method isPrime(int)
	public static boolean isPrime(int val) {
		int n = val - 1;
		while (n > 2) {
			if (val % n == 0) {
				return false;
			} else {
				n--;
			}
		}
		return true;
	}

	// Static method isEven(MyInteger)
	public static boolean isEven(MyInteger myval) {
		return myval.isEven();
	}

	// Static method isOdd(MyInteger)
	public static boolean isOdd(MyInteger myval) {
		return myval.isOdd();
	}

	// Static method isPrime(MyInteger)
	public static boolean isPrime(MyInteger myval) {
		return myval.isPrime();
	}

	// Method equals(int)
	public boolean equals(int val) {
		return (val == value);
	}

	// Method equals(MyInteger)
	public boolean equals(MyInteger myval) {
		return (myval.getValue() == value);
	}

	// Static method parseInt(char[])
	public static int parseInt(char[] character) {
		String str = new String(character);
		return (Integer.parseInt(str));
	}

	// Static method parseInt(String)
	public static int parseInt(String str) {
		return (Integer.parseInt(str));
	}
}