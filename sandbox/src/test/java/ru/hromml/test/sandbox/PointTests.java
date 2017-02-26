package ru.hromml.test.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by HROM on 26.02.2017.
 */
public class PointTests {
    @Test
    public void TestDistance(){
       Point p=new Point(5,5,6,6);
       Assert.assertEquals(p.distance(),1.4142135623730951);
    }

}
