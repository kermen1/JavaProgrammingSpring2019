package homework;

import java.util.ArrayList;
import java.util.List;

public class repl188 {

	public static void main(String[] args) {
		ArrayList<String> wordList = new ArrayList<String>();
		wordList.add("hi");
		wordList.add("hey");
		wordList.add("hello");
		wordList.add("hi");
		System.out.println(removeAll(wordList, "hi"));
		ArrayList<String> wordList1 = new ArrayList<String>();
		ArrayList<String> wordList2 = new ArrayList<String>();
		wordList1.add("hi");
		wordList1.add("hey");
		wordList2.add("hello");
		wordList2.add("hi");
		System.out.println(combineAL(wordList1, wordList2));
		ArrayList<Integer> w = new ArrayList<>();
		w.add(-9);
		w.add(7);
		w.add(2);
		w.add(-1);
		appendPosSum(w);
		ArrayList<Integer> nums = new ArrayList<>();
		nums.add(1);
		nums.add(7);
		nums.add(2);
		nums.add(3);
		timesTwo(nums);

	}
	public static ArrayList<String> removeAll(ArrayList<String> wordList, String targetWord){
		  
		
	ArrayList<String> s = new ArrayList<String>();
	
	 for(String str : wordList) {
         s.add(str);
         
     }
	 
 s.removeAll(wordList);
	
	return s;
	}
	public static ArrayList<String> combineAL(ArrayList<String> wordList1, ArrayList<String> wordList2){
		  
		
		ArrayList<String> s = new ArrayList<String>();
		
		 for(String str : wordList1) {
	         s.add(str);
	         
	     }
		 for(String str : wordList2) {
	         s.add(str);
	         
	     }
		 
	System.out.println(s);
		
		return s;
}
public static ArrayList<Integer> appendPosSum(ArrayList<Integer> w){
		  
		
		ArrayList<Integer> s = new ArrayList<>();
		
		int sum=0;
		 for(int str : w) {
			 if(str>0) {
		      sum+=str;
	         s.add(str);
			 }
	     }
		 
		 s.add(sum);
	System.out.println(s);
		
		return s;
}	public static ArrayList<Integer> timesTwo(ArrayList<Integer> nums){
	  ArrayList<Integer> s = new ArrayList<>();
		
		int sum=0;
		 for(int str : nums) {
			 
		      sum = str*2;
	         s.add(sum);
			 
	     }
		 System.out.println(s);
	     return s;
}
}