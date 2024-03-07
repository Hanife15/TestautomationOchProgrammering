package InlamUpp;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestRun {

    @Test
    public void firstTestLetter() {

        Logik logik = new Logik();

        String testdata = "A";
        String expected = "*-";
        String actual = logik.getMorse(testdata);
        assertEquals(expected, actual);
    }

    @Test
    public void secondTestSpecialCharacter() {

        Logik logik = new Logik();

        String testdata = "*-";
        String expected = "A";
        String actual = logik.getAlpha(testdata);
        assertEquals(expected, actual);
    }

    @Test
    public void thirdTestLetter() {

        Logik logik = new Logik();

        String testdata = "H";
        String expected = "****";
        String actual = logik.getMorse(testdata);
        assertEquals(expected, actual);
    }

    @Test
    public void fourthTestSpecialCharacter() {

        Logik logik = new Logik();

        String testdata = "****";
        String expected = "H";
        String actual = logik.getAlpha(testdata);
        assertEquals(expected, actual);
    }

    @Test
    public void fifthTestSmallLetter() {

        Logik logik = new Logik();

        String testdata = "a";
        String expected = "*-";
        String actual = logik.getMorse(testdata);
        assertEquals(expected, actual);
    }
    @Test
    public void sixthTestError() {

        Logik logik = new Logik();

        String testdata = "%";
        String expected = "Error";
        String actual = logik.getMorse(testdata);
        assertEquals(expected, actual);
    }
    @Test
    public void sevenTestError() {

        Logik logik = new Logik();

        String testdata = "&";
        String expected = "Error";
        String actual = logik.getAlpha(testdata);
        assertEquals(expected, actual);
    }
}