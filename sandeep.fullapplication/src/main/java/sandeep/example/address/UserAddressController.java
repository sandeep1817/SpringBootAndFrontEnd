package sandeep.example.address;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserAddressController {

	@Autowired
	private UserAddressService service;
	
	
	@GetMapping("/address/{name}")
	public String getUserAddress(@PathVariable("name") String name){
		return service.returnTheAddressOfUser(name);
	}
	
	@PostMapping("/address")
	public Address addAddress(@RequestBody Address address){
		//return address;
		return service.add(address);
//		System.err.println(address.getNameOfTheUser());
//		return address;
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
