package steps;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import com.specialcook.model.Customer;

import io.cucumber.java.en.*;

public class CustomerProfileSteps {

    private Customer customer;

    @Given("a customer named {string}")
    public void a_customer_named(String name) {
        customer = new Customer(name);
    }

    @When("the customer adds dietary preference {string}")
    public void the_customer_adds_dietary_preference(String preference) {
        customer.addDietaryPreference(preference);
    }

    @When("the customer adds allergy {string}")
    public void the_customer_adds_allergy(String allergy) {
        customer.addAllergy(allergy);
    }

    @Then("the system should store {string} as a dietary preference")
    public void the_system_should_store_as_a_dietary_preference(String preference) {
        assertTrue(customer.getDietaryPreferences().contains(preference));
    }

    @Then("the system should store {string} as an allergy")
    public void the_system_should_store_as_an_allergy(String allergy) {
        assertTrue(customer.getAllergies().contains(allergy));
    }

    @Given("a customer named {string} with dietary preference {string}")
    public void a_customer_named_with_dietary_preference(String name, String preference) {
        customer = new Customer(name);
        customer.addDietaryPreference(preference);
    }

    @When("the system retrieves her dietary preferences")
    public void the_system_retrieves_her_dietary_preferences() {
        // already stored in object
    }

    @Then("the result should contain {string}")
    public void the_result_should_contain(String value) {
        boolean inPreferences = customer.getDietaryPreferences().contains(value);
        boolean inAllergies = customer.getAllergies().contains(value);
        assertTrue(inPreferences || inAllergies);
    }

    @Given("a customer named {string} with allergy {string}")
    public void a_customer_named_with_allergy(String name, String allergy) {
        customer = new Customer(name);
        customer.addAllergy(allergy);
    }

    @When("the system retrieves his allergies")
    public void the_system_retrieves_his_allergies() {
        // already stored in object
    }
}