package com.practice.factory;

public class CarClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(CarFactory.buildCar(CarType.MICRO, Location.USA));
		System.out.println(CarFactory.buildCar(CarType.MINI, Location.INDIA));
		System.out.println(CarFactory.buildCar(CarType.LUXURY, Location.DEFAULT));

	}

}
