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
public class AvgAgeComparator implements Comparator<Team> {

    @Override
    public int compare(Team t, Team t1) {
        if (t.avgAgePlayers()> t1.avgAgePlayers()) {
            return 1;
        } else if (t.avgAgePlayers()< t1.avgAgePlayers()) {
            return -1;
        } else {
            return 0;
        }
    }
}
