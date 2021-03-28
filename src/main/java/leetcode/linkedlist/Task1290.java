package leetcode.linkedlist;

import leetcode.linkedlist.support.ListNode;

/*
 * https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/
 */
public class Task1290 {
    public int getDecimalValue(ListNode head) {
        StringBuilder temp = new StringBuilder();

        while (head != null) {
            temp.append(head.val);
            head = head.next;
        }

        int counter = 1;
        int result = 0;
        for (int i = temp.length() - 1; i >= 0; i--) {
            result += counter * Integer.parseInt(temp.substring(i, i + 1));
            counter *= 2;
        }

        return result;
    }
}
