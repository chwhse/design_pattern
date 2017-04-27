package design_pattern.ch11.template.before;

import com.sun.javafx.scene.traversal.Direction;

public class LGMotor extends Motor{
	private Door door;
	private MotorStatus motorStatus;
	public LGMotor(Door door) {
		super(door);
	}
	
	@Override
	public String toString() {
		String motorStatus = getMotorStatus() == MotorStatus.MOVING?"이동중":"중지";
		String doorStatus = door.getDoorStatus() == DoorStatus.OPENED?"문열림":"문닫힘";
		
		return String.format("문의 상태 : %s  이동방향 : %s %n", motorStatus, doorStatus);
	}

	@Override
	protected void moveMotor(Direction direction) {
		String strDirection = direction == Direction.UP?"위로":"아래로";
		System.out.printf("엘지 모토 %s로 이동중..",strDirection);
	}
	
	
}
