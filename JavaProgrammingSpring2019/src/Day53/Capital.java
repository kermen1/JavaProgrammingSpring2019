package Day53;

public class Capital extends City{
	
	private long population;
	public int count =1;
	
	public long getPopulation() {
		return population;
	}
	public static void buildARoad() {
		System.out.println("Capital City - building a road");
	}
	public void letsBuildARoad() {
		buildARoad();
	}
	public void displayCount() {
		System.out.println("City count: "+super.count);
		System.out.println("Capital count: "+count);
	}

	public void setPopulation(long population) {
		this.population = population;
	}

	public Capital(int id, String name, long population) {
		super(id, name);
		this.population=population;
	}
	
	public String toString() {
		return super.toString() +" population: "+
	+population +" countCap: "+count;
	}

}
