package pages;

import org.openqa.selenium.WebDriver;
import utilities.SafeActions;

public class Organization_Structure_page extends SafeActions {
    public WebDriver driver;
    public Organization_Structure_page(WebDriver driver){
        super(driver);
        this.driver=driver;
}
}

