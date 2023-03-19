package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;

public class LinkedListTest {
    @Test
    public void testContains(){
        // Given
        LinkedList<String> ll = new LinkedList<>();

        // When
        // Then
        Assert.assertFalse(ll.contains("this item"));
    }

    @Test
    public void testAdd(){
        // Given
        LinkedList<String> ll = new LinkedList<>();

        // When
        ll.add("this item");
        // Then
        Assert.assertTrue(ll.contains("this item"));
    }
}
