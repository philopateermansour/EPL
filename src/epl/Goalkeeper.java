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
public class Goalkeeper extends Player{
    
    static ArrayList<Goalkeeper>goalkeepers=new ArrayList<>();
    private int numberOfGoalReceived; 

    public static void addGoalkeepersToList(Goalkeeper g) {
       goalkeepers.add(g);
    }

    public Goalkeeper(String name, int age,int number,int rank, int score, int assist ,int numberOfGoalReceived,  Team team) {
        super("goalkeeper", name, age, number, rank, score, assist, team);
        this.numberOfGoalReceived = numberOfGoalReceived;
    }

    
    
    

    public int getNumberOfGoalReceived() {
        return numberOfGoalReceived;
    }

    @Override
    public String displayPlayerRoleWithDescription() {
        return "goalkeeper, The goalkeeper's role is to protect the goal from the opponent's attempts to score by stopping or blocking the ball from entering the net.";
    }

    public  void setNumberOfGoalReceived(int numberOfGoalReceived) {
        this.numberOfGoalReceived = numberOfGoalReceived;
    }
    
    public static void bestGoalkeepers() {
        Collections.sort(goalkeepers, new GoalsReceivedComparator());
        for (int i = 0; i < 3; i++) {
            System.out.println(goalkeepers.get(i).getName()+" received "+goalkeepers.get(i).getNumberOfGoalReceived()+" goal(s)");
        }
}
}
