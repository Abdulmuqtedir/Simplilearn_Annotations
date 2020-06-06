package com.annotations;

import org.testng.annotations.Test;

public class TestAnnotations2 {
	@Test(priority=0)
	public void Login() {
		System.out.println("Logged in");
	}
	@Test(priority=1)
	public void AccountEnquiry() {
		System.out.println("Account enquiry done.");
	}
	@Test(priority=2)
	public void FundTransfer() {
		System.out.println("Fund transferred.");
	}

}
