package design_pattern.ch06.command.lamp.alarm;

public class Button {
	private Lamp theLamp;
	private Alarm theAlarm;
	private Mode mode;
	
	public Button(Lamp theLamp, Alarm theAlarm) {
		this.theLamp = theLamp;
		this.theAlarm = theAlarm;
	}
	
	public void setMode(Mode mode) {
		this.mode = mode;
	}

	public void pressed(){
		switch (mode) {
		case LAMP:
			theLamp.turnOn();
			break;
		case ALARM:
			theAlarm.start();
			break;
		default:
			break;
		}
		
	}
}	
