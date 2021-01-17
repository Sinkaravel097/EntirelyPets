package org.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import javax.swing.text.Element;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.w3c.dom.Text;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
	public static WebDriver driver;
	public static Actions a;
	public static WebDriverWait w;
	public static JavascriptExecutor js;
	public static TakesScreenshot ts;
	public static Select s;
	
	// CHROME BROWSER
	public static void chrome() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	// FIREFOX BROWSER
	public static void firefox() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
	}
	
	// EDGE BROWSER
	public static void edge() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
	}
	
	// IE BROWSER
	public static void ie() {
		WebDriverManager.iedriver().setup();
		driver = new InternetExplorerDriver();
	}
	
	// URL
	public static void launchUrl(String url) {
		driver.get(url);
	}
	
	// MAXIMIZE WINDOW
	public static void maxWindow() {
		driver.manage().window().maximize();
	}
	
	//CLICK
	public static void clickAny(WebElement element) {
		element.click();
	}
	
	public static void implicitWait() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
	
	// WEBDRIVER WAIT
	public static void notYet() {
		w = new WebDriverWait(driver, 15);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//webpushrpromptbtndeny2[text()='NOT YET']")));
	}
	
	public static void logoutWait() {
		w = new WebDriverWait(driver, 10);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[text()='Sign Out'])[1]")));
	}
	
	// SENDKEYS
	public static void sendText(WebElement element, String giveText) {
		element.sendKeys(giveText);
	}
	
	// JAVA CLICK
	public static void javaClick(WebElement element) {
		js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", element);

	}
	
	// SCROLL
	public static void scrollUpAndDown(WebElement element) {
		js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView()", element);

	}
	
	// SCREENSHOT
	public static void screenShot(String imgName) throws IOException {
		ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("E:\\Selenium Practical\\EntirelyPets\\Screenshots\\"+imgName);
		FileUtils.copyFile(source, destination);

	}
	
	// GET TEXT
	public static String textGet(WebElement element) {
		String text = element.getText();
		return text;

	}
	
	
	// ACTIONS --->  MOVE TO ELEMENT
	public static void moveToEle(WebElement element) {
		a = new Actions(driver);
		a.moveToElement(element).perform();
	}
	
	// ROBOT  --->  SELECT BY VISIBLE TEXT
	public static void selectVisibleText(WebElement element, String text) {
		s = new Select(element);
		s.selectByVisibleText(text);
	}
	
	public static String readExcel(int particularRow, int particularCellFromRow) throws IOException {

		File f = new File("E:\\Selenium Practical\\EntirelyPets\\ExcelSheet\\EntirelyPets.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);

		Sheet sheet = wb.getSheet("Entirelypets");

		Row row = sheet.getRow(particularRow);

		Cell cell = row.getCell(particularCellFromRow);
		
		int cellType = cell.getCellType();

		String value = " ";

		if (cellType == 1) {
			value = cell.getStringCellValue();
		} else if (DateUtil.isCellDateFormatted(cell)) {
			Date dateCellValue = cell.getDateCellValue();
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");
			value = sdf.format(dateCellValue);
		} else {
			double numericCellValue = cell.getNumericCellValue();
			long l = (long) numericCellValue;
			value = String.valueOf(l);
		}
		return value;
	}
	

}
