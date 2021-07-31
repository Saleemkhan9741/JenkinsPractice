package PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    @FindBy(xpath = "//span[contains(text(),'Okay')]")
    private WebElement okayButton;

    @FindBy(xpath = "//i[@class='o-icon-close-circle o-icon--large']")
    private WebElement noAdsCloseButton;

    @FindBy(xpath = "//input[@type='text']")
    private WebElement searchBar;

    @FindBy(xpath = "//span[text()='Dismiss']")
    private WebElement adsPopup;

    @FindBy(xpath = "//div[@class='rbt-input-hint-container']")
    private WebElement searchBarIcon;

    public HomePage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public WebElement getOkayButton() {
        return okayButton;
    }

    public void setOkayButton(WebElement okayButton) {
        this.okayButton = okayButton;
    }

    public WebElement getNoAdsCloseButton() {
        return noAdsCloseButton;
    }

    public void setNoAdsCloseButton(WebElement noAdsCloseButton) {
        this.noAdsCloseButton = noAdsCloseButton;
    }

    public WebElement getSearchBar() {
        return searchBar;
    }

    public void setSearchBar(WebElement searchBar) {
        this.searchBar = searchBar;
    }

    public WebElement getAdsPopup() {
        return adsPopup;
    }

    public void setAdsPopup(WebElement adsPopup) {
        this.adsPopup = adsPopup;
    }

    public WebElement getSearchBarTab() {
        return searchBarIcon;
    }

    public void setSearchBarIcon(WebElement searchBarIcon) {
        this.searchBarIcon = searchBarIcon;
    }

}
