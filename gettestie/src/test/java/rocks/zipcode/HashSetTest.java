package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;

public class HashSetTest {
    @Test
    public void testAdd(){
        HashSet<Integer> hs = new HashSet<>();
        hs.add(5);
        Assert.assertEquals(1,hs.size());
    }

    @Test
    public void testClear(){
        HashSet<Integer> hs = new HashSet<>();
        hs.add(5);
        hs.clear();
        Assert.assertEquals(0,hs.size());
    }
}
