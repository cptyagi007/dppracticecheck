package com.clas.implementation;

import com.interfaces.contract.NotificationObserver;

public class Admin implements  NotificationObserver {

	@Override
	public void sendMessage() {
		// TODO Auto-generated method stub
		System.out.println(NotificationObserver.Name);
	}
	public String toString() {
		return "Admin";
	}
	

}
