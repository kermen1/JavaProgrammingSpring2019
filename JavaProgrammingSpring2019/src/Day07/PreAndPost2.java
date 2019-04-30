package Day07;

public class PreAndPost2 {

	public static void main(String[] args) {
		int messages = 10;
		messages++;//11
		++messages;//12
		System.out.println("Messages: " + messages);
		
		int readMessages = --messages;
		System.out.println("ReadMessages: " + readMessages);
		System.out.println("Messages: " + messages);

		     //11               //11
		int unreadMessages = readMessages--;
		
		System.out.println("unreadMessages: " + unreadMessages);//11
		System.out.println("ReadMessages: " + readMessages);//10
		                  //11       -     //10
		int total = unreadMessages++ - readMessages--;
		
		System.out.println("unreadMessages: " + unreadMessages);//12
		System.out.println("ReadMessages: " + readMessages);//9
		System.out.println("total: " + total);//1
		
		int count = 20;
		int count2 = 10;
		                  //21   +   9
		int totalCount = ++count + --count2;
		System.out.println("count1: " + count);//21
		System.out.println("count2: " + count2);//9
		System.out.println("total: " + totalCount);//30
		
		      //44       //21     +  23
		int myCount = count++ + ++count;
		
		System.out.println("count: "  + count);//30
		System.out.println("myCount: " + myCount);//44
		
		
		
		
		
		
		
		
		
	}

}
