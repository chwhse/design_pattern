package design_pattern.ch01.check05;

import java.util.Vector;

public class TestMain {

	public static void main(String[] args) {
		
		Course c1 = new Course("java");
		Course c2 = new Course("android");
		Course c3 = new Course("database");
		Course c4 = new Course("html");
		Student sdh = new Student("������");
		
		Transcript t1 = new Transcript(sdh, c1);
		t1.setGrade("A+");
		t1.setDate("2017/1");
		
		System.out.println(t1);
		
	}

}
