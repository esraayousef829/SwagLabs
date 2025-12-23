package utils;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;

public class ExcelFile {
    private XSSFWorkbook workbook;
    private XSSFSheet sheet;
    public ExcelFile(String filepath , String sheetName) {
        try {
            FileInputStream fileInputStream= new FileInputStream(new File(filepath));
            workbook = new XSSFWorkbook(fileInputStream);
            sheet = workbook.getSheet(sheetName);
        }catch (Exception e){
            e.getStackTrace();
        }
    }
    public String GetSpecficValue(int rowName ,int colName){
        Cell cell =sheet.getRow(rowName).getCell(colName);
        DataFormatter dataFormatter = new DataFormatter();
        return dataFormatter.formatCellValue(cell);


    }
}
