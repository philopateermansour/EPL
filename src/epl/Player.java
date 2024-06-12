/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epl;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author lenovo
 */
public abstract class Player {

    private String type, name;
    private int number, rank, score, age, assist;
    private Team team;
    final static ArrayList<Player> players = new ArrayList<>();

    public Player(String type, String name, int age, int number, int rank, int score, int assist, Team team) {
        this.type = type;
        this.name = name;
        this.age = age;
        this.number = number;
        this.rank = rank;
        this.score = score;
        this.assist = assist;
        this.team = team;
    }

    public int getAge() {
        return age;
    }
    
    public int getScore() {
        return score;
    }

    public static void addPlayerToList(Player p) {
        players.add(p);
    }

    public String displayPlayerInformation() {
        return "player's name is " + name + "\nposition is a " + type + "\nteam : " + team.getName() + "\nage : " + age + "\nnumber : " + number + "\nscore : " + score + "\nrank : " + rank+"\nassist : "+assist;
    }

    public abstract String displayPlayerRoleWithDescription();

    public void setType(String type) {
        this.type = type;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setAssist(int assist) {
        this.assist = assist;
    }
    

    public void setAge(int age) {
        this.age = age;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public int getNumber() {
        return number;
    }

    public Team getTeam() {
        return team;
    }

    public String getType() {
        return type;
    }
    
    public static Player searchForPlayer(String t, int number, String name) {  
        for (Player player : players) {
            
            if( player.name.equals(name) && player.number == number && player.team.getName().equals(t))
            {
               return player;
            }
        }
        return null;
    }

    public static void displayTop3scorers() {
        Collections.sort(players, new ScoreComparator());
        int size = players.size();
        for (int i = size - 1; i >= size - 3; i--) {
            System.out.println(players.get(i).name + " has " + players.get(i).score + " goal(s)");
        }
    }
    public static void displayTop3Ranked() {
        Collections.sort(players, new RankComparator());
        for (int i = 0; i < 3; i++) {
            System.out.println(players.get(i).name);}
    }

    public String getName() {
        return name;
    }

    public int getRank() {
        return rank;
    }
    public static boolean searchForNumber(int number,Team t) {
        boolean x = false;
        for (Player player : t.getPlayers()) {
            if( player.number == number){
            x = true;
            }
        }
        return x;
    }

    

}
