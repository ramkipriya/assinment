package singletonExample;
public class RobotDrivertrain {
private static RobotDrivertrain drive=null;

   private RobotDrivertrain(){
	   
		;
	}
   public static RobotDrivertrain getInstance(){
	   if(drive == null)
		   drive = new RobotDrivertrain();
		   
	return drive;
	   
   }
	
	public void moveForward() {
		;
	}
	
	public void moveBackward() {
		;
	}

	public void turnLeft() {
		;
	}
	
	public void turnRight() {
		;
	}

}