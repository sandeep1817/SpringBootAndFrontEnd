package sandeep.example.address;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class UserAddressService {
	
	//public UserAddressService usersWithAddress;
	
	
	/*public UserAddressService(UserAddressService user, String address) {
		
	}*/
	
	private List<Address> addresses = new ArrayList<Address>();
	private List<String> users = new ArrayList<String>();
	
	public boolean add(Address address) {
		addresses.add(address);
		return true;
	}
	
	public String returnTheAddressOfUser(String userName){
		
		String address = "";
		
		if(userName.equalsIgnoreCase("Sandeep")){
			address = "Sandeep is from Kadapa";
		}
		else if(userName.equalsIgnoreCase("Ganesh")){
			address = "Ganesh is from Pune";
		}
		else if(userName.equalsIgnoreCase("Sharath")){
			address = "Sharath is from Karnataka";
		}
		return address;
		
	}
	public void addTheNewUserWithAddress(){
		
	}
	
	/*public UserAddressService addTheNewMemberWithAddress(UserAddressService user, String address){
		//usersWithAddress.put(user, address);
		return new UserAddressService(user,address);
	}*/
	/*public boolean userExists(UserAddressService user2) {
		boolean	flag  = false;
		ArrayList<String> users = new ArrayList<String>();
		for(String user:users){
			if(user.equalsIgnoreCase(user2.toString())){
				System.out.println("User Already exists");
				flag = false;
			}
			else{
				flag = true;
				break;
			}
		}
		return flag;
	}*/
}
