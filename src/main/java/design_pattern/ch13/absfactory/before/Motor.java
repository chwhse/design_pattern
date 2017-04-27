package design_pattern.ch13.absfactory.before;

import com.sun.javafx.scene.traversal.Direction;

public abstract class Motor {
	private MotorStatus motorStatus;
	private Door door;
	public Motor() {
		motorStatus = MotorStatus.STOPPED;
	}
	public MotorStatus getMotorStatus() {
		return motorStatus;
	}
	public void setMotorStatus(MotorStatus motorStatus) {
		this.motorStatus = motorStatus;
	}
	public void setDoor(Door door) {
		this.door = door;
	}
	
	public void move(Direction direction){
		if(motorStatus == MotorStatus.MOVING){
			return;
		}else if(door.getDoorStatus() == DoorStatus.OPENED){
			door.close();
		}
		moveMotor(direction);
		motorStatus = motorStatus.MOVING;
	}
	protected abstract void moveMotor(Direction direction);
	
	
}
