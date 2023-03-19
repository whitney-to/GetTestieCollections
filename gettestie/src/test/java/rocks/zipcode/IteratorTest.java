package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTest {
    @Test
    public void testHasNext(){
        // Given
        ArrayList<String> expected = new ArrayList<>();
        ArrayList<String> actual = new ArrayList<>();

        // When
        expected.add("item1");
        expected.add("item2");
        expected.add("item3");
        Iterator it = expected.iterator();
        while(it.hasNext()){
            actual.add((String) it.next());
        }

        // Then
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testRemove(){
        // Given
        ArrayList<String> al = new ArrayList<>();
        int expected = 2;
        // When
        al.add("item1");
        al.add("item2");
        al.add("item3");
        Iterator it = al.iterator();
        it.next();
        it.remove();

        // Then
        Assert.assertEquals(expected,al.size());
    }
}
