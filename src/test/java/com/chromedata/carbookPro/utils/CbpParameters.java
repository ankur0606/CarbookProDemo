package com.chromedata.carbookPro.utils;

public class CbpParameters {
	
	private static String webBrowser;
	private static String userAccount;
	private static String cbpBrand;
	private static String cbpEnvironment;
	
	public static String getBrowser(){
		webBrowser = System.getProperty("browser");
		return webBrowser;
	}
	
	public static String getUserAccounts(){
		userAccount = System.getProperty("userAccount");
		return userAccount;
	}
	
	public static String getBrands(){
		cbpBrand = System.getProperty("cbpBrand");
		return cbpBrand;
	}
	
	public static String getCbpEnvironment(){
		cbpEnvironment = System.getProperty("cbpEnvironment");
		return cbpEnvironment;
	}
	
	

}
