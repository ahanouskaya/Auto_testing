package cz.czechitas.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HlavniProgramU2 {

    public void run() throws Exception {
//      System.setProperty("webdriver.gecko.driver", System.getProperty("user.home") + "/Java-Training/Selenium/geckodriver");
        System.setProperty("webdriver.gecko.driver", "C:\\Java-Training\\Selenium\\geckodriver.exe");

        WebDriver prohlizec;
        prohlizec = new FirefoxDriver();
        prohlizec.navigate().to("https://automation-playground.czechitas.repl.co/adding.html");

//        WebElement pridejKocku = prohlizec.findElement(By.id("addItem"));
//        for (int i=0; i<10; i++) {
//            pridejKocku.click();
//        }

        generujKocky(prohlizec, 10);
        vyhodnoceni(prohlizec, 10);

//        WebElement pocetKocek = prohlizec.findElement(By.id("counter"));
//        String counter = pocetKocek.getText();
//        int cislo = Integer.parseInt(counter);
//        if (cislo == 10) {
//            System.out.println("Pocet kocek je " + cislo);
//        }

//        WebElement odebratKocku = prohlizec.findElement(By.id("removeItem"));
//        for (int i=0; i<5; i++) {
//            odebratKocku.click();
//        }

//        WebElement pocetKocek2 = prohlizec.findElement(By.id("counter"));
//        String counter2 = pocetKocek2.getText();
//        int cislo2 = Integer.parseInt(counter2);
//        if (cislo2 == 5) {
//            System.out.println("Pocet kocek je PET ");
//        }


        WebElement apokalypsa = prohlizec.findElement(By.id("removeAll"));
        apokalypsa.click();

//        WebElement pocetKocek3 = prohlizec.findElement(By.id("counter"));
//        String counter3 = pocetKocek3.getText();
//        int cislo3 = Integer.parseInt(counter2);
//        if (cislo3 == 0) {
//            System.out.println("Pocet kocek je NULA ");
//        }

        Thread.sleep(10_000);
        prohlizec.quit();

    }


    public void generujKocky(WebDriver prohlizec, int kolik){
        WebElement pridejButton = prohlizec.findElement(By.id("addItem"));
        for (int i=0; i<kolik; i++) {
            pridejButton.click();
        }
    }

    public void vyhodnoceni (WebDriver prohlizec, int ocekovanychKocek){
        WebElement counter = prohlizec.findElement(By.id("counter"));
        String stPocetKocek = counter.getText();
        int intPocetKocek = Integer.parseInt(stPocetKocek);
        if (intPocetKocek == ocekovanychKocek) {
            System.out.println("Pocet kocek je ");
        }
    }
}
