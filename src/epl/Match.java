/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package epl;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Kirollous Hany
 */
public class Match {

    private int ID;
    private Date date;
    private Team team1, team2;
    private String referee;
    private int team1Score, team2Score;
    private String stadiumName;
    private final static ArrayList<Match> matches = new ArrayList<>();
    private final static ArrayList<Match> heldMatches = new ArrayList<>();

    public Match(int ID, Date date, Team team1, Team team2, String referee, int team1Score, int team2Score, String stadiumName) {
        this.ID = ID;
        this.date = date;
        this.team1 = team1;
        this.team2 = team2;
        this.referee = referee;
        this.team1Score = team1Score;
        this.team2Score = team2Score;
        this.stadiumName = stadiumName;
    }

    public Match() {
    }
    
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Team getTeam1() {
        return team1;
    }

    public void setTeam1(Team team1) {
        this.team1 = team1;
    }

    public Team getTeam2() {
        return team2;
    }

    public void setTeam2(Team team2) {
        this.team2 = team2;
    }

    public String getReferee() {
        return referee;
    }

    public void setReferee(String referee) {
        this.referee = referee;
    }

    public static void getHeldMatches() {
        for (Match match : heldMatches) {
            System.out.println(match.MatchInformation(match.getID()));
        }
    }

    public static void setHeldMatch(Match match) {
        heldMatches.add(match);
    }

    public int getteam1Score() {
        return team1Score;
    }

    public int getteam2Score() {
        return team2Score;
    }

    public void setTeam1Score(int score) {
        this.team1Score = score;
    }

    public void setTeam2Score(int score) {
        this.team2Score = score;
    }

    public String getStadiumName() {
        return stadiumName;
    }

    public void setStadiumName(String stadiumName) {
        this.stadiumName = stadiumName;
    }

    public static void DisplayMatchsDetails() {
        for (Match match : matches) {
            System.out.println("match  " + match.getFormatedDate() + "  : " + match.getTeam1().getName() + " " + match.getteam1Score() + " - " + match.getTeam2().getName() + " " + match.getteam2Score());
        }
    }

    public static void setMatch(Match match) {
        matches.add(match);
    }

    public Date getDate() {

        return date;
    }

    public String getFormatedDate() {
        SimpleDateFormat DateFormat = new SimpleDateFormat("MM-dd-yyyy");
        String nDate = DateFormat.format(getDate());
        return nDate;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String MatchInformation(int ID) {
        for (Match match : matches) {
            if (match.getID() == ID) {
                return (match.getTeam1().getName() + " " + match.getteam1Score() + " - " + match.getTeam2().getName() + " " + match.getteam2Score());
            }
        }
        return null;
    }

    public static void displayMatchesInCertainDate(Date date) {
        for (Match match : matches) {
            if (match.getDate().equals(date)) {
                System.out.println(match.MatchInformation(match.getID()));
            }
        }
    }

    public void updateMatchDate(int id, Date newDate) {
        for (Match match : matches) {
            if (match.getID() == id) {
                match.setDate(newDate);
                setHeldMatch(match);
            }
        }
    }

    public void updateMatchScore(int id, int team1score, int team2score) {
        for (Match match : matches) {
            if (match.getID() == id) {
                match.setTeam1Score(team1score);
                match.setTeam2Score(team2score);
            }
        }
    }

    boolean searchForMatchUsingID(int id) {
        boolean x = false;
        for (Match match : matches) {
            if (match.getID() == id) {
                x = true;
            }
        }
        return x;
    }

    public static Match match(int id) {
        for (Match match : matches) {
            if (match.getID() == id) {
                return match;
            }
        }
        return null;
    }

}
