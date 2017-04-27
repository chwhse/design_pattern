package design_pattern.ch13.absfactory.before;

public class HyundaiDoor extends Door {

	@Override
	protected void doClose() {
		System.out.printf("Close %s Door", "Hyundai");
	}

	@Override
	protected void doOpen() {
		System.out.printf("Open %s Door", "Hyundai");
	}

}
