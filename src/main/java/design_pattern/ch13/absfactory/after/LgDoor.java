package design_pattern.ch13.absfactory.after;

public class LgDoor extends Door {

	@Override
	protected void doClose() {
		System.out.printf("Close %s Door %n","Lg");
	}

	@Override
	protected void doOpen() {
		System.out.printf("Open %s Door %n","Lg");

	}

}
