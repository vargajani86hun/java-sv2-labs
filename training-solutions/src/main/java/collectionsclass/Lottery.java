package collectionsclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Lottery {
    private List<Integer> balls = new ArrayList<>();

    public List<Integer> selectWinningNumbers(int lotteryType, int ballCount) {
        validateLottery(lotteryType, ballCount);
        createBalls(ballCount);
        Random rnd = new Random();
        List<Integer> winningNumbers = new ArrayList<>();
        while (winningNumbers.size() < lotteryType) {
            int winningBall = rnd.nextInt(ballCount);
            if (!winningNumbers.contains(balls.get(winningBall))) {
                winningNumbers.add(balls.get(winningBall));
            }
        }
        return winningNumbers;
    }

    private void validateLottery(int lotteryType, int ballCount) {
        if (lotteryType >= ballCount) {
            throw new IllegalArgumentException("There must be more balls than the winning numbers!");
        }
    }
    private void createBalls(int ballCount) {
        for (int i = 1; i <= ballCount; i++) {
            balls.add(i);
        }
        Collections.shuffle(balls);
    }
}
