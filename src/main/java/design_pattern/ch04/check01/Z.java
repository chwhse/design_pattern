package design_pattern.ch04.check01;

public class Z {
	private W w;
	
	public void m2(){
		System.out.println("destroy w");
		w = null;
	}
}
