import classes.*;
public class Main{
	public static void main(String[] args) {
		Eater humain = new HumanWorker();
		Worker robot = new RobotWorker();
		humain.work();
		humain.eat();
		robot.work();
	}	
	
}