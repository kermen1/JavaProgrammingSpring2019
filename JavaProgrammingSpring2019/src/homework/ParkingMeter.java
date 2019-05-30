package homework;

public class ParkingMeter {
	 int timeLeft=0;
	  int maxTime;
	  public ParkingMeter(int maxTime) {
		  this.maxTime=maxTime;
	  }
	  public boolean add(int n) {
		 if( n == 25) {
			 if(maxTime>timeLeft) {
			 timeLeft +=30;
			 return true;
			 }
		 }
		return false;
	  }
	  
	  public void tick() {
		  if(timeLeft>0) {
			  timeLeft --;
		  }
	  }
	  public boolean isExpired() {
		  if(timeLeft==0) {
			  return true;
		  }
		return false;
		  
	  }
}
