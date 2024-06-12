/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package epl;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Kirollous Hany
 */
public class Team {

    private String name;
    private int id;
    private ArrayList<Player> players;
    private Player captain;
    private ArrayList<Match> matches;
    private int winCount;
    private int drawCount;
    private int defeatCount;
    private int scoredGoalsCount;
    private int receivedGoalsCount;
    private int points;
    private int matchesPlayed;
    private static final ArrayList<Team> teams = new ArrayList<>();
    private ArrayList<Match> teamHeldMatches;

    public Team(String name, int id) {
        this.name = name;
        this.id = id;
        this.players = new ArrayList<>();
        this.matches = new ArrayList<>();
        this.teamHeldMatches = new ArrayList<>();
    }

    public Team() {
        this.players = new ArrayList<>();
        this.matches = new ArrayList<>();
        this.teamHeldMatches = new ArrayList<>();
    }

    public static void getTeams() {
        for (Team team : teams) {
            System.out.println(team.getName());
        }
    }

    public static void setTeams(Team team) {
        teams.add(team);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void displayPlayers() {
        for (Player player : players) {
            System.out.println(player.displayPlayerInformation());
        }
    }

    public void setPlayers(Player player) {
        this.players.add(player);
    }

    public Player getCaptain() {
        return captain;
    }

    public void setCaptain(Player captain) {
        this.captain = captain;
    }

    public void getMatches() {
        for (Match match : matches) {
            System.out.println(match.MatchInformation(match.getID()));
        }
    }

    public void setMatches(Match match) {
        this.matches.add(match);
    }

    public void getTeamHeldMatches() {
        for (Match match : teamHeldMatches) {
            System.out.println(match.MatchInformation(match.getID()));
        }
    }

    public void setTeamHeldMatches(Match match) {
        this.teamHeldMatches.add(match);
    }

    public int getWinCount() {
        return winCount;
    }

    public void setWinCount(int winCount) {
        this.winCount = winCount;
    }

    public int getDrawCount() {
        return drawCount;
    }

    public void setDrawCount(int drawCount) {
        this.drawCount = drawCount;
    }

    public int getDefeatCount() {
        return defeatCount;
    }

    public void setDefeatCount(int defeatCount) {
        this.defeatCount = defeatCount;
    }

    public int getScoredGoalsCount() {
        return scoredGoalsCount;
    }

    public void setScoredGoalsCount(int scoredGoalsCount) {
        this.scoredGoalsCount = scoredGoalsCount;
    }

    public int getReceivedGoalsCount() {
        return receivedGoalsCount;
    }

    public void setReceivedGoalsCount(int receivedGoalsCount) {
        this.receivedGoalsCount = receivedGoalsCount;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getMatchesPlayed() {
        return matchesPlayed;
    }

    public void setMatchesPlayed(int matchesPlayed) {
        this.matchesPlayed = matchesPlayed;
    }

    public String displayTeamInfo(Team team) {
        return ("Team ID : " + team.getId()
                + "\n Team Name : " + team.getName()
                + "\n Matches won : " + team.getWinCount()
                + "\n Matches lost : " + team.getDefeatCount()
                + "\n Matches draw : " + team.getDrawCount()
                + "\n Scored goals : " + team.getScoredGoalsCount()
                + "\n Recieved goals : " + team.getReceivedGoalsCount()
                + "\n Points : " + team.getPoints()
                + "\n Matches played : " + team.getMatchesPlayed());
    }

    public static boolean searchForTeamUsingName(String name) {
        boolean x = false;
        for (Team club : teams) {
            if (club.getName().equalsIgnoreCase(name)) {
                x = true;
            }
        }
        return x;
    }

    public static boolean searchForTeamUsingID(int id) {
        boolean x = false;
        for (Team club : teams) {
            if (club.getId() == id) {
                x = true;
            }
        }
        return x;
    }

    public String displayTeamDetailedScores(Team team) {

        return "Club: " + team.getName()
                + " Points: " + team.getPoints()
                + " goal difference: " + (team.getScoredGoalsCount() - team.getReceivedGoalsCount());
    }

    public void displayTeamMatchesWithDetails() {
        for (Match match : matches) {
            System.out.println(match.MatchInformation(match.getID()));
        }
    }

    public static void displayTeamsOrderedPoints() {
        Collections.sort(teams, new CustomComparator());
        for (Team club : teams) {
            System.out.println("Club: " + club.getName() + " Points: " + club.getPoints());
        }
    }

    public static void displayTeamsOrderedScoredgoals() {

        Collections.sort(teams, new NoOfScoredGoalsComparator());
        for (Team club : teams) {
            System.out.println("Club: " + club.getName() + " Scored Goals: " + club.getScoredGoalsCount());
        }
    }

    public double avgAgePlayers() {
        double totalAge = 0;
        double counter = 0;
        double avgAge;
        for (Player player : players) {
            totalAge += player.getAge();
            counter++;
        }
        avgAge = totalAge / counter;
        return avgAge;
    }

    public static void displayTeamsOrderedAvgAge() {

        Collections.sort(teams, new AvgAgeComparator());
        for (Team club : teams) {
            System.out.println("Club: " + club.getName() + " AvgAge: " + String.format("%.2f", club.avgAgePlayers()));
        }
    }

    public static Team teamName(String name) {
        for (Team team : Team.teams) {
            if (team.getName().equals(name)) {
                return team;
            }
        }
        return null;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void deletePlayer(Player p) {
        p.getTeam().players.remove(p);
    }
}
