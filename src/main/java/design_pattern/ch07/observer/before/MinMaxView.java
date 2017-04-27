package design_pattern.ch07.observer.before;

import java.util.Collections;
import java.util.List;

public class MinMaxView {
	private ScoreRecord scoreRecord;
	
	
	public MinMaxView(ScoreRecord scoreRecord) {
		this.scoreRecord = scoreRecord;
	}

	public void update() {
		List<Integer> records = scoreRecord.getScores();
		displayMinMax(records);
	}

	private void displayMinMax(List<Integer> records) {
		int min = Collections.min(records);
		int max = Collections.max(records);
		System.out.printf("Min : %d Max : %d  %n", min, max);
	}
	
}
