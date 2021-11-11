package cz.czechitas.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class HlavniProgram {

    public void run() throws Exception {
//      System.setProperty("webdriver.gecko.driver", System.getProperty("user.home") + "/Java-Training/Selenium/geckodriver");
        System.setProperty("webdriver.gecko.driver", "C:\\Java-Training\\Selenium\\geckodriver.exe");

        WebDriver prohlizec;
        prohlizec = new FirefoxDriver();
        prohlizec.navigate().to("https://automation-playground.czechitas.repl.co/table.html");

//        int summaUzasnosti = 0;
//
//        List<WebElement> polozky = prohlizec.findElements(By.xpath("/html/body/div/table/tbody/tr/td[2]"));
//         for (WebElement polozkaSeznamu: polozky) {
//            String strLVLUzasnosti = polozkaSeznamu.getText();
//            System.out.println("LVL " + strLVLUzasnosti);
//
//            int intLVLUzasnosti = Integer.parseInt(strLVLUzasnosti);
//            summaUzasnosti = summaUzasnosti  +  intLVLUzasnosti;
//        }

//        System.out.println("Celkova summa uzasnosti je  " + summaUzasnosti);

//        List<WebElement> najdiMaleZvire = prohlizec.findElements(By.xpath("/html/body/div/table/tbody/tr/td[3]"));
//        for (WebElement polozka: najdiMaleZvire) {
//           if (polozka.getText().equals("malé")){
//               int pocetMalych =
//               pocetMalych++;
//           }
//            System.out.println("Pochet malych zvirat je  " + polozka.getText());
//        }

//        List<WebElement> najdiMaleZvirata = prohlizec.findElements(By.xpath("//td[3]"));
//        List<WebElement> jmena = prohlizec.findElements(By.xpath("//td[1]"));
//
        for (int i = 0; i < najdiMaleZvirata.size(); i++) {
            WebElement polozkaVelikost = najdiMaleZvirata.get(i);
            WebElement polozkaJmeno = jmena.get(i);
            if (polozkaVelikost.getText().equals("malé")) {
                System.out.println("Toto je male zvire: "+polozkaJmeno.getText());
            }
        }



//        List<WebElement> polozkyMaleZvire = prohlizec.findElements(By.xpath("//td[contains(text(),'malé')]"));
//        System.out.println("Malych zvirat je "+ polozkyMaleZvire.size());


        Thread.sleep(10_000);
        prohlizec.quit();

    }



}
