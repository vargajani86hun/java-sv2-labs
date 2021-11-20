package introexceptionthrow.patient;

public class SsnValidator {
    public boolean isValidSsn(String ssn) {
        if (ssn.length() != 9) {
            return false;
        }

        int[] digits = new int[9];
        try {
            for (int i = 0; i < 9; i++) {
                digits[i] = Integer.parseInt(ssn.substring(i, i + 1));
            }
        }
        catch (IllegalArgumentException iae) {
            return false;
        }

        int sum = getDigitsSum(digits);
        return (sum % 10) == digits[8];
    }

    private int getDigitsSum(int[] digits) {
        int sum = 0;
        for (int i = 0; i < 8; i++) {
            if((i % 2) == 0){
                sum += (digits[i] * 3);
            }
            else {
                sum += (digits[i] * 7);
            }
        }
        return sum;
    }
}
