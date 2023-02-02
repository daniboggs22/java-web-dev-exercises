package org.launchcode.java.demos.lsn6inheritance.CatTest;

import org.launchcode.java.demos.lsn6inheritance.HouseCat;

import static org.junit.Assert.assertEquals;

public class Test {
    @Test
    public void inheritsSuperinFirstConstructor() {
        HouseCat FluffBall = new HouseCat("FluffBall", 11);
        assertEquals(11, FluffBall.getWeight(), .001);
    }
}
