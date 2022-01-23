package JavaAndDataStructures;

public class CircularLinkedList {
        public static void main(String[] args) {  
            CircularLinkedList Obj = new CircularLinkedList();  
            Obj.add(31);  
            Obj.add(12);  
            Obj.add(14);  
            Obj.add(99);  
            Obj.print();  
        }  
        class Node{  
            int element;  
            Node next;  
             Node(int element) {  
                this.element = element;  
            }  
        }  
          
         Node head = null;  
         Node tail = null;  
          
         void add(int element){  
            Node n = new Node(element);  
            if(head == null) {  
                head = n;  
                tail = n;  
                n.next = head;  
            }  
            else {  
                tail.next = n;  
                tail = n;  
                tail.next = head;  
            }  
        }  
           void print() {
            Node current = head;  
            if(head == null) {  
                System.out.println("List is empty");  
            }  
            else {  
                System.out.println("Nodes of the circular linked list: ");  
                 do{  
                    System.out.print(current.element+" ");  
                    current = current.next;  
                }while(current != head);  
                System.out.println();  
            }  
        }  
}
