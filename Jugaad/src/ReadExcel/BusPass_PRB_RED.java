package ReadExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFEvaluationWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class BusPass_PRB_RED {
	
	public List<String> ReadExcel() throws Exception {
		// TODO Auto-generated method stub
		
		
		File source = new File("D:\\Dektop backup 23 march 2016\\Selenium\\Excel_Data\\test_Excel.xlsx");
		
		FileInputStream fis = new FileInputStream(source);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		List<String> s1=new ArrayList<>();
		
		
		
		wb.getSheetAt(2);
		XSSFSheet sheet1 = wb.getSheetAt(2);
	   
	  Iterator<Row> rowIterator = sheet1.iterator();
	  int i =1;
	  rowIterator.next();
	   while(rowIterator.hasNext() )
	  {
		   
		   System.out.println("Value of i "+i);
		try{
	   String data0 = sheet1.getRow(i).getCell(0).getStringCellValue();
	   String data1 = sheet1.getRow(i).getCell(1).getStringCellValue();
	   String data2 = sheet1.getRow(i).getCell(2).getStringCellValue();
	   String data3 = sheet1.getRow(i).getCell(3).getStringCellValue();
	   
	   
	   System.out.println(data0);
	   System.out.println(data1);
	   System.out.println(data2);
	   System.out.println(data3);
	     
	   s1.add(data0);
	   
	   s1.add(data1);
	   
	   s1.add(data2);
	   
	   s1.add(data3);
	  
	   i++;
	   rowIterator.next();
		}
		catch(NullPointerException e)
		{
			//e.printStackTrace();
			return s1;
		}
	  }
	   //for(int k =0;k<s1.size();k++)
		 //  System.out.println(s1.get(k));
		 return s1;
	   
	
	}

}
