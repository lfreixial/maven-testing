package lfreixial.maventest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void shouldReturnTrue(){
        App a = new App();
        int answer = a.multiply(5, 5);
        assertEquals(25, answer);
    }

    @Test
    public void shouldReturnTrueAdd(){
        App a = new App();
        int answer = a.add(5, 5);
        assertEquals(10, answer);
    }

    @Test
    public void shouldReturnTrueSub(){
        App a = new App();
        int answer = a.sub(5, 5);
        assertEquals(0, answer);
    }


}
