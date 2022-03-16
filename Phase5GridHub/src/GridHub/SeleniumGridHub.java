package GridHub;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumGridHub {
public static void main(String[] args) throws MalformedURLException {
	DesiredCapabilities dr= new DesiredCapabilities();
    
    dr.setBrowserName("chrome");
    dr.setPlatform(Platform.WINDOWS);
    
    URL url =new URL("http://192.168.0.104:4444/wd/hub");
    
    WebDriver driver= new RemoteWebDriver(url,dr);
    driver.get("https://www.google.com");
    System.out.println("MyTittle: "+ driver.getTitle());
    driver.close();
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
//    <build>
//    <plugins>
//         <plugin>
//    <groupId>org.apache.maven.plugins</groupId>
//    <artifactId>maven-compiler-plugin</artifactId>
//    <version>3.10.0</version>
//    <configuration>
//      <source>1.8</source>
//      <target>1.8</target>
//    </configuration>
//  </plugin>
//    </plugins>
//</build>
}
}
