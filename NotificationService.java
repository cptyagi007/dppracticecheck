package com.clas.implementation;

import java.util.ArrayList;
import java.util.List;

import com.interfaces.contract.INotificationObserver;
import com.interfaces.contract.INotificationService;

public class NotificationService implements INotificationService {

	private List<INotificationObserver> observers;
	private boolean changed;
	
	public NotificationService(){
		this.observers=new ArrayList<>();
	}
	
	public void AddSubscriber(INotificationObserver ob) {
		if(ob == null) throw new NullPointerException("Null Observer");
		
		if(!observers.contains(ob)) {
			
			observers.add(ob);
			for(INotificationObserver o:observers)
			   System.out.println(o);
		}
		
	}
	
	public void RemoveSubscriber(INotificationObserver ob) {
		
		observers.remove(ob);
		for(INotificationObserver o:observers)
			   System.out.println(o);
		
	}
	 public void NotifySubscriber() {
		 List<INotificationObserver> observersLocal = null;
			
			observersLocal = new ArrayList<>(this.observers);
			for (INotificationObserver obj : observersLocal) {
				obj.OnServerDown();
			}

	 }
}
