package design_pattern.ch04.check02;

public class A1 {
	public void doA1(){
		A2 a2 = new A2();
		a2.doA2(this);
	}
	
	public void doIt(A3 a3){
		a3.doit();
	}
}
