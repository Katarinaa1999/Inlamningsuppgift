import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

public class ProgramTest {

    @Test
    public void testLineAndCharacterCount() {
        Program data = new Program();

        data.addLine("Hello world!");
        data.addLine("I like programming.");

        assertEquals(2, data.getLineCount());
        assertEquals(31, data.getCharCount());
    }

    @Test
    public void testWordCount() {
        Program data = new Program();

        data.addLine("Hello world");
        data.addLine(("I like programming."));

        assertEquals(5, data.getWordCount());
    }

    @Test
    public void testLongestWord() {
        Program data = new Program();

        data.addLine("Hello world");
        data.addLine(("I like programming"));

        assertEquals("programming", data.getLongestWord());
    }

    @Test
    public void testStopFirstLine() {
        Program data = new Program();

        data.addLine("stop");

        assertTrue(data.isStopEntered());
        assertEquals(0, data.getLineCount());
    }

}