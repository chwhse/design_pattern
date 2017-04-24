package design_pattern.ch06.command.lamp;

public class Client {
	public static void main(String[] args) {
		Lamp lamp = new Lamp();
		Button lampButton = new Button(lamp);
		lampButton.pressed();
	}
}
