package Day12;
import java.util.*;
public class WeatherJava {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("How is the weather today?");
		String weather =  s.next();
		
		switch(weather){
		case "sunny":
		    System.out.println("Go to Park");
		    System.out.println("Code Java");
		break;
		case "hot":
			 System.out.println("Go Swimming");
			    System.out.println("Code Java");
		break;
		case "windy":
			 System.out.println("Fly a kite");
			    System.out.println("Code Java");
		break;
		case "rainy":
			 System.out.println("Go shopping");
			    System.out.println("Code Java");
	    break;
		case "snow":
		    System.out.println("Chain your tyres");
		    System.out.println("Code Java");
		    System.out.println("Go skiing");
		    break;
		
		default:
			System.out.println("Code Java in any other weather!");
			break;
		}
		System.out.println("###### END THE PROGRAM #####");
		

	}

}
