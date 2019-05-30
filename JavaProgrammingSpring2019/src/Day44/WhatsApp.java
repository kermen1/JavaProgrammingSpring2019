package Day44;

public class WhatsApp {
	private String toNumber;
	private String message;
	private boolean delivared;
	
	public WhatsApp() {
		System.out.println("No-Args constractor");
	}
	public WhatsApp(String toNumber, String message) {
		this();
		System.out.println("2 Args constraction");
		this.message = message;
		this.toNumber = toNumber;
	}
	public WhatsApp(String  toNumber) {
		//toNumber , "[]"
		//this.toNumber = toNumber;
		//this.message = "[]";
		this(toNumber, "[]");
		System.out.println("1 arg constraction");
	}
	public String getToNumber() {
		return toNumber;
	}
	public void setToNumber(String toNumber) {
		this.toNumber = toNumber;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public boolean isDelivared() {
		return delivared;
	}
	public void setDelivared(boolean delivared) {
		this.delivared = delivared;
	}
	
	@Override
	public String toString() {
		return "WhatsApp [toNumber=" + toNumber + ", message=" + message + ", delivared=" + delivared + "]";
	}
	
	
	
	

}
