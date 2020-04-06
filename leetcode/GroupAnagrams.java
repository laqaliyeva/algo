package leetcode;

/*
 * Given an array of strings, group anagrams together.
 * The order of output does not matter.
 *
 * Example:         Input: ["eat", "tea", "tan", "ate", "nat", "bat"]
 *                  Output: [["ate","eat","tea"], ["nat","tan"], ["bat"]]
 */

import java.util.*;

public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            String sortedStr = getSortedString(str);
            List<String> anagrams = map.getOrDefault(sortedStr, new ArrayList<>());
            anagrams.add(str);
            map.put(sortedStr, anagrams);
        }
        List<List<String>> result = new ArrayList<>();
        for (String str : map.keySet()) {
            result.add(map.get(str));
        }
        return result;
    }

    private String getSortedString(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}