package com.mydomain;

import lejos.nxt.Button;
import lejos.nxt.Motor;
import lejos.util.Delay;

public class RobotExperiment {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	
	{
		//System.out.println("Please input number of sides for your polygon!");
		int Numberofsides = 4;
		
		float trackWidth = 4.5f;
		float wheelDiameter = 56/25.4f;
		//float ratio = (float) (trackWidth/wheelDiameter);
		int revs = (int)(360*2*trackWidth/(Numberofsides*wheelDiameter));
		int dis = (int)(180*24/(wheelDiameter*Math.PI));
		for(int i=1;i<=4;i++) 
		{
			
		Motor.A.rotate(dis,true);
		Motor.B.rotate(dis);
		Motor.A.setAcceleration(1000);  
		Motor.B.setAcceleration(1000);
		Motor.A.setSpeed(500);
		Motor.B.setSpeed(500);
		Motor.A.forward();
		Motor.B.forward();
		Motor.A.stop();
		Motor.B.stop();
		Delay.msDelay(500);
		Motor.A.rotate(-revs,true);
		Motor.B.rotate(revs);
	}
		// TODO Auto-generated method stub
		/*Motor.A.setSpeed(500);
		Motor.B.setSpeed(500);
		Motor.A.forward();
		Motor.B.forward();
		
		Delay.msDelay(2000);
		Motor.A.stop();
		Motor.B.stop();
		
		Motor.A.backward();
		Motor.B.backward();
		Delay.msDelay(2000);
		Motor.A.stop();
		Motor.B.stop();
		
		System.out.println(Motor.A.getTachoCount());
		System.out.println(Motor.B.getTachoCount());
		Motor.A.stop();
		Button.waitForAnyPress();*/
		
		/*Motor.A.rotate(720,true);
		Motor.B.rotate(720);
		System.out.println(Motor.A.getTachoCount());
		System.out.println(Motor.B.getTachoCount());
		Button.waitForAnyPress();*/
		
			
		 /*Motor.A.setAcceleration(6000);  // try again with acceleration 1000;
		 Motor.B.setAcceleration(6000);
		 Motor.A.setSpeed(700);
		 Motor.B.setSpeed(700); 
		 Motor.A.rotate(720,true);
		 Motor.B.rotate(720);
		 Delay.msDelay(2000);
		Motor.A.stop();
		Motor.B.stop();
		
	     Motor.A.setAcceleration(200000);  // try again with acceleration 1000;
		 Motor.B.setAcceleration(200000);
		 Motor.A.setSpeed(350);
		 Motor.B.setSpeed(350); 
		 Motor.A.rotate(720,true);
		 Motor.B.rotate(720);
		 Motor.A.stop();
		Motor.B.stop();*/
			
	     Button.waitForAnyPress();

		
	}
}
