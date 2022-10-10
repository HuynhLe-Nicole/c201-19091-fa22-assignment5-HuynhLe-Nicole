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
    @DisplayName("Credit card 5588576018107076 is valid")
    void validateCreditCardNumberAsInvalid5588576018107076() {
        boolean response = false;
        try {
            response = CreditCardValidation.validateCreditCard(5588576018107076L);
        } catch (Exception e) {
            fail();
        }
        assertTrue(response);
    }

    /**
     * Create an additional test with a non vaild credit card
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
