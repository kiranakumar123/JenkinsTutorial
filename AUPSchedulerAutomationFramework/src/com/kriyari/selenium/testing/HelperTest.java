package com.kriyari.selenium.testing;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/*import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
*/
import com.kriyari.selenium.helper.DataBaseConnection;
import com.kriyari.selenium.helper.Helper;

//import static org.junit.Assert.assertEquals;


public class HelperTest {
	//Helper obj=new Helper();
	//String split="--";
	DataBaseConnection conn=new DataBaseConnection();
	@BeforeClass
	public static void beforeClass(){
		
		 
	}
	
	//@Ignore
	@Test
	public void testCatNameFormat(){
		String catName="c1-- Newzstand";
		String returnedCatName=Helper.catNameFormat(catName);
		//assertEquals("CatNameFormat not returning proper value","c1",returnedCatName);
		
	}
	@Test
	public void testEnterpriseidCategoryTypeAndCategoryId(){
		conn.setCategoryDetails();
		String expectedResult="3-1-50";
		String actualResult=Helper.enterpriseidCategoryTypeAndCategoryId(conn.getCategoryEnterpriseId(),conn.getCategoryType(),conn.getCategoryId());
		//assertEquals(expectedResult, actualResult);
	}
}
