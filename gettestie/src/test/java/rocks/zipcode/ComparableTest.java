package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class ComparableTest {
    @Test
    public void testCompare(){
        // Given
        Person p1 = new Person("",1999);
        Person p2 = new Person("",2005);
        Person p3 = new Person("",2002);
        Person[] people = new Person[3];
        Person[] expected = new Person[]{p2,p3,p1};

        // When
        people[0] = (p1);
        people[1] = (p2);
        people[2] = (p3);
        Arrays.sort(people);

        // Then
        Assert.assertEquals(expected,people);
    }
}
