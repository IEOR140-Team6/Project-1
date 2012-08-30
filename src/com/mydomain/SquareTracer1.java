package com.mydomain;

import lejos.nxt.Motor;
import lejos.util.Delay;

/* Project 1
 * Programmers Sherman Siu and MoonSoo Choi
 * IEOR 140 
 * 
 * Program Description: Tracing a square clockwise and counter-clockwise
 */
public class SquareTracer1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int NumberofSides = 4;
		float trackWidth = 4.81f;
		float wheelDiameter = (float)(56/25.4);
		int revs = (int)(180*2*trackWidth/(NumberofSides*wheelDiameter)); // calculating revolution required for a turn
		int dis = (int)(360*36/(wheelDiameter*Math.PI)); // calculating amount of distances that robot has to travel

		for (int i=1;i<=4;i++) {
			Motor.A.setAcceleration(1000); // setting acceleration for motor A and B
			Motor.B.setAcceleration(1000);
			Motor.A.setSpeed(500); // setting speed
			Motor.B.setSpeed(500);
			Motor.A.rotate(-dis,true); // make the robot go forward
			Motor.B.rotate(-dis);
			Motor.A.forward();
			Motor.B.forward();
			Motor.A.stop();
			Motor.B.stop();
			Delay.msDelay(500); // make the robot stop for a second on a corner of the square
			Motor.A.rotate(-revs,true); // make the robot rotate in place
			Motor.B.rotate(revs);
		}
		
		Motor.A.rotate(revs,true);
		Motor.B.rotate(-revs);
		
		// same as above, except this time we're tracing the square counter-clockwise instead of clockwise
		for (int i=1;i<=4;i++) {
			Motor.A.setAcceleration(1000);
			Motor.B.setAcceleration(1000);
			Motor.A.setSpeed(500);
			Motor.B.setSpeed(500);
			Motor.A.rotate(dis,true);
			Motor.B.rotate(dis);
			Motor.A.backward();
			Motor.B.backward();
			Motor.A.stop();
			Motor.B.stop();
			Delay.msDelay(500);
			Motor.A.rotate(revs,true);
			Motor.B.rotate(-revs);
		}
		
	}

}
