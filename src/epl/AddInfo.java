/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package epl;

/**
 *
 * @author Kirollous Hany
 */
public class AddInfo {

    public AddInfo() {
        addPTM();
    }

    public void addPTM() {

        Team barca = new Team("barca", 1);
        Team madrid = new Team("madrid", 2);
        Team liverpool = new Team("liverpool", 3);
        Team mancity = new Team("mancity", 4);

        Team.setTeams(barca);
        Team.setTeams(madrid);
        Team.setTeams(liverpool);
        Team.setTeams(mancity);

        Player lewa = new Forward("lewa", 34, 9, 1, 22, 5, barca);
        Player pedri = new Midfielder("pedri", 18, 8, 1, 10, 10, barca);
        Player gavi = new Midfielder("gavi", 17, 6, 1, 10, 5, barca);
        Player balde = new Defender("balde", 16, 2, 1, 1, 5, barca);
        Player terStegen = new Goalkeeper("terstegen", 32, 1, 1, 0, 1, 5, barca);
        Player vini = new Forward("vini", 25, 7, 1, 22, 5, madrid);
        Player modric = new Midfielder("pedri", 35, 8, 1, 10, 10, madrid);
        Player kroos = new Midfielder("gavi", 35, 6, 1, 10, 5, madrid);
        Player alba = new Defender("balde", 26, 2, 1, 1, 5, madrid);
        Player navas = new Goalkeeper("navas", 32, 1, 1, 0, 1, 5, madrid);
        Player salah = new Forward("salah", 30, 11, 1, 22, 5, liverpool);
        Player thiago = new Midfielder("thiago", 35, 8, 1, 10, 10, liverpool);
        Player henderson = new Midfielder("henderson", 35, 6, 1, 10, 5, liverpool);
        Player konate = new Defender("konate", 26, 2, 3, 1, 5, liverpool);
        Player alisson = new Goalkeeper("alisson", 32, 1, 1, 0, 1, 5, liverpool);
        Player halaand = new Forward("halaand", 30, 11, 1, 22, 5, mancity);
        Player rodri = new Midfielder("rodri", 35, 8, 1, 10, 10, mancity);
        Player foden = new Midfielder("foden", 35, 6, 1, 10, 5, mancity);
        Player dias = new Defender("dias", 26, 2, 3, 1, 5, mancity);
        Player ederson = new Goalkeeper("ederson", 32, 1, 1, 0, 1, 5, mancity);

        Player.addPlayerToList(lewa);
        Player.addPlayerToList(pedri);
        Player.addPlayerToList(gavi);
        Player.addPlayerToList(balde);
        Player.addPlayerToList(terStegen);
        Player.addPlayerToList(vini);
        Player.addPlayerToList(modric);
        Player.addPlayerToList(kroos);
        Player.addPlayerToList(alba);
        Player.addPlayerToList(navas);
        Player.addPlayerToList(salah);
        Player.addPlayerToList(thiago);
        Player.addPlayerToList(henderson);
        Player.addPlayerToList(konate);
        Player.addPlayerToList(alisson);
        Player.addPlayerToList(halaand);
        Player.addPlayerToList(rodri);
        Player.addPlayerToList(foden);
        Player.addPlayerToList(dias);
        Player.addPlayerToList(ederson);

        barca.setPlayers(lewa);
        barca.setPlayers(pedri);
        barca.setPlayers(gavi);
        barca.setPlayers(balde);
        barca.setPlayers(terStegen);

        madrid.setPlayers(vini);
        madrid.setPlayers(modric);
        madrid.setPlayers(kroos);
        madrid.setPlayers(alba);
        madrid.setPlayers(navas);

        liverpool.setPlayers(salah);
        liverpool.setPlayers(thiago);
        liverpool.setPlayers(henderson);
        liverpool.setPlayers(konate);
        liverpool.setPlayers(alisson);

        mancity.setPlayers(halaand);
        mancity.setPlayers(rodri);
        mancity.setPlayers(foden);
        mancity.setPlayers(dias);
        mancity.setPlayers(ederson);
    }
}
