package com.company;

class  Movie{
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot(){
        return "No Plot her";
    }

    public String getName() {
        return name;
    }
}

class Wazir extends  Movie{
    public Wazir() {
        super("Wazir");
    }

    public String plot(){
        return "Politics of individual person";
    }
}
class IndependanceDay extends  Movie{
    public IndependanceDay() {
        super("IndePendanceDay");
    }

    @Override
    public String plot() {
        return "coveing all the problems during migration";
    }
}

class MazeRunner extends  Movie{
    public MazeRunner() {
        super("Maze Runner");
    }

    @Override
    public String plot() {
        return "Kids try and escape a maze";
    }
}


class StarWars extends Movie {
    public StarWars() {
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "Imperial Forces try to take over the universe";
    }
}

class Forgetable extends Movie {
    public Forgetable() {
        super("Forgetable");
    }

    // No plot method
}

public class Main {


    public static void main(String[] args) {
        for (int i=1; i<10;i++){
            Movie movie= randomMovie();
            System.out.println("Movie #" +i+ " : " + movie.getName() + "\n" + "Plot: "+movie.plot()+"\n");
        }

    }

    public static Movie randomMovie(){
        int randomNumber = (int) (Math.random() * 5)+1;
        System.out.println("Random number generated was: "+ randomNumber);
        switch (randomNumber){
            case 1:
                return new IndependanceDay();
            case 2:
                return new Wazir();
            case 3:
                return new StarWars();
            case 4:
                return new MazeRunner();
            case 5:
                return new Forgetable();
        }
        return null;
    }
}
