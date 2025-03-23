package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test
    public void testCalculate() {
        assertEquals(15.0, App.calculate(10.0, 5.0, "add"), 0.001);
        assertEquals(5.0, App.calculate(10.0, 5.0, "subtract"), 0.001);
        assertEquals(50.0, App.calculate(10.0, 5.0, "multiply"), 0.001);
        assertEquals(2.0, App.calculate(10.0, 5.0, "divide"), 0.001);
        assertTrue(Double.isNaN(App.calculate(10.0, 0.0, "divide")));
        assertTrue(Double.isNaN(App.calculate(10.0, 5.0, "invalid")));
    }
}