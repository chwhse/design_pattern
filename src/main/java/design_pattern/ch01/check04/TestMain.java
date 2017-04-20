package design_pattern.ch01.check04;

import java.util.Vector;

public class TestMain {

	public static void main(String[] args) {
		 // ���� �л��� ������û ����� ����غ�����
		Course c1 = new Course("java");
		Course c2 = new Course("android");
		Course c3 = new Course("database");
		Course c4 = new Course("html");

		Student sdh = new Student("������");
		Student kdh = new Student("�����");
		Student lwj = new Student("�̿���");
		c1.registerStudent(sdh);
		c1.registerStudent(kdh);
/*		c1.registerStudent(lwj);
		c2.registerStudent(sdh);
		c2.registerStudent(lwj);*/
		sdh.registerCourse(c1);
		sdh.registerCourse(c3);
/*		sdh.registerCourse("css");
		sdh.dropCourse("java");
		sdh.dropCourse(c2);*/
		
		System.out.printf("���� : %s %n",sdh.getvCourses());
		System.out.printf("�л� : %s %n",c1.getvStudents());
		
	}

}
