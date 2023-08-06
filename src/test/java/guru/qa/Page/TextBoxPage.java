package guru.qa.Page;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxPage {
    SelenideElement
            // Input Values
            userNameInput = $("#userName"),
            userEmailInput = $("#userEmail"),
            userCurrentAddressInput = $("#currentAddress"),
            userPermanentAddressInput = $("#permanentAddress"),
    //Check Result
            checkName = $("#name"),
            checkEmail = $("#email"),
            checkCurrentAddress = $("#output #currentAddress"),
            checkPermanentAddress = $("#output #permanentAddress");


    //Test case
    public TextBoxPage openWebSite() {
        open("/text-box");
        Selenide.executeJavaScript("$('#fixedban').remove()");
        Selenide.executeJavaScript("$('footer').remove()");
        return this;
    }

    public TextBoxPage setUserName(String userName) {
        userNameInput.setValue(userName);
        return this;
    }

    public TextBoxPage setUserEmail(String userEmail) {
        userEmailInput.setValue(userEmail);
        return this;
    }

    public TextBoxPage setUserCurrentAddress(String userCurrentAddress) {
        userCurrentAddressInput.setValue(userCurrentAddress);
        return this;
    }

    public TextBoxPage setUserPermanentAddress(String userPermanentAddress) {
        userPermanentAddressInput.setValue(userPermanentAddress);
        return this;
    }

    public TextBoxPage clickSubmit() {
        $("#submit").click();
        return this;
    }

    //Result

    public TextBoxPage checkUserName(String name) {
        checkName.shouldHave(text(name));
        return this;
    }

    public TextBoxPage checkUserEmail(String email) {
        checkEmail.shouldHave(text(email));
        return this;
    }

    public TextBoxPage checkUserCurrentAddress(String currentAddress) {
        checkCurrentAddress.shouldHave(text(currentAddress));
        return this;
    }

    public TextBoxPage checkUserPermanentAddress(String permanentAddress) {
        checkPermanentAddress.shouldHave(text(permanentAddress));
        return this;
    }
}

