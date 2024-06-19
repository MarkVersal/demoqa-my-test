import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class PracticeFormTest {

        @BeforeAll
        static void beforeAll() {
            Configuration.browserSize = "1920x1080";
            Configuration.baseUrl = "https://demoqa.com";
        }

    @AfterAll
    static void afterAll() {
        sleep(5);
    }

    @Test
    void fillFormTest() {
        open("/automation-practice-form");
        $("#firstName").setValue("Mark");
        $("#lastName").setValue("Versal");
        $("#userEmail").setValue("MarkVersal@ya.ru");
        $(".custom-control-label").click();
        $("#userNumber").setValue("1234567890");
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").click();
        $(byText("January")).click();
        $(".react-datepicker__year-select").click();
        $(byText("1999")).click();
        //$(".react-datepicker__day.").click();
        //$(byText("1")).click();


    }
}
