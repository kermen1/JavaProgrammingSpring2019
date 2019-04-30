package homework;
import java.util.Scanner;
public class wether {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String day, weather; 
		double time;
		System.out.println("Enter what day it is");
		day = scan.next();
		System.out.println("How is the weather outside");
		weather = scan.next();
		System.out.println("what time is it?");
		time = scan.nextDouble();
		switch(day) {
		case "monday":
		switch(weather) {
		case "rainy":
		if(time == 7) {
		System.out.println("time to wake up!, I have to got work!");
		}
		else if(time == 9) {
		System.out.println("time for the standup meeting");
		}
		else if(time >= 10 && time < 12) {
		if(time == 10) {
		System.out.println("doing test cases at work");
		}
		else if(time == 11) {
		System.out.println("one more hour to go for lunch break");
		}
		else {
		System.out.println("time for lunch!");
		}
		}
		else if(time >= 12 && time < 1) {
		System.out.println("yumm this Strawberry tastes");
		}
		else if(time >= 1 && time < 3) {
		if(time >= 1 && time < 2.30) {
		System.out.println("doing grooming session");
		}
		else { 
		System.out.println("thank god this grooming session is over!");
		}
		}
		else if(time >= 3 && time <= 5) {
		if(time >= 3 && time <= 4.99) {
		System.out.println("doing test cases, but it's almost time to go home");
		}
		}
		else if(time >= 5 && time <= 6) {
		System.out.println("home sweet home");
		}
		else if(time > 6 && time <=7) {
		System.out.println("time to plan something to do tonight");
		}
		else if(time > 7 && time < 10.30) {
		System.out.println("watching tv");
		}
		else {
		System.out.println("time to sleep");
		}
		break;
		case "sunny":
		if(time == 7) {
		System.out.println("time to wake up!, I have to got work!");
		}
		else if(time == 9) {
		System.out.println("time for the standup meeting");
		}
		else if(time >= 10 && time < 12) {
		if(time == 10) {
		System.out.println("doing test cases at work");
		}
		else if(time == 11) {
		System.out.println("one more hour to go for lunch break");
		}
		else {
		System.out.println("time for lunch!");
		}
		}
		else if(time >= 12 && time < 1) {
		System.out.println("yumm this Strawberry tastes");
		}
		else if(time >= 1 && time < 3) {
		if(time >= 1 && time < 2.30) {
		System.out.println("doing grooming session");
		}
		else { 
		System.out.println("thank god this grooming session is over!");
		}
		}
		else if(time >= 3 && time <= 5) {
		if(time >= 3 && time <= 4.99) {
		System.out.println("doing test cases, but it's almost time to go home");
		}
		}
		else if(time >= 5 && time <= 6) {
		System.out.println("home sweet home");
		}
		else if(time > 6 && time <=7) {
		System.out.println("time to plan something to do tonight");
		}
		else if(time > 7 && time < 10.30) {
		System.out.println("watching tv");
		}
		else {
		System.out.println("time to sleep");
		}
		break;
		case "windy": 
		if(time == 7) {
		System.out.println("time to wake up!, I have to got work!");
		}
		else if(time == 9) {
		System.out.println("time for the standup meeting");
		}
		else if(time >= 10 && time < 12) {
		if(time == 10) {
		System.out.println("doing test cases at work");
		}
		else if(time == 11) {
		System.out.println("one more hour to go for lunch break");
		}
		else {
		System.out.println("time for lunch!");
		}
		}
		else if(time >= 12 && time < 1) {
		System.out.println("yumm this Strawberry tastes");
		}
		else if(time >= 1 && time < 3) {
		if(time >= 1 && time < 2.30) {
		System.out.println("doing grooming session");
		}
		else { 
		System.out.println("thank god this grooming session is over!");
		}
		}
		else if(time >= 3 && time <= 5) {
		if(time >= 3 && time <= 4.99) {
		System.out.println("doing test cases, but it's almost time to go home");
		}
		}
		else if(time >= 5 && time <= 6) {
		System.out.println("home sweet home");
		}
		else if(time > 6 && time <=7) {
		System.out.println("time to plan something to do tonight");
		}
		else if(time > 7 && time < 10.30) {
		System.out.println("watching tv");
		}
		else {
		System.out.println("time to sleep");
		}
		break;
		}
		}

	}

}
