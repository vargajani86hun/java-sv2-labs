package exceptionmulticatch.converter;

public class AnswerStat {
    private BinaryStringConverter bsc;

    public AnswerStat(BinaryStringConverter bsc) {
        this.bsc = bsc;
    }

    public boolean[] convert(String value) {
        try {
            return bsc.binaryStringToBooleanArray(value);
        }
        catch (IllegalArgumentException | NullPointerException e) {
            throw new InvalidBinaryStringException(e);
        }
    }

    public int answerTruePercent(String answers) {
        boolean[] values = convert(answers);
        int trueValues = 0;
        for (boolean b : values) {
            if (b) {
                trueValues++;
            }
        }
        return trueValues * 100 / values.length;
    }
}
