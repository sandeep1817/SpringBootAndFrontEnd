package sandeep.fullapplication;

import java.util.Random;

public class Test {

	public static void main(String[] args) {
		int id;
		String idOfTheUser;
		Random random = new Random();
		id=random.nextInt(10000);
		idOfTheUser = Integer.toString(id);
		System.out.println(idOfTheUser);
	}

}
