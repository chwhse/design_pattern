package design_pattern.ch13.absfactory.after;

import com.sun.javafx.scene.traversal.Direction;

public class HyundaiMotor extends Motor {

	@Override
	protected void moveMotor(Direction direction) {
		String strDirection = direction == Direction.UP?"위로":"아래로";
		System.out.printf("Hyundai Motor %s 이동중..",strDirection);

	}

}
