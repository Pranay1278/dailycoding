
For example, given A = 3 -> 7 -> 8 -> 10 and B = 99 -> 1 -> 8 -> 10, return the node with value 8.

In this example, assume nodes with the same value are the exact same node objects.

Do this in O(M + N) time (where M and N are the lengths of the lists) and constant space.






import java.util.*;
public class Main
{
    static Node head,head1;
    static class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }
    
    static void printlist()
    {
        Node n=head;
        while(n!=null)
        {
            System.out.println(n.data);
            n=n.next;
        }
        
        Node m=head1;
        while(m!=null)
        {
            System.out.println(m.data);
            m=m.next;
        }
        
    }
    
    
    static int separate()
    {
        int c=count(head);
        int c1=count(head1);
        int d;
        if(c>c1)
        {
            d=c-c1;
            return instance(d,head,head1);
        }
        else
        {
            d=c1-c;
            return instance(d,head,head1);
        }
    }
    static int count(Node node)
    {
        Node c=node;
        int count=0;
        while(c!=null)
        {
            count++;
            c=c.next;
        }
        return count;
        
    }
    
    static int instance(int d,Node head,Node h)
    {
        Node head1=head;
        Node head2=h;
        
        for(int i=0;i<d;i++)
        {
            head1=head1.next;
        }
        System.out.println(head1.data);
        while(head1!=null && head2!=null)
        {
            if(head1.data==head2.data)
            {
                return head1.data;
            }
            head1=head1.next;
            head2=head2.next;
        }
        return -1;
        
    }
    public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Main m=new Main();
		Main.head=new Node(1);
		Main.head.next=new Node(2);
		Main.head.next.next=new Node(3);
		Main.head.next.next.next=new Node(40);
		Main.head.next.next.next.next=new Node(4);
		Main.head.next.next.next.next.next=new Node(5);
		
		Main.head1=new Node(11);
		Main.head1.next=new Node(22);
		Main.head1.next.next=new Node(13);
		Main.head1.next.next.next=new Node(4);
		Main.head1.next.next.next.next=new Node(5);
		
// 		m.printlist();
    
        System.out.println(m.separate());
	}
}
