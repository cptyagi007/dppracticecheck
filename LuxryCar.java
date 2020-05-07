package com.practice.factory;

public class LuxryCar extends Car {

	LuxryCar(Location location) {
		super(CarType.LUXURY, location);
		construct();
	}

	@Override
	protected void construct() {
		// TODO Auto-generated method stub
		System.out.println("Connecting to luxury car");
	}

}
