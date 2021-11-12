package com.qa;

import java.util.LinkedList;

import com.qa.garage.Garage;
import com.qa.garage.equipment.Lift;
import com.qa.vehicles.land.Motorbike;
import com.qa.vehicles.land.Tank;
import com.qa.vehicles.sea.Submarine;

public class App {

	public static void main(String[] args) {

		Lift lift = new Lift();

		Garage garage = new Garage(new LinkedList<>());

		garage.addVehicle(new Motorbike(2, 200, false));

		System.out.println(garage.removeVehicle(1));

		garage.addVehicle(new Tank(3, 35, 46));
		garage.addVehicle(new Tank(57, 47, 3636));
		garage.addVehicle(new Tank(46, 75, 47));

		garage.addVehicle(new Submarine(0, 600, 6));
		garage.addVehicle(new Submarine(0, 600, 6));
//		garage.removeVehicleByType("Tank");

		System.out.println(garage);
		System.out.println(garage.fix());

		garage.removeVehicleByType(Tank.class);
		System.out.println(garage);

		garage.empty();

		System.out.println(garage);

	}
}
