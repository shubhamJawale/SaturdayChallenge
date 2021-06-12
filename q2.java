// q2.java
import java.util.*;
class node{

    int data;
    node next;

    node(int element){
        data = element;
        node next = null;

    }

}


class LinkedList{

    node head = null;
    int count =0;
    int tempcounter = 1;
    void addElement(int element){
        node newnode = new node(element);
        if(head==null)
            {
                head = newnode;
                count ++;
            }
            else{
                node pointer = head;
                while(pointer.next!=null)
                {
                    pointer=pointer.next;
                }
                pointer.next = newnode;
                count ++;
        }
        }


        void swap(){
            
            node prev = null;
            node nextp= null;
            node cur= head;
            node temp=head;
            if(head==null)
            {
            	//System.out.println(" ");
            }
            else{
            while(temp.next!=null)
            {
                temp=temp.next;
                
            }
                // if(count%2==0)
                // {
                    for(int i=1; i<count-1; i++)
                    {
                        prev=cur;
                        cur=cur.next;
                        nextp=cur.next;
                        tempcounter++;
                        
                        if(prev==head)
                        {
                            prev.next=nextp;
                            cur.next=prev;
                            head=cur;
                            cur=prev;
                            prev=head;


                        }
                        else{
                            prev.next=nextp;
                            cur.next=nextp.next;
                            nextp.next=cur;
                           
                            }

                    }
                }

                // }
            //}


        }

         void display()
     {

         if(head == null)
         {
             System.out.println("[ ]");
         }
         else


         {    

             System.out.print(" ");
             node pointer = head;
             while(pointer!= null)
             {
             
             System.out.print(" [ "+pointer.data+" ] ");

             pointer = pointer.next;
             //System.out.print();
             }
             

         }
     }
}

public class q2{
    

        public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        Scanner sc = new Scanner(System.in);
        ll.addElement(1);
        ll.addElement(2);
        ll.addElement(3);
        ll.addElement(4);
       
        
        ll.display();

        ll.swap();
        System.out.println();
        ll.display();

        

    }
}