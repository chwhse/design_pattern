package design_pattern.ch11.template.before;

import com.sun.javafx.scene.traversal.Direction;

public class Client {
	public static void main(String[] args) {
		System.out.println("==============현대==============");
		Door hdoor = new Door();
		
		Motor hyundaiMotor = new HyundaiMotor(hdoor);
		
		System.out.println(hyundaiMotor);
		hyundaiMotor.move(Direction.UP);
		System.out.println();
		System.out.println(hyundaiMotor);
		
		System.out.println("==============엘지==============");
		Door ldoor = new Door();
		
		Motor lgMotor = new LGMotor(ldoor);
		
		System.out.println(lgMotor);
		lgMotor.move(Direction.UP);
		System.out.println();
		System.out.println(lgMotor);
		
		
	}
}
