package design_pattern.ch05.singleton.after;

import static org.junit.Assert.*;

import org.junit.Test;

import design_pattern.ch06.singleton.after.User;

public class TestSingleton2 {

	@Test
	public void test() {
		User[] user = new User[5];
		
		for(int i = 0 ; i < user.length ; i++){
			user[i] = new User((i+1)+"-User");
			user[i].print();
		}
		
	}

}
