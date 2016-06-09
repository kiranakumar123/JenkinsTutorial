package com.kriyari.selenium.helper;

public class Helper {
	static String splitArray[];//=new String[3];

	public static String catNameFormat(String catName){
	//	buff.append(catName);
		String split="--";
		splitArray=catName.split(split);
		return splitArray[0];
		//catName.i
		
	}
	
	public static String enterpriseidCategoryTypeAndCategoryId(String enterpriseId,String categoryType,String categoryId){
		String join="-";
		return enterpriseId+join+categoryType+join+categoryId;		
	}
	
}
