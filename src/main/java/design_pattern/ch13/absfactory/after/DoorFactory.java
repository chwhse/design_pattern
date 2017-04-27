package design_pattern.ch13.absfactory.after;

public class DoorFactory {
	
	public static Door createDoor(VendorID vendorID){
		Door door= null;
		
		switch (vendorID) {
		case LG:
			door= new LgDoor();
			break;
		case HYUNDAI:
			door= new HyundaiDoor();
			break;
		}
		return door;
	}
	
}
