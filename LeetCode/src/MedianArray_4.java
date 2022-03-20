import java.util.Arrays;

public class MedianArray_4 {

	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		
		
		int fal = nums1.length;
		int sal = nums2.length;
		int[] res = new int[fal + sal];
		System.arraycopy(nums1, 0, res, 0, fal);
		System.arraycopy(nums2, 0, res, fal, sal);
		Arrays.sort(res);
		System.out.println(Arrays.toString(res));
	
		if(res.length % 2 == 1) {
			
			return 1.0*res[res.length/2];
			
		}else if(res.length % 2 == 0){
			
			int i = res[(res.length-1)/2];
			int j = res[((res.length-1)/2)+1];
			
			return ((1.0*i+j)/2);
		}
		
		return (Double) null;
	}
	
	
}
