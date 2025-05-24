package steps;

import static org.junit.Assert.*;
import com.specialcook.service.NotificationService;
import io.cucumber.java.en.*;

import java.util.List;

public class NotificationSteps {

    private NotificationService notificationService = new NotificationService();
    private List<String> notifications;

    @Given("a chef is assigned a cooking task")
    public void aChefIsAssignedACookingTask() {
        notificationService.notifyChef("Prepare vegan pasta");
    }

    @When("the chef checks their notifications")
    public void theChefChecksTheirNotifications() {
        notifications = notificationService.getNotifications();
    }

    @Then("the notification list should contain {string}")
    public void theNotificationListShouldContain(String expected) {
        assertTrue(notifications.contains(expected));
    }
}
