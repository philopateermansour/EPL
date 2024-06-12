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
public class RankComparator implements Comparator<Player> {
    

    @Override
    public int compare(Player o1, Player o2) {
        return Integer.compare(o1.getRank(), o2.getRank());
    }
}
