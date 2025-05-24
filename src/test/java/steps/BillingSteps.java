package steps;

import static org.junit.Assert.*;
import com.specialcook.model.*;
import com.specialcook.service.BillingService;
import io.cucumber.java.en.*;

public class BillingSteps {

    private Order order;
    private Invoice invoice;
    private BillingService billingService = new BillingService();

    @Given("an order by customer {string} with ingredients")
    public void anOrderByCustomerWithIngredients(String customerName, io.cucumber.datatable.DataTable dataTable) {
        Customer customer = new Customer(customerName);
        order = new Order(customer, "Pasta");
        for (String name : dataTable.asList()) {
            Ingredient i = new Ingredient(name);
            i.setPrice(10.0); // Assume price for test
            order.addIngredient(i);
        }
    }

    @When("the invoice is generated")
    public void theInvoiceIsGenerated() {
        invoice = billingService.generateInvoice(order);
    }

    @Then("the total invoice amount should be {double}")
    public void theTotalInvoiceAmountShouldBe(Double expected) {
        assertEquals(expected, invoice.getTotalAmount(), 0.01);
    }
}