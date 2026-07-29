
class ListNode{
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val= val;
        this.next = null;
    }
    
}



public class Reverse_Linked_List {

    public static void printList(ListNode head) {

        ListNode  temp = head;

        while(temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    public static ListNode reverListNode(ListNode head) {
        ListNode after = null;
        ListNode curr = head;
        ListNode prev = null;

        while(curr != null) {
            after = curr.next;
            curr.next = prev;
            prev = curr;
            curr = after;
        }

        return prev;
    }
    
    public static void main(String[] args) {
        
        ListNode first = new ListNode(10);
        ListNode second = new ListNode(20);
        ListNode third = new ListNode(30);
        ListNode fourth = new ListNode(40);

        first.next = second;
        second.next = third;
        third.next = fourth;
        
        printList(first);
        
        ListNode newHead = reverListNode(first);

        printList(newHead);
    }
}
