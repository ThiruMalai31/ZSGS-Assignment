package Hashing;

import java.util.LinkedList;

class Node {
    int key;
    String value;

    Node(int key, String value) {
        this.key = key;
        this.value = value;
    }
}

class HashTable {
    private final int size;
    private final LinkedList<Node>[] table;

    @SuppressWarnings("unchecked")
    public HashTable(int size) {
        this.size = size;
        this.table = new LinkedList[size];
        for (int i = 0; i < size; i++) {
            table[i] = new LinkedList<>();
        }
    }

    private int hashFunction(int key) {
        return key % size;
    }

    public void add(int key, String value) {
        int index = hashFunction(key);
        LinkedList<Node> bucket = table[index];
        for (Node node : bucket) {
            if (node.key == key) {
                node.value = value;
                return;
            }
        }
        bucket.add(new Node(key, value));
    }

    public String get(int key) {
        int index = hashFunction(key);
        LinkedList<Node> bucket = table[index];
        for (Node node : bucket) {
            if (node.key == key) {
                return node.value;
            }
        }
        return null;
    }

    public void printTable() {
        for (int i = 0; i < size; i++) {
            System.out.print("Bucket " + i + ": ");
            for (Node node : table[i]) {
                System.out.print("[" + node.key + " -> " + node.value + "] ");
            }
            System.out.println();
        }
    }
}

public class HashTwo {


    public static void main(String[] args) {
        HashTable hashTable = new HashTable(5);
        hashTable.add(1, "Apple");
        hashTable.add(2, "Orange");
        hashTable.add(3, "Pineapple");
        hashTable.add(4, "Watermelon");
        hashTable.add(5, "Banana");

        System.out.println("Hash table Entries:");

        hashTable.printTable();

    }
}


