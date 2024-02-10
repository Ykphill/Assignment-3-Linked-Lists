// Name: Phillip Bell
// Class: CS 3305/Section 04
// Term: Spring 2024
// Instructor: Dr. Haddad
// Assignment: 3
// IDE Name: Inteli J


// class define a linked list that stores integer values.
public class LinkedList
{
   public Node head, tail;

   //constructor method to create a list of object with head, tail, and size. 
   public LinkedList()
   {
      head = null;
      tail = null;
   }
  
   //method add node to end of list
   public void addLastNode(int data) 
   {
      if (tail == null) 
         head = tail = new Node(data); //empty list
      else 
      {
         tail.next = new Node(data); //link new node as last node
         tail = tail.next; //make tail pointer points to last node
      }
   }
  
   //======== Your part to complete for this assignment =========
   
   //method #1: add first node
   public void addFirstNode(int data)
   {
      if(tail==null){
         head = tail = new Node(data); //empty list
      }
      else {
         Node temp = new Node(data);//creates a temp node
         temp.next = head;//links temp node to head
         head = temp;//head is set to temp
      }
   }
      
   //method #2: add node at index
   public void addAtIndex(int index, int data)
   {

      System.out.print("\nAdding value "+data+" at the index of "+index+".\n" +
              "List content before adding "+data+" is:\t");
      printList();
      Node current = head;
      Node temp = head.next;
      do {
         temp=temp.next;//moves the node up the link list
         current=current.next;//moves the node up the link list
         index--;
         }while (index!=1);

      current.next=new Node(data);//inserts nodes
      (current.next).next=temp;//attaches node to next node


   }
      
   //method #3: remove first node
   public void removeFirstNode()
   {

      //if there are more than one node
      if (head.next != null) {
         Node temp = head;//creates a temp node = to head
         head = temp.next;//links head to next node
         temp = null;//set the temp to null
      }//if there is only 1 node and deletes list
      else {
         head=null;
         tail=null;
      }
         //complete this method
   }
      
   //method #4: remove last node
   public void removeLastNode()
   {
      //if there are more than one node
      if (head.next != null) {

         Node current = head;//creates a temp node = to head
         //iterates until at the second to last node
         while (current.next != tail) {
            current = current.next;
         }

         Node temp = tail;
         tail = current;//links head to next node
         tail.next = null;//set the temp to null
      }
      //if there is only 1 node and deletes list
      else{
         head=null;
         tail=null;
      }

   }
    
   //method #5: remove node at index
   public void removeAtIndex(int index)
   {
      //if there are more than one node
      if (head.next != null) {
         Node current = head;//creates a temp node = to head

         //iterates until at the index
         for (int i = 0; i < index + 1; i++) {
            current = current.next;
         }


         Node temp = current.next; //sets are unwanted node to temp
         current.next = current.next.next; //connect the to node too exclude the unwanted
         temp = null; //discard unwanted node
      }
      else{
         head=null;
         tail=null;
      }

   }
          
   //method #6: countNodes
   public int countNodes()
   {
         int listSize= 0;
         Node temp=head;
         //complete this method
         do {
            temp=temp.next;
            listSize++;
         }while (temp != null);

         //this methods returns the list size
         return listSize;
         
   }
   
   //method #7: pritnInReverse  (Recursive method)
   public String printInReverse(Node L)
   {
      String List="";
      if(L.next==null){
         return L.data+"   ";
      }
      else {
         List=printInReverse(L.next)+L.data+"   ";
      }
      return List;
         //complete this method as recursive methods
   }   

   //================= end of your part ==============

   //method to print out the list
   public void printList() 
   {
      Node temp;
      temp = head;
      while (temp != null)
      {
         System.out.print(temp.data + "   ");
         temp = temp.next;
      }
   }
  
   //class to create nodes as objects
   private class Node
   {
      private int data;  //data field
      private Node next; //link field
       
      public Node(int item) //constructor method
      {
         data = item;
         next = null;
      }
   }
}

