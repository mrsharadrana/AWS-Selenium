package test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.automation.aws.utility.DateUtils;

public class Input_Output_File extends DateUtils{

	
	
	@Test(priority = 1)
	public void createFile() {
		// TODO Auto-generated method stub
		//Creating Object for File and setting the Path to create a file
		
		File file = new File("./Extent-Report/IOFile.txt");
		try {
			;
			if(file.createNewFile()) {
				System.out.println("Created File:-"+file.getName());
			}
			else {
				System.out.println("File Already Exits @:-"+file.getPath());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("File not Created");
		}
	}	
	@Test (priority = 2)
public void fileInformation() {
	File file2 = new File("./Extent-Report/IOFile.txt");
	if(file2.exists()) {
		System.out.println("File is Present @ :- "+file2.getAbsolutePath());
		System.out.println("File is Readable ? :- "+file2.canRead());
		System.out.println("File is Executable ? :- "+file2.canExecute());
	}
	else {
		System.out.println("File information not Present");
	}
}
@Test (priority = 3)
public void write()  {
	try {
		
	
	FileWriter fw = new FileWriter("./Extent-Report/IOFile.txt");
			   fw.write("This is from Eclipse");
			   fw.flush();
			   fw.close();
			   System.out.println("File Succesfully wrote");
	}
	catch(Exception e) {
		System.out.println("Check the Logs");
		
	}
	}
@Test (priority = 4)
public void read()  {
try {
	File re = new File("./Extent-Report/IOFile.txt");
	Scanner read = new Scanner(re);
	while(read.hasNextLine()) {
		String text = read.nextLine();
		System.out.println("File Content :- "+text);
	}
	read.close();
}
catch (Exception e) {
	System.out.println("Please check logs");
}
}
}

