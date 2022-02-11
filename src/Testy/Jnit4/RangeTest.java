package Testy.Jnit4;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class RangeTest {
    private Range range;

    @Before
    public void setUp() {
        range = new Range(10, 20);
    }

    @Test
    public void shouldSayThat15rIsInRange() {
        assertTrue(range.isInRange(15));
    }

    @Test
    public void shouldSayThat5IsntInRange() {
        assertFalse(range.isInRange(5));
    }
}