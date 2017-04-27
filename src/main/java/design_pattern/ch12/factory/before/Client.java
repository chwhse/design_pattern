package design_pattern.ch12.factory.before;

import com.sun.javafx.scene.traversal.Direction;

public class Client {
	public static void main(String[] args) {
		
		ElevatorManager elevatorManager = new ElevatorManager(2);
		
		for(int i=1; i<6; i++){
			elevatorManager.requestElevator(10, Direction.UP);
		}
	}
}
