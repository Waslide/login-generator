package geco;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LoginGeneratorTest {

    private LoginService ls;
    private LoginGenerator lg;

    @Before
    public void setUp() throws Exception {
        ls = new LoginService(new String[]{"JROL","BPER", "CGUR", "JDU", "JRAL", "JRAL1"});
        lg = new LoginGenerator(this.ls);
    }

    @Test
    public void testGenerateLoginForNomAndPrenom() {
        // CT1
        lg.generateLoginForNomAndPrenom("Durand","Paul");
        assertTrue(ls.loginExists("PDUR"));

        //CT2
        lg.generateLoginForNomAndPrenom("Ralling","John");
        assertTrue(ls.loginExists("JRAL2"));

        //CT3
        lg.generateLoginForNomAndPrenom("Rolling","Jean");
        assertTrue(ls.loginExists("JROL1"));

        //CT4
        lg.generateLoginForNomAndPrenom("Dùrand","Paul");
        assertTrue(ls.loginExists("PDUR"));
    }
}