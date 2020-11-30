package geco;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Classe permettant de tester le générateur de mots de passe.
 */
public class PasswordGeneratorTest {

    PasswordGenerator pg = new PasswordGenerator();

    /**
     * Tests si la méthode renvoie bien un string de longueur 8.
     */
    @Test
    public void getRandomPassword() {
        assertEquals(String.class,pg.getRandomPassword().getClass());
        assertEquals(8,pg.getRandomPassword().length());
    }
}