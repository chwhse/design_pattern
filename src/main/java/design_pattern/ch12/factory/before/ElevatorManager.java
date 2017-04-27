package design_pattern.ch12.factory.before;

import java.util.ArrayList;
import java.util.List;

import com.sun.javafx.scene.traversal.Direction;


public class ElevatorManager {
	private List<ElevatorController> controllers;
	private ThroughputScheduler scheduler;
	
	public ElevatorManager(int controllerCount) {
		controllers = new ArrayList<>();;
		for(int i=0; i<controllerCount; i++){
			controllers.add(new ElevatorController(i));
		}
		scheduler = new ThroughputScheduler();
	}
	
	public void requestElevator(int destination, Direction direction){
		int selectedElevator = scheduler.selectElevator(this,destination,direction);
		
		controllers.get(selectedElevator).gotoFloor(destination);
	}
	
}
