package PersonAndDate;

import java.util.Random;

public class GuessMaster {
    private int numberOfCandidatesEntities = 0;
    private Entity[] entities = new Entity[10];

    public void addEntity(Entity entity) {
        entities[numberOfCandidatesEntities] = entity;

        numberOfCandidatesEntities++;
    }

    public int genRandomInd() {
        // return a valid random index depending on number of players
        Random r = new Random();
        return r.nextInt(numberOfCandidatesEntities);
    }

    public void playGame() {
        // Game Variables
        boolean playGame = false;
        Entity chosenEntity = entities[genRandomInd()];

        // Game Intructions and Prompts
        System.out.println(Config.INTRO);
        System.out.println(Config.PERSON);
        System.out.println(Config.RULES);
        Config.waitSomeTime();

        // Chosen Player
        System.out.println("This the entity you're guessing: ");
        String name = chosenEntity.getName();
        String line = "_".repeat(name.length() + 4); // +4 for the spaces and pipes

        System.out.println(line);
        System.out.println("| " + name + " |");
        System.out.println(line);

        // Game Logic
        while (!playGame) {
            System.out.println("Once");
            playGame = true;
        }

    }

    public static void main(String[] args) {
        // Please Create Entities Here:
        Entity trudeau = new Entity("Justin Trudeau", new Date("December", 25, 1971));
        Entity dion = new Entity("Celine Dion", new Date("March", 30, 1968));
        Entity usa = new Entity("United States", new Date("July", 4, 1776));

        // Please Add Entities Here:
        GuessMaster gm = new GuessMaster();
        gm.addEntity(trudeau);
        gm.addEntity(dion);
        gm.addEntity(usa);

        // Begin Game
        gm.playGame();
    }
}
