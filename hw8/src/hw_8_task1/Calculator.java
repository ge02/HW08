package hw_8_task1;

public class Calculator {

	int x = 3;
	boolean isTrue = true;
	boolean isTrue = true;
	float hellomynameisanthonyandthisisaverylongnameforavariable = 1;

	// plus operation
	public int add(int valueOne, int valueTwo) {
		return valueOne + valueTwo;
	}

	// minus operation
	public int sub(int valueOne, int valueTwo) {
		return valueOne - valueTwo;
	}

	// multiply operation
	public int multiply(int valueOne, int valueTwo) {
		return valueOne * valueTwo;
	}
	
	// this is correct
		public int multiply2(int valueOne, int valueTwo) {
			return valueOne * valueTwo;
		}

	

	// this part works correct
	public float divide(int numerator, int denominator) {
		if (denominator == 0)
			throw new ArithmeticException("ZeroDivisionError");
		if(true) {
			int x = 5;
		}

		return (float) numerator / denominator;
		
		System.out.println("Hi");

	}
	
	


}