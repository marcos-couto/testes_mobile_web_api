/*
############################################################################################################
PROJETO: Exercícios Práticos - ITEM 3
CUROS: Início Rápido em Teste de Software
APLICATIVO ALVO: icarros - Versão 4.19.3

                               -ESPECIFICAÇÕES DO AMBIENTE DE TESTE-
------------------------------------------------------------------------------------------------------------
1 - Sistema Operacional: Linux Fedora 31
2-  IDE: IntelliJ IDEA 2020.1.2 Build #IC-201.7846.76, built on June 1, 2020
3-  Test Automation Framework: Appium 1.17.1-1 (Node.js 12.8.1 Electron 7.2.4)
4 - Browser : Google Chrome Versão 83.0.4103.61 (Versão oficial) 64 bits
5 - Android Studio:Android Studio 4.0 Build #AI-193.6911.18.40.6514223, built on May 20, 2020
6 - Android Version: 8.1 Oreo API Level 27 System Image x86_64 / 9.0 Pie API Level 28 System Image x86_64
------------------------------------------------------------------------------------------------------------
Autor: Marcos A. M. Couto
e-mail: mc3labs@outlook.com
Data: 10/06/2020
Versão do Teste : v1.0

############################################################################################################
 */

// Bibliotecas
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

// Main Class
public class MyTest {

        private static final String APP = "br.com.icarros.androidapp"; // Definição do app alvo do teste
        private static final String APPIUM = "http://localhost:4723/wd/hub"; // Configuração de parâmetros do Appium

        private AndroidDriver driver; // Definição do driver

// Variáveis da pesquisa
        private String marca1W;
        private String marca1R;
        private String modelo1W;
        private String modelo1R;
        private String preco1W;
        private String preco1R;
        private String ano1W;
        private String ano1R;
        private String km1W;
        private String km1R;
        private String cor1W;
        private String cor1R;
        private String cambio1W;
        private String cambio1R;

        private String marca2W;
        private String marca2R;
        private String modelo2W;
        private String modelo2R;
        private String preco2W;
        private String preco2R;
        private String ano2W;
        private String ano2R;
        private String km2W;
        private String km2R;
        private String cor2W;
        private String cor2R;
        private String cambio2W;
        private String cambio2R;

        private String marca3W;
        private String marca3R;
        private String modelo3W;
        private String modelo3R;
        private String preco3W;
        private String preco3R;
        private String ano3W;
        private String ano3R;
        private String km3W;
        private String km3R;
        private String cor3W;
        private String cor3R;
        private String cambio3W;
        private String cambio3R;

        private String marca4W;
        private String marca4R;
        private String modelo4W;
        private String modelo4R;
        private String preco4W;
        private String preco4R;
        private String ano4W;
        private String ano4R;
        private String km4W;
        private String km4R;
        private String cor4W;
        private String cor4R;
        private String cambio4W;
        private String cambio4R;

        public JSONObject carroJSON(String marca, String modelo, String ano, String km, String cor, String cambio, String preco) {

            JSONObject carro = new JSONObject();
            carro.put("marca", marca);
            carro.put("modelo", modelo);
            carro.put("ano", ano);
            carro.put("km", km);
            carro.put("cor", cor);
            carro.put("cambio", cambio);
            carro.put("preco", preco);


            return carro;
        }            // Escrita dos dados no arquivo carros.json

        public void writeCarros(JSONObject carro1, JSONObject carro2, JSONObject carro3, JSONObject carro4, String path ) {

            JSONObject carros = new JSONObject();
            carros.put("carro1", carro1);
            carros.put("carro2", carro2);
            carros.put("carro3", carro3);
            carros.put("carro4", carro4);


            try (FileWriter file = new FileWriter (path)) {
                file.write(carros.toString());
            } catch (IOException e) {
                e.printStackTrace();
            }

        } // Método - Escrita no arquivo

       public JSONObject readCarros(String path) {
        JSONParser parser = new JSONParser();
        JSONObject obj = new JSONObject();

           try (Reader reader = new FileReader(path)) {

            obj = (JSONObject) parser.parse(reader);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return obj;
    }  // Método - Leitua do Arquivo

        @Before
        public void setUp() throws Exception {
            DesiredCapabilities caps = new DesiredCapabilities(); // Definição das Capabilities
            caps.setCapability("platformName", "Android");
            caps.setCapability("platformVersion", "8.1");
            caps.setCapability("deviceName", "Android Emulator");
            caps.setCapability("automationName", "UiAutomator2");
            caps.setCapability("appPackage", APP);
            caps.setCapability("appActivity", "br.com.icarros.androidapp.ui.home.MainActivity");



        JSONObject carros = readCarros("carros.json"); // Início da leitura do conteúdo do arquivo carros.jon

        JSONObject c1 = (JSONObject) carros.get("carro1");
        JSONObject c2 = (JSONObject) carros.get("carro1");
        JSONObject c3 = (JSONObject) carros.get("carro1");
        JSONObject c4 = (JSONObject) carros.get("carro1");
        JSONObject c5 = (JSONObject) carros.get("carro1");
        JSONObject c6 = (JSONObject) carros.get("carro1");
        JSONObject c7 = (JSONObject) carros.get("carro1");


        JSONObject c8 = (JSONObject) carros.get("carro2");
        JSONObject c9 = (JSONObject) carros.get("carro2");
        JSONObject c10 = (JSONObject) carros.get("carro2");
        JSONObject c11 = (JSONObject) carros.get("carro2");
        JSONObject c12 = (JSONObject) carros.get("carro2");
        JSONObject c13 = (JSONObject) carros.get("carro2");
        JSONObject c14 = (JSONObject) carros.get("carro2");

        JSONObject c15 = (JSONObject) carros.get("carro3");
        JSONObject c16 = (JSONObject) carros.get("carro3");
        JSONObject c17 = (JSONObject) carros.get("carro3");
        JSONObject c18 = (JSONObject) carros.get("carro3");
        JSONObject c19 = (JSONObject) carros.get("carro3");
        JSONObject c20 = (JSONObject) carros.get("carro3");
        JSONObject c21 = (JSONObject) carros.get("carro3");

        JSONObject c22 = (JSONObject) carros.get("carro4");
        JSONObject c23 = (JSONObject) carros.get("carro4");
        JSONObject c24 = (JSONObject) carros.get("carro4");
        JSONObject c25 = (JSONObject) carros.get("carro4");
        JSONObject c26 = (JSONObject) carros.get("carro4");
        JSONObject c27 = (JSONObject) carros.get("carro4");
        JSONObject c28 = (JSONObject) carros.get("carro4");

            try {
                Thread.sleep(100);
            } catch (Exception ign) {
            }

            marca1R = (String) c1.get("marca");
            modelo1R = (String) c2.get("modelo");
            ano1R = (String) c3.get("ano");
            km1R= (String) c4.get("km");
            cor1R = (String) c5.get("cor");
            cambio1R = (String) c6.get("cambio");
            preco1R = (String) c7.get("preco");

            try {
                Thread.sleep(100);
            } catch (Exception ign) {
            }
            marca2R = (String) c8.get("marca");
            modelo2R = (String) c9.get("modelo");
            ano2R = (String) c10.get("ano");
            km2R = (String) c11.get("km");
            cor2R = (String) c12.get("cor");
            cambio2R = (String) c13.get("cambio");
            preco2R = (String) c14.get("preco");

            try {
                Thread.sleep(100);
            } catch (Exception ign) {
            }
             marca3R = (String) c15.get("marca");
             modelo3R = (String) c16.get("modelo");
             ano3R = (String) c17.get("ano");
             km3R = (String) c18.get("km");
             cor3R = (String) c19.get("cor");
             cambio3R = (String) c20.get("cambio");
             preco3R = (String) c21.get("preco");

            try {
                Thread.sleep(100);
            } catch (Exception ign) {
            }
             marca4R = (String) c22.get("marca");
             modelo4R = (String) c23.get("modelo");
             ano4R = (String) c24.get("ano");
             km4R = (String) c25.get("km");
             cor4R = (String) c26.get("cor");
             cambio4R = (String) c27.get("cambio");
             preco4R = (String) c28.get("preco");  // Final da leitura do conteúdo do arquivo carros.jon


        System.out.println("++++ DADOS DO ARQUIVO++++\n"); // Dados da pesquisa na saída padrão

        System.out.println("----CARRO1----");
        System.out.println(marca1R);
        System.out.println(modelo1R);
        System.out.println(ano1R);
        System.out.println(km1R);
        System.out.println(cor1R);
        System.out.println(cambio1R);
        System.out.println(preco1R);
        System.out.println("---------------\n");

        System.out.println("----CARRO2----");

        System.out.println(marca2R);
        System.out.println(modelo2R);
        System.out.println(ano2R);
        System.out.println(km2R);
        System.out.println(cor2R);
        System.out.println(cambio2R);
        System.out.println(preco2R);
        System.out.println("---------------\n");

        System.out.println("----CARRO3----");
        System.out.println(marca3R);
        System.out.println(modelo3R);
        System.out.println(ano3R);
        System.out.println(km3R);
        System.out.println(cor3R);
        System.out.println(cambio3R);
        System.out.println(preco3R);
        System.out.println("---------------\n");

        System.out.println("----CARRO4----");
        System.out.println(marca4R);
        System.out.println(modelo4R);
        System.out.println(ano4R);
        System.out.println(km4R);
        System.out.println(cor4R);
        System.out.println(cambio4R);
        System.out.println(preco4R);
        System.out.println("---------------\n");

        System.out.println("+++++++++++++++++++++++++\n");

            driver = new AndroidDriver(new URL(APPIUM), caps);
            driver.manage().timeouts().implicitlyWait(60000, TimeUnit.MILLISECONDS);
            try {
                Thread.sleep(3000);
            } catch (Exception ign) {
            }
        }

        @After
        public void tearDown() {
            if (driver != null) {
                driver.quit();
            }
        }

        @Test

        public void test() {

            driver.findElement(By.id("br.com.icarros.androidapp:id/searchText")).click();
            driver.findElement(By.id("br.com.icarros.androidapp:id/fullSearchText")).sendKeys("Renegade"); // Escolha de modelo de carro
            driver.findElement(By.id("br.com.icarros.androidapp:id/searchButton")).click();
            driver.findElement(By.id("br.com.icarros.androidapp:id/filterText")).click();
            try {
                Thread.sleep(5000);
            } catch (Exception ign) {
            }

            WebElement filters = driver.findElement(By.id("br.com.icarros.androidapp:id/filtersList")); // Realiza o filtro
            List<WebElement> filterList = (List<WebElement>) filters.findElements(By.className("android.widget.RelativeLayout"));


            for (WebElement el : filterList) {
                String title = el.findElement(By.id("br.com.icarros.androidapp:id/titleText")).getText();

                          if (title.equals("Preço")) {
                    el.findElement(By.id("br.com.icarros.androidapp:id/titleText")).click();
                    driver.findElement(By.id("br.com.icarros.androidapp:id/fromEditText")).clear();
                    driver.findElement(By.id("br.com.icarros.androidapp:id/fromEditText")).sendKeys("54000");
                    driver.findElement(By.id("br.com.icarros.androidapp:id/toEditText")).clear();
                    driver.findElement(By.id("br.com.icarros.androidapp:id/toEditText")).sendKeys("55000");
                    driver.findElement(By.id("br.com.icarros.androidapp:id/applyButton")).click();
                    break;
                }
            }

            driver.findElement(By.id("br.com.icarros.androidapp:id/filterButton")).click();
            try {
                Thread.sleep(5000);
            } catch (Exception ign) {
            }

            WebElement deals = driver.findElement(By.id("br.com.icarros.androidapp:id/dealList")); // Mecanismo de rolagem da tela
            List<WebElement> dealList = (List<WebElement>) deals.findElements(By.id("br.com.icarros.androidapp:id/cardview"));
            WebElement deal1 = dealList.get(0);
            WebElement deal2 = dealList.get(1);
            Point loc2 = deal2.getLocation();

            deal1.click();
            try {
                Thread.sleep(1000);
            } catch (Exception ign) {
            }
            // Coleta de dados do carro1
            marca1W = driver.findElement(By.id("br.com.icarros.androidapp:id/dealNameText")).getText();
            modelo1W = driver.findElement(By.id("br.com.icarros.androidapp:id/dealInfoText")).getText();
            ano1W = driver.findElement(By.id("br.com.icarros.androidapp:id/dealModelYearText")).getText();
            km1W = driver.findElement(By.id("br.com.icarros.androidapp:id/dealMileageText")).getText();
            cor1W = driver.findElement(By.id("br.com.icarros.androidapp:id/dealColorText")).getText();
            cambio1W = driver.findElement(By.id("br.com.icarros.androidapp:id/dealTransmissionText")).getText();
            preco1W = driver.findElement(By.id("br.com.icarros.androidapp:id/dealPriceText")).getText();

            System.out.println("---CARRO1---");
            System.out.println(marca1W);
            System.out.println(modelo1W);
            System.out.println(ano1W);
            System.out.println(km1W);
            System.out.println(cor1W);
            System.out.println(cambio1W);
            System.out.println(preco1W);
            System.out.println("-------------");


            driver.findElementByAccessibilityId("Navegar para cima").click();
            try {
                Thread.sleep(1000);
            } catch (Exception ign) {
            }

            TouchAction ts = new TouchAction(driver);

            ts.longPress(PointOption.point(500, loc2.y)).moveTo(PointOption.point(500, 200)).release().perform();
            try {
                Thread.sleep(4000);
            } catch (Exception ign) {
            }

            dealList = (List<WebElement>) deals.findElements(By.id("br.com.icarros.androidapp:id/cardview"));// Mecanismo de rolagem da tela
            deal1 = dealList.get(0);
            deal2 = dealList.get(1);
            loc2 = deal2.getLocation();
            deal1.click();
            try {
                Thread.sleep(1000);
            } catch (Exception ign) {
            }
          // Coleta de dados do carro2
            marca2W = driver.findElement(By.id("br.com.icarros.androidapp:id/dealNameText")).getText();
            modelo2W = driver.findElement(By.id("br.com.icarros.androidapp:id/dealInfoText")).getText();
            ano2W = driver.findElement(By.id("br.com.icarros.androidapp:id/dealModelYearText")).getText();
            km2W = driver.findElement(By.id("br.com.icarros.androidapp:id/dealMileageText")).getText();
            cor2W = driver.findElement(By.id("br.com.icarros.androidapp:id/dealColorText")).getText();
            cambio2W = driver.findElement(By.id("br.com.icarros.androidapp:id/dealTransmissionText")).getText();
            preco2W = driver.findElement(By.id("br.com.icarros.androidapp:id/dealPriceText")).getText();

            System.out.println("----CARRO2----");
            System.out.println(marca2W);
            System.out.println(modelo2W);
            System.out.println(ano2W);
            System.out.println(km2W);
            System.out.println(cor2W);
            System.out.println(cambio2W);
            System.out.println(preco2W);
            System.out.println("-------------");

            driver.findElementByAccessibilityId("Navegar para cima").click();
            try {
                Thread.sleep(1000);
            } catch (Exception ign) {
            }

            ts.longPress(PointOption.point(500, loc2.y)).moveTo(PointOption.point(500, 200)).release().perform();
            try {
                Thread.sleep(4000);
            } catch (Exception ign) {
            }

            dealList = (List<WebElement>) deals.findElements(By.id("br.com.icarros.androidapp:id/cardview"));// Mecanismo de rolagem da tela
            deal1 = dealList.get(0);
            deal2 = dealList.get(1);
            loc2 = deal2.getLocation();
            deal1.click();
            try {
                Thread.sleep(1000);
            } catch (Exception ign) {
            }
            // Coleta de dados do carro3
            marca3W = driver.findElement(By.id("br.com.icarros.androidapp:id/dealNameText")).getText();
            modelo3W = driver.findElement(By.id("br.com.icarros.androidapp:id/dealInfoText")).getText();
            ano3W = driver.findElement(By.id("br.com.icarros.androidapp:id/dealModelYearText")).getText();
            km3W = driver.findElement(By.id("br.com.icarros.androidapp:id/dealMileageText")).getText();
            cor3W = driver.findElement(By.id("br.com.icarros.androidapp:id/dealColorText")).getText();
            cambio3W = driver.findElement(By.id("br.com.icarros.androidapp:id/dealTransmissionText")).getText();
            preco3W = driver.findElement(By.id("br.com.icarros.androidapp:id/dealPriceText")).getText();

            System.out.println("----CARRO3----");
            System.out.println(marca3W);
            System.out.println(modelo3W);
            System.out.println(ano3W);
            System.out.println(km3W);
            System.out.println(cor3W);
            System.out.println(cambio3W);
            System.out.println(preco3W);
            System.out.println("-------------");
            driver.findElementByAccessibilityId("Navegar para cima").click();
            try {
                Thread.sleep(1000);
            } catch (Exception ign) {
            }


            ts.longPress(PointOption.point(500, loc2.y)).moveTo(PointOption.point(500, 200)).release().perform();
            try {
                Thread.sleep(4000);
            } catch (Exception ign) {
            }

            dealList = (List<WebElement>) deals.findElements(By.id("br.com.icarros.androidapp:id/cardview"));// Mecanismo de rolagem d tela
            deal1 = dealList.get(0);
            deal2 = dealList.get(1);
            loc2 = deal2.getLocation();
            deal1.click();
            try {
                Thread.sleep(1000);
            } catch (Exception ign) {
            }
            // Coleta de dados do carro4
            marca4W = driver.findElement(By.id("br.com.icarros.androidapp:id/dealNameText")).getText();
            modelo4W = driver.findElement(By.id("br.com.icarros.androidapp:id/dealInfoText")).getText();
            ano4W = driver.findElement(By.id("br.com.icarros.androidapp:id/dealModelYearText")).getText();
            km4W = driver.findElement(By.id("br.com.icarros.androidapp:id/dealMileageText")).getText();
            cor4W = driver.findElement(By.id("br.com.icarros.androidapp:id/dealColorText")).getText();
            cambio4W = driver.findElement(By.id("br.com.icarros.androidapp:id/dealTransmissionText")).getText();
            preco4W = driver.findElement(By.id("br.com.icarros.androidapp:id/dealPriceText")).getText();

            System.out.println("----CARRO4----");
            System.out.println(marca4W);
            System.out.println(modelo4W);
            System.out.println(ano4W);
            System.out.println(km4W);
            System.out.println(cor4W);
            System.out.println(cambio4W);
            System.out.println(preco4W);
            System.out.println("-------------");

            driver.findElementByAccessibilityId("Navegar para cima").click();
            try {
                Thread.sleep(1000);
            } catch (Exception ign) {
            }

            // Metodo da escrita em arquivo carro.json
        JSONObject carro1 = carroJSON(marca1W, modelo1W, ano1W, km1W, cor1W, cambio1W, preco1W);
        JSONObject carro2 = carroJSON(marca2W, modelo2W, ano2W, km2W, cor2W, cambio2W, preco2W);
        JSONObject carro3 = carroJSON(marca3W, modelo3W, ano3W, km3W, cor3W, cambio3W, preco3W);
        JSONObject carro4 = carroJSON(marca4W, modelo4W, ano4W, km4W, cor4W, cambio4W, preco4W);

        writeCarros(carro1, carro2, carro3, carro4, "carros.json");

            Assert.assertEquals(marca1W, marca1R); // Compara marca do Carro1 ( Valor no Arquivo com a Valor no App)
            Assert.assertEquals(modelo1W, modelo1R); // Compara modelo do Carro1 ( Valor no Arquivo com a Valor no App)
            Assert.assertEquals(ano1W, ano1R); // Compara ano do Carro1 ( Valor no Arquivo com a Valor no App)
            Assert.assertEquals(km1W, km1R);// Compara kilometragem do Carro1 ( Valor no Arquivo com a Valor no App)
            Assert.assertEquals(cor1W, cor1R);// Compara cor do Carro1 ( Valor no Arquivo com a Valor no App)
            Assert.assertEquals(cambio1W, cambio1R);// Compara cambio do Carro1 ( Valor no Arquivo com a Valor no App)
            Assert.assertEquals(preco1W, preco1R);// Compara preço do Carro1 ( Valor no Arquivo com a Valor no App)

            Assert.assertEquals(marca2W, marca2R);// Compara marca do Carro2 ( Valor no Arquivo com a Valor no App)
            Assert.assertEquals(modelo2W, modelo2R);// Compara modelo do Carro2 ( Valor no Arquivo com a Valor no App)
            Assert.assertEquals(ano2W, ano2R);// Compara ano do Carro2 ( Valor no Arquivo com a Valor no App)
            Assert.assertEquals(km2W, km2R); // Compara kilometragem do Carro1 ( Valor no Arquivo com a Valor no App)
            Assert.assertEquals(cor2W, cor2R); // Compara kilometragem do Carro1 ( Valor no Arquivo com a Valor no App)
            Assert.assertEquals(cambio2W, cambio2R); // Compara kilometragem do Carro1 ( Valor no Arquivo com a Valor no App)
            Assert.assertEquals(preco2W, preco2R); // Compara kilometragem do Carro1 ( Valor no Arquivo com a Valor no App)


            Assert.assertEquals(marca3W, marca3R); // Compara kilometragem do Carro1 ( Valor no Arquivo com a Valor no App)
            Assert.assertEquals(modelo3W, modelo3R); // Compara kilometragem do Carro1 ( Valor no Arquivo com a Valor no App)
            Assert.assertEquals(ano3W, ano3R); // Compara kilometragem do Carro1 ( Valor no Arquivo com a Valor no App)
            Assert.assertEquals(km3W, km3R); // Compara kilometragem do Carro1 ( Valor no Arquivo com a Valor no App)
            Assert.assertEquals(cor3W, cor3R); // Compara kilometragem do Carro1 ( Valor no Arquivo com a Valor no App)
            Assert.assertEquals(cambio3W, cambio3R); // Compara kilometragem do Carro1 ( Valor no Arquivo com a Valor no App)
            Assert.assertEquals(preco3W, preco3W); // Compara kilometragem do Carro1 ( Valor no Arquivo com a Valor no App)

            Assert.assertEquals(marca4W, marca4R); // Compara kilometragem do Carro1 ( Valor no Arquivo com a Valor no App)
            Assert.assertEquals(modelo4W, modelo4R); // Compara kilometragem do Carro1 ( Valor no Arquivo com a Valor no App)
            Assert.assertEquals(ano4W, ano4R); // Compara kilometragem do Carro1 ( Valor no Arquivo com a Valor no App)
            Assert.assertEquals(km4W, km4R); // Compara kilometragem do Carro1 ( Valor no Arquivo com a Valor no App)
            Assert.assertEquals(cor4W, cor4R); // Compara kilometragem do Carro1 ( Valor no Arquivo com a Valor no App)
            Assert.assertEquals(cambio4W, cambio4R); // Compara kilometragem do Carro1 ( Valor no Arquivo com a Valor no App)
            Assert.assertEquals(preco4W, preco4R); // Compara kilometragem do Carro1 ( Valor no Arquivo com a Valor no App)


        }
    }
