package algos.linkedlist.easy;

//Reverse a singly linked list.

public class ReverseLinkedList
{
	//Iterative approach
	public ListNode reverseList(ListNode head) {
        if(head == null)
        {
            return null;
        }
        
        if(head.next == null)
        {
            return head;
        }
        
        ListNode nextNode = head;
        ListNode currNode = null;
        
        while(nextNode!=null)
        {
            ListNode temp = nextNode.next;
            nextNode.next = currNode;
            currNode = nextNode;
            nextNode = temp;
        }
        
        return currNode;
    }
	//Recursive approach
	
}
