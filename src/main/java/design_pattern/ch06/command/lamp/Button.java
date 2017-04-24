package design_pattern.ch06.command.lamp;

public class Button {
	private Lamp theLamp;

	public Button(Lamp theLamp) {
		super();
		this.theLamp = theLamp;
	}
	
	public void pressed(){
		theLamp.turnOn();
	}
}	
