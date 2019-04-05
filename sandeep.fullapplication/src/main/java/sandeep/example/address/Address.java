package sandeep.example.address;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor
public class Address {
	private String nameOfTheUser;
	private String addressOfTheUser;
	private String idOfTheUser = generateIdForTheCustomer();
	private String timeStamp = getTimeStamp();
	
	public String generateIdForTheCustomer(){
		int id;
		Random random = new Random();
		id=random.nextInt(9000000)+1000000;
		idOfTheUser = Integer.toString(id);
		return idOfTheUser;
	}

	public String getTimeStamp() {
			Date date = new Date();
			SimpleDateFormat format = new SimpleDateFormat("dd/MM/YYYY HH:mm:ss");
			timeStamp = format.format(date);
		return timeStamp;
	}
}
