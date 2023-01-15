package com.javabox.dsapartone;
import com.javabox.dsa.CharacterFinder;
import com.javabox.dsa.HashTable;

public class Main {
    public static void main(String[] args) {
//        CharacterFinder finder = new CharacterFinder();
//        var ch =  finder.findFirstRepeatingChar("a green apple");
//        System.out.println(ch);
//        CharacterFinder findUnique = new CharacterFinder();
//        var uniqueResult = findUnique.firstRepeatingChar("green apple");
//        System.out.println(uniqueResult);
        HashTable table = new HashTable();
        table.put(6, "A");
        table.put(8, "B");
        table.put(11, "C");
        System.out.println("DONE!" + table.get(6));
    }
}
