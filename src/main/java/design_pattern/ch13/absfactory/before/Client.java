package design_pattern.ch13.absfactory.before;

import com.sun.javafx.scene.traversal.Direction;

public class Client {
	public static void main(String[] args) {
		Door lgDoor = DoorFactory.createDoor(VendorID.LG);
		
		Motor lgMotor = MotorFactory.createMotor(VendorID.LG);
		lgMotor.setDoor(lgDoor);
		
		lgDoor.open();
		lgMotor.move(Direction.UP);
	}
}
