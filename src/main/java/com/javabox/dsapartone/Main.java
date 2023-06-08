package com.javabox.dsapartone;
import com.javabox.dsa.hashtable.LUPrefix;

public class Main {
    public static void main(String[] args) {
        LUPrefix server = new LUPrefix(4);
        server.upload(10);
        int param_2 = server.longest();
        System.out.println(param_2);
    }
}
