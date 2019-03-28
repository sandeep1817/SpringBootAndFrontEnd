package sandeep.example.adress;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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

	/*@PostMapping("/address/member")
	public void addTheNewMember(){
		
	}*/
}
