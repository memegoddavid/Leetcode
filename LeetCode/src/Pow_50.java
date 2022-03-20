
public class Pow_50 {
	
	public double myPow(double x, int n) {
     
		double r = 0;
		
		if(n==0) {
			return 1;
		}else if(n<0) {
			r = (1/myPow(x, -n));
		}else if(n>0) {
			r = x*myPow(x, n-1);
		}
		return r;
		
		
    }
	
}
