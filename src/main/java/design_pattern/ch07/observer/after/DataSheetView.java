package design_pattern.ch07.observer.after;

import java.util.List;

public class DataSheetView implements Observer{
	private ScoreRecord scoreRecord;
	private int viewCount;
	
	
	
	public DataSheetView(ScoreRecord scoreRecord, int viewCount) {
		this.scoreRecord = scoreRecord;
		this.viewCount = viewCount;
	}

	public void update() {
		List<Integer> records = scoreRecord.getScores();
		displayScores(records, viewCount);
	}

	private void displayScores(List<Integer> records, int viewCount2) {
		System.out.print("List of "+viewCount+" entries : ");
		for(int i = 0 ; i<viewCount && i<records.size(); i++){
			
			System.out.print(records.get(i)+" ");
		}
		System.out.println();
	}
	
}
