package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        FootballPlayer tahir = new FootballPlayer("Tahir");
        BaseballPlayer ahmad = new BaseballPlayer("Ahmad");
        SoccerPlayer shami = new SoccerPlayer("Shami");

        Team<FootballPlayer> qalandars = new Team("Lahore Qalandars");
        qalandars.addPlayer(tahir);
//        qalandars.addPlayer(shami);
//        qalandars.addPlayer(ahmad);


        System.out.println(qalandars.numPlayers());

        Team<BaseballPlayer> baseballPlayerTeam = new Team<>("Peshawar Zalmi");
        baseballPlayerTeam.addPlayer(ahmad);

        Team<SoccerPlayer> soccerPlayerTeam = new Team<>("Islamabad");
        soccerPlayerTeam.addPlayer(shami);

        Team<SoccerPlayer> brokenTeam = new Team<>("this won't work");
        brokenTeam.addPlayer(shami);

        Team<FootballPlayer> teamA= new Team<>("TeamA");
        Team<FootballPlayer> teamB= new Team<>("TeamB");

        teamA.matchResult(teamB, 1,0);
        teamB.matchResult(teamA,8,9);



    }
}
