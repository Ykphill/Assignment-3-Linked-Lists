// Name: Phillip Bell
// Class: CS 3305/Section 04
// Term: Spring 2024
// Instructor: Dr. Haddad
// Assignment: 3
// IDE Name: Inteli J

import java.util.InputMismatchException;
import java.util.Scanner;


//this class test all my method present in the linked list class
public class myTest
{
   public static void main (String[] args)
   {
      LinkedList myList = new LinkedList(); //create a list object
      Scanner scan = new Scanner(System.in); //initializes scanner
      int choice = 0; //hold the user choice on the method they wish to call
      Boolean sentinel= true; // general sentinel value
      int data = 0; //initializes data that might be passed through
      int index = 0; //initializes index that might be passed through
   
      for (int i=1; i <= 5; i++) //add 5 nodes to the list
      {
         myList.addLastNode(i*10);
     }

      do {


         choice = menu(); // calls menu method and return choice

         //adds first node
         if(choice == 1){

            do {
               sentinel=true;

               try {

                  //prompt user to enter datat
                  System.out.print("\nPlease enter a data (int) :\t");
                  data = scan.nextInt();
                  scan.nextLine();
                  sentinel=false;


               }
               //catches any wrong inputs
               catch (InputMismatchException e){
                  scan.nextLine();
                  System.out.println("\nPlease enter only integers");
               }

            }while (sentinel);

            System.out.print("\nAdding value "+data+" as first node. \n" +
                               "List content before adding "+data+" is:\t");
            myList.printList();//prints list before adding node

            myList.addFirstNode(data);//adds data as the first node

            System.out.print("\nList content after adding "+data+" is:\t");
            myList.printList();//prints list after node is added
         }

         //adds last node
         if(choice == 2){
            do {
               sentinel=true;

               try {

                  //prompt user to enter data
                  System.out.print("\nPlease enter a data (int) :\t");
                  data = scan.nextInt();
                  scan.nextLine();
                  sentinel=false;


               }
               //catches any wrong inputs
               catch (InputMismatchException e){
                  scan.nextLine();
                  System.out.println("\nPlease enter only integers");
               }

            }while (sentinel);

            System.out.print("\nAdding value "+data+" as last node. \n" +
                    "List content before adding "+data+" is:\t");
            myList.printList();//prints list before adding node

            myList.addLastNode(data);//adds data as the last node

            System.out.print("\nList content after adding "+data+" is:\t");
            myList.printList();//prints list after node is added
         }

         //adds node at specifiic index
         if(choice == 3){
            do {
               sentinel=true;

               try {

                  do {


                     //prompt user to enter data
                     System.out.print("\nPlease enter a index (int) :\t");
                     index = scan.nextInt();

                     if(index>myList.countNodes()||index<0){
                        System.out.println("\nInvalid index, try again");
                     }
                     else {
                        sentinel=false;
                     }
                  }while (sentinel);

                  sentinel=true;
                  //prompt user to enter data
                  System.out.print("Please enter a data (int) :\t");
                  data = scan.nextInt();

                  scan.nextLine();
                  sentinel=false;
               }
               //catches any wrong inputs
               catch (InputMismatchException e){
                  scan.nextLine();
                  System.out.println("\nPlease enter only integers");
               }

            }while (sentinel);

            System.out.print("\nAdding value "+data+" at the index of "+index+".\n" +
                              "List content before adding "+data+" is:\t");
            myList.printList();//prints out list before modification


            //adds if it is the first node
            if(index==0){
               myList.addFirstNode(data);
            }
            //adds if it is the last node
            else if (index==myList.countNodes()-1) {
               myList.addLastNode(data);
            }
            else {
               myList.addAtIndex(index, data);
            }

            System.out.print("\nList content after adding "+data+" is:\t");
            myList.printList();//prints out list after adding dat
         }

         //removes first node
         if(choice == 4){

            //if the list is empty tells the user "List is Empty"
            if(myList.head==null){
                  System.out.print("\nList is Empty");
            }
            //else run method
            else {
               System.out.print("\nMethod removeFirstNode()\n" +
                       "List content before removing first node is:\t");
               myList.printList();//prints list before adding node

               myList.removeFirstNode();//removes data at the first node

               System.out.print("\nList content after removing first node is:\t");
               myList.printList();//prints list after node is added

            }

      }

         //removes last node
         if(choice == 5){

            //if the list is empty tells the user "List is Empty"
            if(myList.head==null){
               System.out.print("\nList is Empty");
            }
            //else run method
            else {
               System.out.print("\nMethod removeLastNode()\n" +
                       "List content before removing last node is:\t");
               myList.printList();//prints list before adding node

               myList.removeLastNode();//removes data at the firs node

               System.out.print("\nList content after removing last node is:\t");
               myList.printList();//prints list after node is added

            }
         }

         //removes node at specifiic index
         if(choice == 6){
            if(myList.head==null){
               System.out.print("\nList is Empty");
            }
            else {
               do {
                  sentinel = true;

                  try {

                     do {
                        sentinel = true;
                        //prompt user to enter index
                        System.out.print("\nPlease enter a index (int) :\t");
                        index = scan.nextInt();

                        if (index > myList.countNodes()-1 || index < 0) {
                           System.out.println("\nInvalid index, try again");
                        } else {
                           sentinel = false;
                        }

                     } while (sentinel);

                  }
                  //catches any wrong inputs
                  catch (InputMismatchException e) {
                     scan.nextLine();
                     System.out.println("\nPlease enter only integers");
                  }

               } while (sentinel);

               System.out.print("\nMethod removeAtIndex().\n" +
                       "List content before removing node at index " + index + " is:\t");
               myList.printList();//prints out list before modification


               //adds if it is the first node
               if (index == 0) {
                  myList.removeFirstNode();
               }
               //adds if it is the last node
               else if (index == myList.countNodes() - 1) {
                  myList.removeLastNode();
               } else {
                  myList.removeAtIndex(data);
               }

               System.out.print("\nList content after removing node at index " + index + " is:\t\t");
               myList.printList();//prints out list after adding data

            }
         }



         //printd list size
         if(choice == 7){
            if(myList.head==null){
               System.out.print("\nList is Empty");
            }
            else {
               System.out.print("\nMethod countNodes()\n" +
                                 "List Size:\t"+myList.countNodes());
            }

         }

         //prints list forward
         if(choice == 8){
            //if list is empty
            if(myList.head==null){
               System.out.print("\nList is Empty");
            }
            //prints list
            else {
               System.out.print("\nMethod printList()\n" +
                       "List(Forward):\t");
               myList.printList();
            }
         }
         //prints list in reverse
         if(choice == 9){
            //if list is empty
            if(myList.head==null){
               System.out.print("\nList is Empty");
            }
            //prints list
            else {
               System.out.print("\nMethod printInReverseList()\n" +
                       "List(In Reverse):\t");
               System.out.print(myList.printInReverse(myList.head));
            }

         }


      }while(choice!=10);


   }

   //prints out menu and read message
   public static int menu(){
      Scanner scan = new Scanner(System.in);
      int choice = 0;
      boolean sentinel=true;

      do {

         try {


            System.out.print("\n\n---------MAIN MENU-------- \n" +
                    "1 – Add First Node \n" +
                    "2 – Add Last Node \n" +
                    "3 – Add At Index \n" +
                    "4 – Remove First Node \n" +
                    "5 – Remove Last Node \n" +
                    "6 – Remove At Index \n" +
                    "7 – Print List Size \n" +
                    "8 – Print List (Forward) \n" +
                    "9 – Print List (In Reverse) \n" +
                    "10- Exit program \n" +
                    "Enter option number:\t");

            choice = scan.nextInt();
            scan.nextLine();

            if(choice >= 1 && choice <= 10){
               sentinel=false;
            }
            else {
               sentinel= true;
               System.out.println("\npleas only input values that are integers and between 1-10 ");
            }
         }catch (InputMismatchException e){
            System.out.println("\npleas only input values that are integers and between 1-10 ");
            scan.nextLine();
         }

         }while (sentinel);
      return choice;
   }
}
    
