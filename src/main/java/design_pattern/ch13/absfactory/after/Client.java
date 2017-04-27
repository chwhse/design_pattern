package design_pattern.ch13.absfactory.after;

import com.sun.javafx.scene.traversal.Direction;

public class Client {
	public static void main(String[] args) {
		ElevatorFactory factory= null;
		VendorID vendorID;
		String venderName="SAMSUNG";
		if(venderName.equals("LG")){
			vendorID= VendorID.LG;
		}else if(venderName.equals("HYUNDAI")){
			vendorID= VendorID.HYUNDAI;
		}else{
			vendorID= VendorID.SAMSUNG;
		}
		factory= ElevatorFactoryFactory.getFactory(vendorID);
		Door door= factory.createDoor();
		Motor motor= factory.createMotor();
		motor.setDoor(door);
		
		door.open();
		motor.move(Direction.UP);
	}
}
