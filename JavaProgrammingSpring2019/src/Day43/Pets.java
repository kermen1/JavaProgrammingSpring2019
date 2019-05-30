package Day43;

public class Pets {

	public static void main(String[] args) {
		pet pet1 = new pet("Dog","Poohchi");
		pet pet2 = new pet("Cat","Barsik");
		pet pet3 = new pet("Cat","Mila");
		pet pet4 = new pet("Goat","Kozlik");
		pet pet5 = new pet("Bird","Mina | Chika");
		
		pet1.speak();
		pet2.speak();
		pet3.speak();
		pet4.speak();
		pet5.speak();
		
		System.out.println(pet1.toString());
		System.out.println(pet2.toString());
		System.out.println(pet3.toString());
		System.out.println(pet4.toString());
		System.out.println(pet5.toString());

	}

}
