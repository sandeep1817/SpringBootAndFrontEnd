package sandeep.fullapplication.UserAddressService;

public class UserAddress {
	
	
	public String returnTheAddressOfUser(String userName){
		
		String address = "";
		
		switch(userName){
		case "Ganesh":
			address = "Ganesh Gaitonde is from Pune";
		case "Sandeep":
			address = "Sandeep is from Kadapa";
		case "sharath":
			address = "Sharath is from Karnatka";
			default:
				address = "User not found in the DB";
		}
		return userName;
		
	}

}
