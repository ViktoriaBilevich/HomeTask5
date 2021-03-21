import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.util.List;

public class Tests_HomeTask_6 {

    @Test
    public void test1() {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("drivers/chromedriver.exe").getFile());
        String absolutePath = file.getAbsolutePath();

        System.setProperty("webdriver.chrome.driver", absolutePath);

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://english-e-reader.net/");

        WebElement element = driver.findElement(By.id("onesignal-slidedown-container"));
        Assert.assertTrue(element.isEnabled());

        WebElement element1 = driver.findElement(By.name("google-site-verification"));
        Assert.assertTrue(element1.isEnabled());

        WebElement cssIdSelector = driver.findElement(By.cssSelector("#onesignal-slidedown-container"));
        Assert.assertTrue(cssIdSelector.isEnabled());

        WebElement cssIdSelector2 = driver.findElement(By.cssSelector("#logout_modal"));
        Assert.assertTrue(cssIdSelector2.isEnabled());

        WebElement xPathId = driver.findElement(By.xpath("//*[@id='onesignal-slidedown-container']"));
        Assert.assertTrue(xPathId.isEnabled());

        WebElement xPathId2 = driver.findElement(By.xpath("//div[@id='logout_modal']"));
        Assert.assertTrue(xPathId2.isEnabled());

        driver.quit();
    }

    @Test
    public void test2() {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("drivers/chromedriver.exe").getFile());
        String absolutePath = file.getAbsolutePath();

        System.setProperty("webdriver.chrome.driver", absolutePath);

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://rabota.by/");

        WebElement element = driver.findElement(By.className("supernova-dashboard-content"));
        Assert.assertTrue(element.isEnabled());

        List<WebElement> element1 = driver.findElements(By.tagName("head"));
        Assert.assertEquals(1, element1.size());

        List<WebElement> linkElements = driver.findElements(By.linkText("TV-программа"));
        Assert.assertEquals(1, linkElements.size());

        List<WebElement> partialLinkElement = driver.findElements(By.partialLinkText("TV"));
        Assert.assertEquals(1, partialLinkElement.size());

        WebElement cssClassSelector = driver.findElement(By.cssSelector(".supernova-dashboard-content"));
        Assert.assertTrue(cssClassSelector.isEnabled());

        WebElement cssClassSelector2 = driver.findElement(By.cssSelector(".HH-Supernova-MainContent"));
        Assert.assertTrue(cssClassSelector2.isEnabled());

        WebElement cssClassSelector3 = driver.findElement(By.cssSelector(".supernova-footer.HH-Supernova-Footer"));
        Assert.assertTrue(cssClassSelector3.isEnabled());

        WebElement cssClassSelector4 = driver.findElement(By.cssSelector(".HH-Unsupported-Browser.important-info"));
        Assert.assertTrue(cssClassSelector4.isEnabled());

        WebElement cssClassSelector5 = driver.findElement(By.cssSelector(".supernova-overlay__content .bloko-columns-wrapper"));
        Assert.assertTrue(cssClassSelector5.isEnabled());

        WebElement cssClassSelector6 = driver.findElement(By.cssSelector(".bloko-columns-wrapper .supernova-overlay-closer-wrapper"));
        Assert.assertTrue(cssClassSelector6.isEnabled());

        List<WebElement> cssElemSelector = driver.findElements(By.cssSelector("head"));
        Assert.assertEquals(1, cssElemSelector.size());

        List<WebElement> cssElemSelector2 = driver.findElements(By.cssSelector("iframe"));
        Assert.assertEquals(3, cssElemSelector2.size());

        WebElement cssElemClassSelector = driver.findElement(By.cssSelector("div.HH-Supernova-MainContent"));
        Assert.assertTrue(cssElemClassSelector.isEnabled());

        WebElement cssElemClassSelector2 = driver.findElement(By.cssSelector("div.supernova-dashboard-content"));
        Assert.assertTrue(cssElemClassSelector2.isEnabled());

        List<WebElement> cssElemElemSelector1 = driver.findElements(By.cssSelector("head, title"));
        Assert.assertEquals(2, cssElemElemSelector1.size());

        WebElement cssElemElemSelector2 = driver.findElement(By.cssSelector("meta, head"));
        Assert.assertTrue(cssElemElemSelector2.isEnabled());

        List<WebElement> cssElemElemSelector3 = driver.findElements(By.cssSelector("head title"));
        Assert.assertEquals(1, cssElemElemSelector3.size());

        WebElement cssElemElemSelector4 = driver.findElement(By.cssSelector("div div.grid__columns-wrapper"));
        Assert.assertTrue(cssElemElemSelector4.isEnabled());

        WebElement cssElemElemSelector5 = driver.findElement(By.cssSelector(".supernova-navi div>button"));
        Assert.assertTrue(cssElemElemSelector5.isEnabled());

        WebElement cssElemElemSelector6 = driver.findElement(By.cssSelector(".supernova-overlay-closer-wrapper div>button"));
        Assert.assertTrue(cssElemElemSelector6.isEnabled());

        WebElement cssElemElemSelector7 = driver.findElement(By.cssSelector(".top-menu-item+div a[href*=finance]"));
        Assert.assertTrue(cssElemElemSelector7.isEnabled());

        WebElement cssElemElemSelector8 = driver.findElement(By.cssSelector("div+iframe"));
        Assert.assertTrue(cssElemElemSelector8.isEnabled());

        WebElement cssElemElemSelector9 = driver.findElement(By.cssSelector("script ~ iframe[name]"));
        Assert.assertTrue(cssElemElemSelector9.isEnabled());

        WebElement cssElemElemSelector10 = driver.findElement(By.cssSelector("script[data-name] ~ div.supernova-navi-fill"));
        Assert.assertTrue(cssElemElemSelector10.isEnabled());

        WebElement cssAttributeSelector = driver.findElement(By.cssSelector("iframe[id]"));
        Assert.assertTrue(cssAttributeSelector.isEnabled());

        WebElement cssAttributeSelector2 = driver.findElement(By.cssSelector("script+script[id]"));
        Assert.assertTrue(cssAttributeSelector2.isEnabled());

        WebElement cssAttributeValueSelector1 = driver.findElement(By.cssSelector("script[id=topmailru-code]"));
        Assert.assertTrue(cssAttributeValueSelector1.isEnabled());

        WebElement cssAttributeValueSelector2 = driver.findElement(By.cssSelector("div[class='supernova-dashboard-content']"));
        Assert.assertTrue(cssAttributeValueSelector2.isEnabled());

        WebElement cssAttributeValueSelector3 = driver.findElement(By.cssSelector("[content~='вакансий,']"));
        Assert.assertTrue(cssAttributeValueSelector3.isEnabled());

        WebElement cssAttributeValueSelector4 = driver.findElement(By.cssSelector("[placeholder~='компания']"));
        Assert.assertTrue(cssAttributeValueSelector4.isEnabled());

        WebElement cssAttributeValueSelector5 = driver.findElement(By.cssSelector("label[class |= 'bloko-input']"));
        Assert.assertTrue(cssAttributeValueSelector5.isEnabled());

        WebElement cssAttributeValueSelector6 = driver.findElement(By.cssSelector("[sandbox |= 'allow']"));
        Assert.assertTrue(cssAttributeValueSelector6.isEnabled());

        WebElement cssAttributeValueSelector7 = driver.findElement(By.cssSelector("meta[content ^= 'работа']"));
        Assert.assertTrue(cssAttributeValueSelector7.isEnabled());

        WebElement cssAttributeValueSelector8 = driver.findElement(By.cssSelector("meta[name ^= 'wmail']"));
        Assert.assertTrue(cssAttributeValueSelector8.isEnabled());

        WebElement cssAttributeValueSelector9 = driver.findElement(By.cssSelector("meta[content $= 'поиск']"));
        Assert.assertTrue(cssAttributeValueSelector9.isEnabled());

        WebElement cssAttributeValueSelector10 = driver.findElement(By.cssSelector("meta[name $= 'ection']"));
        Assert.assertTrue(cssAttributeValueSelector10.isEnabled());

        WebElement cssAttributeValueSelector11 = driver.findElement(By.cssSelector("meta[content *= 'резюм']"));
        Assert.assertTrue(cssAttributeValueSelector11.isEnabled());

        WebElement cssAttributeValueSelector12 = driver.findElement(By.cssSelector("body[class *= 'font']"));
        Assert.assertTrue(cssAttributeValueSelector12.isEnabled());

//xPath

        WebElement xPathClass = driver.findElement(By.xpath("//*[@class='supernova-dashboard-content']"));
        Assert.assertTrue(xPathClass.isEnabled());

        WebElement xPathClass2 = driver.findElement(By.xpath("//div[@class='HH-Supernova-MainContent']"));
        Assert.assertTrue(xPathClass2.isEnabled());

        WebElement xPathClass3 = driver.findElement(By.xpath("//div[contains(@class, 'HH-Supernova-Footer')]"));
        Assert.assertTrue(xPathClass3.isEnabled());

        WebElement xPathClass4 = driver.findElement(By.xpath("//*[contains(@class, 'HH-Unsupported-Browser')]"));
        Assert.assertTrue(xPathClass4.isEnabled());

        WebElement xPathClass5 = driver.findElement(By.xpath("//div[@class='supernova-overlay__content']/child::div"));
        Assert.assertTrue(xPathClass5.isEnabled());

        WebElement xPathClass6 = driver.findElement(By.xpath("//div[@class='bloko-columns-wrapper']/child::div[@class='supernova-overlay-closer-wrapper']"));
        Assert.assertTrue(xPathClass6.isEnabled());

        WebElement xPathElemClass = driver.findElement(By.xpath("//script[@data-name='HH/VacanciesOfTheDay']/ancestor::div"));
        Assert.assertTrue(xPathElemClass.isEnabled());

        WebElement xPathElemClass2 = driver.findElement(By.xpath("//div[@data-navi-item-name = 'copiny']/ancestor::div[contains(@class, 'content')]"));
        Assert.assertTrue(xPathElemClass2.isEnabled());

        WebElement xPathElemElem3 = driver.findElement(By.xpath("//head/title[contains(text(), 'свежие вакансии')]"));
        Assert.assertTrue(xPathElemElem3.isEnabled());

        WebElement xPathElemElem4 = driver.findElement(By.xpath("//*[@class='grid__column']/ancestor-or-self::div[@class='grid__columns-wrapper']"));
        Assert.assertTrue(xPathElemElem4.isEnabled());

        WebElement xPathElemElem5 = driver.findElement(By.xpath("//div[@class='supernova-navi']/descendant::button"));
        Assert.assertTrue(xPathElemElem5.isEnabled());

        WebElement xPathElemElem6 = driver.findElement(By.xpath("//*[@class='supernova-overlay__content']/descendant::button"));
        Assert.assertTrue(xPathElemElem6.isEnabled());

        WebElement xPathElemElem7 = driver.findElement(By.xpath("//a[text()='Финансы']"));
        Assert.assertTrue(xPathElemElem7.isEnabled());

        WebElement xPathElemElem8 = driver.findElement(By.xpath("//*[@class='footer-counters']/following::iframe[1]"));
        Assert.assertTrue(xPathElemElem8.isEnabled());

        WebElement xPathElemElem9 = driver.findElement(By.xpath("//*[@data-navi-item-name='copiny']/following-sibling::div[@class='supernova-navi-fill']"));
        Assert.assertTrue(xPathElemElem9.isEnabled());

        WebElement xPathAttribute = driver.findElement(By.xpath("//script/preceding-sibling::script[@defer='defer']"));
        Assert.assertTrue(xPathAttribute.isEnabled());

        WebElement xPathAttribute2 = driver.findElement(By.xpath("//script/preceding::script[@id='topmailru-code']"));
        Assert.assertTrue(xPathAttribute2.isEnabled());

        WebElement xPathAttribute3 = driver.findElement(By.xpath("//meta/preceding::title"));
        Assert.assertTrue(xPathAttribute3.isEnabled());

        WebElement xPathAttribute4 = driver.findElement(By.xpath("//script/preceding-sibling::meta[@name='keywords']"));
        Assert.assertTrue(xPathAttribute4.isEnabled());

        WebElement xPathAttributeValue2 = driver.findElement(By.xpath("//div[@class='bloko-columns-wrapper']/following::div[contains(@class,'-dashboard-content')]"));
        Assert.assertTrue(xPathAttributeValue2.isEnabled());

        WebElement xPathElement = driver.findElement(By.xpath("//div[@class='bloko-columns-wrapper']/following-sibling::div[@class='footer-counters']"));
        Assert.assertTrue(xPathElement.isEnabled());

        WebElement xPathElement2 = driver.findElement(By.xpath("//div[@class='bloko-columns-wrapper']/parent::div[contains(@class, '__navi')]"));
        Assert.assertTrue(xPathElement2.isEnabled());

        WebElement xPathElement3 = driver.findElement(By.xpath("//div[@data-navi-item-name='copiny']/parent::div"));
        Assert.assertTrue(xPathElement3.isEnabled());

        WebElement xPathElement5 = driver.findElement(By.xpath("//*[text()='Погода']"));
        Assert.assertTrue(xPathElement5.isEnabled());

        WebElement xPathElement6 = driver.findElement(By.xpath("//*[text()='TV-программа']"));
        Assert.assertTrue(xPathElement6.isEnabled());

        //    WebElement xPathElement4 = driver.findElement(By.xpath("//div[@class='supernova-navi-item supernova-navi-item_lvl-2 HH-Supernova-NaviLevel2-Item supernova-navi-item_dashboard ']/attribute::data-navi-item-name "));
        //    Assert.assertTrue(xPathElement4.isEnabled());

        //      WebElement xPathElemElem9 = driver.findElement(By.xpath("//iframe/attribute::id"));
        //      Assert.assertTrue(xPathElemElem9.isEnabled());

        driver.quit();
    }
}
