package design_pattern.ch08.decorator.before;

public class Client {
	public static void main(String[] args) {
		RoadDisplay road = new RoadDisplay();
		road.draw();
		
		RoadDisplay roadWithLane = new RoadDisplayWithLane();
		roadWithLane.draw();
	}
}
