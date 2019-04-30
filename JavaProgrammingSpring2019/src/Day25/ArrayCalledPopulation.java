package Day25;

public class ArrayCalledPopulation {

	public static void main(String[] args) {
		int [] population = new int [5];
		population[0]=5000;
		population[1]=10000;
		population[2]=7000;
		population[3]=8907;
		population[4]=4455;
		
		//int [] population = {5000,10000,7000,8907,4455};
		
		System.out.println("City 0 population:"+population[0]);
		System.out.println("City 1 population:"+population[1]);
		System.out.println("City 2 population:"+population[2]);
		System.out.println("City 3 population:"+population[3]);
		System.out.println("City 4 population:"+population[4]);
		
		String str = "abc";
		System.out.println("City 1 population:"+population[str.length()]);
		
		
		//String array called cities= "Miami","London","Tokio","Rome","New York"
		
		
		String[] cities = { "Miami","London","Tokio","Rome","New York"};
		
		//populetion of Miami is 5000.
		
		System.out.println("Populetion of " +cities[0]+" is "+population[0]);
		System.out.println("Populetion of " +cities[1]+" is "+population[1]);
		System.out.println("Populetion of " +cities[2]+" is "+population[2]);
		System.out.println("Populetion of " +cities[3]+" is "+population[3]);
		System.out.println("Populetion of " +cities[4]+" is "+population[4]);
		
		
		
		

	}

}
