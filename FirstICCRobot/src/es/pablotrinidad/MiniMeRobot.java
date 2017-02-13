package es.pablotrinidad;

import robocode.Robot;
import robocode.ScannedRobotEvent;


public class MiniMeRobot extends Robot {

	@Override
	public void onScannedRobot(ScannedRobotEvent event) {
		fire(1.1);
	}

	@Override
	public void run() {
		setAdjustGunForRobotTurn(true);
		turnLeft(getHeading() % 90);
		turnGunRight(90);
		while(true) {
			ahead(1000);
			turnRight(90);		
		}
	}

}
