package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.pagefactory.ByAll;
import org.testng.annotations.Test;

import com.automation.aws.driver.Driver;

public class HandleTestDataUsingExcel extends Driver{

	
	@Test
	public void EnterGoogleSearch() throws IOException {
		
		//Read Item to search from Excel using Apache POI
		//Specify the path of file
		File src = new File("./ExcelFile/data.xlsx");
		//Load the Excel File
		FileInputStream fis = new FileInputStream(src);
		//Load the WorkBook
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		//Load Sheet with SheetName
		XSSFSheet sheet = wb.getSheet("Google");
		int count_lastRow = sheet.getLastRowNum();
		for(int i = 1; i<=count_lastRow; i++) {
			
			driver.get("https://twitter.com/login?lang=en");
			
			WebElement txtName = driver.findElement(new ByAll(By.name("session[username_or_email]"),By.xpath("//*[@title='Search'")));
			WebElement txtPwd = driver.findElement(new ByAll(By.name("session[password]")));
			System.out.println("Title of Page "+driver.getTitle());			
			String credential[] = sheet.getRow(i).getCell(0).getStringCellValue().split(":");
			System.out.println("credential" +credential);
			//String uname[] = credential.split(":");
			txtName.sendKeys(credential[0]);
			txtPwd.sendKeys(credential[1]);
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
