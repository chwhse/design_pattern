package design_pattern.ch13.absfactory.before;

public class LGDoor extends Door {

	@Override
	protected void doClose() {
		System.out.printf("Close %s Door", "LG");
	}

	@Override
	protected void doOpen() {
		System.out.printf("Open %s Door", "LG");
	}

}
