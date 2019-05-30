package homework;

public class repl178{
		  
		public static void main(String[] args) {
			reverse("kermen");
		
		  }
    public static int[] mergR(int[] a,int[] b) {
	int[] array1and2 = new int[a.length + b.length];
	int z = 0;

	for( int i = 0; i < a.length; i++) {
	    array1and2[z] = a[i];
	    z++;
	}

	for( int j = 0; j < b.length; j++) {
	    array1and2[z] = b[j];
	    z++;
	}//end mergR
	return array1and2;

}
    public static String reverse(String input)
	{
    	 String reverse = "";
         
         
         for(int i = input.length() - 1; i >= 0; i--)
         {
             reverse = reverse + input.charAt(i);
         }
         
         System.out.println("Reversed string is:");
         System.out.println(reverse);
	  return reverse; 
	}


}
