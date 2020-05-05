package com.clas.implementation;

import com.interfaces.contract.INotificationObserver;

public class SteveObserver implements  INotificationObserver {

	@Override
	public void OnServerDown() {
		// TODO Auto-generated method stub
		System.out.println(INotificationObserver.Name);
	}
	public String toString() { return "steve"; }

}
