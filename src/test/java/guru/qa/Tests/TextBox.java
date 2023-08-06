package guru.qa.Tests;

import guru.qa.Page.TextBoxPage;
import org.junit.jupiter.api.Test;

import java.lang.module.Configuration;

import static com.codeborne.selenide.Selenide.sleep;

public class TextBox extends TestBase {
    @Test
    public void fillFormInTextBox() {
        TextBoxPage textBoxPage = new TextBoxPage();
        textBoxPage
                .openWebSite()
                .setUserName("Chingiz")
                .setUserEmail("chingiz-askarov@mail.ru")
                .setUserCurrentAddress("Russia")
                .setUserPermanentAddress("Azerbaijan")
                .clickSubmit();
        textBoxPage
                .checkUserName("Chingiz")
                .checkUserEmail("chingiz-askarov@mail.ru")
                .checkUserCurrentAddress("Russia")
                .checkUserPermanentAddress("Azerbaijan");


    }
}
