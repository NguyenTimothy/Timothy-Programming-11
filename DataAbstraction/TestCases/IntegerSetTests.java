import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class IntegerSetTests {
    IntegerSet testSet;
    @Before
    public void setup(){
        testSet = new IntegerSet();
    }

    @Test
    public void testInsertNotThere(){
        //check number is not already in set
        assertEquals(testSet.size(), 0);
        assertFalse(testSet.contains(3));
        //insert a number
        testSet.insert(3);
        //check the number is in the set
        assertEquals(testSet.size(), 1);
        assertTrue(testSet.contains(3));
    }

    @Test
    public void testInsertAlreadyThere(){
        //inserts a number
        testSet.insert(3);
        //checks if testSet contains number
        assertEquals(testSet.size(), 1);
        assertTrue(testSet.contains(3));
        //attempts to add the same number
        testSet.insert(3);
        //confirms number was not added
        assertEquals(testSet.size(), 1);
    }
}