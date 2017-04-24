package design_pattern.ch06.singleton.after.thread;

public class TestMain {
	public static void main(String[] args) {
		
		UserThread[] user = new UserThread[5];
		
		for(int i = 0 ; i < user.length ; i++){
			user[i] = new UserThread((i+1)+"-User");
			user[i].start();
		}
	}
}
