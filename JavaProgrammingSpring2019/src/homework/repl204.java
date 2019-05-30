package homework;

import java.util.Arrays;

public class repl204 {
	public static int[] populate(int[] r) 
	{
	  int count = 1;
		for(int i = 0; i <= r.length-1; i++){
    r[i] = count;
    count++;
}
		return r;
	}
	
	public static void main(String[] args) 
	{
	 
	  
    int [] i= new int[3]; 
    i= populate(i) ;
    System.out.println(Arrays.toString(i));

	}

}
