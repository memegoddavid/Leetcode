import java.util.Arrays;
import java.util.Iterator;

public class Test {

	public static void main(String[] args) {
		
		//System.out.println(myPow(2,-2));
		int[] digits = new int[3];
		for (int i = 0 ; i < digits.length; i++) {
			digits[i] = i+1;
		}
//		System.out.println(Arrays.toString(digits));
//		System.out.println(digits.length);
//		System.out.println(digits[digits.length-1]);
		
		digits[digits.length-1] = digits[digits.length-1]+1;
		System.out.println(digits[digits.length-1]);
		System.out.println(Arrays.toString(digits));
		
		
	}
	/*public static double myPow(double x, int n) {
	     
		double r = 0;
		
		if(n==0) {
			return 1;
		}else if(n<0) {
			r = (1/myPow(x, -n));
		}else if(n>0) {
			r = x*myPow(x, n-1);
		}
		return r;
		
		
    }*/
	
	
	
}
