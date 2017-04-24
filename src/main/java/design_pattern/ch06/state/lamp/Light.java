package design_pattern.ch06.state.lamp;

public class Light {
	private static final int ON = 0; 	// lamp on
	private static final int OFF = 1; // lamp off
	private static final int SLEEPING = 2; 
	private int state; // current condition
	public Light() {
		state = OFF;
	}
	
	public void on_button_pushed() {
		if(state==ON){
			System.out.println("반응없음");
		}else if(state==SLEEPING){
			System.out.println("취침등 상태");
			System.out.println("Light On!!");
			state = ON;
		}else{
			System.out.println("Light On!");
			state = ON;
		}
	}
	public void off_button_pushed(){
		if(state==OFF){
			System.out.println("반응없음");
		}else if(state==SLEEPING){
			System.out.println("취침등 상태");
			System.out.println("Light Off!!");
			state = OFF;
		}else{
			System.out.println("Light Off!");
			state = OFF;
		}
	}
	
}
