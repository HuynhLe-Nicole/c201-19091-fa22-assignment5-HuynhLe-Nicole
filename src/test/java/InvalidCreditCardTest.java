import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class InvalidCreditCardTest {
    // Notice that the tests are extremely descriptive; this is the industry standard and is expected
    @Test
    @DisplayName("Credit card 4246345689049834 is invalid")
    void validateCreditCardNumberAsInvalid4246345689049834() {
        boolean response = false;
        try {
            response = CreditCardValidation.validateCreditCard(4246345689049834L);
        } catch (Exception e) {
            fail();
        }
        assertFalse(response);
    }

    @Test
    @DisplayName("Credit card 438479389343787 is invalid")
    void validateCreditCardNumberAsInvalid438479389343787() {
        boolean response = false;
        try {
            response = CreditCardValidation.validateCreditCard(438479389343787L);
        } catch (Exception e) {
            fail();
        }
        assertFalse(response);
    }

    @Test
    @DisplayName("Credit card 54373493261291 is invalid")
    void validateCreditCardNumberAsInvalid54373493261291() {
        boolean response = false;
        try {
            response = CreditCardValidation.validateCreditCard(54373493261291L);
        } catch (Exception e) {
            fail();
        }
        assertFalse(response);
    }

    @Test
    @DisplayName("Credit card 56864749348645 is invalid")
    void validateCreditCardNumberAsInvalid56864749348645() {
        boolean response = false;
        try {
            response = CreditCardValidation.validateCreditCard(56864749348645L);
        } catch (Exception e) {
            fail();
        }
        assertFalse(response);
    }

    /**
     * Create an additional test
     */

    @Test
    void validateCreditCardNumberAsInvalid369369369369369() {
        boolean response = false;
        try {
            response = CreditCardValidation.validateCreditCard(369369369369369L);
        } catch (Exception e) {
            fail();
        }
        assertFalse(response);
    }
    @Test
    void validateCreditCardNumberAsInvalid358358358358358() {
        boolean response = false;
        try {
            response = CreditCardValidation.validateCreditCard(358358358358358L);
        } catch (Exception e) {
            fail();
        }
        assertFalse(response);
    }

    @Test
    void validateCreditCardNumberAsInvalid356893568935689() {
        boolean response = false;
        try {
            response = CreditCardValidation.validateCreditCard(356893568935689L);
        } catch (Exception e) {
            fail();
        }
        assertFalse(response);
    }

}
