/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epl;

/**
 *
 * @author lenovo
 */
public class Forward extends Player{

    public Forward(String name, int age, int number, int rank, int score, int assist, Team team) {
        super("forward", name, age, number, rank, score, assist, team);
    }

    

    @Override
    public String displayPlayerRoleWithDescription() {
        return "Forward, A forward's role in a team is to primarily focus on scoring goals and creating scoring opportunities by using their athleticism, speed, and technical skills. They are typically positioned in the front line of the team's formation and work closely with the midfielders to receive passes and make runs towards the opposition's goal.";
    }

   
    
}
