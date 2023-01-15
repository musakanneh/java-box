package com.javabox.dsa;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

// Hash function: maps key value to an index value

public class CharacterFinder {
    // green apple -- using Map
    public char findFirstRepeatingChar(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        var chars = str.toCharArray();
        for (var ch : chars) {
            var count = map.containsKey(ch) ? map.get(ch) : 0;
            map.put(ch, count + 1);
        }
        for (var ch : chars) {
            if (map.get(ch) == 1) {
                return ch;
            }
        }

        return Character.MIN_VALUE;
    }

    // green apple -- using set
    public char firstRepeatingChar(String stringValue) {
        Set<Character> set = new HashSet<>();
        for (var character: stringValue.toCharArray()) {
            if (set.contains(character)) {
               return character;
            }
            set.add(character);
        }
        return Character.MIN_VALUE;
    }

    // collisions -- two distinct items generating the same value
    // chaining: using linked list to store multiple array items at the same index
    // open addressing: store directly in array slots: hashValue(key)+i

}
