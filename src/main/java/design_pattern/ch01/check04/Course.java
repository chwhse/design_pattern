package design_pattern.ch01.check04;

import java.util.Vector;

public class Course {
	private String courseName;
	private Vector<Student> vStudents;
	private int cnt = 0;

	
	
	public Course(String courseName) {
		this.courseName = courseName;
		vStudents = new Vector<Student>();
	}

	public void registerStudent(Student std){
		cnt++;
		System.out.println(cnt);
		if(vStudents.contains(std)==true){
			System.out.println(std+" : �̹�����");
			return;
		}
		vStudents.add(std);
		std.registerCourse(this);
	}
	
	public void dropStudent(Student std){
		if(vStudents.contains(std)==true){
		vStudents.remove(vStudents.indexOf(std));
		std.dropCourse(this);
			return;
		}
		System.out.println(std+" : ����� �л� ����X");
	}

	public String getCourseName() {
		return courseName;
	}

	public Vector<Student> getvStudents() {
		return vStudents;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((courseName == null) ? 0 : courseName.hashCode());
		result = prime * result + ((vStudents == null) ? 0 : vStudents.hashCode());
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
		Course other = (Course) obj;
		if (courseName == null) {
			if (other.courseName != null)
				return false;
		} else if (!courseName.equals(other.courseName))
			return false;
		if (vStudents == null) {
			if (other.vStudents != null)
				return false;
		} else if (!vStudents.equals(other.vStudents))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return String.format("���Ǹ� [%s]", courseName);
	//	return "[���Ǹ�:" + courseName + ", ����л�:" + vStudents + "]";
	}


	
	
}
