package com.abin.selenium.tdd.automation.withtestng;

import com.abin.selenium.tdd.automation.base.BaseTest;
import com.abin.selenium.tdd.automation.pages.PasswordResetPage;
import com.abin.selenium.tdd.automation.utils.DemoUtils; // ✅ Import the pause utility
import org.testng.Assert;
import org.testng.annotations.Test;

public class PasswordResetTest extends BaseTest {

    @Test
    public void verifyPasswordResetFlow() {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/requestPasswordResetCode");
        DemoUtils.pause(2);  // Wait after page load

        PasswordResetPage resetPage = new PasswordResetPage(driver);
        resetPage.enterUsername("Admin");
        DemoUtils.pause(2);  // Wait after entering username

        resetPage.clickResetButton();
        DemoUtils.pause(2);  // Wait for confirmation message to appear

        String confirmation = resetPage.getResetMessage();
        Assert.assertTrue(confirmation.contains("Reset Password link sent successfully"), "❌ Password reset confirmation not visible!");
    }
}
