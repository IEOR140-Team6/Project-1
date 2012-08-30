package com.mydomain;

import lejos.nxt.Motor;
import lejos.robotics.navigation.DifferentialPilot;
import lejos.util.Delay;

public class PolygonHelp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DifferentialPilot Pilot = new DifferentialPilot((float)(56/25.4),4.8f,Motor.A,Motor.B,true);
			Pilot.setTravelSpeed(5);
			Pilot.arc(36,180);
			Pilot.stop();
			Delay.msDelay(300);
			Pilot.setRotateSpeed(30);
			Pilot.rotate(90);
			Pilot.stop();
			Delay.msDelay(300);
			Pilot.setTravelSpeed(5);
			Pilot.travel(36);
			
		DifferentialPilot pilot = new DifferentialPilot((float)(56/25.4),4.7f,Motor.B,Motor.A,true);
			pilot.setTravelSpeed(5);
			pilot.arc(12,90);
			pilot.stop();
			Delay.msDelay(300);
			for (int l=1;l<3;l++) {
				pilot.setRotateSpeed(30);
				pilot.rotate(90);
				pilot.stop();
				Delay.msDelay(300);
				pilot.setTravelSpeed(5);
				pilot.travel(12);
				pilot.stop();
				Delay.msDelay(300);
			}
	}

}
