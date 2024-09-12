package LinkedList;

 class DoublyUsage
{
    public static void main(String[] args) {
        DoublyLinkedCode doubly = new DoublyLinkedCode();
        doubly.insertBeg(11);
        doubly.insertBeg(22);
        doubly.insertBeg(33);
        doubly.insertBeg(44);
        doubly.insertBeg(55);
        doubly.insertPos(3,77);
        doubly.insertEnd(100);

       // doubly.deleteBeg();
//        doubly.deleteBeg();
        //doubly.deletePos(3 );
        doubly.display();
    }
}
