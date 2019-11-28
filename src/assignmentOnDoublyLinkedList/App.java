package assignmentOnDoublyLinkedList;

public class App
{
   public static void main(String[] args)
   {
	 DoublyLinkedList list = new DoublyLinkedList();
	 list.insertFirst(44);
	 list.insertFirst(65);
	 list.insertFirst(45);
	 list.insertLast(53);
	 list.insertLast(76);
	 list.insertLast(46);
	 list.displayForward();
	 list.displayBackward();
	 list.deleteFirst();
	 list.deleteLast();
	 list.deleteKey(65);
	 list.displayForward();
	 list.insertAfter(44, 54);
	 list.insertAfter(76, 85);
	 list.displayForward();
	 
     
   }
}
