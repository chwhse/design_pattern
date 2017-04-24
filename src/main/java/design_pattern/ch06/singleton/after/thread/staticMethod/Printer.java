package design_pattern.ch06.singleton.after.thread.staticMethod;

public class Printer {
	private static int cnt= 0;
	public synchronized static void print(String str){
		cnt++;
		System.out.println(str+cnt);
	}
}
