package design_pattern.ch01.check02;

public class TestMain {

	public static void main(String[] args) {
		Phone phone1 = new Phone();
		phone1.setNumber("010-2334-1111");
		Phone phone2 = new Phone("010-2234-2222");
		
		Person p = new Person();
		p.setHomePhones(phone1);
		p.setOfficePhones(phone2);
		
		System.out.println(p);
	}

}
