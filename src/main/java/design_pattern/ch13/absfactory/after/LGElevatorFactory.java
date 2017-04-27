package design_pattern.ch13.absfactory.after;

public class LGElevatorFactory extends ElevatorFactory {
	public static final LGElevatorFactory intence= new LGElevatorFactory();

	private LGElevatorFactory() {}


	public static LGElevatorFactory getIntence() {
		return intence;
	}
	@Override
	public Motor createMotor() {
		return new LGMotor();
	}

	@Override
	public Door createDoor() {
		return new LgDoor();
	}

}
