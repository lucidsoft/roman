import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RomanTest
{
    @Test
    public void junitWorksProperly()
    {
        assertTrue(true);
    }

    @Test
    public void singleDigitTest ()
    {
        assertEquals(1, Roman.convert("I"));
        assertEquals(5, Roman.convert("V"));
        assertEquals(10, Roman.convert("X"));
        assertEquals(50, Roman.convert("L"));
        assertEquals(100, Roman.convert("C"));
        assertEquals(500, Roman.convert("D"));
        assertEquals(1000, Roman.convert("M"));
    }

    @Test
    public void addTest () {
        assertEquals(2, Roman.convert("II"));
        assertEquals(3, Roman.convert("III"));
        assertEquals(6, Roman.convert("VI"));
        assertEquals(2020, Roman.convert("MMXX"));
        assertEquals(2688, Roman.convert("MMDCLXXXVIII"));
    }

    @Test
    public void subtractTest () {
        assertEquals(4, Roman.convert("IV"));
        assertEquals(9, Roman.convert("IX"));
        assertEquals(40, Roman.convert("XL"));
        assertEquals(90, Roman.convert("XC"));
        assertEquals(400, Roman.convert("CD"));
    }

    @Test
    public void addSubtractTest() {
        assertTrue(False);
    }
}
