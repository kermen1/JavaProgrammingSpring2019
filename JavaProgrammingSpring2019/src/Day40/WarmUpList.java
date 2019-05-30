package Day40;

import java.util.ArrayList;

public class WarmUpList {

	public static void main(String[] args) {
		ArrayList<String> myList = new ArrayList<>();
		myList.add("Moon");
		myList.add("Sun");
		myList.add("Mars");
		myList.add("Saturn");
		myList.add("Venus");
		myList.add("Sun");
		myList.add("Earth");
		myList.add("Pluto");
		myList.add("Sun");
		myList.add("Netune");
		myList.add("Sun");
		
		String targetWord = "Sun";
		int count = countOccurences(myList, targetWord);
		if(count == 3) {
			System.out.println("Unit test Pass: Count is 3");
		}else {
			System.out.println("Unit test Fail: count is "+ count);
		}

	}
	//[aa, aa, bb, jj, yy]           aa
    public static int countOccurences(ArrayList<String> list, String word) {
        int count = 0;
        for(String str : list) {
            if(str.equals(word)) {
                count++;
            }
        }
        return count;
    }
    
}


