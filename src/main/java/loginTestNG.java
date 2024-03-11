import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.AutomationName;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class loginTestNG {

  @Test
    public void login_app() throws InterruptedException, MalformedURLException {

      UiAutomator2Options options = new UiAutomator2Options();
      options.setPlatformName("Android");
      options.setAutomationName(AutomationName.ANDROID_UIAUTOMATOR2);
      options.setDeviceName("Pixel 3");
      options.setApp(System.getProperty("user.dir") + "/apps/Preseus project.apk");

      AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
      Thread.sleep(10000);

  }
}
