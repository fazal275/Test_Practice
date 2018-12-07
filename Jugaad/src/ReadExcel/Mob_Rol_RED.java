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


public class Mob_Rol_RED {
	
	public List<String> ReadExcel() throws Exception {
		// TODO Auto-generated method stub
		
		
		File source = new File("D:\\Dektop backup 23 march 2016\\Selenium\\Excel_Data\\test_Excel.xlsx");
		
		FileInputStream fis = new FileInputStream(source);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		List<String> s1=new ArrayList<>();
		
		
		
		wb.getSheetAt(1);
		XSSFSheet sheet1 = wb.getSheetAt(1);
	   
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
	   String data4 = sheet1.getRow(i).getCell(4).getStringCellValue();
	   String data5 = sheet1.getRow(i).getCell(5).getStringCellValue();
	   
	   System.out.println(data0);
	   System.out.println(data1);
	   System.out.println(data2);
	   System.out.println(data3);
	   System.out.println(data4);
	   System.out.println(data5);  
	   s1.add(data0);
	   
	   s1.add(data1);
	   
	   s1.add(data2);
	   
	   s1.add(data3);
	   
       s1.add(data4);
	   
	   s1.add(data5);
	   
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
	   
		
		
		
		
		
		
		
		
	  
		/*
		
		 wb.getSheetAt(0);
	   XSSFSheet sheet1 = wb.getSheetAt(0);
	   String data0 = sheet1.getRow(1).getCell(0).getStringCellValue();
	   String data1 = sheet1.getRow(1).getCell(1).getStringCellValue();
	   String data2 = sheet1.getRow(1).getCell(2).getStringCellValue();
	   String data3 = sheet1.getRow(1).getCell(3).getStringCellValue();
	   
	    
	   s1.add(data0);
	   
	   
	   s1.add(data1);
	   
	   s1.add(data2);
	   s1.add(data3);
	
	   return s1;
	   
	  
	    
	
	    wb.getSheetAt(1);
	    XSSFSheet sheet2 = wb.getSheetAt(1);
	    String data01 = sheet2.getRow(1).getCell(0).getStringCellValue();
		String data11 = sheet2.getRow(1).getCell(1).getStringCellValue();
		String data21 = sheet2.getRow(1).getCell(2).getStringCellValue();
		String data31 = sheet2.getRow(1).getCell(3).getStringCellValue();
		String data41 = sheet2.getRow(1).getCell(4).getStringCellValue();  
		String data51 = sheet2.getRow(1).getCell(5).getStringCellValue();
		
	    System.out.println("Data for Nominator is "+data01);
	    System.out.println("Data for Link is "+data11);
	    System.out.println("Data for User is "+data21);
	    System.out.println("Data for LAO no. is "+data31);
	    System.out.println("Data for Approver1 is "+data41);
	    System.out.println("Data for Approver2 is "+data51);
	    System.out.println("");
	    
	    
	    s1.add(data01);
	   
	   
	   s1.add(data11);
	   
	   s1.add(data21);
	   s1.add(data31);
	   s1.add(data41);
	   s1.add(data51);
	   return s1;
	   
	  
	   /*
	    
	    
	    
	    wb.getSheetAt(2);
	    XSSFSheet sheet3 = wb.getSheetAt(2);
	    String data02 = sheet3.getRow(1).getCell(0).getStringCellValue();
		String data12 = sheet3.getRow(1).getCell(1).getStringCellValue();
		String data22 = sheet3.getRow(1).getCell(2).getStringCellValue();
		String data32 = sheet3.getRow(1).getCell(3).getStringCellValue();
		String data42 = sheet3.getRow(1).getCell(4).getStringCellValue();  
		String data52 = sheet3.getRow(1).getCell(5).getStringCellValue();
		
		
	    System.out.println("Data for Nominator is "+data02);
	    System.out.println("Data for Link is "+data12);
	    System.out.println("Data for User is "+data22);
	    System.out.println("Data for Approver1 is "+data32);
	    System.out.println("Data for Approver2 is "+data42);
	    System.out.println("Data for Approver3 is "+data52);
	    System.out.println("");
	    
	    wb.getSheetAt(3);
	    XSSFSheet sheet4 = wb.getSheetAt(3);
	    String data03 = sheet4.getRow(1).getCell(0).getStringCellValue();
		String data13 = sheet4.getRow(1).getCell(1).getStringCellValue();
		String data23 = sheet4.getRow(1).getCell(2).getStringCellValue();
		String data33 = sheet4.getRow(1).getCell(3).getStringCellValue();
		String data43 = sheet4.getRow(1).getCell(4).getStringCellValue();  
		String data53 = sheet4.getRow(1).getCell(5).getStringCellValue();
		String data63 = sheet4.getRow(1).getCell(6).getStringCellValue();
		
	    System.out.println("Data for Nominator is "+data03);
	    System.out.println("Data for Link is "+data13);
	    System.out.println("Data for User is "+data23);
	    System.out.println("Data for Approver1 is "+data33);
	    System.out.println("Data for Approver2 is "+data43);
	    System.out.println("Data for Approver3 is "+data53);
	    System.out.println("Data for Approver4 is "+data63);
	    System.out.println("");
	    
	    
	    wb.getSheetAt(4);
	    XSSFSheet sheet5 = wb.getSheetAt(4);
	    String data04 = sheet5.getRow(1).getCell(0).getStringCellValue();
		String data14 = sheet5.getRow(1).getCell(1).getStringCellValue();
		String data24 = sheet5.getRow(1).getCell(2).getStringCellValue();
		String data34 = sheet5.getRow(1).getCell(3).getStringCellValue();
		String data44 = sheet5.getRow(1).getCell(4).getStringCellValue();  
		String data54 = sheet5.getRow(1).getCell(5).getStringCellValue();
		String data64 = sheet5.getRow(1).getCell(6).getStringCellValue();
		String data74 = sheet5.getRow(1).getCell(7).getStringCellValue();
		
	    System.out.println("Data for Nominator is "+data04);
	    System.out.println("Data for Link is "+data14);
	    System.out.println("Data for User is "+data24);
	    System.out.println("Data for Approver1 is "+data34);
	    System.out.println("Data for Approver2 is "+data44);
	    System.out.println("Data for Approver3 is "+data54);
	    System.out.println("Data for Approver4 is "+data64);
	    System.out.println("Data for Approver5 is "+data74);
	    System.out.println("");
	    
	    */
	    
	    
	}

}



