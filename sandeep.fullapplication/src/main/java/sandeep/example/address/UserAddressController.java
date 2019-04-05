package sandeep.example.address;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserAddressController {

	@Autowired
	private UserAddressService userAddress;
	
	
	@GetMapping("/address")
	public String getUserAddress(){
		String add = userAddress.returnTheAddressOfUser("sharath");
		return add;
	}
	
	@PostMapping("/address")
	public Address addAddress(@RequestBody Address address){
		
		System.err.println(address);
		return address;
//		if(userAddress.userExists(user)){
//			System.out.println("User Already Exists in DB");
//		}
//		else{
//			userAddress.addTheNewMemberWithAddress(user,address);
//		}
//		//return userAddress.addTheNewMemberWithAddress(user, address);
//		return user;
	}
}
