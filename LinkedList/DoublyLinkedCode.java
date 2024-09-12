package LinkedList;


public class DoublyLinkedCode
{
    Node head;
    Node tail;
    class Node
    {
        Node prev;
        int data;
        Node next;
        Node(int data){
            this.prev = null;
            this.data = data;
            this.next = null;

        }
    }
    DoublyLinkedCode()
    {
        head = null;
        tail = null;
    }
    public void insertBeg(int data)
    {
        Node newNode = new Node(data);
        if(head==null)
        {
            head = newNode;
            tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }
    public void insertPos(int pos,int data)
    {
        Node newNode = new Node(data);
        if(pos==0)
        {
            insertBeg(data);
            return;
        }
        Node prev = head;
        Node temp = head;
        for(int i=1;i<pos;i++)
        {
            if(prev == null) {
                System.out.println("Out Of IndexBound !!!!");
                return;
            }
            prev = prev.next;
            temp = prev;

        }
        newNode.next = prev.next;
        newNode.prev = temp.prev;
        prev.next = newNode;
        temp.prev = newNode;

    }
    public void insertEnd(int data)
    {
        Node newNode = new Node(data);
        if(head==null)
        {
            head = newNode;
            tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }
    public void deleteBeg()
    {
        if(head.next==null)
        {
            head = null;
            tail = null;
            System.out.println("Successfully Deleted !!!!");
            return;
        }
        if(head!=null)
        {
            head = head.next;
            head.prev = null;
            return;
        }
        System.out.println("Nothing To Delete !!!");
    }
    public void deletePos(int pos)
    {
        if(pos==0)
        {
            deleteBeg();
            return;
        }
        Node prev = head;
        for(int i=1;i<pos;i++)
        {
            prev = prev.next;
        }
        prev.next.next.prev = prev;
        prev.next = prev.next.next;

    }
    public void display()
    {
        if(head==null) System.out.println("Nothing To Display !!!");
        if(head!=null) System.out.print("Elements -> ");
        Node temp = head;
        while (temp!=null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
}
