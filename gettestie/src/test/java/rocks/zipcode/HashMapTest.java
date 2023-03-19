package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
    @Test
    public void testPut(){
        // Given
        Map<Integer,String> map = new HashMap<>();

        // When
        map.put(1,"One");

        // Then
        Assert.assertTrue(map.containsKey(1));
        Assert.assertTrue(map.containsValue("One"));

    }

    @Test
    public void testSize(){
        // Given
        Map<Integer,String> map = new HashMap<>();
        Integer expected = 2;
        // When
        map.put(1,"One");
        map.put(2,"Two");

        // Then
        Assert.assertEquals(2,map.size());
    }
}
