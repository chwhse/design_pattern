package design_pattern.ch11.template.before;

import com.sun.javafx.scene.traversal.Direction;

public abstract class Motor {
	private Door door;
	private MotorStatus motorStatus;
	
	public Motor(Door door) {
		this.door = door;
		motorStatus = MotorStatus.STOPPED;
	}
	
	public MotorStatus getMotorStatus() {
		return motorStatus;
	}

	protected void setMotorStatus(MotorStatus motorStatus) {
		this.motorStatus = motorStatus;
	}
	
	public void move(Direction direction){	// template Method
		MotorStatus motorStatus = getMotorStatus();
		if(motorStatus == MotorStatus.MOVING){
			return;
		}
		
		DoorStatus doorStatus = door.getDoorStatus();
		if(doorStatus == DoorStatus.OPENED){
			door.close();
		}
		
		moveMotor(direction);	// hook Method
		setMotorStatus(MotorStatus.MOVING);
	};
	

	protected abstract void moveMotor(Direction direction);
	
	@Override
	public 	abstract String toString();	
	
}
