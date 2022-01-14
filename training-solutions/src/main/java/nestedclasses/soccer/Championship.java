package nestedclasses.soccer;

import java.util.ArrayList;
import java.util.List;

public class Championship {
    public static class GameResult {
        private String teamHome, TeamGuest;
        private int goalHome, goalGuest;

        public GameResult(String teamHome, String teamGuest, int goalHome, int goalGuest) {
            this.teamHome = teamHome;
            TeamGuest = teamGuest;
            this.goalHome = goalHome;
            this.goalGuest = goalGuest;
        }
    }
    private List<TeamStatistics> leagueTable = new ArrayList<>();
    public void addGame(GameResult result) {

    }
}
