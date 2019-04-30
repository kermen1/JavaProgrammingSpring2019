package Day07;

public class PreAndPost {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int num = 0;
		int num2 = num++;
		System.out.println("num: "+ num);
		System.out.println("num2: "+ num2);
		
		
		int n = 20;
		int n2 = ++n;
		
		System.out.println("n: "+ n);
		System.out.println("n2: "+ n2);
		
		int i = 10;
		++i;//add 1
		i++;//add 1
		
		System.out.println("I value: "+ i);
		
		int bananas = 6;//6
		int apples = ++bananas;//7=>apples-7
		int pears = bananas++;//pears -7,bananas-8
		
		
		System.out.println("bananas: "+ bananas);
		System.out.println("apples: "+ apples);
		System.out.println("pears: "+ pears);
		
		
		int friends = 10;
		System.out.println(++friends);
		System.out.println(friends);
		
		
		int p1 = 10;
		int sum = p1++ +5;
		
		
		System.out.println("sum: " + sum);
		System.out.println("p1:" + p1);
		//p1 + 5 and assign to sum
		//p = p +1
		  
		
		
		int batteries = 8;
		int oldBatteries = 5; 
		          //14           //8     +        6
		int totalBatteries = batteries++ + ++oldBatteries;
		
		System.out.println("batteries: " + batteries);//9
		System.out.println("oldBatteries: " + oldBatteries);//6
		System.out.println("totalBatteries: " + totalBatteries);//14
		
		
		
		
		
		

	}

}
