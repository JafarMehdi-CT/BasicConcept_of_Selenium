package ExcelData;

import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.IOException;

public class Ex1_getIntegerData
{
    public static void main(String[] args) throws IOException {
        FileInputStream file=new FileInputStream("D:\\IT PROFESSIONAL\\Velocity 29th NOV 2025\\Selenium\\New Microsoft Excel Worksheet.xlsx");

        double value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(1).getNumericCellValue();
        System.out.println(value);
    }
}
