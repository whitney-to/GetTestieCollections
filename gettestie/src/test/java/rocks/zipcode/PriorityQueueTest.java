package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.PriorityQueue;

public class PriorityQueueTest {
    @Test
    public void testAdd(){
        // Given
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        Integer expected = 2;

        // When
        pq.add(5);
        pq.add(2);

        // Then
        Assert.assertEquals(expected,pq.peek());

    }

    @Test
    public void testContains(){
        // Given
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // When
        // Then
        Assert.assertFalse(pq.contains(5));

    }
}
