package arrayOffis;

public class ArrayOrder {

	public static void main(String[] args) {
		int[] nums = new int[] {1, 1, 4, 6, 7, 12};
		int[] nums2 = new int[] {1, 4, 6, 3, 7, 12};
		int[] nums3 = new int[] {433, 5, 12};
		
		isArraySorted(nums2);
		
		
	
		}	
	public static void isArraySorted(int[] nums) {
		
	    boolean sorted = true;
        
		
			for(int i =0; i<nums.length-1; i++) {
				System.out.println(nums[i] + " " + nums[i+1]);
				if(nums[i]>nums[i+1]) {
					sorted=false;
					break; //exit the loop
				}
			}
			 System.out.println(" Is Arrays sorted? - "+ sorted);
		
		
		
	}

}
