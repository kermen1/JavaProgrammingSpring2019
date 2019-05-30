package homework;

public class TV {
      private int channel =1;
      private int volumeLevel =1;
      private boolean on = false;
      private String brand= "undefined";
      
      public TV() {
   	   System.out.println("Creating TV object using no Args- constructor");
   	   
      }
     public TV(String brand) {
   	  System.out.println("Creating TV object using 1 arg - constructor");
   	  this.brand = brand;
   	 
     }
      
   
      
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		if(isOn() == false || channel <=0 || channel >120) {
			System.out.println("ERROR: TV is either OFF or invalid Channel");
		}else {
		this.channel = channel;
		}
	}
	public int getVolemeLevel() {
		return volumeLevel;
	}
	public void setVolemeLevel(int volemeLevel) {
		if(isOn()==false || volumeLevel<1 || volumeLevel>7) {
			System.out.println("ERROR: TV is either OFF or invalid Volume level");
		}else {
		this.volumeLevel = volumeLevel;
		}
	}
	public boolean isOn() {
		return on;
	}
	public void setOn(boolean on) {
		this.on = on;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void channelDown() {
		if(isOn()==false || channel <= 0) {
			System.out.println("ERROR: TV is either OFF or invalid Channel");
		}else {
			channel--;
		}
		
	}
	public void channelUp() {
		if(isOn()==false || channel> 120) {
			System.out.println("ERROR: TV is either OFF or invalid Channel");
		}else {
			channel++;
		}
	}
	public void volumeUp() {
		if(isOn()==false || volumeLevel>7 ) {
			System.out.println("ERROR: TV is either OFF or invalid Volume level");
		}else {
			volumeLevel--;
		}
	}
	public void volumeDown() { 
		if(isOn()==false || volumeLevel<1 ) {
			System.out.println("ERROR: TV is either OFF or invalid Volume level");
		}else {
			volumeLevel++;
		}
	}
	public void turnOn() {
		if(!isOn()) {
			System.out.println("TV is already ON");
		}else {
			this.on= true;
		}
	}
	public void turnOff() {
		if(isOn()) {
			System.out.println("TV is already Off");
		}else {
			this.on= false;
		}
	}
      
}
