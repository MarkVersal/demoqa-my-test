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
        sleep(50000);
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
        $(".react-datepicker__month-select").$(byText("March")).click();
        $(".react-datepicker__year-select").$(byText("1980")).click();
        $(".react-datepicker__month-container").$(byText("1")).click();
        $("#subjectsInput").setValue("H").pressEnter();
        $("#hobbies-checkbox-1").click();
        $("#uploadPicture").uploadFromClasspath("src/test/resources/pictures/3.jpg");
        $("#currentAddresscheckbox-1").setValue("Gorod");
        $("#react-select-3-input-1").setValue("N").pressEnter();
        $("#react-select-4-input").setValue("N").pressEnter();
        $("#submit").click();






//        $(".react-datepicker__month-select").selectOption("January");
//        $(byText("January")).click();
//        $(byText("1999")).click();
//        $(".subjects-auto-complete__value-container").setValue("H");
//        $("#react-select-2-option-0").click();



        //$(".react-datepicker__day.").click();
        //$(byText("1")).click();


    }
}
