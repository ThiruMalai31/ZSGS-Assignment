package Hashing;

import java.util.Arrays;

class HashTable2 {
    private int size;
    private int count;
    private int[] keys;
    private String[] values;
    private static final double LOAD_FACTOR_THRESHOLD = 0.75;

    public HashTable2(int initialSize) {
        this.size = initialSize;
        this.keys = new int[size];
        this.values = new String[size];
        Arrays.fill(keys, -1);
        this.count = 0;
    }

    private int hashFunction(int key) {
        return key % size;
    }

    public void add(int key, String value) {
        if ((double) count / size > LOAD_FACTOR_THRESHOLD) {
            rehash();
        }

        int index = hashFunction(key);
        while (keys[index] != -1 && keys[index] != key) {
            index = (index + 1) % size;
        }
        if (keys[index] == -1) {
            count++;
        }
        keys[index] = key;
        values[index] = value;
    }

    private void rehash() {
        int newSize = size * 2;
        int[] oldKeys = keys;
        String[] oldValues = values;

        keys = new int[newSize];
        values = new String[newSize];
        Arrays.fill(keys, -1);
        size = newSize;
        count = 0;

        for (int i = 0; i < oldKeys.length; i++) {
            if (oldKeys[i] != -1) {
                add(oldKeys[i], oldValues[i]);
            }
        }

        System.out.println("Rehashed to new size: " + size);
    }

    public String get(int key) {
        int index = hashFunction(key);
        int startIndex = index;
        while (keys[index] != -1) {
            if (keys[index] == key) {
                return values[index];
            }
            index = (index + 1) % size;
            if (index == startIndex) {
                break;
            }
        }
        return null;
    }

    public void printTable() {
        for (int i = 0; i < size; i++) {
            System.out.print("Index " + i + ": ");
            if (keys[i] == -1) {
                System.out.println("Empty");
            } else {
                System.out.println("Key " + keys[i] + " -> Value " + values[i]);
            }
        }
    }
}

public class HashFour {

    public static void main(String[] args) {

        HashTable2 hashTable = new HashTable2(4);
        hashTable.add(1, "Apple");
        hashTable.add(2, "Orange");
        hashTable.add(3, "Pineapple");
        hashTable.add(4, "Watermelon");

        System.out.println("Hash table before exceeding load factor:");
        hashTable.printTable();

        hashTable.add(5, "Banana");

        System.out.println("Hash table after rehashing:");
        hashTable.printTable();
    }


}
