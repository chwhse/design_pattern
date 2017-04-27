package design_pattern.ch12.factory.after;

import com.sun.javafx.scene.traversal.Direction;

public class ResponseTimeScheduler implements ElevatorScheduler {
	private static final ResponseTimeScheduler instance = new ResponseTimeScheduler();
	public static ResponseTimeScheduler getinstance(){
		return instance;
	}
	
	@Override
	public int selectElevator(ElevatorManager manager, 
			int destination, Direction direction) {
		return (int)(Math.random()*3);
	}

	@Override
	public String toString() {
		return String.format("ResponseTimeScheduler "+hashCode());
	}
	
}
