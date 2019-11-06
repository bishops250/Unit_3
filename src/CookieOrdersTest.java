import org.junit.Test;

import static org.junit.Assert.*;

public class CookieOrdersTest {

    @Test
    public void totalCostTest() {
        assertEquals("You bought 17 boxes of cookies at $4.95 per box. Your total bill is $84.15",
                CookieOrders.totalCost(17));
        assertEquals("Your input is invalid", CookieOrders.totalCost(-5));
    }
}