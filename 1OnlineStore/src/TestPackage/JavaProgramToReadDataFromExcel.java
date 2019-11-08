package TestPackage;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class JavaProgramToReadDataFromExcel {

	public static void main(String args[]) throws Exception
	{
		File f=new File("D:\\selenium\\Book1.xlsx");
		FileInputStream fis=new FileInputStream(f);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		Sheet s=wb.getSheetAt(0);
		//System.out.println(s.getRow(1).getCell(0));
		
		//System.out.println(s.getRow(5).getLastCellNum());
		
		
		int rowcount=s.getLastRowNum()-s.getFirstRowNum();
		//System.out.println(rowcount);
		for(int i=0;i<=rowcount;i++)
		{
			for(int j=0; j<s.getRow(i).getLastCellNum();j++)
			{
				System.out.print(s.getRow(i).getCell(j)+" | ");
			}
			System.out.println("Row"+i);
		}
		wb.close();
	}
	
}
