package edu.isu.cs.cs2263.adapter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @author David Hellwig
 */
class PushbackTokenizerTest {
    /**
     * Test to make sure there are tokens
     */
    @Test void NotEmpty(){

        PushbackTokenizerImplementation pushbackTokenizerImplementation = new PushbackTokenizerImplementation("test test test");

        assertNotNull(pushbackTokenizerImplementation.nextToken());

    }
    /**
     * Test to see if the returned token is correct
     */
    @Test void correctString(){
        PushbackTokenizerImplementation pushbackTokenizerImplementation = new PushbackTokenizerImplementation("1234");

        assertEquals("1234", pushbackTokenizerImplementation.nextToken());
    }

    /**
     * Test to see if hasMoreTokens works as intended
     */
    @Test void hasMoreTokensWorks(){
        PushbackTokenizerImplementation pushbackTokenizerImplementation = new PushbackTokenizerImplementation("1");

        assertTrue(pushbackTokenizerImplementation.hasMoreTokens());

    }

    /**
     * Test to see if pushback method works
     */
    @Test void pushBackWorks(){
        PushbackTokenizerImplementation pushbackTokenizerImplementation = new PushbackTokenizerImplementation("1 2");

        pushbackTokenizerImplementation.nextToken();

        pushbackTokenizerImplementation.pushback();

        assertEquals("1", pushbackTokenizerImplementation.nextToken());
    }

    @Test void nextTokenTest(){
        PushbackTokenizerImplementation pushbackTokenizerImplementation = new PushbackTokenizerImplementation("1 2 3");
        pushbackTokenizerImplementation.nextToken();
        pushbackTokenizerImplementation.nextToken();
        assertEquals("3", pushbackTokenizerImplementation.nextToken());
    }

    @Test void emptyStringTest(){
        PushbackTokenizerImplementation pushbackTokenizerImplementation = new PushbackTokenizerImplementation("");
        assertFalse(pushbackTokenizerImplementation.hasMoreTokens());
    }





}
