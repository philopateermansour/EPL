/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epl;

import java.util.Comparator;

/**
 *
 * @author lenovo
 */
public class GoalsReceivedComparator implements Comparator<Goalkeeper> {
    

    @Override
    public int compare(Goalkeeper o1, Goalkeeper o2) {
        return Integer.compare(o1.getNumberOfGoalReceived(), o2.getNumberOfGoalReceived());
    }
}
