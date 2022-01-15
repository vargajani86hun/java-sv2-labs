package nestedclasses.soccer;

import java.util.ArrayList;
import java.util.List;

public class Championship {
    public static class GameResult {
        private String teamHome, teamGuest;
        private int goalHome, goalGuest;

        public GameResult(String teamHome, String teamGuest, int goalHome, int goalGuest) {
            this.teamHome = teamHome;
            this.teamGuest = teamGuest;
            this.goalHome = goalHome;
            this.goalGuest = goalGuest;
        }
    }
    private List<TeamStatistics> leagueTable = new ArrayList<>();
    public void addGame(GameResult result) {
        getTeamByName(result.teamHome).played(result.goalHome, result.goalGuest);
        getTeamByName(result.teamGuest).played(result.goalGuest, result.goalHome);
    }

    public List<TeamStatistics> getLeagueTable() {
        return new ArrayList<>(leagueTable);
    }

    private TeamStatistics getTeamByName(String teamName) {
        for (TeamStatistics ts : leagueTable) {
            if (ts.getTeamName().equals(teamName)) return ts;
        }
        leagueTable.add(new TeamStatistics(teamName));
        return leagueTable.get(leagueTable.size() - 1);
    }
}
