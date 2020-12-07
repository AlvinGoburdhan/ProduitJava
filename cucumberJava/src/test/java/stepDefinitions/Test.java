package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import produit.Produit;
import produit.Rayon;
import io.cucumber.java.en.Then;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
	
public class Test {
	private Produit produit;
	private Rayon rayon;
	
	@Given("un {string} de {string}")
	public void un_de(String string, String string2) {
		this.produit = new Produit (string);
		this.rayon = new Rayon (string2);
		this.produit.setRayon(rayon);
	}
	
	@When("le Vendeur en fait la demande")
	public void le_vendeur_en_fait_la_demande() {
	}
	
	@Then("{string} est retournee")
	public void est_retournee(String string) {
		assertEquals(string,produit.getRayon().getNomRayon());
	}
	
	@Then("un {string} est retournee")
	public void un_est_retournee(String string) {
		assertEquals(string,"Pas de rayon");
	}
	
	@Given("que j ai les produits suivants dans le rayon {string}")
	public void que_j_ai_les_produits_suivants_dans_le_rayon(String string, io.cucumber.datatable.DataTable dataTable) {
		rayon = new Rayon(string);
		List<List<String>> rows = dataTable.asLists(String.class);
		for (List<String> columns : rows) {
	    	produit = new Produit(columns.get(0));
	    	rayon.addProduit(produit);
	    }
	}

	@When("le Vendeur cherche le nombre de produits")
	public void le_vendeur_cherche_le_nombre_de_produits() {
	}

	@Then("je trouve {int} produits")
	public void je_trouve_produits(Integer int1) {
		assertEquals(int1,rayon.getListeProduit().size());
		
	}
	
	@Given("que je n ai aucun produits dans le rayon {string}")
	public void que_je_n_ai_aucun_produits_dans_le_rayon(String string) {
		rayon = new Rayon(string);
	}

}