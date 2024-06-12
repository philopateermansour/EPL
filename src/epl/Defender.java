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
public class Defender extends Player{

    public Defender( String name, int age, int number, int rank, int score, int assist, Team team) {
        super("defender", name, age, number, rank, score, assist, team);
    }
    
   

    @Override
    public String displayPlayerRoleWithDescription() {
        return "defender, The defender role is responsible for protecting their team's goal or objective and preventing the opposing team from scoring or advancing. They use their defensive skills, tactics, and physicality to intercept passes, block shots, and regain possession of the ball, ensuring the safety and security of their team's defensive zone.";
    }
    
    
}
