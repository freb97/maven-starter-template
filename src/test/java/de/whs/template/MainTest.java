package de.whs.template;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Main Test.
 *
 * Tests the main class of the application.
 *
 * @author Frederik Bußmann
 */
public class MainTest {
    /**
     * Tests the main method.
     */
    @Test
    public void testMain() {
        // Capture output stream (System.out)
        ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(out));

        // Call main method
        Main.main(new String[1]);

        // Assert main method prints "Hello World!" to output stream
        assertEquals("Hello World!\n", out.toString());
    }
}
