package design_pattern.ch05.strategy.attack;

public class LaserStrategy implements AttackStrategy{

	@Override
	public void attack() {
		System.out.println("I have Laser and can attack with it.");

	}

}
