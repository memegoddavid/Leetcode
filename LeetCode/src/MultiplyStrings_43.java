import java.math.BigInteger;

public class MultiplyStrings_43 {

	public String multiply(String num1, String num2) {
		
		
		BigInteger b = new BigInteger(num1);
		BigInteger c = new BigInteger(num2);
		BigInteger a;
		a = b.multiply(c);
		return a.toString();
	}
	
}
