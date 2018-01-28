package algos.linkedlist.easy;

/*
 Given a singly linked list, determine if it is a palindrome.

Follow up:
Could you do it in O(n) time and O(1) space?
 */

//Hint -> Reverse the seconf half of the list and check if first half and second half(reversed) of the list
//is equal.
public class PalindromeLinkedList
{
	public static boolean isPalindrome(ListNode head) 
    {
        if(head == null || head.next ==null)
        {
            return true;
        }
        
        ListNode curr = head;
        int len = 0;
        
        while(curr!=null)
        {
            len = len+1;
            curr = curr.next;
        }
        
        int secondListStart  = 0;
        
        if(len%2 == 0)
        {
             secondListStart = (len/2)+1;
        }
        else
        {
             secondListStart = (len/2)+2;
        }
        
        ListNode mid = head;
        
        for(int i=1;i<secondListStart;i++)
        {
            mid = mid.next;
        }
    
    
         ListNode currOne = null;
         ListNode currNext = mid;
    
         while(currNext!=null)
         {
             ListNode temp = currNext.next;
             currNext.next = currOne;
             currOne = currNext;
             currNext = temp;
         }
    
        for(int i=0;i<len/2;i++)
        {
            if(currOne.val!=head.val)
            {
             return false;   
            }
            
            currOne = currOne.next;
            head = head.next;
        }
        
        return true;
        }
	public static void main(String[] args) 
	{
		ListNode head = new ListNode(1);
		head.next = new ListNode(1);
		head.next.next = new ListNode(2);
		head.next.next.next = new ListNode(1);
		System.out.println(isPalindrome(head));
		
	}
}
