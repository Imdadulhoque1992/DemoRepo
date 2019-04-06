package com.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelreader {
	
	
//public static ArrayList<Object[]> readexcel() {

		//throws IOException
	//	
		
		
public static void main(String[] args) throws IOException
{
	ArrayList<Object[]> myData=new ArrayList<Object[]>();

		
	File file=new File("E:\\Ecmmerce\\testNG\\src\\com\\utility\\RegData.xlsx");
	FileInputStream input=new FileInputStream(file);
	XSSFWorkbook wb=new XSSFWorkbook(input);
	XSSFSheet sheet=wb.getSheetAt(0);
	String FirstName=sheet.getRow(0).getCell(0).getStringCellValue();
	String Surname=sheet.getRow(1).getCell(1).getStringCellValue();
	double MobNo=sheet.getRow(2).getCell(2).getNumericCellValue();
	String NewPassword=sheet.getRow(3).getCell(3).getStringCellValue();
	System.out.println(FirstName+Surname+MobNo+NewPassword);
	//return myData;
	wb.close();
}}