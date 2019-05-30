package Day50_inheritance03;

public class TestAnimals {

	public static void main(String[] args) {
		Animals an = new Animals();
		Cat cat = new Cat();
		Dog dog = new Dog();
		Duck duck = new Duck();
		
		an.speak();
		cat.speak();
		dog.speak();
		duck.speak();

		an.move(100);
		cat.move(300);
		dog.move(235);
		duck.move(343);
		
		

	}

}
