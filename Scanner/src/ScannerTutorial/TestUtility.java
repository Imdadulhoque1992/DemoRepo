package ScannerTutorial;


import java.io.Reader;
import java.util.ArrayList;

import org.xml.sax.XMLReader;

public class TestUtility {
	//static Xlsx_Reader reader;
	
	public static <Xls_Reader> ArrayList<Object[]> getDataFromExcel() {
		ArrayList<Object[]> myData=new ArrayList<Object[]>();
		try {
			Xls_Reader reader=new Xls_Reader("E:\\Selenium chrome\\RegData.xlsx");
		}
		catch(Exception e){e.printStackTrace();}	
	    

		for(int rowCount=2;rowCount<=reader.getRowCount("RegData");rowCount++) {
			
			String FirstName=reader.getCellData("RegData","FirstName",rowCount);
			String Surname=reader.getCellData("RegData","Surname",rowCount);
			String MobNo=reader.getCellData("RegData","MobNo",rowCount);
			String NewPassword=reader.getCellData("RegData","NewPassword",rowCount);
			Object ob[]= {FirstName, Surname, MobNo,NewPassword};
			myData.add(ob);
		}
	return myData;
		
}}
		
	

	
	
	