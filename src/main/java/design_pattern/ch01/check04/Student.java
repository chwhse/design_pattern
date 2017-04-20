package design_pattern.ch01.check04;

import java.util.Vector;

public class Student {
	private String stdname;
	private Vector<Course> vCourses;
	private int cnt = 0;
	
	public Student(String name) {
		this.stdname = name;
		vCourses = new Vector<Course>();
	}

	public void registerCourse(Course course){
		cnt--;
		System.out.println(cnt);
		if(vCourses.contains(course)==true){
			System.out.println(course+" : �̹�����");
			return;
		}
		vCourses.add(course);
		course.registerStudent(this);
	}
	
	public void dropCourse(Course course){
		if(vCourses.contains(course)==true){
			vCourses.remove(course);
			course.dropStudent(this);
			return;
		}
		System.out.println(course+" : ����� �ڽ� ����X");
	}
	

	public String getName() {
		return stdname;
	}

	public Vector<Course> getvCourses() {
		return vCourses;
	}
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((stdname == null) ? 0 : stdname.hashCode());
		result = prime * result + ((vCourses == null) ? 0 : vCourses.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (stdname == null) {
			if (other.stdname != null)
				return false;
		} else if (!stdname.equals(other.stdname))
			return false;
		if (vCourses == null) {
			if (other.vCourses != null)
				return false;
		} else if (!vCourses.equals(other.vCourses))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return String.format("�л��̸� [%s]", stdname);
	//	return "[�л��̸�:" + stdname + ", ��������:" + vCourses + "]";
	}


	

	
	
}
