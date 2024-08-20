class ListNode{
    int value;
    ListNode next;

    public ListNode(int value) {
        this.value = value;
        this.next = null;
    }
}
class MergesortLinkedLists {
    public static ListNode mergeLists(ListNode head1, ListNode head2) {
        ListNode dummy = new ListNode(-1); // Dummy node for merged list
        ListNode tail = dummy; // Pointer to the last node of merged list

        while (head1 != null && head2 != null) {
            if (head1.value < head2.value) {
                tail.next = head1;
                head1 = head1.next;
            } else {
                tail.next = head2;
                head2 = head2.next;
            }
            tail = tail.next;
        }

        // Attach remaining nodes (if any)
        if (head1 != null) {
            tail.next = head1;
        } else {
            tail.next = head2;
        }

        return dummy.next; // Merged list starts from the next of dummy
    }

    public static void main(String[] args) {
        // Example usage
        ListNode a = new ListNode(5);
        a.next = new ListNode(10);
        a.next.next = new ListNode(15);

        ListNode b = new ListNode(2);
        b.next = new ListNode(3);
        b.next.next = new ListNode(20);

        ListNode mergedList = mergeLists(a, b);

        // Print the merged list
        while (mergedList != null) {
            System.out.print(mergedList.value + " -> ");
            mergedList = mergedList.next;
        }
        System.out.println("null");
    }
}
