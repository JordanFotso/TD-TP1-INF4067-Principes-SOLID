import classes.*;
public class Main{
	public static void main(String[] args) {
		Worker humain = new HumanWorker();
		Worker robot = new RobotWorker();
		humain.work();
		humain.eat();
		robot.work();
		robot.eat();
	}	
	
}