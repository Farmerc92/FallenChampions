package player;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SaveFilesTest {

    private Player bob;
    private Player steve;
    private Player paul;
    private SaveFiles files = new SaveFiles("");

    @Before
    public void init(){
        bob = new Player("Bob");
        steve = new Player("Steve");
        paul = new Player("Paul");
        files.add(bob);
        files.add(steve);
        files.add(paul);
        files.saveTest();
    }

    @Test
    public void containsTest(){
        Assert.assertTrue(files.contains(1));
    }

    @Test
    public void getTest(){
        Assert.assertEquals(bob, files.get(1));
    }

    @Test
    public void isEmpty() {
        Assert.assertFalse(files.isEmpty());
    }

    @Test
    public void toStringTest(){
        String actual = "1.  Name: Bob  Level: 1\n2.  Name: Steve  Level: 1\n3.  Name: Paul  Level: 1\n";
        String expected = files.toString();
        System.out.println(expected);
        Assert.assertEquals(actual, expected);
    }
}
