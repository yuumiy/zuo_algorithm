package com.easy.day6;

import java.util.LinkedList;

public class IsCBT {
    //判断是否是完全二叉树
    public static class Node {
        public int value;
        public Node left;
        public Node right;

        public Node(int data) {
            this.value = data;
        }
    }

    public static boolean isCBT(Node head) {
        if (head == null) {
            return true;
        }
        LinkedList<Node> queue = new LinkedList<>();
        boolean leaf = false;
        Node l = null;
        Node r = null;
        queue.add(head);
        while (!queue.isEmpty()) {
            head = queue.poll();
            l = head.left;
            r = head.right;
            //如果遇到了不双全的结点之后，又发现当前结点不是叶子结点
            if ((leaf && (l != null || r != null))
                    ||
                    (l == null && r != null)) {
                return false;
            }
            if (l != null) {
                queue.add(l);
            }
            if (r != null) {
                queue.add(r);
            } else {
                leaf = true;
            }
        }
        return true;
    }
}
