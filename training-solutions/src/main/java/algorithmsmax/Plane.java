package algorithmsmax;

public class Plane {
    public int getLongestOcean(String map) {
        int maxOceanLength = 0;
        int length = 0;
        char[] mapChars = map.toCharArray();
        for (Character mapChar : mapChars) {
            if (mapChar == '1') {
                if (length > maxOceanLength) {
                    maxOceanLength = length;
                }
                length = 0;
            }
            else {
                length++;
            }
        }
        return maxOceanLength;
    }
}
