package design_pattern.ch13.absfactory.after;

public class SamsungElevatorFactory extends ElevatorFactory {
	public static final SamsungElevatorFactory intence= new SamsungElevatorFactory();
	
	private SamsungElevatorFactory() {}

	
	public static SamsungElevatorFactory getIntence() {
		return intence;
	}


	@Override
	public Motor createMotor() {
		return new SamsungMotor();
	}

	@Override
	public Door createDoor() {
		return new SamsungDoor();
	}

}
