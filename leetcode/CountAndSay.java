package leetcode;

public class CountAndSay {

    /*
    * The count-and-say sequence is the sequence of integers with the first five terms as following:
    *
    * 1.     1
    * 2.     11
    * 3.     21
    * 4.     1211
    * 5.     111221
    *
    * 1 is read off as "one 1" or 11.
    * 11 is read off as "two 1s" or 21.
    * 21 is read off as "one 2, then one 1" or 1211.
    *
    * Given an integer n where 1 ≤ n ≤ 30, generate the nth term of the count-and-say sequence.
    *
    * Example:          Input: 1
    *                   Output: "1"
    *
    *                   Input: 4
    *                   Output: "1211"
    */

    public static String countAndSay(int n) {
        StringBuilder builder = new StringBuilder();
        String previous = "1";
        for (int i = 1; i < n; i++) {
            char c = previous.charAt(0);
            int count = 0;
            for (int j = 0; j < previous.length(); j++) {
                if (c == previous.charAt(j)) {
                    count++;
                } else {
                    builder.append(count).append(c);
                    count = 1;
                    c = previous.charAt(j);
                }
            }
            builder.append(count).append(c);
            previous = builder.toString();
            builder.delete(0, builder.length());
        }
        return previous;
    }
}