package Day27_arrays05;

public class Times {

	public static void main(String[] args) {
		//hours : 0-24
				//minutes : 0 -59
				//time = {11,10}
				//Print "Time1 is eatLier"
		int[] time1 = new int[2];//0,0 by default
		
		int[] time2 = new int[2];//0,0 by default
		int t;
		//System.out.println(t);
	//System.out.println(time1[0]);//0
		 // int [] time1 = {20.40}
		 //int [] time2 = {20.40}
		
	    time1[0]=10;
		time1[1]=15;
		
		time2[0]=16;
		time2[1]=10;
		
	//Before compering ,check if both arrays have	
	//valid hour//minute	
	if(time1[0]< 0 || time1[0]>23) {//check hours
		System.out.println("Time1 has invalid hour");
		return;
	}
		
	if(time1[1]< 0 || time1[1]>59) {
		System.out.println("Time1 has invalid hour");
		return;
	}
	if(time2[0]< 0 || time2[0]>23) {//hours
		System.out.println("Time2 has invalid hour");
		return;
	}
		
	if(time2[1]< 0 || time2[1]>59) {//minutes
		System.out.println("Time2 has invalid hour");
		return;
	}		

		//COMPERE ARRAYS and tell which one is earlier
	//compare hour
	
	if(time1[0]>time2[0]) {
		System.out.println("Time1 is earlier");
	}else if(time2[0]< time1[0]) {
		System.out.println("Time2 is earlier");
	}else { //hours are equals, check minutes
	
	if(time1[1]< time2[1]) {
		System.out.println("Time1 is earlier");
	}else if(time2[1]< time1[1]) {
		System.out.println("Time2 is earlier");
	}else {
		System.out.println("Same Time!");
	}
	
	
	
	
	
	
		
	}
	}

}
