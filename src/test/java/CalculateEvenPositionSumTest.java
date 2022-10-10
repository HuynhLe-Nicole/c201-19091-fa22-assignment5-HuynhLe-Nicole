import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculateEvenPositionSumTest {
    // Notice that the tests are extremely descriptive; this is the industry standard and is expected
    @Test
    @DisplayName("Even sum for credit card number 5388576018107076 is 26")
    void calculateEvenSumForCreditCard5388576018107076() {
        assertEquals(26, CreditCardValidation.calculateEvenPositionSum( 5388576018107076L), 0.01);
    }

    /**
     * Create two additional tests
     */
    @Test
    void calculateEvenSumForCreditCard369369369369369() {
        assertEquals(39, CreditCardValidation.calculateEvenPositionSum(369369369369369L));
    }
    @Test
    void calculateEvenSumForCreditCard358358358358358() {
        assertEquals(29, CreditCardValidation.calculateEvenPositionSum(358358358358358L));
    }
    @Test
    void calculateEvenSumForCreditCard356893589358935689() {
        assertEquals(46, CreditCardValidation.calculateEvenPositionSum(356893589358935689L));
    }




}