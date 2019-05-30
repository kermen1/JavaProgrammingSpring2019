package homework;

public class repl176 {

	public static void main(String[] args) {
		
		
	}	public static int findMax(int[] nums) {
		    int maximum =nums[0];   
		    for (int i=1; i<nums.length; i++) {
		        if (nums[i] > maximum) {
		            maximum = nums[i];  
		        }
		    }
		    return maximum;
			
			
		}public static double findMin(double[] nums) {
		    double min =nums[0];   
		    for (int i=1; i<nums.length; i++) {
		        if (nums[i] > min) {
		            min = nums[i];   
		        }
		    }
		    return min;
	}
}
