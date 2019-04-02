package jar.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import java.util.concurrent.TimeUnit;
import java.util.NoSuchElementException;
import com.cognifide.qa.bb.qualifier.PageObject;
import com.google.inject.Inject;

@PageObject
public class PandaPage {

  private static final String URL =  "http://application:8080";

  @Inject
  private WebDriver webDriver;
  
  @FindBy(linkText = "here")
  private WebElement pandaURL;

  public WebElement findLink() {
    return this.pandaURL;
  }

  public void waitForVideo() {
    try{
      Thread.sleep(2000);
    }
    catch(InterruptedException ie){
    }
  }

  public PandaPage open() {
    webDriver.get(URL);
    return this;
  }

  @FindBy(id = "panda")
  private WebElement image;
  
  public boolean checkImage() {
    WebElement imageFile = this.image;
    try {
      return imageFile.isDisplayed();
    }
    catch (NoSuchElementException e) {
      return false;
    }
  }
}
