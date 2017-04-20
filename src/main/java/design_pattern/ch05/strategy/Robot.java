package design_pattern.ch05.strategy;

import design_pattern.ch05.strategy.attack.AttackStrategy;
import design_pattern.ch05.strategy.moving.MovingStrategy;

public abstract class Robot {
	private String name;
	private AttackStrategy attackStrategy;
	private MovingStrategy movingStrategy;

	public Robot(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	
	
	public void setAttackStrategy(AttackStrategy attackStrategy) {
		this.attackStrategy = attackStrategy;
	}

	public void setMovingStrategy(MovingStrategy movingStrategy) {
		this.movingStrategy = movingStrategy;
	}

	protected void attack(){
		attackStrategy.attack();
	};
	protected void move(){
		movingStrategy.move();
	};
	
}
