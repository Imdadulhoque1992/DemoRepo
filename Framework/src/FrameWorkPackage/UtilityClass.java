package FrameWorkPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class UtilityClass {

	public static ArrayList<Object[]> getDataFromExcell() throws IOException {
		
		ArrayList<Object[]> myData=new ArrayList<Object[]>();
		
		
	File	srcFile=new File("D:\\Ecmmerce\\Framework\\Reg_Data.xlsx");
		FileInputStream fis=new FileInputStream(srcFile);
	
	XSSFWorkbook wb=new XSSFWorkbook(fis);
	
	XSSFSheet sheet1=wb.getSheetAt(0);
	int RowCount=sheet1.getLastRowNum();
	
 	for(int i=0;i<RowCount;i++) {
 
	String First_Name=sheet1.getRow(1).getCell(i).getStringCellValue();
	String Last_Name=sheet1.getRow(2).getCell(i).getStringCellValue();	
	String Email_Adress=sheet1.getRow(3).getCell(i).getStringCellValue();
	String Password=sheet1.getRow(4).getCell(i).getStringCellValue();
 	}
	return myData;
 	
	}	
	
}
