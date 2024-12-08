package SeleniumPractice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	public static Actions a;
	public static Robot r;
	public static JavascriptExecutor js;
	public static Alert at;
	public static Select s;
	public static WebDriverWait driverWait;
	public static FluentWait<WebDriver> fluentWait;

	public static void edgeBrowser() {

		WebDriverManager.edgedriver().setup();

		driver = new EdgeDriver();
	}

	public static void closeBrowser() {

		driver.quit();

	}

	public static void maxWindow() {

		driver.manage().window().maximize();

	}

	public static String pageTitle() {

		String titleName = driver.getTitle();
		System.out.println(titleName);
		return titleName;

	}

	public static String pageUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		return currentUrl;

	}

	public static void launchUrl(String url) {

		driver.get(url);

	}

	public static void btnClick(WebElement element) {

		element.click();

	}

	public static void fillTextBox(WebElement ele, String value) {

		ele.sendKeys(value);

	}

	public static void moveElement(WebElement element) throws AWTException {

		a = new Actions(driver);
		a.moveToElement(element).perform();

	}

	public static void dragDrop(WebElement drag, WebElement drop) {

		a.dragAndDrop(drag, drop).perform();

	}

	public static void doubleClick(WebElement element) {

		a.contextClick(element).perform();

	}

	public static void copy() {

		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_C);

	}

	public static void paste() {

		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);

	}

	public static void threadSleep() throws InterruptedException {

		Thread.sleep(3000);

	}

	public static void scrollDown(WebElement element) {

		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);

	}

	public static void scrollUp(WebElement element) {

		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);

	}

	/*
	 * public static void enterData(WebElement element) {
	 * 
	 * element.click(); js.executeScript("arguments[0].click()");
	 * js.executeScript("return arguments[0].setAttribute('Value', 'values')",
	 * element);
	 * 
	 * }
	 */

	public static void retrieveEnteredData(WebElement element) {

		Object data = js.executeScript("return arguments[0].getAttribute('Value')", element);
		System.out.println(data);

	}

	public static void simpleAlert() {

		at = driver.switchTo().alert();
		at.accept();

	}

	public static void confirmAlert() {

		at = driver.switchTo().alert();
		at.accept();

	}

	public static void promptAlert(String value) throws InterruptedException {

		at = driver.switchTo().alert();
		String text = at.getText();
		System.out.println(text);
		at.sendKeys(value);
		threadSleep();
		at.accept();
	}

	public static void singleDrop(WebElement element, String value) {

		s = new Select(element);
		s.selectByValue(value);

	}

	public static void multipleDrop() {

		boolean multiple = s.isMultiple();
		System.out.println(multiple);

	}

	public static void allOptions() {

		List<WebElement> allopt = s.getOptions();

		for (WebElement element : allopt) {
			System.out.println(element.getText());
		}

	}

	public static void allSelectedOpt() {

		List<WebElement> allSelected = s.getAllSelectedOptions();

		for (WebElement element : allSelected) {
			System.out.println(element.getText());
		}

	}

	public static void firstSelected() {

		WebElement firstSelected = s.getFirstSelectedOption();
		System.out.println(firstSelected);

	}

	public static void deSelect(String value) {

		s.deselectByValue(value);

	}

	public static void WebDriverWait(long seconds) {

		driverWait = new WebDriverWait(driver, Duration.ofSeconds(seconds));

	}

	public static void fluentWait(long seconds, long millis) {

		fluentWait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(seconds))
				.pollingEvery(Duration.ofMillis(millis)).ignoring(Exception.class);
		
	}

	public static void parentWindow() {

		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);

	}

	public static Set<String> allWindow() {

		Set<String> allWindows = driver.getWindowHandles();
		System.out.println(allWindows);
		return allWindows;

	}

	public static void switchWindow(int value) {

		List<String> l = new ArrayList<>();
		l.addAll(allWindow());
		driver.switchTo().window(l.get(value));

	}

	public static void navigateBack() {

		driver.navigate().back();
		System.out.println("Navigated to Back Window");

	}

	public static void navigateForward() {
		driver.navigate().forward();
		System.out.println("Navigated to the Next Window");

	}

	public static void navigateRefresh() {
		driver.navigate().refresh();
		System.out.println("Window Refreshed....");

	}
	
	public static void takeSnap(String picName) throws IOException {
		
		TakesScreenshot tk = (TakesScreenshot) driver;
		File src = tk.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\MDK Dinesh\\eclipse-workspace\\MavenPractice\\Screenshots\\"+picName+".png");
		FileUtils.copyFile(src, dest);

	}
	
	
	
	public static String readFromExcel(String sheetName, int rowNo, int cellNo) throws IOException {
		
		File f = new File("C:\\Users\\MDK Dinesh\\eclipse-workspace\\MavenPractice\\ExternalFiles\\ExcelBook.xlsx");
		
		FileInputStream fin = new FileInputStream(f);
		
		XSSFWorkbook book = new XSSFWorkbook(fin);
		
		XSSFSheet sh = book.getSheet(sheetName);
		
		XSSFRow row = sh.getRow(rowNo);
		
		XSSFCell cell = row.getCell(cellNo);
		
		CellType ct = cell.getCellType();
		
		String name = "";
		
		if(ct==CellType.STRING) {
			
			 name = cell.getStringCellValue();
		}
		
		else if(DateUtil.isCellDateFormatted(cell)) {
			
			Date da = cell.getDateCellValue();
			SimpleDateFormat sd = new SimpleDateFormat("dd-mmm, yyyy");
			 name = sd.format(da);
		}
		
		else {
			
			double d = cell.getNumericCellValue();
			long l = (long)d;
			 name = String.valueOf(l);
		}
		
		return name;
		
	}
	
	public static void getDateAndTime() {
		
		Date d = new Date();
		System.out.println(d);

	}
	
}
