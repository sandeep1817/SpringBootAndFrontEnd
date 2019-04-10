package sandeep.example.address;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor
public class Address {
	

	/*private List<String> addresses = new ArrayList<String>();
	private List<String> users = new ArrayList<String>();*/
	private String nameOfTheUser;
	private String addressOfTheUser;
	private String idOfTheUser ;
	private String timeStamp ;

	/*public String generateIdForTheCustomer(){
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
	}*/
	/*
	public Map<String,String> addCustomerToDB(){
		userAddress.put(nameOfTheUser, addressOfTheUser);
		return userAddress;
	}*/
}
