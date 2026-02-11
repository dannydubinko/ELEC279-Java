package PersonAndDate;

import java.util.Random;
import java.util.Scanner;

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

    private static void gameIntro() {
        // Game Intructions and Prompts
        System.out.println(Config.INTRO);
        System.out.println(Config.PERSON);
        Config.introTime();

        System.out.println(Config.RULES);
        System.out.println(Config.RULES_WARNING);
        Config.ruleTime();
    }

    public void playGame() {
        // Game Variables
        boolean playGame = true;
        Entity chosenEntity = entities[genRandomInd()];

        // Chosen Entity
        System.out.println("The entity you're guessing is: \n");
        String name = chosenEntity.getName();
        System.out.println(Config.DATE_FORMAT);

        Scanner scannerName = new Scanner(System.in);

        // Game Logic
        while (playGame) {
            // print current game information for the User
            String line = "_".repeat(name.length() + 4); // +4 for the spaces and pipes
            System.out.println(line);
            System.out.println("| " + name + " |");
            System.out.println(line);

            System.out.print("\nGuess: ");

            // read User input
            String dateInput = scannerName.nextLine();

            // If user types "quit" or "exit" then they leave the current session and enter
            // a new session
            if (dateInput.equalsIgnoreCase("quit") ||
                    dateInput.equalsIgnoreCase("exit")) {
                System.out.println("\nExiting Current Session.");
                playGame = false;
            } else if (dateInput.equalsIgnoreCase("new game")) {
                playGame();
            } else {
                // compare guessed date with entity date
                try {
                    DateStructure date = new DateStructure(dateInput);
                    Date chosenDate = new Date(date);

                    if (chosenEntity.getBirthDate().equals(chosenDate)) {
                        System.out.println(Config.WINNER);

                        System.out.println("Would you like to play a new game? Type yes or no");
                        String answer = scannerName.nextLine();

                        if (answer.equalsIgnoreCase("yes")) {
                            continue;
                        } else {
                            System.out.println("😢");
                            playGame = false;
                        }

                    } else {
                        System.out.println(Config.LOSER);
                    }

                } catch (IllegalArgumentException e) {
                    System.out.println("\nError: " + e.getMessage());
                    System.out.println("Please try again using the format MM/DD/YYYY.");
                }
            }

        }
        scannerName.close();

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
        GuessMaster.gameIntro(); // game intro
        gm.playGame();
    }
}
