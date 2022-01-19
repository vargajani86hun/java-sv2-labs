package searching;

import java.util.Arrays;

public class Mountain {
    private int[] heights;

    public Mountain(int[] heights) {
        this.heights = heights;
    }

    public boolean searchPeak(Peak peak) {
        return Arrays.binarySearch(heights, peak.getHeight()) >= 0;
    }
}
