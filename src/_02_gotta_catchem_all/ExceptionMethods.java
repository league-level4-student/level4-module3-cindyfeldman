package _02_gotta_catchem_all;

public class ExceptionMethods {
	static double divide(double one, double two) {
		double quotient = 0.0;
		try {
		quotient = one/two;
		if(two==0.0) {
			throw new IndexOutOfBoundsException();
		}
		}
		catch(IndexOutOfBoundsException e) {
			System.out.println("denominator is 0.0");
			e.printStackTrace();
		}
		return quotient;
	}
	static String reverse(String s) {
		String reverse ="" ;
		try {
			reverse = new StringBuffer(s).reverse().toString();
			if(reverse.isEmpty()) {
				throw new IllegalStateException();
			}
		}
		catch(IllegalStateException e) {
			System.out.println("s is empty");
			e.printStackTrace();
		}
		return reverse;
	}
}
