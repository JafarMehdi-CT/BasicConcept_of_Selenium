package ExcelData;

import org.apache.poi.ss.usermodel.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex1_getStringData
{
    public static void main(String[] args) throws IOException
    {

        FileInputStream file =new FileInputStream("D:\\IT PROFESSIONAL\\Velocity 29th NOV 2025\\Selenium\\New Microsoft Excel Worksheet.xlsx");

//        String value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
//        System.out.println(value);


        Workbook book = WorkbookFactory.create(file);
        Sheet sh = book.getSheet("Sheet1");
        Row r = sh.getRow(0);
        Cell c = r.getCell(0);
        String value = c.getStringCellValue();
        System.out.println(value);

    }
}
