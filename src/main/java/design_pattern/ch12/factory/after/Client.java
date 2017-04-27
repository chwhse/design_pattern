package design_pattern.ch12.factory.after;

import com.sun.javafx.scene.traversal.Direction;

public class Client {
	public static void main(String[] args) {
		
		ElevatorManager emWithResponseTimeScheduler = new ElevatorManager(3,SchedulingStrategyID.RESPONSE_TIME);
		emWithResponseTimeScheduler.requestElevator(10, Direction.UP);

		ElevatorManager emWithThroughtputScheduler = new ElevatorManager(3,SchedulingStrategyID.THROUGHPUT);
		emWithThroughtputScheduler.requestElevator(10, Direction.UP);
		
		ElevatorManager emWithDynamicScheduler = new ElevatorManager(3,SchedulingStrategyID.DYNAMIC);
		emWithDynamicScheduler.requestElevator(10, Direction.UP);
	}
	
}
