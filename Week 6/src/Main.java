// Week 6
// 31-01-2026
import java.util.*;

// LC- 171. Excel Sheet Column Number
/*
class Main{
    public static int f(String columnTitle){
        int result = 0;
        for(char c : columnTitle.toCharArray()){
            int value = c - 'A' + 1;
            result = result * 26 + value;
        }
        return result;
    }
    public static void main(String args[]){
        String columnTitle = "AB";
        System.out.println(f(columnTitle));
    }
}
*/
//Singly Linked List
/*
class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}
class Main{
    public static void main(String args[]){
        Node head = new Node(15);
        head.next = new Node(3);
        head.next.next = new Node(17);
        head.next.next.next = new Node(90);

        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
*/

//Traversal in a singly linked list
class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class Main{
    public static void traverseLL(Node head){
        while(head != null){
            System.out.print(head.data);
            if(head.next != null){
                System.out.print(" -> ");
            }
            head = head.next;
        }
        System.out.println();
    }
    public static void main(String args[]){

        Node head = new Node(4);
        head.next = new Node(11);
        head.next.next = new Node(9);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(2);
        head.next.next.next.next.next = new Node(6);


        traverseLL(head);

    }
}
















































