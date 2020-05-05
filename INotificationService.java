package com.interfaces.contract;

public interface INotificationService {

	public void AddSubscriber(INotificationObserver ob);
	public void RemoveSubscriber(INotificationObserver ob);
	 public void NotifySubscriber();
}
