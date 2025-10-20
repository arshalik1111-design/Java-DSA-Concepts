public class LinkedList {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;

        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        // Step 1. Create a new Node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // point new Node next to head
        newNode.next = head;
        // Step 3- Update head to new node
        head = newNode;

    }

    public void addLast(int data) {
        // Step 1. Create a new Node
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }
        // point new Node next to head
        tail.next = newNode;
        // Step 3- Update head to new node
        tail = newNode;

    }

    public void addAtIndex(int idx, int data) {
        if (idx == 0) {
            addFirst(data);
            return;
        }
        Node temp = head;
        Node newNode = new Node(data);
        size++;

        int i = 0;
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        // i = idx - 1 ;
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst() {
        if (size == 0) {
            System.out.println("List is empty");
            return Integer.MAX_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast() {
        if (size == 0) {
            System.out.println("List is empty");
            return Integer.MAX_VALUE;

        }

        else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        // prev = size - 2
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }

        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;

    }

    public void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();

    }

    public int iterativeSearch(int key) {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == key) {
                return i;

            }
            i++;
            temp = temp.next;

        }
        return -1;

    }

    public int helper(Node head, int key) {
        if (head == null) {
            return -1;

        }
        if (head.data == key) {
            return 0;
        }

        int idx = helper(head.next, key);
        if (idx == -1) {

            return -1;
        }
        return idx + 1;

    }

    public int recursiveSearch(int key) {
        return helper(head, key);
    }

    public void reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void RemoveNthNodefromEnd(int n) {
        // size of linked list
        int sz = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            sz++;
        }
        if (n == sz) { // Delete first node
            head = head.next;

        }
        int i = 1;
        Node prev = head;
        int iToFind = sz - n;
        while (i < iToFind) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;

    }

    // Slow fast approach
    public Node findMId(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {

            slow = slow.next;// +1
            fast = fast.next.next;// +2
        }
        return slow;// slow is my mid
    }

    public boolean checkPalindrome() {
        if (head == null && head.next == null) {
            return true;
        }
        // Find mid
        Node mid = findMId(head);

        // Reverse 2nd Half
        Node prev = null;
        Node curr = mid;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;
        Node left = head;

        while (right != null) {
            if (left.data != right.data) {
                return false;
            }

            left = left.next;
            right = right.next;
        }

        return true;

    }

    public static boolean isCycle() { // Floyd's cycle finding algorithm
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }

        }
        return false;

    }

    public static void removeCycle() {
        // Detect a cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                cycle = true;
                break;
            }
        }

        if (cycle == false) {
            return;
        }
        // finding meeting point
        slow = head;
        Node prev = null;// null
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;

        }
        // remove cycle-> last.next = null
        prev.next = null;
    }

    public Node getMid(Node head) {

        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; // mid
    }

    public Node merge(Node head1, Node head2) {
        Node mergeLL = new Node(-1);
        Node temp = mergeLL;
        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1.next;
                head1 = head1.next;
                temp = temp.next;

            } else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;

            }
        }
        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;

        }
        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;

        }
        return mergeLL.next;
    }

    public Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        // find mid
        Node mid = getMid(head);
        // left and right MS
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        // merge
        return merge(newLeft, newRight);

    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.printList(head);
      ll.head =  ll.mergeSort(ll.head);
        ll.printList(head);

        // head = new Node(1);
        // Node temp = new Node(2);
        // head.next = temp;
        // head.next.next = new Node(3);
        // head.next.next.next = temp;
        // ll.addFirst(2);
        // ll.addFirst(1);
        // ll.addLast(2);
        // ll.addLast(1);
        // ll.addLast(5);
        // ll.addAtIndex(0, 9);
        // ll.printList(ll.head);
        // // System.out.println(ll.size);
        // ll.removeFirst();
        // ll.removeLast();
        // ll.printList(ll.head);
        // System.out.println(ll.iterativeSearch(3));
        // System.out.println(ll.iterativeSearch(5));
        // System.out.println(ll.recursiveSearch(4));
        // ll.printList(head);
        // ll.reverse();
        // ll.RemoveNthNodefromEnd(4);
        // ll.printList(head);
        // System.out.println(ll.checkPalindrome() + " ");
        // System.out.println(isCycle());
        // removeCycle();
        // System.out.println(isCycle());

    }

}