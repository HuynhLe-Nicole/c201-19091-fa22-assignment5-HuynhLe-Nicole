import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GetCreditCardSizeTest {
    // Notice that the tests are extremely descriptive; this is the industry standard and is expected
    @Test
    @DisplayName("Size of credit card number 5388576018107076 is 16")
    void getCreditCard5388576018107076Size() {
        assertEquals(16, CreditCardValidation.getCreditCardSize(5388576018107076L), 0.01);
    }

    /**
     * Create two additional tests
     */
}
