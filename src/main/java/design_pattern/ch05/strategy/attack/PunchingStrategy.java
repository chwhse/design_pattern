package design_pattern.ch05.strategy.attack;

public class PunchingStrategy implements AttackStrategy {

	@Override
	public void attack() {
		System.out.println("I have strong punch and can attack with it.");

	}
	
}
