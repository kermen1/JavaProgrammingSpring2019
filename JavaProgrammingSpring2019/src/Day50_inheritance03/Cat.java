package Day50_inheritance03;

public class Cat extends Animals{
	 @Override
	public void speak(){
		System.out.println("Cat is saying Meow Meow");
	
	
}
	public void move(int steps) {
		System.out.println("Cat is moving "+steps+" steps");
	}

}
