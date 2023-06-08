package com.javabox.dsa.hashtable;
import java.util.ArrayList;
import java.util.List;

// Input: ["OrderedStream", "insert", "insert", "insert", "insert", "insert"]
//        [[5], [3, "ccccc"], [1, "aaaaa"], [2, "bbbbb"], [5, "eeeee"], [4, "ddddd"]]
// Output: [null, [], ["aaaaa"], ["bbbbb", "ccccc"], [], ["ddddd", "eeeee"]]

public class OrderedStream {
    private int count = 0;
    private String[] string;

    public OrderedStream(int value) {
        string = new String[value];
    }

    public List<String> insert(int idKey, String value) {
        List<String> list = new ArrayList<>();
        string[idKey - 1] = value;

        while (count < string.length && string[count] != null) {
            list.add(string[count++]);
        }

        return list;
    }
}
