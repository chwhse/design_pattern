package design_pattern.ch13.absfactory.after;

public class ElevatorFactoryFactory {
	public static ElevatorFactory getFactory(VendorID vendorID){
		ElevatorFactory factory= null;
		switch (vendorID) {
		case LG:
			factory= LGElevatorFactory.getIntence();
			break;
		case HYUNDAI:
			factory=HyundaiElevatorFactory.getIntence();
			break;
		case SAMSUNG:
			factory=SamsungElevatorFactory.getIntence();
			break;
		}
		return factory;
	}
}
