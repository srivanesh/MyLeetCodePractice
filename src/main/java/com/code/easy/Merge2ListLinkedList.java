package com.code.easy;

import org.example.ListNode;

public class Merge2ListLinkedList {
    public static void main(String[] args) {
        ListNode list1 = new ListNode(1,2,4) ;
        ListNode list2 = new ListNode(1,3,4) ;
        ListNode result = mergeTwoLists(list1, list2);
        System.out.println(result);
    }

    private static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }
        if (list1 != null) {
            current.next = list1;
        } else {
            current.next = list2;
        }

        return dummy.next;
    }
}
