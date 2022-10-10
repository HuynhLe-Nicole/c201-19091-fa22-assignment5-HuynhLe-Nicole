import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculateOddPositionSumTest {
    // Notice that the tests are extremely descriptive; this is the industry standard and is expected
    @Test
    @DisplayName("Odd sum for credit card number 5388576018107076 is 32")
    void calculateOddSumForCreditCard5388576018107076() {
        assertEquals(32, CreditCardValidation.calculateOddPositionSum(5388576018107076L), 0.01);
    }

    /**
     * Create two additional tests
     */
    @Test
    void calculateOddSumForCreditCard369369369369369() {
        assertEquals(48, CreditCardValidation.calculateOddPositionSum(369369369369369L));
    }
    @Test
    void calculateOddSumForCreditCard368368368368368() {
        assertEquals(45, CreditCardValidation.calculateOddPositionSum(368368368368368L));
    }
    @Test
    void calculateOddSumForCreditCard356893568936589() {
        assertEquals(48, CreditCardValidation.calculateOddPositionSum(356893568936589L));
    }

}

