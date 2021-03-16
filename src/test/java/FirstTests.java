import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.util.List;

public class FirstTests {
    @Test
    public void  smokeTest1() throws InterruptedException {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("drivers/chromedriver.exe").getFile());
        String absolutePath = file.getAbsolutePath();

        System.setProperty("webdriver.chrome.driver", absolutePath);

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://calc.by/building-calculators/laminate.html");

        WebElement roomLength = driver.findElement(By.id("ln_room_id"));
        roomLength.clear();
        roomLength.sendKeys("500");

        WebElement roomWidth = driver.findElement(By.id("wd_room_id"));
        roomWidth.clear();
        roomWidth.sendKeys("400");

        WebElement laminatePanelLength = driver.findElement(By.id("ln_lam_id"));
        laminatePanelLength.clear();
        laminatePanelLength.sendKeys("2000");

        WebElement laminatePanelWidth = driver.findElement(By.id("wd_lam_id"));
        laminatePanelWidth.clear();
        laminatePanelWidth.sendKeys("200");

        WebElement selectWebElement = driver.findElement(By.id("laying_method_laminate"));
        Select layingMethodLaminate = new Select(selectWebElement);
        layingMethodLaminate.selectByVisibleText("с использованием отрезанного элемента");


        List<WebElement> list = driver.findElements(By.name("direction-laminate"));

        for (WebElement option: list){
            if (option.getAttribute("value").equals("1")){
                option.click();
            }
        }

        WebElement calcBtn = driver.findElement(By.className("calc-btn-div"));
        calcBtn.click();

        Thread.sleep(1200);
        WebElement numberOfLaminateBoards = driver.findElement(By.xpath("//span[text() = '53']"));
        String numberOfLaminateBoardsText = numberOfLaminateBoards.getText();

        WebElement numberOfLaminatePackages = driver.findElement(By.xpath("//span[text() = '7']"));
        String numberOfLaminatePackagesText = numberOfLaminatePackages.getText();


        Assert.assertEquals(numberOfLaminateBoardsText, "53", "Неверное значение количества досок ламината");
        Assert.assertEquals(numberOfLaminatePackagesText, "7", "Неверное значение количества упаковок ламината");

        driver.quit();
    }

    @Test
    public void smokeTest2(){

        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("drivers/chromedriver.exe").getFile());
        String absolutePath = file.getAbsolutePath();

        System.setProperty("webdriver.chrome.driver", absolutePath);

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://masterskayapola.ru/kalkulyator/laminata.html");

        WebElement roomLength = driver.findElement(By.name("calc_roomwidth"));
        roomLength.sendKeys(Keys.chord(Keys.CONTROL, "a"), "7");

        WebElement roomWidth = driver.findElement(By.name("calc_roomheight"));
        roomWidth.sendKeys(Keys.chord(Keys.CONTROL, "a"), "3,5");

        WebElement laminatePanelLength = driver.findElement(By.name("calc_lamwidth"));
        laminatePanelLength.sendKeys(Keys.chord(Keys.CONTROL, "a"), "1200");

        WebElement laminatePanelWidth = driver.findElement(By.name("calc_lamheight"));
        laminatePanelWidth.sendKeys(Keys.chord(Keys.CONTROL, "a"), "200");

        WebElement laminateInPackages = driver.findElement(By.name("calc_inpack"));
        laminateInPackages.sendKeys(Keys.chord(Keys.CONTROL, "a"), "12");

        WebElement price = driver.findElement(By.name("calc_price"));
        price.sendKeys(Keys.chord(Keys.CONTROL, "a"), "600");

        WebElement selectWebElement = driver.findElement(By.name("calc_direct"));
        Select layingMethodLaminate = new Select(selectWebElement);
        layingMethodLaminate.selectByIndex(1);

        WebElement calcBtn = driver.findElement(By.className("tocalc"));
        calcBtn.click();


        WebElement layingArea = driver.findElement(By.xpath("//b[text() = '24.29']"));
        String layingAreaText = layingArea.getText();

        WebElement numberOfLaminateBoards = driver.findElement(By.xpath("//b[text() = '106']"));
        String numberOfLaminateBoardsText = numberOfLaminateBoards.getText();

        WebElement numberOfLaminatePackages = driver.findElement(By.xpath("//b[text() = '9']"));
        String numberOfLaminatePackagesText = numberOfLaminatePackages.getText();

        WebElement cost = driver.findElement(By.xpath("//b[text() = '15552']"));
        String costText = cost.getText();

        WebElement remainder = driver.findElement(By.xpath("//b[text() = '2']"));
        String remainderText = remainder.getText();

        WebElement segments = driver.findElement(By.xpath("//b[text() = '11']"));
        String segmentsText = segments.getText();

        Assert.assertEquals(layingAreaText, "24.29");
        Assert.assertEquals(numberOfLaminateBoardsText, "106");
        Assert.assertEquals(numberOfLaminatePackagesText, "9");
        Assert.assertEquals(costText, "15552");
        Assert.assertEquals(remainderText, "2");
        Assert.assertEquals(segmentsText, "11");

        driver.quit();
    }

    @Test
    public void smokeTest3(){

        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("drivers/chromedriver.exe").getFile());
        String absolutePath = file.getAbsolutePath();

        System.setProperty("webdriver.chrome.driver", absolutePath);

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://masterskayapola.ru/kalkulyator/laminata.html");

        WebElement roomLength = driver.findElement(By.name("calc_roomwidth"));
        roomLength.sendKeys(Keys.chord(Keys.CONTROL, "a"), "7");

        WebElement roomWidth = driver.findElement(By.name("calc_roomheight"));
        roomWidth.sendKeys(Keys.chord(Keys.CONTROL, "a"), "4");

        WebElement laminatePanelLength = driver.findElement(By.name("calc_lamwidth"));
        laminatePanelLength.sendKeys(Keys.chord(Keys.CONTROL, "a"), "1200");

        WebElement laminatePanelWidth = driver.findElement(By.name("calc_lamheight"));
        laminatePanelWidth.sendKeys(Keys.chord(Keys.CONTROL, "a"), "200");

        WebElement laminateInPackages = driver.findElement(By.name("calc_inpack"));
        laminateInPackages.sendKeys(Keys.chord(Keys.CONTROL, "a"), "12");

        WebElement price = driver.findElement(By.name("calc_price"));
        price.sendKeys(Keys.chord(Keys.CONTROL, "a"), "600");

        WebElement selectWebElement = driver.findElement(By.name("calc_direct"));
        Select layingMethodLaminate = new Select(selectWebElement);
        layingMethodLaminate.selectByIndex(0);

        WebElement offsetRows = driver.findElement(By.name("calc_bias"));
        offsetRows.sendKeys(Keys.chord(Keys.CONTROL, "a"), "250");

        WebElement distanceFromWalls = driver.findElement(By.name("calc_walldist"));
        distanceFromWalls.sendKeys(Keys.chord(Keys.CONTROL, "a"), "8");


        WebElement calcBtn = driver.findElement(By.className("tocalc"));
        calcBtn.click();

        WebElement layingArea = driver.findElement(By.xpath("//b[text() = '27.82']"));
        String layingAreaText = layingArea.getText();

        WebElement numberOfLaminateBoards = driver.findElement(By.xpath("//b[text() = '121']"));
        String numberOfLaminateBoardsText = numberOfLaminateBoards.getText();

        WebElement numberOfLaminatePackages = driver.findElement(By.xpath("//b[text() = '11']"));
        String numberOfLaminatePackagesText = numberOfLaminatePackages.getText();

        WebElement cost = driver.findElement(By.xpath("//b[text() = '19008']"));
        String costText = cost.getText();

        WebElement remainder = driver.findElement(By.xpath("//b[text() = '11']"));
        String remainderText = remainder.getText();

        WebElement segments = driver.findElement(By.xpath("//b[text() = '7']"));
        String segmentsText = segments.getText();

        Assert.assertEquals(layingAreaText, "27.82");
        Assert.assertEquals(numberOfLaminateBoardsText, "121");
        Assert.assertEquals(numberOfLaminatePackagesText, "11");
        Assert.assertEquals(costText, "19008");
        Assert.assertEquals(remainderText, "11");
        Assert.assertEquals(segmentsText, "7");

        driver.quit();
    }

    @Test
    public void smokeTest4(){

        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("drivers/chromedriver.exe").getFile());
        String absolutePath = file.getAbsolutePath();

        System.setProperty("webdriver.chrome.driver", absolutePath);

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://masterskayapola.ru/kalkulyator/laminata.html");

        WebElement roomLength = driver.findElement(By.name("calc_roomwidth"));
        roomLength.sendKeys(Keys.chord(Keys.CONTROL, "a"), "5.155");

        WebElement roomWidth = driver.findElement(By.name("calc_roomheight"));
        roomWidth.sendKeys(Keys.chord(Keys.CONTROL, "a"), "4");

        WebElement laminatePanelLength = driver.findElement(By.name("calc_lamwidth"));
        laminatePanelLength.sendKeys(Keys.chord(Keys.CONTROL, "a"), "1000");

        WebElement laminatePanelWidth = driver.findElement(By.name("calc_lamheight"));
        laminatePanelWidth.sendKeys(Keys.chord(Keys.CONTROL, "a"), "215");

        WebElement laminateInPackages = driver.findElement(By.name("calc_inpack"));
        laminateInPackages.sendKeys(Keys.chord(Keys.CONTROL, "a"), "8");

        WebElement price = driver.findElement(By.name("calc_price"));
        price.sendKeys(Keys.chord(Keys.CONTROL, "a"), "485");

        WebElement selectWebElement = driver.findElement(By.name("calc_direct"));
        Select layingMethodLaminate = new Select(selectWebElement);
        layingMethodLaminate.selectByIndex(1);

        WebElement offsetRows = driver.findElement(By.name("calc_bias"));
        offsetRows.sendKeys(Keys.chord(Keys.CONTROL, "a"), "300");

        WebElement distanceFromWalls = driver.findElement(By.name("calc_walldist"));
        distanceFromWalls.sendKeys(Keys.chord(Keys.CONTROL, "a"), "12");


        WebElement calcBtn = driver.findElement(By.className("tocalc"));
        calcBtn.click();

        WebElement layingArea = driver.findElement(By.xpath("//b[text() = '20.40']"));
        String layingAreaText = layingArea.getText();

        WebElement numberOfLaminateBoards = driver.findElement(By.xpath("//b[text() = '97']"));
        String numberOfLaminateBoardsText = numberOfLaminateBoards.getText();

        WebElement numberOfLaminatePackages = driver.findElement(By.xpath("//b[text() = '13']"));
        String numberOfLaminatePackagesText = numberOfLaminatePackages.getText();

        WebElement cost = driver.findElement(By.xpath("//b[text() = '10844']"));
        String costText = cost.getText();

        WebElement remainder = driver.findElement(By.xpath("//b[text() = '7']"));
        String remainderText = remainder.getText();

        WebElement segments = driver.findElement(By.xpath("//b[text() = '10']"));
        String segmentsText = segments.getText();

        Assert.assertEquals(layingAreaText, "20.40");
        Assert.assertEquals(numberOfLaminateBoardsText, "97");
        Assert.assertEquals(numberOfLaminatePackagesText, "13");
        Assert.assertEquals(costText, "10844");
        Assert.assertEquals(remainderText, "7");
        Assert.assertEquals(segmentsText, "10");

        driver.quit();
    }
}
