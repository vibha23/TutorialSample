package com.calc;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;


public class AuthorisationTest {
	CustomerInfo custInfo;
	CustomerStorage custStorage;
	Authorisation auth=null;
	

	@Before
	public void setUp() throws Exception {
		
		custInfo = mock(CustomerInfo.class);
		Mockito.when(custInfo.getCustomerName()).thenReturn("Sanjay");
		Mockito.when(custInfo.getDob()).thenReturn("28071992");
		Mockito.when(custInfo.getContactNo()).thenReturn("9413941306");
		
		custStorage = mock(CustomerStorage.class);
		Mockito.when(custStorage.readstorage()).thenReturn("4982aS");
		
		auth = new Authorisation();
	}

	@Test
	public void testIsauthenticated_success() {
		boolean result = auth.isauthenticated(custInfo, custStorage);
		 assertTrue(result);
		
	}
	
	@Test
	public void testIsauthenticated_Fail() {
		
		Mockito.when(custInfo.getCustomerName()).thenReturn("sanjay");
	
		boolean result = auth.isauthenticated(custInfo, custStorage);
		 assertFalse(result);
		
	}

}
