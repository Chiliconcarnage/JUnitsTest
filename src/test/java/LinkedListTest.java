import org.junit.Test;
import org.mockito.Mock;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class LinkedListTest {

    @Test
    public void CheckNegativeIndexaddEnd() {

        LinkedList test_list = new LinkedList();

        assertFalse(test_list.addAtIndex(1, -1));
    }

    @Test
    public  void AddAtIndexWhenListIsTooSmall(){

        LinkedList test_list = new LinkedList();

        assertFalse(test_list.addAtIndex(1, 10));
    }


    @Test
    public void deleteEnd() {
    }

    @Test
    public void showList() {
    }

    @Test
    public void addAtIndex() {
    }
}