package org.launchcode.java.demos.lsn5unittesting.test;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.java.demos.lsn5unittesting.main.Car;

import static org.junit.Assert.*;

public class CarTest {
    //TODO: add emptyTest so we can configure our runtime environment (remove this test before pushing to your personal GitLab account)
    @Test
    public void emptyTest(){
    //asserting an expected value of 10 to equal an actual value of 10, with an accepted .001 variance.
    assertEquals(10,10,.001);
}

    //TODO: constructor sets gasTankLevel properly
    Car test_car;
    @Before
    public void createCarObject(){
        test_car = new Car("Toyota", "Prius", 10, 50);
    }

    @Test
    public void testInitialGasTank(){
//        assertEquals(10, test_car.getGasTankLevel(), .001);
        //int gasLevel = (int) test_car.getGasTankLevel();
//        assertTrue("Initial gas tank level is 10", test_car.getGasTankLevel() == 10);
        assertFalse("Initial gas tank level should be 10.", !(test_car.getGasTankLevel() == 10));
    }

    //TODO: gasTankLevel is accurate after driving within tank range

@Test
public void testGasTankAfterDriving(){
        //Your test must use the Car method drive()
    test_car.drive(50);
    //With a value of 50 miles passed into drive(), we expect test_car to have a gasTankLevel of 9.
    assertEquals(9, test_car.getGasTankLevel(), .001);
}

    //TODO: gasTankLevel is accurate after attempting to drive past tank range
    @Test
    public void testGasTankAfterExceedingTankRange(){
        test_car.drive(510);
        assertFalse("Car past tank range", test_car.getGasTankLevel() > 500);
    }


    //TODO: can't have more gas than tank size, expect an exception
    @Test (expected = IllegalArgumentException.class)
    public void testGasOverfillException(){
        test_car.addGas(5);
        fail("Car cannot have more gas than the size of the tank.");

    }
}
