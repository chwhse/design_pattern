package design_pattern.ch05.strategy.moving;

public class FlyingStrategy implements MovingStrategy {

	@Override
	public void move() {
		System.out.println("I can fly.");
	}

}
