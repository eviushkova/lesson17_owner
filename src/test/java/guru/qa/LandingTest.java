package guru.qa;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LandingTest extends TestBase {

    @Test
    void checkTitle() {

        open("/");
        $("#ltBlock1543870559").shouldHave(text("\n" +
                "\t\t\tШкола инженеров по автоматизации тестирования на Java\n" +
                "\t\t"));
    }
}
