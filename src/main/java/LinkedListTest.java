public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.addEnd(1);
        list.addEnd(2);
        list.addEnd(3);
        list.showList();
        list.deleteEnd(1);
        list.deleteEnd(3);
        list.showList();
        list.addAtIndex(1, 1);
        list.showList();


    }
}


