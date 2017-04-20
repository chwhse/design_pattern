package design_pattern.ch03.check01;

import java.util.Calendar;

public class FakeTimeProvider implements Timeprovider {
	private Calendar cal;
	
	
	
	public FakeTimeProvider() {
		cal = Calendar.getInstance();
	}
	
	public FakeTimeProvider(int hours){
		this();
		setHours(hours);
	}

	@Override
	public void setHours(int hours) {
		cal.set(Calendar.HOUR_OF_DAY, hours);
	}

	@Override
	public int getTime() {
		return cal.get(Calendar.HOUR_OF_DAY);
	}

}
