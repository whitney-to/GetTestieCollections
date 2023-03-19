package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.TreeMap;

public class TreeMapTest {
    @Test
    public void testEmpty(){
        TreeMap<Integer,Integer> tm = new TreeMap<>();
        Assert.assertTrue(tm.isEmpty());
    }

    @Test
    public void testClear(){
        TreeMap<Integer,Integer> tm = new TreeMap<>();
        tm.put(1,4);
        tm.clear();
        Assert.assertTrue(tm.isEmpty());
    }
}
