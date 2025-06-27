package steps;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import static javax.swing.text.html.CSS.getAttribute;


public class FacilityPage {

     public static WebDriver driver;

////     @Before
////     public void beforScenario(){
////         try {
////             loadProperties()
////             if (driver == null) {
////            launchBrowser();
////             }
////         }
////     }
////     catch(Exception e){
////         e.printStackTrace();
//    }

     @Given("Navigate to Devtula Home Page")
    public void NavigateToLoginPage() throws InterruptedException {
        System.setProperty("Webdriver.chrome.driver", "E://IntelliJ Java Prgrams and frameworks_poornima//Selenium jars and drivers//Drivers//Chromedriver//Chromedriver//Chromedriver.exe");
        driver = new ChromeDriver();
        //String loginUrl = .getProperty("login.url");
        driver.get("https://dev.icsr.in/Devtula/Home/Dashboard");

         //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
         driver.findElement(By.id("UserName")).sendKeys("VS13249");
         driver.findElement(By.id("Password")).sendKeys("PUNJABpeas@28");
         Thread.sleep(2000);
         driver.findElement(By.id("btnlogin")).click();

         Thread.sleep(2000);

         //driver.switchTo().frame("myModal2");
         //driver.findElement(By.name("recaptchaToken")).getAttribute("value");

         //driver.get(loginUrl);
         driver.manage().window().maximize();
    }

    @Then("Click FacilityModule in HomePage")
    public void clickFacilityModuleInHomePage() {
        WebElement ClickFacilityModule = driver.findElement(By.xpath("\n" +
                "//*[@id=\"Module_3\"]/i"));
        ClickFacilityModule.click();

        //WebElement SearchText = driver.findElement(By.id("txtSearch"));
        //SearchText.sendKeys("srb");
        //driver.findElement(By.id("btnSearch")).click();
    }
    @Then("Click SRB")
    public void clickSRB() {
        WebElement ClickSRB= driver.findElement(By.xpath("/html/body/div[4]/div/div[1]/div[4]/div/div/ul/li[1]/ul/li/a"));
        ClickSRB.click();
    }

    @Then("click Add new button in SRB list")
    public void clickAddNewButtonInSRBList() {

        WebElement Addnew = driver.findElement(By.id("btnAddNew"));
        System.out.println("title of the parent page:"+driver.getTitle());
        Addnew.click();
        String tab1=driver.getWindowHandle();
        driver.switchTo().window(tab1);
    }



    @Then ("Enter Item details")
    public void enterItemDetails() throws InterruptedException {
         //WebElement iframe= driver.findElement(By.name("frmSRB"));
         //driver.switchTo().frame("frmSRB");

        Thread.sleep(2000);


        //Select ItemCategory = new Select(driver.findElement(By.name("ItemCategory")));


        //Thread.sleep(2000);
//       Set<String> windowHandles = driver.getWindowHandles();
//        Iterator <String> itr = windowHandles.iterator();
//        String parentId =itr.next();
//        String ChildId = itr.next();
//
//        Thread.sleep(2000);
//
//        driver.switchTo().window(ChildId);
//        System.out.println("title of the Child page:"+driver.getTitle());


         //driver.switchTo().frame(driver.findElement(By.cssSelector()));

        //WebElement SRBWindow = driver.findElement(By.id("AddNewSRBModal"));
        //SRBWindow.isDisplayed();


      WebElement ItemCategory  = driver.findElement(By.id("ItemCategory"));
        Select selectObject  = new Select(ItemCategory);

        selectObject.selectByVisibleText("Consumables");

//        List<WebElement> optionList = selectObject.getOptions();
//
//       for(WebElement option : optionList) {
//           System.out.println(option.getText());
//           WebElement Quantity = driver.findElement(By.id("Quantity"));
//           if (selectObject.getFirstSelectedOption().getText().equals("Consumables")) {
//               Quantity.getAttribute("value");
//               option.click();
//           } else if (selectObject.getFirstSelectedOption().getText().equals("Electricals")) {
//               Quantity.getAttribute("value");
//               option.click();
//           } else if (selectObject.getFirstSelectedOption().getText().equals("Electronic")) {
//               Quantity.getAttribute("value");
//               option.click();
//           } else if (selectObject.getFirstSelectedOption().getText().equals("Others")) {
//               Quantity.sendKeys("3");
//               option.click();
//           } else if (selectObject.getFirstSelectedOption().getText().equals("Service")) {
//               Quantity.sendKeys("3");
//               option.click();
//           } else if (selectObject.getFirstSelectedOption().getText().equals("Stationary")) {
//               Quantity.sendKeys("3");
//               option.click();
//           }
//       }

        //ItemCategory.selectByVisibleText("Electricals");
        //Thread.sleep(2000);

        //ItemCategory.selectByVisibleText("Electronic");
        //Thread.sleep(2000);

        //ItemCategory.selectByVisibleText("Others");
        //Thread.sleep(2000);

        //ItemCategory.selectByVisibleText("Service");
//        Thread.sleep(2000);

//       ItemCategory.selectByVisibleText("Stationary");
//        Thread.sleep(2000);

//        WebElement Quantity = driver.findElement(By.id("Quantity"));
//        Quantity.sendKeys("3");

        WebElement ItemName = driver.findElement(By.id("ItemName"));
        ItemName.sendKeys("Engine");

        //driver.findElement(By.id("divDefContent")).sendKeys("2000");
        //Thread.sleep(2000);
        //driver.findElement(By.id("ItemName")).sendKeys("Laptop");
        Thread.sleep(2000);

        WebElement Quantity = driver.findElement(By.id("Quantity"));
        Quantity.sendKeys("2");

        Select UOM_select = new Select(driver.findElement(By.id("UOM")));
        UOM_select.selectByVisibleText("Nos");
        Thread.sleep(2000);

        WebElement Itemvalue = driver.findElement(By.id("TotalAmount"));
        Itemvalue.sendKeys("10000");

//        UOM_select.selectByVisibleText("Bundle");
//        Thread.sleep(2000);
//
//        UOM_select.selectByVisibleText("Box");
//        Thread.sleep(2000);
//
//        UOM_select.selectByVisibleText("KG");
//        Thread.sleep(2000);

    //   WebElement IsAsset = driver.findElement(By.id("divDefContent"));
       //IsAsset.click();



            WebElement suppliername = driver.findElement(By.id("SupplierName"));
            suppliername.sendKeys("Dell Technologies India pvt ltd");
            Thread.sleep(2000);

            Select Department_select = new Select(driver.findElement(By.id("Department")));
            Department_select.selectByVisibleText("IT");
            System.out.println(Department_select.getFirstSelectedOption().getText());

            WebElement PO_number = driver.findElement(By.id("PONumber"));
            PO_number.sendKeys("PO123456");

            WebElement Invoice_date = driver.findElement(By.id("PurchaseDate"));
            Invoice_date.click();

//        //Select year = new Select(driver.findElement(By.id("ui-datepicker-div")));
//        year.selectByVisibleText("2022");
//
//        WebElement Nextbutton = driver.findElement(By.id("ui-datepicker-div"));
//
//        Select month = new Select(driver.findElement(By.id("ui-datepicker-div")));

            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("document.getElementById('ui-datepicker-div').value='18-May-2025'");

            WebElement Inward_Date = driver.findElement(By.id("InwardDate"));
            Inward_Date.click();
            JavascriptExecutor js2 = (JavascriptExecutor) driver;
            js2.executeScript("document.getElementById('ui-datepicker-div').value='18-May-2025'");

            WebElement Invoice_Number = driver.findElement(By.id("InvoiceNumber"));
            Invoice_Number.sendKeys("INVOICE123456");

            WebElement Tax_rate = driver.findElement(By.id("TaxRate"));
            Tax_rate.sendKeys("18");

            WebElement PO_documentUpload = driver.findElement(By.id("PODocument"));
            PO_documentUpload.sendKeys("C:/Users/poornima/Downloads/template.pdf");

            WebElement Remarks = driver.findElement(By.id("Remarks"));
            Remarks.sendKeys("This is a remark");

            WebElement Submit_button = driver.findElement(By.id("btnSubmit"));
            Submit_button.click();















    }
}
