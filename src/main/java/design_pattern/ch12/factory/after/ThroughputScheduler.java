package design_pattern.ch12.factory.after;

import com.sun.javafx.scene.traversal.Direction;

public class ThroughputScheduler implements ElevatorScheduler {
	private static final ThroughputScheduler instance = new ThroughputScheduler();
	public static ThroughputScheduler getInstance(){
		return instance;
	}
	
	@Override
	public int selectElevator(ElevatorManager manager, int destination, Direction direction) {
		return (int)(Math.random()*3);
	}

	@Override
	public String toString() {
		return String.format("ThroughputScheduler"+hashCode());
	}
	
	
}
