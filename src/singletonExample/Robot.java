package singletonExample;

public class Robot {

	public static void main(String[] args) {
		//bad possibility:
//		RobotDrivetrain rd = new RobotDrivetrain();
//		//some code
//		RobotDrivetrain rd1 = new RobotDrivetrain();
//		
//		rd.moveForward();
//		rd1.moveBackward();
		
		RobotDrivertrain rd = RobotDrivertrain.getInstance();
		//this is going to reference the same RD instance
		RobotDrivertrain rd1 = RobotDrivertrain.getInstance();
		
		rd.moveForward();
		rd.moveBackward();
	}

}