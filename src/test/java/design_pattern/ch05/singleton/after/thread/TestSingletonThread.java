package design_pattern.ch05.singleton.after.thread;

import static org.junit.Assert.*;

import org.junit.Test;

import design_pattern.ch06.singleton.after.User;
import design_pattern.ch06.singleton.after.thread.UserThread;

public class TestSingletonThread {

	@Test
	public void test() {
		UserThread[] user = new UserThread[5];
		
		for(int i = 0 ; i < user.length ; i++){
			user[i] = new UserThread((i+1)+"-User");
			user[i].start();
		}
		
	}

}
