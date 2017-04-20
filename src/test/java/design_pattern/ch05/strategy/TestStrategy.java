package design_pattern.ch05.strategy;

import org.junit.Test;

import design_pattern.ch05.strategy.attack.LaserStrategy;
import design_pattern.ch05.strategy.attack.MissileStrategy;
import design_pattern.ch05.strategy.attack.PunchingStrategy;
import design_pattern.ch05.strategy.moving.FlyingStrategy;
import design_pattern.ch05.strategy.moving.WalkingStrategy;

public class TestStrategy {
	
	@Test
	public  void test() {
		Robot taekwonV = new TaekwonV("태권브이");
		Robot atom = new Atom("아톰");
		
		taekwonV.setMovingStrategy(new WalkingStrategy());
		taekwonV.setAttackStrategy(new MissileStrategy());

		atom.setMovingStrategy(new FlyingStrategy());
	//	atom.setAttackStrategy(new PunchingStrategy());
		atom.setAttackStrategy(new MissileStrategy());
		
		prnRobot(taekwonV);
		prnRobot(atom);
		
		Robot sungard = new Sungard("선가드");
		
		sungard.setMovingStrategy(new FlyingStrategy());
		sungard.setAttackStrategy(new MissileStrategy());
		sungard.setAttackStrategy(new LaserStrategy());
		
		prnRobot(sungard);
	}
	
	private void prnRobot(Robot robot) {
		System.out.printf("My name is %s%n", robot.getName());
		robot.move();
		robot.attack();
		
	}
}

