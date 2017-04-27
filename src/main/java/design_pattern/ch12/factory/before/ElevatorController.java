package design_pattern.ch12.factory.before;

public class ElevatorController {
	private int id;
	private int curFloor;
	
	public ElevatorController(int id){
		this.id = id;
		this.curFloor = 1;
	}
	
	public void gotoFloor(int destination){
		System.out.printf("Elevator [%d] Floor:%d",id,curFloor);
		curFloor = destination;
		System.out.printf("==> %d%n", curFloor);
	}
	
	


}

