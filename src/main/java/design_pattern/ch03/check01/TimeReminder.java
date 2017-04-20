package design_pattern.ch03.check01;

import java.util.Calendar;

public class TimeReminder {
	private Mp3 m;
	private Timeprovider tProv;
	
	
	
	public void settProv(Timeprovider tProv) {
		this.tProv = tProv;
	}



	public void reminder(){
//		Calendar cal = Calendar.getInstance();
		m = new Mp3();
		/*int hour = cal.get(Calendar.HOUR_OF_DAY);*/
		int hour = tProv.getTime();
		
		
		if(hour >= 22){
			m.playSong();
		}
	}
}
