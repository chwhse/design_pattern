package design_pattern.ch13.absfactory.after;

public class HyundaiDoor extends Door {

	@Override
	protected void doClose() {
		System.out.printf("Close %s Door","LG");
	}

	@Override
	protected void doOpen() {
		System.out.printf("Open %s Door","LG");

	}

}
