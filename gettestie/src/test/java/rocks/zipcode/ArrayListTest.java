package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class ArrayListTest {
    @Test
    public void testIsEmpty(){
        // Given
        ArrayList<String> al = new ArrayList<>();
        int expected = 0;

        // When
        // Then
        Assert.assertEquals(expected,al.size());
    }

    @Test
    public void testAddItem(){
        // Given
        ArrayList<String> al = new ArrayList<>();
        int expected = 1;

        // When
        al.add("item1");
        // Then
        Assert.assertEquals(expected,al.size());
    }
}
