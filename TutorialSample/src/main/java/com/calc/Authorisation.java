package com.calc;

public class Authorisation {
    StringBuilder key=new StringBuilder();
	public boolean isauthenticated(CustomerInfo CustomerInfo, CustomerStorage customerStorage){
		String Name=CustomerInfo.getCustomerName().substring(0, 2);
		String dOB=CustomerInfo.getDob().substring(0, 2);
		String contactno=CustomerInfo.getContactNo().substring(0, 2);
		key.append(Name).append(dOB).append(contactno);
		key.reverse();
		
		System.out.println(key.toString());
		if(key.toString().equals(customerStorage.readstorage())){
			return true;
		}else
		return false;
	}
	
}
