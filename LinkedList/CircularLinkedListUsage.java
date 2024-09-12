package LinkedList;

public class CircularLinkedListUsage {
    public static void main(String[] args) {

        CircularLinkedListCode clist = new CircularLinkedListCode();

        clist.insertBeg(11);
        clist.insertBeg(22);
        clist.insertBeg(33);
        clist.insertBeg(44);
        clist.insertBeg(55);
        clist.insertPos(4,123);
        clist.insertEnd(9);
        clist.display();
       // clist.deleteBeg();
        //clist.deletePos(2);
        //clist.deleteEnd();
        // clist.display();
        //clist.sizeOfList();
        //clist.containsElement(999);
       // clist.updateData(123,66);
        clist.display();
       // clist.elementIndex(66);

    }
}
