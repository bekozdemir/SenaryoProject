package Adapters;

import Abstract.CustomerCheckService;
import Entities.Customer;


public class MernisServiceAdapter implements CustomerCheckService {

	
	public boolean CheckIfRealPerson(Customer customer) {
		 
		boolean result =true;
		if (result) {
			System.out.println("Do�rulama ba�ar�l� (sim�lasyon)");
			return result;
			
		}else {
			System.out.println("Bu bilgilere ait ki�i bulunamad�! (sim�lasyon)");
			return result;
		}
	}
	
}
