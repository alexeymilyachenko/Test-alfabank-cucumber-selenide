import com.codeborne.selenide.Driver;
import com.codeborne.selenide.SelenideElement;
import cucumber.api.java.ru.Допустим;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Set;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class OdobrimCashSteps {
    //+
    @Допустим("^открываем сайт на странице \"([^\"]*)\"$")
    public void открываем_сайт_на_странице(String arg1) {
        open(arg1);
    }

    @Допустим("^вводим сумму стоимости недвижимости (\\d+)$")
    public void вводим_сумму_стоимости_недвижимости(String arg1) {
        $(By.name("estateCost")).sendKeys(Keys.CONTROL, "a");
        $(By.name("estateCost")).sendKeys("15000000");
    }
    @Допустим("^вводим первоночальный взнос (\\d+)$")
    public void вводим_первоночальный_взнос(String arg1) {
        $(By.name("initialFee")).sendKeys(Keys.CONTROL, "a");
        $(By.name("initialFee")).sendKeys("2250000");
    }
    @Допустим("^вводим срок кредитования (\\d+)$")
    public void вводим_срок_кредитования(String arg1) {
        $(By.name("creditTerm")).sendKeys(Keys.CONTROL, "a");
        $(By.name("creditTerm")).sendKeys("30");
    }
    @Допустим("^сравниваем таблицу со стоимостью, платежем и процентами$")
    public void сравниваем_таблицу_со_стоимостью_платежем_и_процентами() {

        for (SelenideElement selenideElement : $$((".paragraph__DxSUy.size-l__1z8kk.theme-white__2myGx.value__1HW9q"))) {
            System.out.println(selenideElement.getText());
        }
    }
    @Допустим("^нажимаем кнопку заполнить заявку$")
    public void нажимаем_кнопку_заполнить_заявку()  {
        $(".button__SX_Y9.size-m__3gqvj.red-white__SCmtl.button__2d9oJ").click();
    }
    @Допустим("^нажимаем кнопку Да$")
    public void нажимаем_кнопку_Да() {
        switchTo().window(1);//выбираем второе окно
        $$(".question__option--3EMGZ.question__option-small--1HSTf").get(0).click();//выбираем первый элемент"да"
        }
    }
}
