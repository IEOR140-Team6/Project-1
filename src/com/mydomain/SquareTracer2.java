package com.mydomain;

import lejos.nxt.Motor;
import lejos.robotics.navigation.DifferentialPilot;
import lejos.util.Delay;

/* Project 1
 * Programmers Sherman Siu and MoonSoo Choi
 * IEOR 140 
 * 
 * Program Description: Tracing a square clockwise and counter-clockwise using DifferentialPilot
 */
public class SquareTracer2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DifferentialPilot Pilot = new DifferentialPilot((float)(56/25.4),4.8f,Motor.A,Motor.B,true);
		//setting up instance variable (Pilot) in DifferentialPilot class
		for (int i=1;i<=4;i++) //looping the robot to go 4 straight lines with a 90 degree right turn after each forward motion
		{
			Pilot.setTravelSpeed(5); //setting travel speed and rotation speed
			Pilot.setRotateSpeed(30);
			Pilot.travel(36); //robot travels 3 feet forward
			Pilot.stop();
			Delay.msDelay(300);
			Pilot.rotate(-90); //robot makes a 90 degree turn
			Pilot.stop();
			Delay.msDelay(300);
		}
		
		for (int j=1;j<=4;j++) { //robot will now complete the square backwards, travelling in the opposite direction
			Pilot.setTravelSpeed(5);
			Pilot.setRotateSpeed(30);
			Pilot.rotate(90); //robot rotates 90 degrees left
			Pilot.stop();
			Delay.msDelay(300);
			Pilot.travel(-36); //robot travels backwards for 36 inches
			Pilot.stop();
			Delay.msDelay(300);
		}
	}
}
