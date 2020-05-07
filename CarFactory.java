package com.practice.factory;

public class CarFactory {
	public static Car buildCar(CarType model, Location location) {
		if (model.toString().equalsIgnoreCase("Luxry")) {
			return new LuxryCar(location);
		}
		if (model.toString().equalsIgnoreCase("Mini")) {
			return new MiniCar(location);
		}
		if (model.toString().equalsIgnoreCase("Micro")) {
			return new MicroCar(location);
		}
		return null;
	}
}
