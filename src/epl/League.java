/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package epl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Kirollous Hany
 */
public class League {

    

    public League() {
        displayMenu();
    }

    public void displayMenu() {

        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to our Egyptain Premier League!"
                + "\nOperations: "
                + "\n1- PLayer\na) Add Player\nb) Display Player Information\nc) Display Player Role With Description" + "\nd) Update Player Information\ne) Search For Player"
                + "\n2- Team\na) Add Team\nb) Display Team Information\nc) Display Team Players \nd) Display Team Detailed Scores " + "\ne) Display Team Matches With All Details\nf) Display Team Matches As Held Matches"
                + "\n3- Match\na) Add Match\nb) Display All Matches With Detials\nc) Display Held Matches And To Be Held Matches\nd) Update Match"
                + "\n4- Others\na) Display Teams Ordered By Their Points\nb) The Three Players With The Most Goals Scored\nc) The Three GoalKeepers With The Most Clean Sheets\nd) Display Top Three Player Ordered By Their Ranks\ne) Display Teams Ordered By No Of Scored Goals \nf) Display Teams Ordered By The Average Ages Of Its Players\ng) Display Matches In A Certain Date"
                + "\n5- Quit");
        while (true) {
            System.out.println("============");
            System.out.println("Enter Operation");
            System.out.println("============");
            String choice = in.nextLine();
            switch (choice) {
                case "1a":
                    addPlayer();
                    break;
                case "1b":
                    displayPlayerInformation();
                    break;
                case "1c":
                    displayPlayerRoleWithDescription();
                    break;
                case "1d":
                    updatePlayerInformation();
                    break;
                case "1e":
                    searchForPlayer();
                    break;
                case "2a":
                    AddTeam();
                    break;
                case "2b":
                    displayTeamInformation();
                    break;
                case "2c":
                    displayTeamPlayers();
                    break;
                case "2d":
                    displayTeamDetailedScores();
                    break;
                case "2e":
                    displayTeamMatchesWithAllDetails();
                    break;
                case "2f":
                    displayTeamMatchesAsHeldMatches();
                    break;
                case "3a":
                    addMatch();
                    break;
                case "3b":
                    Match.DisplayMatchsDetails();
                    break;
                case "3c":
                    Match.getHeldMatches();
                    break;
                case "3d":
                    updateMatch();
                    break;
                case "4a":
                    Team.displayTeamsOrderedPoints();
                    break;
                case "4b":
                    Player.displayTop3scorers();
                    break;
                case "4c":
                    Goalkeeper.bestGoalkeepers();
                    break;
                case "4d":
                    Player.displayTop3Ranked();
                    break;
                case "4e":
                    Team.displayTeamsOrderedScoredgoals();
                    break;
                case "4f":
                    Team.displayTeamsOrderedAvgAge();
                    break;
                case "4g":
                    displayMatchesInACertainDate();
                    break;
                case "5":
                    return;

            }
        }
    }
    private static void AddTeam() {
        Scanner in = new Scanner(System.in);
        Team team = new Team();
        System.out.print("Enter Team Name : ");
        String name = in.nextLine();
        team.setName(name);
        if (Team.searchForTeamUsingName(name)) {
            System.out.println("This team is already in the league");
            return;
        }
        System.out.print("Enter Team ID : ");
        int id = in.nextInt();
        team.setId(id);
        if (Team.searchForTeamUsingID(id)) {
            System.out.println("This ID is already in the league");
            return;
        }
        Team.setTeams(team);
    }

    private static void displayTeamInformation() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Team Name : ");
        String name = in.nextLine();
        Team team = Team.teamName(name);
        if (team != null) {
            team.displayTeamInfo(team);
        } else {
            System.out.println("No such Team in league");
        }
    }

    private static void displayTeamDetailedScores() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Team Name : ");
        String name = in.nextLine();
        Team team = Team.teamName(name);
        if (team != null) {
            team.displayTeamDetailedScores(team);
        } else {
            System.out.println("No such Team in league");
        }
    }

    private static void displayTeamPlayers() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Team Name : ");
        String name = in.nextLine();
        Team team = Team.teamName(name);
        if (team != null) {
            team.displayPlayers();
        } else {
            System.out.println("No such Team in league");
        }
    }

    private static void displayTeamMatchesWithAllDetails() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Team Name : ");
        String name = in.nextLine();
        Team team = Team.teamName(name);
        if (team != null) {
            team.displayTeamMatchesWithDetails();
        } else {
            System.out.println("No such Team in league");
        }
    }

    private static void displayTeamMatchesAsHeldMatches() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Team Name : ");
        String name = in.nextLine();
        Team team = Team.teamName(name);
        if (team != null) {
            team.getTeamHeldMatches();
        } else {
            System.out.println("No such Team in league");
        }
    }

    private static void addMatch() {
        Scanner in = new Scanner(System.in);
        Match match = new Match();

        System.out.print("Enter Date (format mm-dd-yyyy) : ");
        String line = in.nextLine();
        Date date;
        try {
            date = new SimpleDateFormat("MM-dd-yyyy").parse(line);
        } catch (ParseException ex) {
            System.out.println("You Have To Enter Date In Format : mm-dd-yyyy");
            return;
        }
        match.setDate(date);

        System.out.print("Enter Home Team : ");
        String team1 = in.nextLine();
        Team t = Team.teamName(team1);
        if (t != null) {
            match.setTeam1(t);
        } else {
            System.out.println("No such club in league");
            return;
        }

        System.out.print("Enter Away Team: ");
        String team2 = in.nextLine();
        Team t2 = Team.teamName(team2);
        if (t2 != null) {
            match.setTeam2(t2);
        } else {
            System.out.println("No such club in league");
            return;
        }

        System.out.print("Enter Home Team Goals : ");
        int team1Score = in.nextInt();

        if (team1Score == -1) {
            System.out.println("You Have To Enter Number Of Goals");
            return;
        }
        match.setTeam1Score(team1Score);

        System.out.print("Enter Away Team Goals : ");
        int team2Score = in.nextInt();

        if (team2Score == -1) {
            System.out.println("You Have To Enter Number Of Goals");
            return;
        }
        match.setTeam2Score(team2Score);

        System.out.print("Enter Match ID : ");
        int id = in.nextInt();
        if (match.searchForMatchUsingID(id)) {
            System.out.println("This ID is already in the league");
            return;
        }
        match.setID(id);

        Match.setMatch(match);
    }

    private static void updateMatch() {
        Scanner in = new Scanner(System.in);
        System.out.println("Update ( Date , Score )");
        String choice = in.nextLine();
        switch (choice) {
            case "Date":
                System.out.print("Enter Date (format mm-dd-yyyy) : ");
                String line = in.nextLine();
                Date nDate;
                try {
                    nDate = new SimpleDateFormat("MM-dd-yyyy").parse(line);
                } catch (ParseException ex) {
                    System.out.println("You Have To Enter Date In Format : mm-dd-yyyy");
                    return;
                }
                System.out.print("Enter Id : ");
                int id = in.nextInt();
                Match match = Match.match(id);
                if (match != null) {
                    match.updateMatchDate(id, nDate);
                } else {
                    System.out.println("This ID is Not in the league");
                }
                break;
            case "Score":
                System.out.print("Enter Home Team Goals : ");
                int team1Score = in.nextInt();
                if (team1Score == -1) {
                    System.out.println("You Have To Enter Number Of Goals");
                    return;
                }
                System.out.print("Enter Away Team Goals : ");
                int team2Score = in.nextInt();
                if (team2Score == -1) {
                    System.out.println("You Have To Enter Number Of Goals");
                    return;
                }
                System.out.print("Enter Id : ");
                int iD = in.nextInt();
                Match match1 = Match.match(iD);
                if (match1 != null) {
                    match1.updateMatchScore(iD, team1Score, team2Score);
                } else {
                    System.out.println("This ID is Not in the league");
                    return;
                }
                match1.getTeam1().setScoredGoalsCount(match1.getTeam1().getScoredGoalsCount() + team1Score);
                match1.getTeam2().setScoredGoalsCount(match1.getTeam2().getScoredGoalsCount() + team2Score);
                match1.getTeam1().setReceivedGoalsCount(match1.getTeam1().getReceivedGoalsCount() + team2Score);
                match1.getTeam2().setReceivedGoalsCount(match1.getTeam2().getReceivedGoalsCount() + team1Score);
                match1.getTeam1().setMatchesPlayed(match1.getTeam1().getMatchesPlayed() + 1);
                match1.getTeam2().setMatchesPlayed(match1.getTeam2().getMatchesPlayed() + 1);
                if (team1Score > team2Score) {
                    match1.getTeam1().setPoints(match1.getTeam1().getPoints() + 3);
                    match1.getTeam1().setWinCount(match1.getTeam1().getWinCount() + 1);
                    match1.getTeam2().setDefeatCount(match1.getTeam2().getDefeatCount() + 1);
                } else if (team1Score < team2Score) {
                    match1.getTeam2().setPoints(match1.getTeam2().getPoints() + 3);
                    match1.getTeam2().setWinCount(match1.getTeam2().getWinCount() + 1);
                    match1.getTeam1().setDefeatCount(match1.getTeam1().getDefeatCount() + 1);
                } else {
                    match1.getTeam1().setPoints(match1.getTeam1().getPoints() + 1);
                    match1.getTeam2().setPoints(match1.getTeam2().getPoints() + 1);
                    match1.getTeam1().setDrawCount(match1.getTeam1().getDrawCount() + 1);
                    match1.getTeam2().setDrawCount(match1.getTeam2().getDrawCount() + 1);
                }
                break;
            default:
                System.out.println("You Should Enter The Date or Score");
        }
    }

    private static void displayMatchesInACertainDate() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Date (format mm-dd-yyyy) : ");
        String line = in.nextLine();
        Date date;
        try {
            date = new SimpleDateFormat("MM-dd-yyyy").parse(line);
        } catch (ParseException ex) {
            System.out.println("You Have To Enter Date In Format : mm-dd-yyyy");
            return;
        }
        Match.displayMatchesInCertainDate(date);
    }

    private static void addPlayer() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter The Name : ");
        String name = scan.nextLine();
        System.out.print("Enter The Position : ");
        String position = scan.nextLine();
        System.out.print("Enter The Team : ");
        String team = scan.nextLine();
        Team t = Team.teamName(team);
        if (t == null) {
            System.out.println("There Is No Team With That Name");
            return;
        }
        System.out.print("Enter The Shirt Number : ");
        int num = scan.nextInt();
        if (Player.searchForNumber(num, t)) {
            System.out.println("This Number Is Already Taken");
            return;
        }
        System.out.print("Enter The Age : ");
        int age = scan.nextInt();
        System.out.print("Enter The Rank : ");
        int rank = scan.nextInt();
        System.out.print("Enter The Number Of Goals : ");
        int score = scan.nextInt();
        System.out.print("Enter The Number Of Assists : ");
        int aasist = scan.nextInt();
        Player p;
        switch (position) {
            case "forward":
                p = new Forward(name, age, num, rank, score, aasist, t);
                t.setPlayers(p);
                Player.addPlayerToList(p);
                break;
            case "defender":
                p = new Defender(name, age, num, rank, score, aasist, t);
                t.setPlayers(p);
                Player.addPlayerToList(p);
                break;
            case "midfielder":
                p = new Midfielder(name, age, num, rank, score, aasist, t);
                t.setPlayers(p);
                Player.addPlayerToList(p);
                break;
            case "goalkeeper":
                System.out.println("Enter How Many Goal That Goalkeeper Received");
                int goalReceived = scan.nextInt();
                p = new Goalkeeper(name, age, num, rank, score, aasist, goalReceived, t);
                t.setPlayers(p);
                Player.addPlayerToList(p);
                Goalkeeper.addGoalkeepersToList((Goalkeeper) p);
                break;
        }

    }

    public static void displayPlayerInformation() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter player's Name : ");
        String name = scan.nextLine();
        System.out.print("Enter player's Team : ");
        String team = scan.nextLine();
        System.out.print("Enter player's Shirt Number : ");
        int number = scan.nextInt();
        Player p = Player.searchForPlayer(team, number, name);
        if (p == null) {
            System.out.println("we Can't Find That Player");
        } else {
            System.out.println(p.displayPlayerInformation());
        }
    }

    public static void displayPlayerRoleWithDescription() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter player's Name : ");
        String name = scan.nextLine();
        System.out.print("Enter player's Team : ");
        String team = scan.nextLine();
        System.out.print("Enter player's Shirt Number : ");
        int number = scan.nextInt();
        Player p = Player.searchForPlayer(team, number, name);
        if (p == null) {
            System.out.println("We Can't Find That Player");
        } else {
            System.out.println(p.displayPlayerRoleWithDescription());
        }
    }
    
    
    private static void updatePlayerInformation() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter player's Name : ");
        String name = in.nextLine();
        System.out.print("Enter player's Team : ");
        String team = in.nextLine();
        System.out.print("Enter player's Shirt Number : ");
        int number = in.nextInt();
        Player p = Player.searchForPlayer(team, number, name);
        if (p == null) {
            System.out.println("We Can't Find That Player");    
        }else{
            plInfo(p);
        }
    }

    public static void plInfo(Player p) {
        Scanner in = new Scanner(System.in);
        System.out.println("a) Age"
                + "\nb) Number"
                + "\nc) Score"
                + "\nd) Assist"
                + "\ne) Rank"
                + "\nf) Team"
                + "\ng) Number Of Goals Received"
                + "\nh) Exit");
        System.out.println("============");
        System.out.println("which Information You Want To Update");
        System.out.println("============");
        String choice = in.nextLine();

        switch (choice) {
            case "a": {
                System.out.print("Enter The New Age : ");
                int age = in.nextInt();
                p.setAge(age);
                break;
            }
            case "b": {
                System.out.print("Enter The New Number : ");
                int num = in.nextInt();
                p.setNumber(num);
                break;
            }
            case "c": {
                System.out.print("Enter The New Score : ");
                int score = in.nextInt();
                p.setScore(score);
                break;
            }
            case "d": {
                System.out.print("Enter The New Assist");
                int assist = in.nextInt();
                p.setAssist(assist);
                break;
            }
            case "f": {
                Team breviousTeam = p.getTeam();
                System.out.print("Enter The New Team : ");
                String teamName = in.nextLine();
                Team t = Team.teamName(teamName);
                if (!Player.searchForNumber(p.getNumber(), t)) {
                    p.setTeam(t);
                    t.setPlayers(p);
                    breviousTeam.deletePlayer(p);
                } else {
                    System.out.println("There Is A Player In That Team Has The Same Shirt Number, So You Have To Change It First");
                }
                break;
            }
            case "g": {
                String n = "goalkeeper";
                if (p.getType().equals(n)) {
                    System.out.print("Enter The New Received Goals : ");
                    int rgoals = in.nextInt();
                    Goalkeeper g = (Goalkeeper) p;
                    g.setNumberOfGoalReceived(rgoals);
                } else {
                    System.out.println("The Player Isnt A Goalkeeper ");
                }
            }
            break;
            case "h": {
                return;
            }
            default:
                System.out.println("Invalid Choice");

        }
    }

    public static void searchForPlayer() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter player's Name : ");
        String name = scan.nextLine();
        System.out.print("Enter player's Team : ");
        String team = scan.nextLine();
        System.out.print("Enter player's Shirt Number : ");
        int number = scan.nextInt();
        Player p = Player.searchForPlayer(team, number, name);
        if (p == null) {
            System.out.println("We Can't Find That Player");
        } else {
            System.out.println("We Found Him");
        }
    }

}
