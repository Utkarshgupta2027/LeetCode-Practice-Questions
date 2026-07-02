
import java.util.Scanner;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}
public class DeleteMiddleNode {
    public ListNode deleteMiddle(ListNode head){
        if(head == null ||head.next == null){
            return null;
        }

        ListNode slow = head;
        ListNode fast = head;
        while(fast.next.next != null && fast.next.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        slow.next = slow.next.next;
        return head;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
    }
}
