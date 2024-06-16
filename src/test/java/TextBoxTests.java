import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class TextBoxTests {

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";

    }

    @Test
    void fillFormTest() {
        open("/text-box");
        $("#userName").setValue("MarkVersal");
        $("#userEmail").setValue("MarkVersal@ya.ru");
        $("#currentAddress").setValue("TestAddress 1");
        $("#permanentAddress").setValue("TestAddress 2");
        $("#submit").click();

        $("#output").shouldHave(text("MarkVersal"), text("MarkVersal@ya.ru"),
                text("TestAddress 1"),text("TestAddress 2"));
    }
}
