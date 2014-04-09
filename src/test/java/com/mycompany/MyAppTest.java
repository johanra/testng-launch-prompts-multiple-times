package com.mycompany;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyAppTest {

	@Test
    public void testApp()
    {
		new MyApp();
		Assert.assertTrue( true );
    }
}
