package Day48;

public class School {

	public static void main(String[] args) {
		 Person person = new Person();
		 Student student = new Student();
		 
		 person.name = "Obama";
		 person.age = 57;
		 person.gender = 'm';
		 
		 student.name = "Roman";
		 student.age = 30;
		 student.gender = 'm';;
		 
		 person.eat("steak");
		 student.eat("grechka");
		 
		 person.walk();
		 student.walk();
		 
		 person.sleep(8);
		 student.sleep(6);
		 
		 Student student2 = new Student();
		 student2.name = "Roman";
		 student2.age = 40;
		 student2.gender = 'm';
		 student.studentID = 4040;
		 student.clazz = "Agile Scrum";
		
		 student2.code("Java");
		 student2.attendClass();
		 student2.eat("kebob");
		 student2.walk();
		 
		 student.code("Python");
		 student.attendClass();
		 

	}

}
