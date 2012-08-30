package com.mydomain;

import lejos.nxt.Motor;
import lejos.robotics.navigation.DifferentialPilot;
import lejos.util.Delay;

/* Project 1
 * Programmers Sherman Siu and MoonSoo Choi
 * IEOR 140 
 * 
 * Program Description: tracing various shapes, including triangle, pentagon, semi-circle, and quarter-circle
 */
public class GeometryTracer 
{

	/**
	 * @param args
	 */
	
	// main method
	public static void main(String[] args)
	{
		DifferentialPilot Pilot1 = new DifferentialPilot((float)(56/25.4),4.8f,Motor.A,Motor.B,true);
		DifferentialPilot Pilot2 = new DifferentialPilot((float)(56/25.4),4.8f,Motor.B,Motor.A,true);
		polygon(Pilot1);
		circle(Pilot1,Pilot2);
		
		/*
		 * We created two instance variables of DifferentialPilot class for 'circle' method, because
		 * while the robot is tracing semi-circle counter-clockwise, the robot is tracing 
		 * quarter-circle clockwise, so we switched Motor A and Motor B for Pilot 1 and Pilot 2.
		 */
	}

	//polygon method: traces a triangle and a pentagon, and takes a DifferentialPilot object as method input
	public static void polygon(DifferentialPilot Pilot1)
	{
		// Triangle: having three sides, so for-loop goes from 1 to 3
		for (int i=1; i<=3; i++) 
		{
			Pilot1.setTravelSpeed(5); // setting the travel and rotation speed for the robot
			Pilot1.setRotateSpeed(30);
			Pilot1.travel(24); //robot travels 2 feet forward
			Pilot1.stop();
			Delay.msDelay(300);
			Pilot1.rotate(120); //robot rotates left to form a 60 degree interior angle
			Pilot1.stop();
			Delay.msDelay(300);
		}
		Delay.msDelay(1300);
		
		
		// Pentagon: having five sides, so for-loop goes from 1 to 5
		for (int i=1; i<=5; i++)
		{
			Pilot1.setTravelSpeed(5); // setting the travel and rotation speed for the robot
			Pilot1.setRotateSpeed(30);
			Pilot1.travel(24); //robot travels 2 feet forward
			Pilot1.stop();
			Delay.msDelay(300);
			Pilot1.rotate(72); //robot rotates left to form 108 interior angle of pentagon
			Pilot1.stop();
			Delay.msDelay(300);
		}
		Delay.msDelay(1300);
	}
	
	//circle method: traces a semi-circle and a quarter circle
	// and takes two DifferentialPilot objects as method input
	public static void circle(DifferentialPilot Pilot1, DifferentialPilot Pilot2)
	{
		// Semi-Circle
		Pilot1.setTravelSpeed(5); // first drawing the arc for the semi-circle
		Pilot1.arc(36,180); //robot arcs left for 180 degrees, guided by a 36 inch radius
		Pilot1.stop();
		Delay.msDelay(300);
		Pilot1.setRotateSpeed(30);
		Pilot1.rotate(90); //robot makes a 90 degree left turn
		Pilot1.stop();
		Delay.msDelay(300);
		Pilot1.setTravelSpeed(5); 
		Pilot1.travel(72); // here, we're closing up the semi-circle (that is, tracing diameter of the circle)
		
		Delay.msDelay(1300);
		
		// Quarter-Circle
		Pilot2.setTravelSpeed(5);
		Pilot2.arc(12,90); //robot arcs right for 90 degree (so forms 1/4 of circle)
		Pilot2.stop();
		Delay.msDelay(300);
		
		// loop to close up the quarter circle
		for (int l=1;l<=2;l++) 
		{
			Pilot2.setRotateSpeed(30);
			Pilot2.rotate(90); //robot makes a 90 degree right turn
			Pilot2.stop();
			Delay.msDelay(300);
			Pilot2.setTravelSpeed(5);
			Pilot2.travel(12); //robot goes forward for 12 in (the radius of circle)
			Pilot2.stop();
			Delay.msDelay(300);
		}

	}

}
