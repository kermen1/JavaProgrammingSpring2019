package Day25;

public class Shopping {

	public static void main(String[] args) {
		String[] products = {"Timberland Shoes","H&M Shirt","Swatch Watch","Gicci Bag","Adidas soks"};
		double[] prices = {120.0, 5.99, 150.50, 3000.5, 6.99};
		int[] itemsId = {12345, 2345, 3456, 4567,5678};
		//print count of products
		System.out.println("Products count: "+products.length);
		
		
		// check if products ,prices and itemsIds have same count
		
		if(products.length == prices.length && prices.length ==itemsId.length ) {
			System.out.println("Shopping list looks good");
		}else {
			System.out.println("Something is wrong in this list");
		}
		
		
		//loop though products and print each one in separate line
		
		for(String p:products) {
			System.out.println(p);
		}
		
		//prices --> for loop
		
		for(int i = 0; i<prices.length; i++) {
			System.out.println(prices[i]);
		}
		
		//itemsIds --> print this reverse orders
		
		for(int a = itemsId.length-1; a>0; a--) {
			System.out.println(itemsId[a]);
		}
		
		//print report.with a total price
		//Item 1 :1234 - timbeland shoes - $120.0
		//.......
		//total price:
		double totalprice = 0;
		for(int s =0; s <products.length;s++ ) {
			System.out.println("Item"+(s+1)+": "+itemsId[s]+" - "+products[s]+" - $"+prices[s]);
			  totalprice += prices[s];
			
		}
		
		System.out.println("Total prices: $"+totalprice);
		
		
		//Find the most expensuve item in your list and 
		double max =0; //Integer.MIN_VALUE;
		int maxIndex = 0;
		for(int j = 0;j<prices.length;j++) {
		if(prices[j]> max) {
			max = prices[j];
			maxIndex = j;
			
		}
		
		}

		System.out.println("Max value:" +max);
		
		
	}

}
