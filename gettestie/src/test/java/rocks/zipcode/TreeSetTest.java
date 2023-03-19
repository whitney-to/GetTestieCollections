package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.TreeSet;

public class TreeSetTest {
    @Test
    public void testAdd(){
        // Given
        TreeSet<Integer> ts = new TreeSet<>();
        Integer expected = 5;

        // When
        ts.add(expected);

        // Then
        Assert.assertTrue(ts.contains(5));
    }

    @Test
    public void test(){
        // Given
        TreeSet<Integer> ts = new TreeSet<>();
        Integer expected = 5;

        // When
        ts.add(expected);
        ts.clear();

        // Then
        Assert.assertFalse(ts.contains(5));
    }
}
