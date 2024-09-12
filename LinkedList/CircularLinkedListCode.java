package LinkedList;

public class CircularLinkedListCode {

    Node head;
    Node tail;
    class Node
    {
        Node prev;
        int data;
        Node next;
        Node(int data)
        {
            prev = null;
            this.data = data;
            next = null;
        }
    }
    CircularLinkedListCode()
    {
        head = null;
        tail = null;
    }

    public void insertBeg(int data)
    {
        Node newNode = new Node(data);
        if(head == null)
        {
            head = newNode;
            tail = newNode;
            return;
        }
        newNode.prev = tail;
        newNode.next = head;
        head.prev = newNode;
        tail.next = newNode;
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
        Node prevNode = head;
        Node temp = head;
        for(int i=1;i<pos;i++)
        {
            if(prevNode.next!=tail) {
                prevNode = prevNode.next;
                temp = prevNode.next;
            }
            else {
                System.out.println("Position Reached");
                return;
            }
        }
        newNode.prev = prevNode;
        newNode.next = prevNode.next;
        prevNode.next = newNode;
        temp.prev = newNode;
    }
    public void insertEnd(int data)
    {
        Node newNode = new Node(data);
        if(head==null)
        {
            insertBeg(data);
            return;
        }
        newNode.prev = tail;
        newNode.next = tail.next;
        tail.next = newNode;
        tail = newNode;
    }
    public void deleteBeg()
    {
        if(head==null) {
            System.out.println("Nothing to be Delete !!!");
            return;
        }
        if(head.next==null) {
            head = null;
            tail = null;
            return;
        }
        head.next.prev = tail;
        tail.next = head.next;
        head = tail.next;
    }
    public void deletePos(int pos){
        if(pos==0){
            deleteBeg();
            return;
        }
        Node prevNode = head;
        Node temp = head;
        for(int i=1;i<pos;i++)
        {
            if(prevNode.next!=tail) {
                prevNode = prevNode.next;
                temp = prevNode.next;
            }
            else {
                System.out.println("Position Reached");
                return;
            }
        }
        prevNode.next = temp.next;
        temp.prev = prevNode;
    }
    public void deleteEnd()
    {
        if(head.next==null)
        {
            head=null;
            tail=null;
            return;
        }
        tail.prev.next = tail.next;
        head.prev = tail.prev;
        tail = head.prev;
    }
    public void sizeOfList()
    {
        Node temp = head;
        int size = 0;
        do {
            size++;
            temp = temp.next;
        }while (temp!=null && temp!=head);
        System.out.println("Size of the Linked List -> "+size);
    }
    public void containsElement(int val)
    {
        Node temp = head;
        int p=0;
        if(head!=null)
        {
            do {
                if(temp.data == val) {
                    System.out.println(val+" Present in List");
                    p=1;
                    break;
                }
                temp = temp.next;
            }while (temp!=null && temp!=head);
        }
        if(p==0)
            System.out.println(val+" Not Present in List");
    }
    public void updateData(int present,int change)
    {
        Node temp = head;
        int p=0;
        if(head!=null)
        {
            do {
                if(temp.data == present) {
                    temp.data = change;
                    System.out.println(present+" Updated to "+change);
                    p=1;
                    break;
                }
                temp = temp.next;
            }while (temp!=null && temp!=head);
        }
        if(p==0)
            System.out.println(present+" Element Not in List --");
    }
    public void elementIndex(int val)
    {
        Node temp = head;
        int p=0;
        int index = 0;
        if(head!=null)
        {
            do {
                if(temp.data == val) {
                    System.out.println(val+" index is "+index);
                    p=1;
                    break;
                }
                index++;
                temp = temp.next;
            }while (temp!=null && temp!=head);
        }
        if(p==0)
            System.out.println(val+" Element Not in List --");
    }
    public void display()
    {
        Node temp = head;
        if(head!=null){
            do {
                System.out.print(temp.data+" -> ");
                temp = temp.next;
            }while (temp!=null && temp!=head);
        }
        System.out.println("HEAD");
    }
}
