package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class WriteExcel {
	@Test
public void writeExcel() throws Exception{
	File src = new File("./Extent-Report/IOFile.xlsx");
	Boolean pro = src.canWrite();
	System.out.println("File can be open in Write Mode :- "+pro);
	FileInputStream file = new FileInputStream(src);
	XSSFWorkbook wb = new XSSFWorkbook(file);
	XSSFSheet sheet = wb.getSheetAt(0);
	sheet.getRow(0).createCell(0).setCellValue("Hello");
	sheet.getRow(0).createCell(1).setCellValue("Hello Again");
	FileOutputStream srcout = new FileOutputStream(src);
	wb.write(srcout);
	file.close();
}
}
