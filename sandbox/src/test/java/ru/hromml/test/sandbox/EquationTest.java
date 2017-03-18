package ru.hromml.test.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by HROM on 13.03.2017.
 */
public class EquationTest {
    @Test
    public void testEquation0() {
        Equation e = new Equation(1, 1, 1);
        Assert.assertEquals(e.rootNumber(), 0);
    }

    @Test
    public void testEquation1() {
        Equation e = new Equation(1, 2, 1);
        Assert.assertEquals(e.rootNumber(), 1);
    }

    @Test
    public void testEquation2() {
        Equation e = new Equation(1, 5, 6);
        Assert.assertEquals(e.rootNumber(), 2);
    }

    @Test
    public void testZero() {
        Equation e = new Equation(0, 0, 0);
        Assert.assertEquals(e.rootNumber(), -1);
    }
    @Test
    public void testConstant() {
        Equation e = new Equation(0, 0, 1);
        Assert.assertEquals(e.rootNumber(), 0);
    }
    @Test
    public void testLinear() {
        Equation e = new Equation(0, 1, 1);
        Assert.assertEquals(e.rootNumber(), 1);
    }
}
