package projeto.teste;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TesteVia {
	WebDriver driver;
	
	@Given("que eu esteja na url {string}")
	public void que_eu_esteja_na_url(String url) {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	   
	}

	@When("clicar em comprar")
	public void clicar_em_comprar() {
		driver.findElement(By.cssSelector("#primary-menu > li.menu-item-629.aligned-fullwidth")).click();
	    
	}

	@When("selecionar os produtos desejados")
	public void selecionar_os_produtos_desejados() {
		driver.findElement(By.cssSelector("#content > div.products.products-grid > div > div.col-xs-12.col-lg-4.col-md-4.col-sm-6.grid.product.type-product.post-2559.status-publish.first.instock.product_cat-hoodies-sweatshirts.has-post-thumbnail.shipping-taxable.purchasable.product-type-variable > div > div.caption > div > div > h3 > a")).click();
	    driver.findElement(By.cssSelector("#product-2559 > div.row > div.information > div > form > table > tbody > tr:nth-child(1) > td.value.woo-variation-items-wrapper > ul > li.variable-item.button-variable-item.button-variable-item-S")).click();
        driver.findElement(By.xpath("//*[@id=\"product-2559\"]/div[1]/div[2]/div/form/table/tbody/tr[2]/td[2]/ul/li[1]")).click();
	    driver.findElement(By.xpath("//*[@id=\"product-2559\"]/div[1]/div[2]/div/form/div/div[2]/div/input[3]")).click();
	    
	   
	}

	@When("adiciono-os no carrinho de compras")
	public void adiciono_os_no_carrinho_de_compras() {
		driver.findElement(By.xpath("//*[@id=\"product-2559\"]/div[1]/div[2]/div/form/div/div[2]/button")).click();
	    driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/a")).click();
}

	@Then("URL validada com sucesso")
	public void url_validada_com_sucesso() {
		    String urlCapturada= driver.getCurrentUrl();
		    String urlDesejada = "http://lojaebac.ebaconline.art.br/carrinho/";
		    assertEquals(urlDesejada, urlCapturada);
		    driver.quit();
		
	   
	}
	
	
	

}
