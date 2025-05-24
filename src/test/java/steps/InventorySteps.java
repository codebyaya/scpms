
package steps;

import static org.junit.Assert.*;
import com.specialcook.model.*;
import com.specialcook.service.InventoryService;
import io.cucumber.java.en.*;

public class InventorySteps {

    private InventoryService inventoryService = new InventoryService();

    @Given("the inventory has {int} units of {string}")
    public void theInventoryHasUnitsOf(int quantity, String item) {
        Ingredient ingredient = new Ingredient(item);
        ingredient.setQuantity(quantity);
        inventoryService.addIngredient(ingredient);
    }

    @When("the system checks stock level for {string}")
    public void theSystemChecksStockLevelFor(String item) {
        // Method runs implicitly
    }

    @Then("the stock level for {string} should be at least {int}")
    public void theStockLevelShouldBeAtLeast(String item, int expected) {
        Ingredient found = inventoryService.getIngredientByName(item);
        assertNotNull(found);
        assertTrue(found.getQuantity() >= expected);
    }
}