package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayDeque;

public class ArrayDequeTest {
    @Test
    public void testAdd(){
        // Given
        ArrayDeque<Integer> ad = new ArrayDeque();
        int expected = 3;

        // When
        ad.add(5);
        ad.add(3);
        ad.add(1);

        // Then
        Assert.assertEquals(expected,ad.size());
    }

    @Test
    public void testClear(){
        // Given
        ArrayDeque<Integer> ad = new ArrayDeque();
        int expected = 0;

        // When
        ad.add(5);
        ad.add(3);
        ad.add(1);
        ad.clear();

        // Then
        Assert.assertEquals(expected,ad.size());
    }
}
