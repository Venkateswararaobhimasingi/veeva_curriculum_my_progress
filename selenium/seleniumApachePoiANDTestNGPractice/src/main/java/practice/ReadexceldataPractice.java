package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.util.RLEDecompressingInputStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFShape;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadexceldataPractice {

	public static void main(String[] args) throws IOException,FileNotFoundException {
		// TODO Auto-generated method stub
		
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\textfiles\\Selenium_Data_Driven_Testing.xlsx");
		
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		
		XSSFSheet sheet=wb.getSheet("Sheet1");
		
		int r=sheet.getLastRowNum();
		int c=sheet.getRow(0).getLastCellNum();
		System.out.println(r+" "+c);
		
		
		/*for(int i=0;i<=r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print(sheet.getRow(i).getCell(j)+"		");
			}
			System.out.println("");
		}*/
		
		for(int i=0;i<=r;i++) {
			XSSFRow r1=sheet.getRow(i);
			
			for(int j=0;j<c;j++) {
				XSSFCell c1=r1.getCell(j);
				System.out.print(c1.toString()+"   ");
			}
			System.out.println(" ");
		}
		
		wb.close();
		fis.close();

	}

}
