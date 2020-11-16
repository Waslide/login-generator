package geco;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class LoginServiceTest {

    private LoginService ls;

    @Before
    public void setUp() throws Exception {
        ls = new LoginService(new String[]{"test","test2"});
    }

    @Test
    public void testLoginExists() {
        assertTrue(ls.loginExists("test"));
        assertFalse(ls.loginExists("test3"));
    }

    @Test
    public void testAddLogin() {
        ls.addLogin("test4");
        assertTrue(ls.loginExists("test4"));
    }

    @Test
    public void testFindAllLoginsStartingWith() {
        assertEquals(new ArrayList<String>(Arrays.asList(new String[]{"test", "test2"})),ls.findAllLoginsStartingWith("test"));
    }

    @Test
    public void testFindAllLogins() {
        assertEquals(new ArrayList<String>(Arrays.asList(new String[]{"test", "test2"})),ls.findAllLogins());
    }
}