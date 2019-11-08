package TestPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public abstract class JavaProgramToWriteDataToExcel {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		File f=new File("D:\\selenium\\Book2.xlsx"); 
		FileInputStream fis=new FileInputStream(f);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet s=wb.getSheetAt(0);
		int x=s.getLastRowNum()+1;
		FileOutputStream fos=new FileOutputStream(f);
		wb.write(fos);
		//s.getRow(arg0)
		for(int i=x;i<=x+4;i++)		
		{
		for(int j=0;j<s.getRow(i).getLastCellNum();j++)
			{			
				Row r=s.getRow(i);
				r.createCell(i).setCellValue("Raviteja");
				wb.write(fos);				
			}
		}	
		wb.close();
	}
}
