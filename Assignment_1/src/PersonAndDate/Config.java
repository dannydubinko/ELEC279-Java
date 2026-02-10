package PersonAndDate;

import java.util.concurrent.TimeUnit;

public final class Config {
    private Config() {
    }

    public static final String PERSON = """
                                                                        .......
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
            1. I Will Give you an entity in the form of Person, Country or Prominent Leader.
            2. You must guess the date that entity was born.
            3. You may keep trying to guess long as you'd like.
            4. Type quit or exit to end the game
            """;
    public static int waitTime = 1;

    public static void waitSomeTime() {
        try {
            System.out.println("Read the Rules Please. Im making you wait anyway");
            TimeUnit.SECONDS.sleep(Config.waitTime);
            ; // 2000 milliseconds = 2 seconds
            System.out.println("Goodluck!\n");
        } catch (InterruptedException e) {
            // Handle the exception if the sleep is interrupted
            Thread.currentThread().interrupt();
        }
    }
}
