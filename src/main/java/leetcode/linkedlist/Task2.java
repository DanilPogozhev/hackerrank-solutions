package leetcode.linkedlist;

import leetcode.linkedlist.support.ListNode;
/*
 * https://leetcode.com/problems/add-two-numbers/
 */
public class Task2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode start = l1;
        int tempVar = l1.val + l2.val;
        int addition = 0;

        if (tempVar > 9) {
            tempVar = tempVar % 10;
            addition = 1;
        }

        start.val = tempVar;
        ListNode previous = start;

        l1 = l1.next;
        l2 = l2.next;
        while (true) {
            ListNode node = new ListNode();
            if (l1 == null && l2 == null) {
                if (addition != 0) {
                    node.val = 1;
                    previous.next = node;
                }

                break;
            }

            if (l1 != null && l2 != null) {
                int value = addition + l1.val + l2.val;
                addition = 0;

                if (value > 9) {
                    value = value % 10;
                    addition = 1;
                }

                node.val = value;
                previous.next = node;
                previous = node;

                l1 = l1.next;
                l2 = l2.next;
            } else if (l1 == null) {
                int value = addition + l2.val;
                addition = 0;

                if (value > 9) {
                    value = value % 10;
                    addition = 1;
                }

                node.val = value;
                previous.next = node;
                previous = node;

                l2 = l2.next;
            } else {
                int value = addition + l1.val;
                addition = 0;

                if (value > 9) {
                    value = value % 10;
                    addition = 1;
                }

                node.val = value;
                previous.next = node;
                previous = node;

                l1 = l1.next;
            }
        }

        return start;
    }
}