package cucumber_2;



import java.util.List;
import java.util.Map;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Purchase {
	
	@When("i go to All {string}")
	public void i_go_to_All_categories(String x) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println(x);
	}

	@When("i go to Electronics")
	public void i_go_to_Electronics() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@When("Click on headphones and add to cart")
	public void click_on_headphones_and_add_to_cart() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Then("Payment page is appeared")
	public void payment_page_is_appeared() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}
	
	@Given("user enters the url")
	public void user_enters_the_url() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Given("i enter {string} and {string}")
	public void i_enter_and(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("\nUsername is:"+string);
		System.out.println("Password is:"+string2);
	}

	@When("i click login button")
	public void i_click_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}
	
	@Then("Home page is displayed")
	public void home_page_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@When("click on Logout button")
	public void click_on_Logout_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Then("Home page is appeared")
	public void home_page_is_appeared() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}
	
	@Given("I want to create an account")
	public void i_want_to_create_an_account() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	}

	@Given("i enter my data")
	public void i_enter_my_data(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    //throw new cucumber.api.PendingException();
		List<Map<String,String>> list=dataTable.asMaps(String.class,String.class);
		for (int i=0;i < list.size(); i++) {
			System.out.println("\n"+list.get(i).get("username"));
			System.out.println(list.get(i).get("password"));
			
		}
	}
	
	@Then("I verify the account")
	public void i_verify_the_account() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}
}
