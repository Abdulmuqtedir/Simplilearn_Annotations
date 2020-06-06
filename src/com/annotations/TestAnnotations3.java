package com.annotations;

import org.testng.annotations.Test;

public class TestAnnotations3 {
		    @Test
		    public void Login() {
		        System.out.println("Login");
		    }
		    @Test(dependsOnMethods="Login")
		    public void AccountEnquiry() {
		    System.out.println("AccountEnquiry");
		    }
		    
		    @Test(dependsOnMethods="Login")
		    public void FundTransfer() {
		        System.out.println("FundTransfer");
		    }

}
