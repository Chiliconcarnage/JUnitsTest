public class LinkedList{

    public Node head;
    public  int listSize;

    public LinkedList(){
        head = new Node(0);
    }

    public boolean addEnd(int content){
        Node end = new Node(content);
        Node current = this.head;

        while(current.next != null){
            current = current.next;
        }
        current.next = end;
        listSize++;
        return true;
    }

    public boolean deleteEnd(int contentToDelete){
        Node current = this.head;
        while(current.next!=null){
            if(current.next.data==contentToDelete){
                current.next = current.next.next;
                System.out.println("Success! "+contentToDelete+" deleted.");
                return true;
            }
            current = current.next;
            listSize--;
        }
        System.out.println("Delete Failed.");
        return false;
    }

    public void showList(){
        Node current = this.head;
        while (current.next != null){
            System.out.print(current.data+ " -> ");
            current = current.next;
        }
        System.out.println(current.data);
    }

    public boolean addAtIndex(int content,int index){
        Node end = new Node(content);
        Node current = head;
        int jump;

        if(index>listSize || index<1){
            System.out.println("Add Failed: index out of bounds of size of linked list!!");
            return false;
        }
        else{
            jump = 0;
            while(jump<index-1){
                current = current.next;
                jump++;
            }
            end.next = current.next;
            current.next = end;
            listSize++;
            System.out.println("Success! "+content+" added at index "+index);
            return true;
        }
    }

}