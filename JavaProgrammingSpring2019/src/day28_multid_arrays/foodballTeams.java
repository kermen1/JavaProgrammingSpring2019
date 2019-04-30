package day28_multid_arrays;

import java.util.Arrays;

public class foodballTeams {

	public static void main(String[] args) {
		//declare MultiD array with 2 rows and 6 coals
		String[][] teams = new String[2][6];
		teams[0][0]= "Irina";
		teams[0][1]= "Zarif";
		teams[0][2]= "Cihan";
		teams[0][3]= "Habib";
		teams[0][4]= "Adel";
		teams[0][5]= "Bojan";
		
		teams[1][0]= "Olimdjon";
		teams[1][1]= "Mirshod";
		teams[1][2]= "Usman";
		teams[1][3]= "Nursultan";
		teams[1][4]= "Roman";
		teams[1][5]= "Dmitriy";
		
		
		System.out.println("First player of first team: ");
		System.out.println(teams[0][0]);
		System.out.println(teams[0][3]);//Habib
		System.out.println(teams[1][5]);//Dmitriy
		//print how many rows/teams/arrays
		System.out.println("Number of rows: "+ teams.length);
		System.out.println("People of in first teams: "+ teams[0].length);
		System.out.println("People of in second teams: "+ teams[1].length);
		System.out.println(Arrays.deepToString(teams));
		
		
		int[][] s1 =  new int[3][4];
		s1[0][0]= 100;
		s1[0][1]= 500;
		s1[0][2]= 1234;
		s1[0][3]= 5434;
		
		s1[1][0]= 545;
		s1[1][1]= 34444;
		s1[1][2]= 56666;
		s1[1][3]= 677777;
		
		
		s1[2][0]= 54;
		s1[2][1]= 764;
		s1[2][2]= 98965;
		s1[2][3]= 876;
		
		System.out.println(Arrays.deepToString(s1));
		System.out.println(Arrays.toString(s1[0]));
		
		int[][] scores= { {3,5,10} , {6,7,2} };
		System.out.println("days played/Number of arrays: "+scores.length);
		System.out.println("Number of values in 1: "+scores[0].length);
		System.out.println("Number of values in 2: "+scores[1].length);
		
		
		int[][] values = new int[4][];
		values[0] = new int[]{34,23,5};
		values[1] = new int[]{34,45,6,5,34,2,2,43,45,56,567,3};
		
		values[2] = new int[2];//55, 88
		values[2][0] = 55; 
		values[2][1] = 88;
		
		values[3] = new int[]{5,12,45,77,34};
		
		System.out.println(Arrays.deepToString(values));
		

	}

}
