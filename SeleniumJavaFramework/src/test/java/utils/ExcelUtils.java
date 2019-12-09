package utils;


import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	static String projectPath;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet1;

	public static void main(String[] args) {
		//getRowCount();
		getCellData();
	}
	public static void getRowCount() {

		try {
			projectPath = System.getProperty("user.dir");
			workbook = new XSSFWorkbook(projectPath + "excel/data.xls");

			//Create reference for workbook
			//HSSFWorkbook workbook = new HSSFWorkbook();

			//Create reference for worksheet
			sheet1 = workbook.getSheet("Sheet1");
			//HSSFSheet sheet =  workbook.getSheet("Sheet1");
			int rowCount = sheet1.getPhysicalNumberOfRows();
			System.out.println("Number of Rows :" + rowCount);
		}catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
	}
	public static void getCellData() {

		try {
			projectPath = System.getProperty("user.dir");
			workbook = new XSSFWorkbook(projectPath + "excel/data.xls");
			sheet1 = workbook.getSheet("Sheet1");
			String cellData = sheet1.getRow(0).getCell(0).getStringCellValue();
			System.out.println(cellData);
		}catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
	}
}
