package com.interfaces.contract;

public interface NotificationServiceInterface {

	public void AddSubscriber(NotificationObserver ob);
	public void RemoveSubscriber(NotificationObserver ob);
	 public void NotifySubscriber();
}
