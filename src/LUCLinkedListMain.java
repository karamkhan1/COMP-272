class Node {
    int data;
    Node next;
    Node(int d) // Constructor
    {
        data = d;
        next = null;
    }
}

class LUCLinkedList {// a Singly Linked List
    Node head; // head of list

    public void insert (int data) // Method to insert a new node
    {
        Node new_node = new Node(data); // Create a new node with given data
        new_node.next = null;
        if (head == null) { // If the Linked List is empty, then make the new node as head
            head = new_node;
        } else {// Else traverse till the last node and insert the new_node there
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = new_node; // Insert the new_node at last node
        }
    }

    public void printList() // Method to print the LinkedList.
    {
        Node currNode = head;
        System.out.print("LinkedList: ");
        while (currNode != null) { // Traverse through the LinkedList
            System.out.print(currNode.data + " "); // Print the data at current node
            currNode = currNode.next; // Go to next node
        }
        System.out.println();
    }

    public void sumList(){
        Node currNode = head;
        int sum = 0;
        while(currNode != null){
            sum += currNode.data;
            currNode = currNode.next;
        }
        System.out.println("Sum: " + sum);
    }

    public void findMax(){
        Node currNode = head;
        int max = 0;
        while(currNode != null){
            max = Math.max(currNode.data, max);
            currNode = currNode.next;
        }
        System.out.println("Max: " + max);
    }

    public void printEven(){
        Node currNode = head;
        System.out.print("Linked List (even print): ");
        while(currNode != null){
            System.out.print(currNode.data + " ");
            currNode = currNode.next.next;
        }
        System.out.println();
    }

    public void removeElem(int num){
        Node currNode = head;
        System.out.print("Linked List (trimmed): ");
        while(currNode!= null){
            if(currNode.data == num){
                head = currNode.next;
                currNode = head;
            }
            else{
                System.out.print(currNode.data + " ");
                currNode = currNode.next;
            }
        }
    }

}


public class LUCLinkedListMain {
    public static void main(String[] args)
    {
        LUCLinkedList list = new LUCLinkedList();/* Start with the empty list. */
        // Insert the values
        list.insert(2);
        list.insert(2);
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(2);
        list.insert(2);
        list.printList(); // Print the LinkedList
        list.sumList(); // Print the sum
        list.findMax(); // Print the max
        list.printEven(); // Print the LinkedList (even indices)
        list.removeElem(2); // Print the LinkedList (trimmed)
    }
}
