package sandeep.example.adress;

import org.springframework.stereotype.Service;

@Service
public class UserAddressService {
	
	
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

}
