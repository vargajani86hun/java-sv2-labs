package typeconversion;

public class Conversion {
    public double convertDoubleToDouble(double number) {
        int intNumberPart = (int) number;
        return (double) intNumberPart;
    }

    public byte[] convertIntArrayToByteArray(int[] numbers) {
        byte[] byteNumbers = new byte[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] >= 0 && numbers[i] < 128) {
                byteNumbers[i] = (byte) numbers[i];
            }
            else {
                byteNumbers[i] = -1;
            }
        }
        return byteNumbers;
    }
}
