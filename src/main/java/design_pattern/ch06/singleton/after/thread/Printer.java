package design_pattern.ch06.singleton.after.thread;

public class Printer {
	
	private static Printer printer = null;
//	private static Printer printer = new Printer();
	private int cnt = 0;
	private Printer(){}
	
	public synchronized static Printer getPrinter() {	// lock에 대한  overhead 걸릴 수 있음
//	public  static Printer getPrinter() {
		if(printer == null){
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			printer = new Printer();
		}
		return printer;
	}
	
	public void print(String str){
		synchronized (this) {
			cnt++;
			System.out.println(str+cnt+"번째");
		}
		
	}
	
	
}
