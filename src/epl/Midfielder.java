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
public class Midfielder extends Player{

    public Midfielder( String name, int age, int number, int rank, int score, int assist, Team team) {
        super("midfielder", name, age, number, rank, score, assist, team);
    }
    
    

    @Override
    public String displayPlayerRoleWithDescription() {
        return "midfielder, A midfielder is a player who operates in the center of the field and acts as a link between the defense and the attack. They are responsible for controlling the flow of the game, distributing the ball to teammates, and facilitating offensive and defensive play.";
    }
    
}
