package session7.B_TDD;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 *  Badminton Player:
 *
 *  - Write a class to represent a badminton player.
 *
 *  - A player has a name and a number of won and lost matches.
 *
 *  Exercise (using TDD):
 *  - Add a method "void wonMatch()" to the player class to signal s/he has won a match.
 *  - Add a method "void lostMatch()" to the player class to signal s/he has lost a match.
 */
public class TestPlayer {

    @Test
    public void createPlayer() {
        BadmintonPlayer badmintonPlayer = new BadmintonPlayer("Andres");
        assertNotNull(badmintonPlayer);
    }

    @Test
    public void testName(){
        BadmintonPlayer badmintonPlayer = new BadmintonPlayer("Andres");
        String name = badmintonPlayer.getName();
        assertEquals("Andres", name);
    }





    /***** UNCOMMENT BELOW TO PROVIDE FEEDBACK ****/
    /*
    @Test
    public void feedback() {
        //Did you have time to finish the exercise?
        boolean I_did_finish = true;

        //Did you understand the concepts used in the exercise?
        boolean I_did_understand = true;

        //Any comments
        String comment = "No comments";

        feedback.Feedback.submit("session8_B", I_did_finish, I_did_understand, comment);
        }
     */
}
