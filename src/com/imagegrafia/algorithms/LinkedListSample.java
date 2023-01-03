package com.imagegrafia.algorithms;

/**
 * LinkedList is nothing but a class for node aggregator and utility method indirectly it keeps ref of LATEST
 * node object only and internally node keep ref of another node obejct which is data and references
 */
public class LinkedListSample {

    Node node1 = new Node(1, null);
    Node node2 = new Node(2, node1);
    Node node3 = new Node(3, node2);
    Node node4 = new Node(4, node3);

    Node node5 = new Node(5, node4);

    public static void main(String[] args) {
        LinkedListSample linkedListSample = new LinkedListSample();
        //printNodeElement
        linkedListSample.printNodeElement(linkedListSample.node5);
        //createNodeFromArray
        Node nodeFromArray = linkedListSample.createNodeFromArray(new int[]{4, 10, 20, 50});
        System.out.println("NODE FROM ARRAY");
        linkedListSample.printNodeElement(nodeFromArray);
        // find Mid Node of Linked LIst
        Node midNodeCreate = linkedListSample.createNodeFromArray(new int[]{4, 10, 20, 50, 76});
//        Node midElementOfNode = linkedListSample.findMidElementOfNode(midNodeCreate);
//        linkedListSample.printNodeElement(midElementOfNode);

        // get size of Node
        System.out.println("Node Size" + linkedListSample.getSizeOfNode(midNodeCreate));
        System.out.println("Mid of Node" + linkedListSample.findMidElementOfNode(new Node(1,null)).data);
        ;
    }

    void printNodeElement(Node node) {
        Node tempNode = node;
//        while(tempNode.next != null) { // will loose the last iteration i.e 1
        while (tempNode != null) {
            System.out.println(tempNode.data);
            tempNode = tempNode.next;
        }
    }

    Node createNodeFromArray(int arr[]) {
        Node node = null;
        for (int i : arr) {
            node = new Node(i, node);
        }
        return node;
    }

    int getSizeOfNode(Node node) {
        int count = 0;
        Node tempNode = node;
        while (tempNode != null) {
            count++;
            tempNode = tempNode.next;
        }
        return count;
    }

    Node findMidElementOfNode(Node node) {
        int n = getSizeOfNode(node);
        Node tempNode = node;
        if (n == 0 || n == 1) {
            return node;
        } else if (n / 2 == 0) {
            n = n / 2;
        } else {
            n = (n + 1) / 2;
        }
        System.out.println("n size is" + n);
        for (int i = 1; i < n; i++) {
            tempNode = tempNode.next;
        }
        return tempNode;
    }

}

class Node {
    int data;
    Node next;

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;

    }
}
