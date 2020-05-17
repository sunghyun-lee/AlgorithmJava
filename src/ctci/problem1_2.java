package ctci;

import java.util.Arrays;

public class problem1_2 {
    public boolean solution(String a, String b) {
        // Convert to char array
        char[] charArrayA = a.toCharArray();
        char[] charArrayB = b.toCharArray();

        Arrays.sort(charArrayA);
        Arrays.sort(charArrayB);

        return Arrays.equals(charArrayA, charArrayB);
    }
}
