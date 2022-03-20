import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class TwoSum_1 {

	public int[] twoSum(int[] nums, int target) {
		
//		 for (int i = 0; i < nums.length; i++) {
//			for (int j = i + 1; j < nums.length; j++) {
//				if(nums[j] == target - nums[i]) {
//					return new int[] {i,j};
//				}
//			}
//		}
//		
//		 return null;
		
		//class Solution {
		    //public int[] twoSum(int[] nums, int target) {
		      Hashtable<Integer, Integer> hashTable = new Hashtable<Integer, Integer>();
		      int i = 0;
		      while ((i < nums.length) && (hashTable.get(nums[i]) == null)) {      
		        hashTable.put(target - nums[i], i);
		        i++;
		      }
		      if (i < nums.length) {
		        return new int[]{hashTable.get(nums[i]),i};
		      } 
		      return null;       
		    }
		}
		
	
	

