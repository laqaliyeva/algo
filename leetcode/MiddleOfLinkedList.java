package leetcode;

/*
 * Given a non-empty, singly linked list with head node head, return a middle node
 * of linked list. If there are two middle nodes, return the second middle node.
 *
 * Example          Input: [1,2,3,4,5]
 *                  Output: Node 3
 *
 *                  Input: [1,2,3,4,5,6]
 *                  Output: Node 4
*/

import java.util.ArrayList;
import java.util.List;

public class MiddleOfLinkedList {

    public ListNode middleNode(ListNode head) {
        List<ListNode> list = new ArrayList<>();
        while (head != null) {
            list.add(head);
            head = head.next;
        }
        return list.get(list.size() / 2);
    }
}

class ListNode {

    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}