/**
 * Assignment3 Class
 */
import java.util.Scanner;
public class CreditCardValidation {

       /**
     * Description: This method takes validates a credit card number against the Luhn check.
     * @param creditCardNumber A credit card number that should have between 13 and 19 digits.
     * @return A boolean if the credit card number is valid or not.
     * @throws Exception Throws a standard exception if credit card is not within the specified range.
     */
    public static boolean validateCreditCard(long  creditCardNumber) throws Exception {
        // The following code ensures that the creditCardNumber is within the allowed size.
        if (getCreditCardSize(creditCardNumber) > 19){
            throw new Exception("Credit Card Number to large. Size: " + creditCardNumber );
        }

        if (getCreditCardSize(creditCardNumber) < 13){
            throw new Exception("Credit Card Number to small. Size: " + creditCardNumber );
        }

        // your code for the Luhn Algorithm goes here.
        boolean valid = ((calculateEvenPositionSum(creditCardNumber) + calculateOddPositionSum(creditCardNumber))% 10 == 0);
        return valid;




    }

    /**
     * Description: Returns the number of digits or size of the credit card number.
     * @param creditCardNumber A credit card number that is within 13 to 19 digits.
     * @return Size of the Credit Card Number
     */
    public static int getCreditCardSize(long creditCardNumber){
        String num = creditCardNumber + "";
        return num.length();
    }

    /**
     * Description: Takes a credit card doubles the even positions number and sums them. I
     * f an even digits doubles to a double-digit number then the individual digits are added into the sum.
     * @param creditCardNumber A credit card number that is within 13 to 19 digits.
     * @return Returns the sum of the doubled even position numbers in the creditCardNumber parameter.
     */
    public static int calculateEvenPositionSum(long creditCardNumber) {
        int sum = 0;
        String num = creditCardNumber + "";
        for (int i = getCreditCardSize(creditCardNumber) - 2; i >= 0; i -= 2) {
            sum += getDigit(Integer.parseInt(num.charAt(i) + "") * 2);
        }
        return sum;

    }

    /**
     * Description: Takes a credit card doubles the odd positions number and sums them.
     * @param creditCardNumber A credit card number that is within 13 to 19 digits.
     * @return Returns the sum of the odd position numbers in the creditCardNumber parameter.
     */
    public static int calculateOddPositionSum(long creditCardNumber) {
        int sum = 0;
        String num = creditCardNumber + "";
        for (int i = getCreditCardSize(creditCardNumber) - 1; i >= 0; i -= 2) {
            sum += Integer.parseInt(num.charAt(i) + "");
        }
        return sum;
    }
    //Return this number if it ia a single digit, otherwise, return the sum of the two digit
    public static int getDigit(int number) {
         if(number < 9)
             return number;
         else
             return number / 10 + number % 10;
        }


    }


