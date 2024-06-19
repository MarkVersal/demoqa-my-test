import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class ExampleTestAlfa {
    @Test
    void testAlfa(){
        open("https://alfabank.ru/");
        $(byText("Вклады")).click();
        $("body").shouldHave(text("Вклады"));
        $$(byText("Подробные условия")).find(visible).click();
        $(".j2CXpR ").shouldHave(text("Предложение месяца с самой высокой ставкой"));
        sleep(50000);


    }
}
