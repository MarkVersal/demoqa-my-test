import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;

public class OtpBankCookie {

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://www.otpbank.ru";

    }

    @Test
    void closeCookiePopup() {
        open("/retail/bank-services/");
        $(withText("Продолжая просмотр сайта, вы даете согласие на обработку")).shouldBe(visible);
        $(byTagAndText("strong","Закрыть")).click();
        $(withText("Продолжая просмотр сайта, вы даете согласие на обработку")).shouldBe(hidden);
//        sleep(5000);
    }
}
