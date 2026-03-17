package utilities;

import org.testng.annotations.DataProvider;

public class DataProviderUtilities {
	ExcelUtility excelUtility;
	
	@DataProvider(name="loginData")
	public Object[][] getloginData(){
		
		String excelPath=".\\src\\test\\resources\\DemoWebShop_LoginData.xlsx";
		String sheetName="Sheet1";
		
		excelUtility=new ExcelUtility();
		Object[][] data=excelUtility.getLoginData(excelPath, sheetName);
		
		return data;
		
	}

}
