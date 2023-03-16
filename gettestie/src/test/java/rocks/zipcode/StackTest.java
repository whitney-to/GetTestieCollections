package rocks.zipcode;

import org.junit.Test;

import static org.junit.Assert.*;
import java.util.Stack;

public class StackTest {
    @Test
    public void testStackNotEmpty() {
        // Given
        Stack<String> stack = new Stack<>();
        String expected = "item1";

        // When
        stack.push(expected);

        //Then
        assertEquals(false, stack.isEmpty()); // false
    }

    @Test
    public void testStackPop(){
        // Given
        Stack<String> stack = new Stack<>();
        String expected = "item1";
        String item2 = "item1";

        // When
        stack.push(expected);
        stack.push(item2);
        assertEquals(item2, stack.peek()); // false

        //Then
        assertEquals(item2, stack.pop()); // false
    }
}
