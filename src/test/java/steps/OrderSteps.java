package steps;

import static org.junit.Assert.*;
import com.specialcook.model.*;
import io.cucumber.java.en.*;

public class OrderSteps {

    private Order order;
    private Customer customer;

    @Given("a new order by customer {string}")
    public void aNewOrderByCustomer(String customerName) {
        customer = new Customer(customerName);
        order = new Order(customer, "Pasta");
    }

    @When("the customer adds ingredients {string} to the order")
    public void theCustomerAddsIngredientsToTheOrder(String ingredients) {
        for (String name : ingredients.split(",")) {
            order.addIngredient(new Ingredient(name.trim()));
        }
    }

    @Then("the order should contain {string}")
    public void theOrderShouldContain(String ingredient) {
        assertTrue(order.getIngredients().stream().anyMatch(i -> i.getName().equals(ingredient)));
    }
}