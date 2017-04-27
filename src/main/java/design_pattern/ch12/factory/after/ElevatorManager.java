package design_pattern.ch12.factory.after;

import java.util.ArrayList;
import java.util.List;

import com.sun.javafx.scene.traversal.Direction;


public class ElevatorManager {
	private List<ElevatorController> controllers;
	private SchedulingStrategyID strategyID;
	
	public ElevatorManager(int controllerCount, SchedulingStrategyID strategyID) {
		controllers = new ArrayList<>();;
		for(int i=0; i<controllerCount; i++){
			controllers.add(new ElevatorController(i));
		}
		this.strategyID = strategyID;
	}
	
	public void requestElevator(int destination, Direction direction){
		ElevatorScheduler scheduler = SchedulerFactory.getscheduler(strategyID);
		System.out.println(scheduler);
		int selectedElevator = scheduler.selectElevator(this,destination,direction);
		
		controllers.get(selectedElevator).gotoFloor(destination);
	}
	
}
