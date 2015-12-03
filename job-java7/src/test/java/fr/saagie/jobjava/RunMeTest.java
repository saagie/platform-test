package fr.saagie.jobjava;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class RunMeTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
        System.setErr(null);
    }

    @Test
    public void should_display_out_and_err_messages() {
        //GIVEN
        RunMe runMe = new RunMe();
        //WHEN
        runMe.main(null);
        //THEN
        assertEquals(RunMe.JOB_JAVA7_OUT, outContent.toString());
        assertEquals(RunMe.JOB_JAVA7_ERR, errContent.toString());
    }
}