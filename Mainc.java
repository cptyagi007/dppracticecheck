package com.clas.implementation;

public class Mainc {
 
	
	public static void main(String... m) {
		Admin j=new Admin();
		NotificationService ser=new NotificationService();
		ser.AddSubscriber(j);
		ser.NotifySubscriber();
		ser.RemoveSubscriber(j);
	}
}
