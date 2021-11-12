package com.qa.garage.equipment;

import com.qa.vehicles.Vehicle;

public class Lift {

	private Vehicle lifted;

	public void lift(Vehicle v) {
		this.lifted = v;
	}

	public void lower(Vehicle v) {
		this.lifted = null;
	}

}
