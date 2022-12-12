package uc1createstack;

public class CreateStack {
    public static Node head;
    public class Node {

        int data;
        Node next;

        public Node(int data) {

            this.data = data;
            this.next = null;
        }


    }
    public boolean isEmpty() {
        return head == null;
    }

    public void addElement(int data) {
        Node newNode = new Node(data);

        if(isEmpty()) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;

    }


    public void display() {

        if(isEmpty()) {
            System.out.println("Stack is Empty");

        }
        Node currentNode = head;
        while(currentNode != null) {
            System.out.print(currentNode.data + "\t");
            currentNode = currentNode.next;
        }

    }
    public static void main(String[] args) {
        System.out.println("Stack And Queue ");

        CreateStack stack = new CreateStack();


        stack.addElement(56);
        stack.addElement(30);
        stack.addElement(76);
        stack.display();
    }

}
