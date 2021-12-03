package defaultconstructor.chess;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ChessTournamentTest {

    @Test
    void testCreate() {
        ChessTournament chessTournament = new ChessTournament();
        assertEquals(3, chessTournament.getTeams().size());
    }

    @Test
    void testAddPlayersToTeamsWithLessPlayers() {
        ChessTournament chessTournament = new ChessTournament();
        List<Player> playersOfFirstDay = Arrays.asList(new Player(), new Player(),
                new Player());
        playersOfFirstDay.get(0).setName("Polgár Petra").setEmail("ppolgar@e-mailem.hu");
        playersOfFirstDay.get(1).setName("Lékó László").setEmail("llelo@e-mailem.hu");
        playersOfFirstDay.get(2).setName("Kovács János").setEmail("jkovacs@e-mailem.hu");
        List<Player> remainingPlayers = chessTournament.addPlayersToTeams(playersOfFirstDay);
        assertEquals(0, remainingPlayers.size());
        assertEquals("Polgár Petra", chessTournament.getTeams().
                get(0).getPlayerOne().getName());
        assertEquals("jkovacs@e-mailem.hu", chessTournament.getTeams().
                get(1).getPlayerOne().getEmail());
        assertThrows(NullPointerException.class,
                () -> chessTournament.getTeams().get(1).getPlayerTwo().getEmail());
        assertThrows(NullPointerException.class,
                () -> chessTournament.getTeams().get(2).getPlayerOne().getName());
    }

    @Test
    void testAddPlayersToTEamsWithMorePlayers() {
        ChessTournament chessTournament = new ChessTournament();
        List<Player> playersOfFirstDay = Arrays.asList(new Player(), new Player(),
                new Player(), new Player(), new Player(), new Player(), new Player(), new Player());
        playersOfFirstDay.get(0).setName("Polgár Petra").setEmail("ppolgar@e-mailem.hu");
        playersOfFirstDay.get(1).setName("Lékó László").setEmail("llelo@e-mailem.hu");
        playersOfFirstDay.get(2).setName("Redneck Erik").setEmail("eredneck@e-mailem.hu");
        playersOfFirstDay.get(3).setName("Vereczkei Imola").setEmail("ivereczkei@e-mailem.hu");
        playersOfFirstDay.get(4).setName("Harmat Júlia").setEmail("jharmat@e-mailem.hu");
        playersOfFirstDay.get(5).setName("Kelemen Imre").setEmail("ikelemen@e-mailem.hu");
        playersOfFirstDay.get(6).setName("Zubai Gábor").setEmail("gzubai@e-mailem.hu");
        playersOfFirstDay.get(7).setName("Lukács István").setEmail("ilukacs@e-mailem.hu");
        List<Player> remainingPlayers = chessTournament.addPlayersToTeams(playersOfFirstDay);
        assertEquals(2, remainingPlayers.size());
        assertEquals("Lékó László", chessTournament.getTeams().
                get(0).getPlayerTwo().getName());
        assertEquals("eredneck@e-mailem.hu", chessTournament.getTeams().
                get(1).getPlayerOne().getEmail());
        assertEquals("Kelemen Imre", chessTournament.getTeams().
                get(2).getPlayerTwo().getName());
    }
}