package com.javabox.dsa.hashtable;

// implement a data structure that calculates the length
// of the longest uploaded prefix at various points in the upload process

import java.util.ArrayList;
import java.util.List;

public class LUPrefix {

    int[] longestUploadedPrefix;

    public LUPrefix(int n) {
        System.out.println("Musa");
    }

    public void upload(int video) {
        List<Integer> list = new ArrayList<>();
        System.out.println(list.add(video));
    }

    public int longest() {
        var lengthOfLongestPrefix = longestUploadedPrefix.length;
        System.out.println(longestUploadedPrefix);

        return lengthOfLongestPrefix;
    }
}
