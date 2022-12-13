// traverse linked list program ?
public class blackbox
{
    ListNode head;
    private static class ListNode
    {
        int data;
        ListNode next;
        public ListNode(int data)
        {
            this.data=data;
            this.next = null;
        }
    }
    public void display()
    {
        ListNode curentNode = head;
        while (curentNode != null) //<------// Modified //
        {
            System.out.println(curentNode.data);
            curentNode = curentNode.next;
        }
    }

    public static void main(String[] args)
    {
        blackbox sll = new blackbox();
        sll.head =  new ListNode(10);
        ListNode second = new ListNode(8);
        ListNode third = new ListNode(1);
        ListNode fourth = new ListNode(10);
        sll.head.next = second;
        second.next = third;
        third.next = fourth;
        sll.display();
    }
}




