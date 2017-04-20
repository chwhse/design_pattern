package design_pattern.ch01.check05;

import java.util.Vector;

public class Course {
	private String courseName;
	private Vector<Transcript> vTranscripts;
	
	
	public Course(String courseName) {
		this.courseName = courseName;
		vTranscripts = new Vector<Transcript>();
	}

	public void addTranscrip(Transcript transcript){
		if(vTranscripts.contains(transcript)==true){
			System.out.println(transcript+" : �̹�����");
			return;
		}
		vTranscripts.add(transcript);
	}
	
	

	@Override
	public String toString() {
		return String.format("강좌명 [%s]", courseName);
	}
	
	
}
