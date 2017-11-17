package generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Reporter;

import com.gargoylesoftware.htmlunit.javascript.host.file.File;

public class Lib {
	
	public static String getPPT(String path,String value)
	{
		String v="";
		Properties p = new Properties();
		try {
			p.load(new FileInputStream(path));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		v= p.getProperty(value);
		return v;
	}
	public static String getExcelValue(String path,String value,int r,int c )
	{
		String p="";
		FileInputStream file;
		try {
			file = new FileInputStream(path);
			Workbook wb=WorkbookFactory.create(file);
			Sheet sheet = wb.getSheet(value);
			Row row = sheet.getRow(r);
			Cell cell = row.getCell(c);
			p=cell.toString();
			Reporter.log("s"+path+value+r+c,true);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return p;
	}
	public static int Rowcount(String path,String value)
	{
		int count=0;
		try {
			Workbook wb= WorkbookFactory.create(new FileInputStream(path));
			Sheet sheet = wb.getSheet(value);
			count=sheet.getLastRowNum();
			Reporter.log("count:"+count,true);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return count;
	}

}
