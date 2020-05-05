package com.clas.implementation;

import java.util.ArrayList;
import java.util.List;

import com.interfaces.contract.NotificationObserver;
import com.interfaces.contract.INotificationService;

public class NotificationService implements INotificationService {

	private List<NotificationObserver> observers;
	
	public NotificationService(){
		this.observers=new ArrayList<>();
	}
	
	public void AddSubscriber(NotificationObserver ob) {
		if(ob == null) throw new NullPointerException("Null Observer");
		
		if(!observers.contains(ob)) {
			
			observers.add(ob);
			for(NotificationObserver o:observers)
			   System.out.println(o);
		}
		
	}
	
	public void RemoveSubscriber(NotificationObserver ob) {
		
		observers.remove(ob);
		for(NotificationObserver o:observers)
			   System.out.println(o);
		
	}
	 public void NotifySubscriber() {
		 List<NotificationObserver> observersLocal = null;
			
			observersLocal = new ArrayList<>(this.observers);
			for (NotificationObserver obj : observersLocal) {
				obj.sendMessage();
			}

	 }
}
