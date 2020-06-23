package com.groups;

import org.testng.annotations.Test;

public class GroupingTests {
	
	@Test (groups={"Login", "chrome"})
	public void ValidLogin() {
		
	}
	
	@Test (groups=("login"))
	public void InvalidLogin() {
		
	}
	
	@Test
	public void EmptyPasswordLogin() {
		
	}
	
	@Test
	public void FundTransfer() {
		
	}
	
	

}
