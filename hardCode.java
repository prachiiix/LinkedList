import java.util.*;

class Node {
    int info;
    Node link;
}

class Linkedlist {
    static Scanner sc = new Scanner(System.in);
    static Node start = null;

    public static Node createNode() {
        return new Node();
    }

    public static void insertnode() {
        Node temp = createNode();
        System.out.println("Enter an element: ");
        temp.info = sc.nextInt();
        temp.link = null;

        if (start == null) {
            start = temp;
        } else {
            Node t1 = start;
            while (t1.link != null) {
                t1 = t1.link;
            }
            t1.link = temp;
        }
    }

    public static void deleteNode() {
        if (start == null) {
            System.out.println("List is empty");
        } else {
            start = start.link;
        }
    }

    public static void printList() {
        if (start == null) {
            System.out.println("List is empty");
        } else {
            Node t2 = start;
            while (t2 != null) {
                System.out.print(t2.info + "->");
                t2 = t2.link;
            }
            System.out.println("null");
        }
    }

    public static int menu() {
        System.out.println("menu: \n1. insert\n2. delete\n3. print\n4. exit");
        System.out.println("Enter choice: ");
        return sc.nextInt();
    }

    public static void main(String[] args) {
        while (true) {
            switch (menu()) {
                case 1:
                    insertnode();
                    break;
                case 2:
                    deleteNode();
                    break;
                case 3:
                    printList();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
