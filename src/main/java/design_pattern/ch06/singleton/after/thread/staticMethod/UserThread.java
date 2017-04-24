package design_pattern.ch06.singleton.after.thread.staticMethod;

public class UserThread extends Thread{

	public UserThread(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		Printer.print(Thread.currentThread().getName()+" print using "+".");
	}
}
