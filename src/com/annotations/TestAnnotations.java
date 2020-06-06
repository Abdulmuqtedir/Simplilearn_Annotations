package com.annotations;

import org.testng.annotations.Test;

public class TestAnnotations {
	@Test
	public void Login() {
		System.out.println("Logged in");
	}
	@Test
	public void AccountEnquiry() {
		System.out.println("Account enquiry done.");
	}
	@Test
	public void FundTransfer() {
		System.out.println("Fund transferred.");
	}

}
