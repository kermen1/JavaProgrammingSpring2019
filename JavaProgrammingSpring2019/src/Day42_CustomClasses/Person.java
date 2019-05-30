package Day42_CustomClasses;

public class Person {
//declare name and age encapsulated data
	private String name;
	private int age;
//	public static void main(String[] args) {
	//Person p1 = new Person();
	//p1.age =1;
	//p1.name = "jim";
  
	
	
	//public getter and setter methods for name
	//read only
	public String getName() {
		
		return name;
	}
	//write only-void
	public void setName(String name) {
		this.name = name;
	}
}