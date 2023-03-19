package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Vector;

public class VectorTest {
    @Test
    public void testIsEmpty(){
        Vector<Integer> v = new Vector<>();
        Assert.assertTrue(v.isEmpty());
    }

    @Test
    public void testSize(){
        Vector<Integer> v = new Vector<>();
        Integer expected = 5;
        v.add(5);
        Assert.assertEquals(expected,v.firstElement());
    }
}
