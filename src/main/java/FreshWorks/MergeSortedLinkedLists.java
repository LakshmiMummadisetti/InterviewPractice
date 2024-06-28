package FreshWorks;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class MergeSortedLinkedLists {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // Create a dummy node to serve as the start of the merged list
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        // Traverse both lists, adding the smaller node to the merged list
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }

        // If one list is longer, append the remainder
        if (l1 != null) {
            current.next = l1;
        } else {
            current.next = l2;
        }

        // The merged list is after the dummy node
        return dummy.next;
    }

    // Helper function to print the linked list
    public static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Create first linked list: 1 -> 2 -> 4
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);

        // Create second linked list: 1 -> 3 -> 4
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        // Merge the lists
        ListNode mergedList = mergeTwoLists(l1, l2);

        // Print the merged list
        System.out.print("Merged List: ");
        printList(mergedList);
    }
}
