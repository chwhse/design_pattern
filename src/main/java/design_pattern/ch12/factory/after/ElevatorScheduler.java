package design_pattern.ch12.factory.after;

import com.sun.javafx.scene.traversal.Direction;

public interface ElevatorScheduler {
	public int selectElevator(ElevatorManager manager, 
			int destination, Direction direction);
	
	
}
