package nestedclasses.soccer;

import statemachine.seatheater.SeatHeaterState;

import java.util.Objects;

public class TeamStatistics {
    private static class SeasonStatistics {
        private int played;
        private int won, tied, lost;
        private int goalsFor, goalsAgainst;
        private int points;
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof SeasonStatistics)) return false;
            SeasonStatistics that = (SeasonStatistics) o;
            return played == that.played && won == that.won && tied == that.tied && lost == that.lost && goalsFor == that.goalsFor && goalsAgainst == that.goalsAgainst && points == that.points;
        }

        @Override
        public int hashCode() {
            return Objects.hash(played, won, tied, lost, goalsFor, goalsAgainst, points);
        }

    }
    private String teamName;
    private SeasonStatistics seasonStatistics;

    public TeamStatistics(String teamName) {
        this.teamName = teamName;
        seasonStatistics = new SeasonStatistics();
    }

    public String getTeamName() {
        return teamName;
    }

    public int getPlayed() {
        return seasonStatistics.played;
    }

    public int getWon() {
        return seasonStatistics.won;
    }

    public int getTied() {
        return seasonStatistics.tied;
    }

    public int getLost() {
        return seasonStatistics.lost;
    }

    public int getGoalsFor() {
        return seasonStatistics.goalsFor;
    }

    public int getGoalsAgainst() {
        return seasonStatistics.goalsAgainst;
    }

    public int getPoints() {
        return seasonStatistics.points;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TeamStatistics)) return false;
        TeamStatistics that = (TeamStatistics) o;
        return Objects.equals(teamName, that.teamName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(teamName);
    }

    public void played(int plusGoalsFor, int plusGoalsAgainst) {
        seasonStatistics.played++;
        seasonStatistics.goalsFor += plusGoalsFor;
        seasonStatistics.goalsAgainst += plusGoalsAgainst;
        if (plusGoalsFor == plusGoalsAgainst) {
            seasonStatistics.tied++;
            seasonStatistics.points++;
        } else if (plusGoalsFor < plusGoalsAgainst) {
            seasonStatistics.lost++;
        } else {
            seasonStatistics.won++;
            seasonStatistics.points += 3;
        }
    }
}
