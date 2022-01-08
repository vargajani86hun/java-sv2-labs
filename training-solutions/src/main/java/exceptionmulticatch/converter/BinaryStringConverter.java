package exceptionmulticatch.converter;

public class BinaryStringConverter {
    public boolean[] binaryStringToBooleanArray(String binaryValues) {
        checkStringParam(binaryValues);
        char[] binaryChars = binaryValues.toCharArray();
        boolean[] values = new boolean[binaryChars.length];
        for (int i = 0; i < binaryChars.length; i++) {
            if (binaryChars[i] == '1') {
                values[i] = true;
            }
            else if (binaryChars[i] == '0') {
                values[i] = false;
            }
            else {
                throw new IllegalArgumentException("Binary string is not valid.");
            }
        }
        return values;
    }

    public String booleanArrayToBinaryString(boolean[] values) {
        checkBinaryArray(values);
        StringBuilder sb = new StringBuilder();
        for (boolean b : values) {
            if(b) {
                sb.append("1");
            }
            else {
                sb.append("0");
            }
        }
        return sb.toString();
    }

    private void checkStringParam(String value) {
        if (value == null) {
            throw new NullPointerException("Binary string is null.");
        }
        if (value.isEmpty()) {
            throw new IllegalArgumentException("Binary string is empty");
        }
    }

    private void checkBinaryArray(boolean[] values) {
        if (values == null) {
            throw new NullPointerException("Boolean array is null!");
        }
        if (values.length == 0) {
            throw new IllegalArgumentException("Boolean array is empty.");
        }
    }
}
