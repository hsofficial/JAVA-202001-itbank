package ch12.test3;

import java.util.ArrayList;

public class RobotTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Robot> robotList = new ArrayList<Robot>();
		
		robotList.add(new SingRobot());
		robotList.add(new DanceRobot());
		robotList.add(new DrawRobot());
		robotList.add(new Robot());
		
		for(Robot robot : robotList) {
			action(robot);
		}
	}


	static void action(Robot r) {
				if(r instanceof DanceRobot)
					((DanceRobot) r).dance();
				else if(r instanceof SingRobot)
					((SingRobot) r).sing();
				else if(r instanceof DrawRobot)
					((DrawRobot) r).draw();
				else
					System.out.println("stop");
			}
}