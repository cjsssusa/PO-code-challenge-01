package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class P4 {

    static class Node {
        int data;
        Node next;
    }

    static Node newNode(int key) {
        Node temp = new Node();
        temp.data = key;
        temp.next = null;
        return temp;
    }

    static void printList(Node node) {
        while (node != null) {
            System.out.printf("%d ",
                    node.data);
            node = node.next;
        }
    }

    Node merge(Node h1, Node h2) {
        if (h1 == null)
            return h2;
        if (h2 == null)
            return h1;

        if (h1.data < h2.data) {
            h1.next = merge(h1.next, h2);
            return h1;
        } else {
            h2.next = merge(h1, h2.next);
            return h2;
        }
    }

    public void pb4() {
        Node head1 = newNode(21);
        head1.next = newNode(43);
        head1.next.next = newNode(65);

        Node head2 = newNode(0);
        head2.next = newNode(2);
        head2.next.next = newNode(4);

        Node head3 = newNode(2);
        head3.next = newNode(7);
        head3.next.next = newNode(9);

        List<Node> list_node = new ArrayList<Node>();
        list_node.add(head1);
        list_node.add(head2);
        list_node.add(head3);

        Node mergedhead = null;
        for (Node n : list_node) {
            mergedhead = merge(mergedhead, n);
        }

        printList(mergedhead);
    }
}
