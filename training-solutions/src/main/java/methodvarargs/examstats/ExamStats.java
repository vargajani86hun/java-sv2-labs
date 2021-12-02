package methodvarargs.examstats;

public class ExamStats {
    private int maxPoints;

    public ExamStats(int maxPoints) {
        this.maxPoints = maxPoints;
    }

    public int getNumberOfTopGrades(int limitInPercent, int... results) {
        double limit = maxPoints * limitInPercent /100.;
        int count = 0;
        if (isValidResults(results)) {
            for (int actual : results) {
                if (actual > limit) {
                    count++;
                }
            }
        }
        return count;
    }

    public boolean hasAnyFailed(int limitInPercent, int... results) {
        double limit = maxPoints * limitInPercent / 100.;
        if (isValidResults(results)) {
            for (int actual : results) {
                if (actual < limit) {
                    return true;
                }
            }
        }
        return false;
    }

    public int getMaxPoints() {
        return maxPoints;
    }

    private boolean isValidResults(int[] results) {
        if (results == null || results.length == 0) {
            throw new IllegalArgumentException("Results of exam are not available");
        }
        return true;
    }
}
