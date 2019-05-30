package Day48;
   ///Employee IS -A    Person
public class Employee extends Person{
	String jobTitle;
	
	public void work() {
		System.out.println(name +" is working as "+jobTitle);
	}

	@Override
	public String toString() {
		return "Employee [jobTitle=" + jobTitle + ", name=" + name + ", age=" + age + ", gender=" + gender
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	
	

}
