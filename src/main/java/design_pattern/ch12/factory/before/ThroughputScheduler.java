package design_pattern.ch12.factory.before;

import com.sun.javafx.scene.traversal.Direction;

public class ThroughputScheduler {
	public int selectElevator(ElevatorManager manager, 
			int destination, Direction direction){
		return (int)(Math.random()*3);
	}
}
