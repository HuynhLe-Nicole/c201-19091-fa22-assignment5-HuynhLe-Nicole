import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ValidCreditCardTest {
    // Notice that the tests are extremely descriptive; this is the industry standard and is expected
    @Test
    @DisplayName("Credit card 4388576018410707 is valid")
    void validateCreditCardNumberAsInvalid4246345689049834() {
        // The L at the end of the number means it's a long type
        boolean response = false;
        try {
            response = CreditCardValidation.validateCreditCard(4388576018410707L);
        } catch (Exception e) {
            fail();
        }
        assertTrue(response);
    }

    @Test
    @DisplayName("Credit card 67670738908615 is valid")
    void validateCreditCardNumberAsInvalid67670738908615() {
        boolean response = false;
        try {
            response = CreditCardValidation.validateCreditCard(67670738908615L);
        } catch (Exception e) {
            fail();
        }
        assertTrue(response);
    }

    @Test
    @DisplayName("Credit card 3763456890498046 is valid")
    void validateCreditCardNumberAsInvalid3763456890498046() {
        boolean response = false;
        try {
            response = CreditCardValidation.validateCreditCard(3763456890498046L);
        } catch (Exception e) {
            fail();
        }
        assertTrue(response);
    }

    @Test
    @DisplayName("Credit card 5388576018107076 is valid")
    void validateCreditCardNumberAsInvalid5388576018107076() {
        boolean response = false;
        try {
            response = CreditCardValidation.validateCreditCard(5388576018107076L);
        } catch (Exception e) {
            fail();
        }
        assertTrue(response);
    }

    /**
     * Create an additional test with a non vaild credit card
     */





}
