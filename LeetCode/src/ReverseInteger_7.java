
public class ReverseInteger_7 {

	public int reverse(int x) {
		
		boolean negative = false;
	    if (x < 0) {
	        x = Math.abs(x);
	        negative = true;
	    }

	    int y = 0, i = 0;
	    while (x > 0) {
	        if (i > 0) {
	            y *= 10;
	        }

	        y += x % 10;
	        x = x / 10;
	        i++;
	    }
	    return negative ? -y : y;
		
	}
	
}
