/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package epl;

import java.util.Comparator;

/**
 *
 * @author Kirollous Hany
 */
public class CustomComparator implements Comparator<Team> {

    @Override
    public int compare(Team t, Team t1) {

        if (t.getPoints() > t1.getPoints()) {
            return -1;
        } else if (t.getPoints() < t1.getPoints()) {
            return 1;
        } else {
            int goalDif = t.getScoredGoalsCount() - t.getReceivedGoalsCount();
            int goalDif1 = t1.getScoredGoalsCount() - t1.getReceivedGoalsCount();
            if (goalDif > goalDif1) {
                return -1;
            } else if (goalDif < goalDif1) {
                return 1;
            } else {
                return 0;
            }
        }

    }

}
