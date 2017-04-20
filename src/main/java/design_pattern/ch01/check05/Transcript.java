package design_pattern.ch01.check05;

import java.util.Vector;

public class Transcript {
	private Student student;
	private Course course;
	private String grade;
	private String date;
	public Transcript() {}
	
	public Transcript(Student student, Course course) {
		this.student = student;
		this.student.addTranscrip(this);
		this.course = course;
		this.course.addTranscrip(this);
	}
	
	

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Student getStudent() {
		return student;
	}

	public Course getCourse() {
		return course;
	}

	@Override
	public String toString() {
		return String.format("강좌명 : %s %n 학생명 : %s %n 학점 : %s %n 학기 : %s %n", student, course, grade, date);
	}
	
	
	
	
	
}
