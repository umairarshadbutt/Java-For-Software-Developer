package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        FootballPlayer tahir = new FootballPlayer("Tahir");
        BaseballPlayer ahmad = new BaseballPlayer("Ahmad");
        SoccerPlayer shami = new SoccerPlayer("Shami");

        Team qalandars = new Team("Lahore Qalandars");
        qalandars.addPlayer(tahir);
        qalandars.addPlayer(shami);
        qalandars.addPlayer(ahmad);


        System.out.println(qalandars.numPlayers());
    }
}
