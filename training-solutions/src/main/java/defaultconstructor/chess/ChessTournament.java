package defaultconstructor.chess;

import java.util.ArrayList;
import java.util.List;

public class ChessTournament {
    private List<Team> teams;

    public ChessTournament() {
        teams = new ArrayList<>();
        teams.add(new Team());
        teams.add(new Team());
        teams.add(new Team());
    }

    public List<Player> addPlayersToTeams(List<Player> playersRegistrated) {
        List<Player> remainingPlayers = new ArrayList<>();
        int i = 0;
        for (Player actual : playersRegistrated) {
            if (i < 6) {
                if (i % 2 == 0) {
                    teams.get(i / 2).setPlayerOne(actual);
                }
                else {
                    teams.get(i / 2).setPlayerTwo(actual);
                }
            }
            else {
                remainingPlayers.add(actual);
            }
            i++;
        }
        return remainingPlayers;
    }

    public List<Team> getTeams() {
        return new ArrayList<>(teams);
    }
}
