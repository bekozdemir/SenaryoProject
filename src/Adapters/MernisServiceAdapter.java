package Adapters;

import Abstract.CustomerCheckService;
import Entities.Customer;


public class MernisServiceAdapter implements CustomerCheckService {

	
	public boolean CheckIfRealPerson(Customer customer) {
		 
		boolean result =true;
		if (result) {
			System.out.println("Doðrulama baþarýlý (simülasyon)");
			return result;
			
		}else {
			System.out.println("Bu bilgilere ait kiþi bulunamadý! (simülasyon)");
			return result;
		}
	}
	
}
