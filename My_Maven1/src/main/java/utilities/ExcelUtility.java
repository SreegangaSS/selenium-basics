package utilities;

import java.io.FileInputStream;

public class ExcelUtility {
	public static FileInputStream f;
	public static XSSFWorkbook wb;
	public static XSSFSheet sh;
		
	public static String getStringData(int i, int j, String sheet) throws IOException 
	{
		String file_path = GeneralUtility.TESTDATAFILE;
		f=new FileInputStream(file_path);
		wb= new XSSFWorkbook(f);
		sh = wb.getSheet(sheet);
		Row r= sh.getRow(i);
		Cell c= r.getCell(j);
		return c.getStringCellValue();
	}
	
	public static String getIntegerData(int i, int j, String sheet) throws IOException
	{
		String file_path = GeneralUtility.TESTDATAFILE;
		f=new FileInputStream(file_path);
		wb= new XSSFWorkbook(f);
		sh = wb.getSheet(sheet);
		Row r= sh.getRow(i);
		Cell c= r.getCell(j);
		int x= (int) c.getNumericCellValue();
		return String.valueOf(x);
	}

}
