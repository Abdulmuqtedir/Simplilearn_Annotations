package com.annotations;

import org.testng.annotations.Test;

@Test
public class Test1 {
  @Test(groups = { "windows.checkintest" }) 
  public void testWindowsOnly() {
  }
 
  @Test(groups = {"linux.checkintest"} )
  public void testLinuxOnly() {
  }
 
  @Test(groups = { "windows.functest" })
  public void testWindowsToo() {
  }
}