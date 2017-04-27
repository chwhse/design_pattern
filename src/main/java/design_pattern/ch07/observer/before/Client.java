package design_pattern.ch07.observer.before;

public class Client {

	public static void main(String[] args) {
		ScoreRecord scoreRecord = new ScoreRecord();
/*		DataSheetView dataSheetView = new DataSheetView(scoreRecord, 3);
		scoreRecord.setDataSheetView(dataSheetView);
		*/
		MinMaxView minMaxView = new MinMaxView(scoreRecord);
		scoreRecord.setMinMaxView(minMaxView);
		for(int i=1 ; i<6 ; i++){
			scoreRecord.addScore(i*10);
		}
	}

}
