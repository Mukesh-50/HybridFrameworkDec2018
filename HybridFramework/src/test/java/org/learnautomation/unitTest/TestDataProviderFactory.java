package org.learnautomation.unitTest;

import org.learnautomation.factory.ConfigDataProvider;
import org.learnautomation.factory.ExcelDataProvider;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDataProviderFactory {

	
	@Test
	public void testExcelLib()
	{
		ExcelDataProvider excel=new ExcelDataProvider();
		String data=excel.getStringData("TestSheet", 0, 0);
		Assert.assertEquals(data, "Testing Excel");
	}
	
	@Test
	public void testConfigLib()
	{
		ConfigDataProvider config=new ConfigDataProvider();
		String data=config.getValue("testConfig");
		Assert.assertEquals(data, "TestingConfigFile");
	}
	

}
