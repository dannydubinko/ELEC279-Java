// Daniel Dubinko 20229482
package PersonAndDate;

import java.util.Random;
import java.util.Scanner;

public class GuessMaster {
    private int numberOfCandidatesEntities;
    private Entity[] entities;
    private Scanner scanner;

    // Constructor to initialize the guess master object
    public GuessMaster() {
        this.numberOfCandidatesEntities = 0;
        this.entities = new Entity[10]; // Max 10 entities
        this.scanner = new Scanner(System.in);
    }

    public void addEntity(Entity entity) {
        if (entity != null && numberOfCandidatesEntities < entities.length) {
            // Use the copy constructor to avoid privacy leaks
            entities[numberOfCandidatesEntities] = new Entity(entity);
            numberOfCandidatesEntities++;
        } else if (numberOfCandidatesEntities >= entities.length) {
            System.out.println("Error: Entity list is full.");
        }
    }

    public int genRandomEntityInd() {
        Random r = new Random();
        return r.nextInt(numberOfCandidatesEntities);
    }

    // --- playGame Methods ---

    // 1. The Main Entry Point
    public void playGame() {
        gameIntro(); // Show instructions once at the start

        boolean keepPlayingGame = true;
        while (keepPlayingGame) {
            int entityInd = genRandomEntityInd();
            playGame(entityInd); // Call the next game

            System.out.println("\nWould you like to play with a new entity? (yes/no)");
            String response = scanner.nextLine();
            if (!response.equalsIgnoreCase("yes")) {
                keepPlayingGame = false;
                System.out.println("Thanks for playing! 😢");
            }
        }
    }

    // 2. The Index Constructor
    public void playGame(int entityInd) {
        if (entityInd >= 0 && entityInd < numberOfCandidatesEntities) {
            playGame(entities[entityInd]);
        }
    }

    // 3. The Game Engine
    public void playGame(Entity entity) {
        String name = entity.getName();
        Date targetDate = entity.getBirthDate();
        boolean correctlyGuessed = false;

        // Reprint the entity so that the user can always see it when guessing
        System.out.println("\nThe entity you're guessing is: ");
        String line = "_".repeat(name.length() + 4);
        System.out.println(line);
        System.out.println("| " + name + " |");
        System.out.println(line);
        System.out.println(Config.DATE_FORMAT);

        // Continue running game until the entity is guessed
        while (!correctlyGuessed) {
            System.out.print("\nGuess: ");
            String dateInput = this.scanner.nextLine();

            if (dateInput.equalsIgnoreCase("quit") || dateInput.equalsIgnoreCase("exit")) {
                System.out.println("Exiting current round.");
                return;
            }

            try {
                DateStructure dateStr = new DateStructure(dateInput);
                Date inputDate = new Date(dateStr);

                if (targetDate.equals(inputDate)) {
                    System.out.println(Config.WINNER);
                    correctlyGuessed = true;
                } else {
                    System.out.println(Config.LOSER);

                    // Hints for guessing the date of the entity
                    if (targetDate.precedes(inputDate)) {
                        System.out.println("Choose an Earlier Date");
                    } else {
                        System.out.println("Choose a Later Date");
                    }

                    // Specific feedback for partially correct answers
                    if (inputDate.getDay() == targetDate.getDay())
                        System.out.println("The Day is Correct");
                    if (inputDate.getMonth() == targetDate.getMonth())
                        System.out.println("The Month is Correct");
                    if (inputDate.getYear() == targetDate.getYear())
                        System.out.println("The Year is Correct");

                    Config.gameWaitTime();
                }
                // catch incorrect date format message
            } catch (IllegalArgumentException e) {
                System.out.println("\nError: " + e.getMessage());
            }
        }
    }

    private void gameIntro() {
        System.out.println(Config.INTRO);
        System.out.println(Config.PERSON);
        System.out.println(Config.LOADING);
        Config.introTime();

        System.out.println(Config.RULES);
        System.out.println(Config.RULES_WARNING);
        System.out.println(Config.LOADING);
        Config.ruleTime();
    }

    public static void main(String[] args) {
        GuessMaster gm = new GuessMaster();

        // Create and add entities
        gm.addEntity(new Entity("Justin Trudeau", new Date("December", 25, 1971)));
        gm.addEntity(new Entity("Celine Dion", new Date("March", 30, 1968)));
        gm.addEntity(new Entity("United States", new Date("July", 4, 1776)));

        // Start the game loop
        gm.playGame();
    }
}
