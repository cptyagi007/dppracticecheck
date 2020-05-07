package com.practice.factory;

public class MiniCar extends Car {

	MiniCar(Location location) {
		super(CarType.MINI, location);
		// TODO Auto-generated constructor stub
		construct();
	}

	@Override
	void construct() {
		// TODO Auto-generated method stub
		System.out.println("Connecting to Mini car");
	}

}
