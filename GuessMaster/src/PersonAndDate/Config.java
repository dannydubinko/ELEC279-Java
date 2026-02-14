// Daniel Dubinko 20229482
package PersonAndDate;

import java.util.concurrent.TimeUnit;

public final class Config {
    private Config() {
    }

    private static final int introTime = 7; // 7
    private static final int ruleTime = 15; // 15
    private static final int gameWaitTime = 2;

    public static final String PERSON = """
               .------\\ /------.
               |       -       |
               |               |
               |               |
               |               |
            _______________________
            ===========.===========
              / ~~~~~     ~~~~~ \\
             /|     |     |\\
             W   ---  / \\  ---   W
             \\.      |o o|      ./
               |                 |
             \\     #########    /
               \\  ## ----- ##  /
                \\##         ##/
                \\_____v_____/
              """;

    public static final String INTRO = """

            ✨✨✨✨ Welcome to My Guesser Game ✨✨✨✨

            I am the GameMaster. My Name is Top Hat Guy.

            😕 ...Please just call me Guy. My father goes by Top Hat.

            Anyways...Lets Play! 🙌
            """;

    public static final String RULES = """
            Listen Here. You better follow these rules
            OR ELSE we can't have fun and you'll just
            ruin it for everyone involved 😤.

            RULES:
            1. I will give you an entity in the form of Person, Country or Prominent Leader.
            2. You must guess the date that the entity was born.
            3. You may keep trying to guess as long as you'd like.
            4. Type "quit" or "exit" to end the game.
            5. Type "new game" if you would like to start over.
            """;

    public static final String DATE_FORMAT = """
            ***** Use the Format *****
            ***** mm/dd/yyyy *****
            """;

    public static final String WINNER = """

            ❕❕❕❕❕ WINNER ❕❕❕❕❕

            Goodjob you Smarty Pants!!!
            """;

    public static final String LOSER = """

            Oops Incorrect 🙊 🤷
            Keep Guessing!!
            """;
    public static final String LOADING = "\nLoading ...\n";
    public static final String RULES_WARNING = "Read the Rules Please. Im making you wait anyway\n";

    public static void ruleTime() {
        try {
            TimeUnit.SECONDS.sleep(Config.ruleTime);
            ; // 2000 milliseconds = 2 seconds
        } catch (InterruptedException e) {
            // Handle the exception if the sleep is interrupted
            Thread.currentThread().interrupt();
        }
    }

    public static void introTime() {
        try {
            TimeUnit.SECONDS.sleep(Config.introTime);
            ; // 2000 milliseconds = 2 seconds
        } catch (InterruptedException e) {
            // Handle the exception if the sleep is interrupted
            Thread.currentThread().interrupt();
        }
    }

    public static void gameWaitTime() {
        try {
            TimeUnit.SECONDS.sleep(Config.gameWaitTime);
            ; // 2000 milliseconds = 2 seconds
        } catch (InterruptedException e) {
            // Handle the exception if the sleep is interrupted
            Thread.currentThread().interrupt();
        }
    }
}
