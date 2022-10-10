import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GetCreditCardSizeTest {
    // Notice that the tests are extremely descriptive; this is the industry standard and is expected
    @Test
    @DisplayName("Size of credit card number 5388576018107076 is 16")
    void getCreditCard5388576018107076Size() {
        assertEquals(9, CreditCardValidation.getCreditCardSize(123456789L), 0.01);
    }

    /**
     * Create two additional tests
     */
    @Test
    void getCreditCard369369369369369Size() {
        assertEquals(15, CreditCardValidation.getCreditCardSize(369369369369369L), 0.01);
    }
    @Test
    void getCreditCard358358358358358Size() {
        assertEquals(15, CreditCardValidation.getCreditCardSize(358358358358358L), 0.01);
    }
    @Test
    void getCreditCard356893568935689Size() {
        assertEquals(15, CreditCardValidation.getCreditCardSize(356893568935689L), 0.01);
    }
}
