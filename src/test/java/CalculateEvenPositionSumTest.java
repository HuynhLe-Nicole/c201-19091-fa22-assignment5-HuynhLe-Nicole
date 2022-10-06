import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculateEvenPositionSumTest {
    // Notice that the tests are extremely descriptive; this is the industry standard and is expected
    @Test
    @DisplayName("Even sum for credit card number 5388576018107076 is 26")
    void calculateEvenSumForCreditCard5388576018107076() {
        assertEquals(26, CreditCardValidation.calculateEvenPositionSum(5388576018107076L), 0.01);
    }

    /**
     * Create two additional tests
     */

}