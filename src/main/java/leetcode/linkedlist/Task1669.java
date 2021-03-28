package leetcode.linkedlist;

import leetcode.linkedlist.support.ListNode;

/*
 * https://leetcode.com/problems/merge-in-between-linked-lists/
 */
public class Task1669 {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode start = findNode(list1, a - 1);
        ListNode end = findNode(list1, b + 1);

        ListNode list2LastNode = findNode(list2);

        list2LastNode.next = end;
        start.next = list2;

        return list1;
    }

    private ListNode findNode(ListNode node, int steps) {
        if (steps == 0) {
            return node;
        } else {
            return findNode(node.next, --steps);
        }
    }

    private ListNode findNode(ListNode node) {
        if (node.next == null) {
            return node;
        } else {
            return findNode(node.next);
        }
    }
}
