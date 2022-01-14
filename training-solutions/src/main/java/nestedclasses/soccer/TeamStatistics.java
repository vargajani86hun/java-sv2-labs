package nestedclasses.soccer;

import java.util.Objects;

public class TeamStatistics {
    private String teamName;
    private static class seasonStatistics {
        private int played;
        private int won, tied, lost;
        private int goalsFor, goalsAgainst;
        private int points;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof seasonStatistics)) return false;
            seasonStatistics that = (seasonStatistics) o;
            return played == that.played && won == that.won && tied == that.tied && lost == that.lost && goalsFor == that.goalsFor && goalsAgainst == that.goalsAgainst && points == that.points;
        }

        @Override
        public int hashCode() {
            return Objects.hash(played, won, tied, lost, goalsFor, goalsAgainst, points);
        }
    }
    private seasonStatistics seasonStatistics;

    public String getTeamName() {
        return teamName;
    }

    public int getPlayedInSeason() {
        return seasonStatistics.played;
    }

    public int getWonInSeason() {
        return seasonStatistics.won;
    }

    public int getTiedInSeason() {
        return seasonStatistics.tied;
    }

    public int getLostInSeason() {
        return seasonStatistics.lost;
    }

    public int getGoalsForInSeason() {
        return seasonStatistics.goalsFor;
    }

    public int getGoalsAgainstInSeason() {
        return seasonStatistics.goalsAgainst;
    }

    public int getPointsInSeason() {
        return seasonStatistics.points;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TeamStatistics)) return false;
        TeamStatistics that = (TeamStatistics) o;
        return Objects.equals(teamName, that.teamName) && Objects.equals(seasonStatistics, that.seasonStatistics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(teamName, seasonStatistics);
    }

    public void played(int plusGoalsFor, int plusGoalsAgainst) {
        seasonStatistics.played++;
        seasonStatistics.goalsFor += plusGoalsFor;
        seasonStatistics.goalsAgainst += plusGoalsAgainst;
        if (plusGoalsFor == plusGoalsAgainst) {
            seasonStatistics.tied++;
            seasonStatistics.points++;
        } else if (plusGoalsFor > plusGoalsAgainst) {
            seasonStatistics.lost++;
        } else {
            seasonStatistics.won++;
            seasonStatistics.points += 3;
        }
    }
}
