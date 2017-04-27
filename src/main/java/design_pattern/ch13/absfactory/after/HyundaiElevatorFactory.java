package design_pattern.ch13.absfactory.after;

public class HyundaiElevatorFactory extends ElevatorFactory {
	public static final HyundaiElevatorFactory intence= new HyundaiElevatorFactory();

	private HyundaiElevatorFactory() {}


	public static HyundaiElevatorFactory getIntence() {
		return intence;
	}
	@Override
	public Motor createMotor() {
		return new HyundaiMotor();
	}

	@Override
	public Door createDoor() {
		return new HyundaiDoor();
	}

}
