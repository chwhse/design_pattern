package design_pattern.ch01.check05;

import java.util.Vector;

public class Student {
	private String stdname;
	private Vector<Transcript> vTranscripts;
	
	public Student(String name) {
		this.stdname = name;
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
		return String.format("학생명 [%s]", stdname);
	}


	
	
}
