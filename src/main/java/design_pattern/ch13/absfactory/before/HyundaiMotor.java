package design_pattern.ch13.absfactory.before;

import com.sun.javafx.scene.traversal.Direction;

public class HyundaiMotor extends Motor {

	@Override
	protected void moveMotor(Direction direction) {
		String strDirection = (direction == Direction.UP)?"위":"아래";
		System.out.printf("%s 모터 %s로 이동 중...%n", "Hyundai", strDirection);
	}
	
}
