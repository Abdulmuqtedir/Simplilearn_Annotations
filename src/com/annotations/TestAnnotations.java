package com.annotations;

import org.testng.annotations.Test;

public class TestAnnotations {
	@Test
	public void Login() {
		System.out.println("Logged in successfully");
	}
	@Test
	public void AccountEnquiry() {
		System.out.println("Account enquiry done successfully.");
	}
	@Test
	public void FundTransfer() {
		System.out.println("Fund transferred.");
	}

}
