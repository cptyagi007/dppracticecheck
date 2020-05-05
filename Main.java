package com.clas.implementation;

public class Main {
 
	
	public static void main(String... m) {
		JohnObserver j=new JohnObserver();
		SteveObserver s=new SteveObserver();
		
		NotificationService ser=new NotificationService();
		ser.AddSubscriber(j);
		ser.AddSubscriber(s);
		ser.NotifySubscriber();
		ser.RemoveSubscriber(s);
	}
}
