package com.equals3.classicinterviewquestions.solvemefirst.linkedlists;

public class HashTable {

    private DataItem[] hashArray;
    private int arraySize;
    private DataItem nonDataItem; // for deleted values

    public HashTable(int size) {
        this.arraySize = size;
        hashArray = new DataItem[arraySize];
        this.nonDataItem = new DataItem(-1);
    }

    public void displayTable() {
        System.out.println("Table");
        for (int j = 0; j < arraySize; j++) {
            if (hashArray[j] != null)
                System.out.print(hashArray[j].getKey() + " ");
            else
                System.out.print("*");
        }

    }
    public int hashFunc(int key)
{
return key % arraySize; // hash function
}

}