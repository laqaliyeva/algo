package leetcode;

public class NumberSegmentsInString {

    /*
    * Count the number of segments in a string, where a segment is defined to be
    * a contiguous sequence of non-space characters.
    *
    * Example           Input: "Hello, my name is John"
    *                   Output: 5
    */

    public static int countSegments(String s) {
        if (s == null || s.trim().isEmpty()) {
            return 0;
        }
        return s.trim().split("\\s+").length;
    }
}