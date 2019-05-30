package Day43;

public class pet {
    private String type;
    private String name;
    
    public pet(String type,String name) {
    	this.type = type;
    	this.name = name;
    }
    public pet() {
    	System.out.println("No-args constructor");
    
    }
    public void  speak() {
    	switch(type.toLowerCase()) {
    	case "cat":
    		System.out.println("Myauu");
    		break;
    	case "dog":
    		System.out.println("gav gav|| woof woof || wow waw");
    		break;
    	case "bird":
    		System.out.println("Chick chirik");
    		break;
    	case "goat":
    		System.out.println("mhaaaa mhaaaa");
    		break;
    	case "sheep":
    		System.out.println("bhaaaa bhaaaa");
    		break;
    	case "rooster":
    		System.out.println("u uruuuu uuuuu");
    		break;
    		default:
    			System.out.println("........");
    	}
    }
    	
   
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return "pet [type=" + type + ", name=" + name + "]";
	}
}
