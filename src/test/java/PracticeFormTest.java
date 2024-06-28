import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Condition.appear;
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
        $(".react-datepicker__month-select").$(byText("March")).click();
        $(".react-datepicker__year-select").$(byText("1980")).click();
        $(".react-datepicker__day--001:not(.react-datepicker__day--outside-month)").click();
        $("#subjectsInput").setValue("Hindi").pressEnter();
//        $("#hobbies-checkbox-1").click();
        $("#uploadPicture").uploadFromClasspath("pictures/1.png");
//        $("#uploadPicture").uploadFile(new File("src/test/resources/pictures/1.png"));
        $("#currentAddress").setValue("Gorod");
        $("#state").click();
        $("#stateCity-wrapper").$(byText("NCR")).click();
        $("#city").click();
        $("#stateCity-wrapper").$(byText("Delhi")).click();
//        $("#react-select-4-input").setValue("N").pressEnter();
        $("#submit").click();
        $(".modal-dialog").should(appear);
        $("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));
        $(".table-responsive").shouldHave(text("Mark"), text("Versal"), text("MarkVersal@ya.ru"), text("1234567890"));
//        $(".modal-body").shouldHave(text("PetrovOleg@mail.ru"));
//        $(".modal-body").shouldHave(text("Male"));
//        $(".modal-body").shouldHave(text("9168130220"));
//        $(".modal-body").shouldHave(text("13 March,1980"));
//        $(".modal-body").shouldHave(text("English"));
//        $(".modal-body").shouldHave(text("Music"));
//        $(".modal-body").shouldHave(text("Victory cq 5"));
//        $(".modal-body").shouldHave(text("Uttar Pradesh Agra"));
//        $("#closeLargeModal").click();
    }
}
