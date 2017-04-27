package design_pattern.ch13.absfactory.after;

public abstract class ElevatorFactory {
	public abstract Motor createMotor();
	public abstract Door createDoor();
}
