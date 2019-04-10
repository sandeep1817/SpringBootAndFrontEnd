package sandeep.example.address;

import java.text.SimpleDateFormat;
import java.util.*;

import org.springframework.stereotype.Service;

@Service
public class UserAddressService {
	String idOfTheUser;
	String timeStamp;
	
	public static Map<String,String> userAddress = new HashMap<String, String>();
	
	//public UserAddressService usersWithAddress;
	
	
	/*public UserAddressService(UserAddressService user, String address) {
		
	}*/
	
	//private List<Address> addresses = new ArrayList<Address>();
//	private List<String> users = new ArrayList<String>();
	
	public Address add(Address address) {
		if(address.getIdOfTheUser()==null){
			address.setIdOfTheUser(generateIdForTheCustomer());
		}
		if(address.getTimeStamp()==null){
			address.setTimeStamp(getTimeStamp());
		}
		userAddress.put(address.getNameOfTheUser(),address.getAddressOfTheUser());
		return address;
		//return true;
	}
	
	public String returnTheAddressOfUser(String userName){
		String address = userAddress.get(userName);
		System.out.println(userName+" is from "+address);
		return address;
	}
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
