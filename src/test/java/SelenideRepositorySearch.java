import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class SelenideRepositorySearch {

    @Test
    void shouldFindSelenideRepositoryAtTheTop() {

        open("https://github.com/");
        $("[placeholder = 'Search or jump to...']").click();
        $("#query-builder-test").setValue("selenide").pressEnter();
        $$(".Box-sc-g0xbh4-0 .kzrAHr").first().$("a"). click();
        $("#repository-container-header").shouldHave(text("selenide / selenide"));
        sleep(50);

    }
}
