package design_pattern.ch05.strategy.moving;

public class WalkingStrategy implements MovingStrategy {

	@Override
	public void move() {
		System.out.println("I can only walk.");
		
	}
	
	

}
